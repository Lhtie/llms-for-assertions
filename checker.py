import os
import sys
import argparse
import glob
import subprocess
import re
import traceback
import json
import ast
import tempfile

# Keep concurrent checker scratch files isolated and on the local filesystem.
# In WSL, the repository may live on /mnt/c, where concurrent copytree calls
# against the shared Windows mount can fail with transient missing-file errors.
_checker_tmp = None
if not os.environ.get("CHECKER_TMP_DIR"):
    _checker_tmp = tempfile.TemporaryDirectory(prefix="llms-for-assertions-checker-")
    os.environ["CHECKER_TMP_DIR"] = _checker_tmp.name

import checkers.nullchecker as nullchecker
import checkers.compilechecker as compilechecker
import checkers.fuzzchecker as fuzzchecker
import checkers.rdtpchecker as rdtpchecker
import checkers.equivchecker as equivchecker
import checkers.probchecker as probchecker

from active import run_active_selection
from utils.problemreader import langmap, read_problem
from utils.sourcepaths import source_directory

def check_gen(func, failure_result=False, skipped_result=False):
    def f(langid, pfx, sfx, grnd_truth, gen_asrts, cc, mask, checker_kwargs):
        arr, dp = [], {}
        for i, asrt in enumerate(gen_asrts):
            if not mask[i]:
                arr.append(skipped_result)
                continue
            if asrt in dp:
                arr.append(dp[asrt])
                continue
            print("!"*10 + f" Entry {i}", file=sys.stderr)
            try:
                result = func(langid, pfx, sfx, grnd_truth, asrt, cc, **checker_kwargs)
            except Exception as e:
                print(f"Error in entry {i}: error type - {type(e).__name__}; error msg - {e}", file=sys.stderr)
                traceback.print_exc()
                result = failure_result
            arr.append(result)
            dp[asrt] = result
        return arr
    return f

def prob_check_gen(func):
    def f(langid, code, raw_result_path, gen_asrts, mask, checker_kwargs):
        scores_all = func(code, langid, raw_result_path, **checker_kwargs)
        return [
            scores_all[i] if i < len(scores_all) and mask[i] else None
            for i in range(len(gen_asrts))
        ]
    return f

CHECKERS = {
    "null_check": check_gen(lambda *args, **kwargs: nullchecker.nullcheck(*args)),
    "compile_check": check_gen(lambda *args, **kwargs: compilechecker.cmplecheck(*args)),
    "fuzz_check": check_gen(lambda *args, check="soundness", **kwargs: fuzzchecker.fuzzcheck(*args, check, **kwargs)),
    "rdtp_check": check_gen(lambda *args, check="equality", **kwargs: rdtpchecker.rdtpcheck(*args, check=check, **kwargs),
                            failure_result=None, skipped_result=None),
    "equiv_check": check_gen(lambda *args, **kwargs: equivchecker.equivcheck(*args)),
    "prob_check": prob_check_gen(lambda *args, **kwargs: probchecker.probcheck_file(*args, **kwargs)),
}


def parse_checker_kwargs(raw_json):
    if not raw_json:
        return {}
    checker_kwargs = json.loads(raw_json)
    assert isinstance(checker_kwargs, dict), "--checkerkwargs must be a JSON object"
    for checker_name, kwargs in checker_kwargs.items():
        assert isinstance(kwargs, dict), f"--checkerkwargs[{checker_name}] must be a JSON object"
    return checker_kwargs

def bool_mask(values):
    return [bool(x) for x in values]

def and_mask(*masks):
    if not masks:
        return []
    return [all(mask[i] for mask in masks) for i in range(len(masks[0]))]

def format_score(score):
    if score is None:
        return "None"
    return f"{score:.6g}"

def format_prob_field(score, field):
    if score is None:
        return "None"
    value = score.get(field)
    if value is None:
        return "None"
    if isinstance(value, int):
        return str(value)
    return f"{value:.6g}"

def format_best_candidate(label, candidate):
    if candidate is None:
        return f"{label}: None\n"
    score_name = "avg_logprob" if "logprob" in candidate else "conformance"
    score_text = format_score(candidate["logprob"]) if score_name == "avg_logprob" else format_score(candidate["conformance"])
    return (
        f"{label}:\n"
        f"  index: {candidate['index']}\n"
        f"  validity: {candidate['validity']}\n"
        f"  {score_name}: {score_text}\n"
        f"  equivalence: {candidate['equivalence']}\n"
        f"  assert: {candidate['assert']}\n"
    )


def recover_checker_report(report_path):
    """Retain complete result blocks, discard an interrupted tail, and count prior work."""
    if not os.path.isfile(report_path):
        return set(), 0, 0, 0, 0

    with open(report_path, "rb") as fd:
        lines = fd.read().decode("utf-8", errors="replace").splitlines(keepends=True)

    header_prefix = "########## "
    header_suffix = " ##########"
    current_key = None
    current_lines = []
    completed = set()
    last_complete_offset = 0
    byte_offset = 0
    succs = tries = solvedps = totalps = 0

    for line in lines:
        encoded_length = len(line.encode("utf-8"))
        stripped = line.rstrip("\r\n")
        if current_key is None:
            if stripped.startswith(header_prefix) and stripped.endswith(header_suffix):
                current_key = stripped[len(header_prefix):-len(header_suffix)]
                current_lines = []
        elif stripped == "####################":
            completed.add(current_key)
            totalps += 1
            final_candidate_equivalent = False
            in_final_candidate = False
            for entry_line in current_lines:
                match = re.match(r"^equiv_res:\s*(\[[^\]]*\])", entry_line)
                if match:
                    try:
                        values = ast.literal_eval(match.group(1))
                    except (SyntaxError, ValueError):
                        values = []
                    succs += sum(bool(value) for value in values)
                    tries += len(values)
                if entry_line.startswith("final_best_candidate:"):
                    in_final_candidate = True
                elif in_final_candidate:
                    if entry_line.startswith("  equivalence:"):
                        final_candidate_equivalent = entry_line.split(":", 1)[1].strip() == "True"
                        in_final_candidate = False
                    elif entry_line.startswith(("####################", "########## ")):
                        in_final_candidate = False
            solvedps += final_candidate_equivalent
            last_complete_offset = byte_offset + encoded_length
            current_key = None
            current_lines = []
        elif current_key is not None:
            current_lines.append(stripped)
        byte_offset += encoded_length

    # Also removes the previous run's aggregate summary, which is regenerated
    # after all remaining entries have completed.
    with open(report_path, "r+b") as fd:
        fd.truncate(last_complete_offset)
    return completed, succs, tries, solvedps, totalps


def parse_report_value(block, field):
    match = re.search(rf"(?m)^{re.escape(field)}:\s*(.*?)\s*$", block)
    if not match:
        return None
    value_text = match.group(1)
    if value_text.startswith("["):
        array_match = re.match(r"(\[.*?\])", value_text)
        if array_match:
            value_text = array_match.group(1)
    try:
        return ast.literal_eval(value_text)
    except (SyntaxError, ValueError):
        return None


def load_conformance_report(report_path):
    """Load per-entry conformance scores and thresholds from a prior checker report."""
    entries = {}
    current_key = None
    current_lines = []
    header_prefix = "########## "
    header_suffix = " ##########"

    with open(report_path, "r", encoding="utf-8", errors="replace") as report:
        for raw_line in report:
            line = raw_line.rstrip("\r\n")
            if current_key is None:
                if line.startswith(header_prefix) and line.endswith(header_suffix):
                    current_key = line[len(header_prefix):-len(header_suffix)]
                    current_lines = [line]
            elif line == "####################":
                block = "\n".join(current_lines)
                scores = parse_report_value(block, "conformance_scores")
                if isinstance(scores, list):
                    threshold = parse_report_value(block, "active_conformance_threshold")
                    entry = {"scores": scores, "threshold": threshold}
                    entries[current_key] = entry
                    entries[os.path.normcase(os.path.abspath(os.path.normpath(current_key)))] = entry
                current_key = None
                current_lines = []
            else:
                current_lines.append(line)

    if not entries:
        raise ValueError(f"No conformance_scores entries found in check file: {report_path}")
    return entries


def replace_active_report_section(block, active_output):
    """Keep old checker results while replacing any previously reported active output."""
    lines = block.splitlines()
    kept = []
    skip_final_candidate = False
    inserted_active = False
    for line in lines:
        if line.startswith("final_best_candidate:"):
            skip_final_candidate = True
            continue
        if skip_final_candidate:
            if line.startswith("####################") or line.startswith("########## "):
                skip_final_candidate = False
            else:
                continue
        if line.startswith((
            "active_score_mode:", "active_conformance_threshold:", "active_logprob_threshold:",
            "active_selection_mode:",
            "active_candidates", "active_candidates_skipped_no_logprob:",
            "active_candidate_pool", "active_tournament:", "active_decision:",
            "validity_fail_best_conf:", "validity_pass_best_conf:", "active_error:",
        )):
            continue
        if line.startswith("####################") and not inserted_active:
            kept.extend(active_output.splitlines())
            inserted_active = True
        kept.append(line)
    if not inserted_active:
        kept.extend(active_output.splitlines())
    while kept and not kept[-1].strip():
        kept.pop()
    return "\n".join(kept) + "\n"


def format_active_output(candidates, final_candidate, tournament_matches, threshold,
                         score_mode="conformance", selection_mode="active"):
    output = [f"active_selection_mode: {selection_mode}", f"active_score_mode: {score_mode}"]
    if score_mode == "conformance":
        output.append(f"active_conformance_threshold: {threshold}")
        score_field = "conformance"
        score_label = "conformance, ascending"
    else:
        score_field = "logprob"
        score_label = "avg_logprob, ascending"
    if candidates:
        pool = ", ".join(
            f"{candidate['index']}:{format_score(candidate[score_field])}"
            for candidate in candidates
        )
    else:
        pool = "None"
    output.append(f"active_candidates (index:{score_label}): {pool}")
    match_summaries = []
    for match in tournament_matches:
        if "bye" in match:
            match_summaries.append(f"r{match['round']}: {match['bye']} bye")
        else:
            match_summaries.append(
                f"r{match['round']}: {match['left']} vs {match['right']}"
                f" -> {match['winner']} ({match['reason']})"
            )
    if selection_mode in {"conformance-only", "logprob-only"}:
        output.append(f"active_tournament: skipped ({selection_mode} selection)")
    else:
        output.append("active_tournament: " + ("; ".join(match_summaries) if match_summaries else "no matches"))
    output.append(
        f"active_decision: candidate_{final_candidate['index']}"
        if final_candidate is not None else "active_decision: None"
    )
    output.append(format_best_candidate("final_best_candidate", final_candidate).rstrip())
    return "\n".join(output)


def rerun_active_from_check_file(check_file, codedir, datasets, combinedcodesdir,
                                 checker_kwargs, threshold_override=None,
                                 score_mode="conformance", selection_mode="active",
                                 output_path=None, resume=False):
    """Rerun active per report entry, optionally resuming a prior output."""
    report = open(check_file, "r").read()
    footer = "####################"
    last_footer = report.rfind(footer)
    summary_tail = report[last_footer + len(footer):] if last_footer >= 0 else ""
    entry_report = report[:last_footer + len(footer)] if last_footer >= 0 else report
    lines = entry_report.splitlines(keepends=True)
    entries = []
    current = []
    header_pattern = re.compile(r"^#{10}\s+(.*?)\s+#{10}\s*$")
    for line in lines:
        if header_pattern.match(line.rstrip("\n")):
            if current:
                entries.append("".join(current))
            current = [line]
        elif current:
            current.append(line)
    if current:
        entries.append("".join(current))

    updated_entries = []
    completed_entries = set()
    outfd = None
    if output_path is not None:
        os.makedirs(os.path.dirname(os.path.abspath(output_path)), exist_ok=True)
        if resume:
            completed_entries, _, _, _, _ = recover_checker_report(output_path)
        outfd = open(output_path, "a" if resume else "w", encoding="utf-8")
        if completed_entries:
            print(
                f"Resuming active rerun {output_path}: skipping {len(completed_entries)} completed entries",
                file=sys.stderr,
            )

    def save_entry(key, entry):
        if outfd is None:
            updated_entries.append(entry)
        else:
            outfd.write(entry.rstrip() + "\n")
            outfd.flush()
            completed_entries.add(key)

    def error_entry(block, message):
        lines = block.rstrip().splitlines()
        if lines and lines[-1] == "####################":
            lines.insert(-1, f"active_error: {message}")
        else:
            lines.append(f"active_error: {message}")
        return "\n".join(lines) + "\n"

    for block in entries:
        header = header_pattern.match(block.splitlines()[0])
        entry_key = header.group(1)
        if entry_key in completed_entries:
            continue
        result_path = entry_key.removesuffix(".check")
        filename = os.path.basename(result_path)
        result_dir = os.path.dirname(result_path)
        source_path = os.path.join(codedir, filename)
        extract_path = os.path.join(result_dir, filename + ".extract")
        try:
            with open(source_path, "r") as source_fd:
                source = source_fd.read()
            with open(extract_path, "r") as extract_fd:
                gen_asrts = [x.strip() for x in extract_fd.read().split("-" * 20)[:-1]]
        except OSError as exc:
            save_entry(entry_key, error_entry(block, str(exc)))
            continue

        langid = filename.split(".")[-2]
        if langid != "java":
            save_entry(entry_key, error_entry(block, "active rerun currently supports Java only"))
            continue
        _, _, groundtruth = read_problem(source, langid)
        null_results = parse_report_value(block, "null_check")
        compile_results = parse_report_value(block, "compile_check")
        validity_scores = parse_report_value(block, "validity_scores")
        conformance_scores = parse_report_value(block, "conformance_scores")
        prob_scores = parse_report_value(block, "prob_avg_scores")
        equivalence_scores = parse_report_value(block, "equiv_res")
        expected_size = len(gen_asrts)
        required_arrays = (null_results, compile_results, validity_scores)
        if score_mode == "conformance":
            required_arrays += (conformance_scores,)
        if not all(isinstance(values, list) and len(values) >= expected_size for values in required_arrays):
            save_entry(
                entry_key,
                error_entry(block, f"report lacks aligned arrays required for {score_mode} active selection"),
            )
            continue
        if score_mode == "logprob" and not (
                isinstance(prob_scores, list) and len(prob_scores) >= expected_size):
            raw_result_path = os.path.join(result_dir, filename)
            try:
                prob_scores = CHECKERS["prob_check"](
                    langid, source, raw_result_path, gen_asrts,
                    [bool(null_results[i]) and bool(compile_results[i]) for i in range(expected_size)],
                    checker_kwargs.get("prob_check", {}),
                )
            except Exception as exc:
                save_entry(
                    entry_key,
                    error_entry(block, f"could not obtain logprob scores: {type(exc).__name__}: {exc}"),
                )
                continue
        if not isinstance(conformance_scores, list) or len(conformance_scores) < expected_size:
            conformance_scores = [None] * expected_size
        if not isinstance(equivalence_scores, list) or len(equivalence_scores) < expected_size:
            equivalence_scores = [None] * expected_size
        candidate_mask = [bool(null_results[i]) and bool(compile_results[i]) for i in range(expected_size)]
        threshold = None
        if score_mode == "conformance":
            threshold = threshold_override
            if threshold is None:
                threshold = parse_report_value(block, "active_conformance_threshold")
            if threshold is None:
                threshold = checker_kwargs.get("rdtp_check", {}).get(
                    "threshold", rdtpchecker.configs.get(langid, {}).get("threshold", 0.6)
                )
        combinedcodes = source_directory(filename, datasets, combinedcodesdir)
        pfx, sfx, _ = read_problem(source, langid)
        candidates, winner, matches = run_active_selection(
            pfx + "\n" + sfx, groundtruth, combinedcodes, gen_asrts,
            conformance_scores, equivalence_scores, validity_scores,
            candidate_mask, threshold,
            outdir=os.path.join(os.environ["CHECKER_TMP_DIR"], "active", "rerun", filename), rounds=2,
            score_mode=score_mode, logprob_scores=prob_scores,
            selection_mode=selection_mode,
        )
        save_entry(
            entry_key,
            replace_active_report_section(
                block, format_active_output(candidates, winner, matches, threshold,
                                            score_mode, selection_mode)
            ),
        )
    if outfd is not None:
        if summary_tail.strip():
            outfd.write(summary_tail if summary_tail.startswith(("\n", "\r")) else "\n" + summary_tail)
            outfd.flush()
        outfd.close()
    return "".join(updated_entries) + summary_tail

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--datasets", default="./datasets", help="Dataset root for group-prefixed input filenames")
    parser.add_argument("--combinedcodesdir", type=str, default="./datasets/c2s_aug")
    parser.add_argument("--codedir", type=str, default="./codes")
    parser.add_argument("--codelist", nargs='+', default=[])
    parser.add_argument("--resultlist", nargs='+', default=["./results/*/*/"])
    parser.add_argument("--outdir", type=str, default="./results/checks/")
    parser.add_argument(
        "--write", default=False, action="store_true",
        help="Write checker results to the output file (overwrite by default)",
    )
    parser.add_argument(
        "--resume", action="store_true",
        help="Resume an existing output file, skipping completed entries (requires --write)",
    )
    parser.add_argument("--outname", type=str, default="")
    parser.add_argument("--mask", nargs='+', default=[])
    parser.add_argument("--checkerkwargs", type=str, default="")
    parser.add_argument(
        "--reuse-conformance-from-check-file", type=str, default="",
        help="Reuse per-entry conformance scores from this report; requires --checklist default",
    )
    parser.add_argument("--active-from-check-file", type=str, default="",
                        help="Rerun active selection per report entry")
    parser.add_argument("--active-threshold", type=float, default=None,
                        help="Override the conformance threshold for active-only reruns")
    parser.add_argument("--active-score", choices=["conformance", "logprob"], default=None,
                        help="Candidate score used by active selection; logprob mode skips conformance")
    parser.add_argument("--selection-mode", choices=["active", "conformance-only", "logprob-only"], default="active",
                        help="Use tournament selection, highest conformance, or highest logprob directly")
    parser.add_argument("--checklist", nargs='+', default=["default"], choices=["default", "valid", "conf", "equiv", "prob"])
    
    args = parser.parse_args()
    if args.resume and not args.write:
        parser.error("--resume requires --write")
    active_score_mode = args.active_score or (
        "logprob" if args.selection_mode == "logprob-only" else "conformance"
    )
    if args.selection_mode == "conformance-only" and active_score_mode != "conformance":
        parser.error("--selection-mode conformance-only requires --active-score conformance")
    if args.selection_mode == "logprob-only" and active_score_mode != "logprob":
        parser.error("--selection-mode logprob-only requires --active-score logprob")
    if args.active_from_check_file and args.reuse_conformance_from_check_file:
        parser.error("--active-from-check-file cannot be combined with --reuse-conformance-from-check-file")
    checker_groups = {"default", "valid", "conf", "equiv", "prob"}
    unknown_checkers = [checker for checker in args.checklist if checker not in checker_groups]
    assert not unknown_checkers, f"Unknown checker groups in --checklist: {unknown_checkers}"
    run_default = "default" in args.checklist
    if args.reuse_conformance_from_check_file and not run_default:
        parser.error("--reuse-conformance-from-check-file requires --checklist default")
    run_valid = run_default or "valid" in args.checklist
    run_conf = active_score_mode == "conformance" and (
        "conf" in args.checklist or run_default
    ) and not args.reuse_conformance_from_check_file
    run_equiv = run_default or "equiv" in args.checklist
    run_prob = "prob" in args.checklist or (run_default and active_score_mode == "logprob")
    checker_kwargs_map = parse_checker_kwargs(args.checkerkwargs)
    reused_conformance = (
        load_conformance_report(args.reuse_conformance_from_check_file)
        if args.reuse_conformance_from_check_file else None
    )

    if args.active_from_check_file:
        output_name = args.outname or (os.path.basename(args.active_from_check_file) + ".active.txt")
        output_path = os.path.join(args.outdir, output_name) if args.write else None
        active_report = rerun_active_from_check_file(
            args.active_from_check_file,
            args.codedir,
            args.datasets,
            args.combinedcodesdir,
            checker_kwargs_map,
            threshold_override=args.active_threshold,
            score_mode=active_score_mode,
            selection_mode=args.selection_mode,
            output_path=output_path,
            resume=args.resume,
        )
        if args.write:
            print(f"Active rerun report: {output_path}", file=sys.stderr)
        else:
            print(active_report, end="")
        sys.exit(0)

    if args.outname: outname = args.outname
    else: 
        outname = "N".join([x.translate({ord('.'):'', ord('/'):'', ord('*'):'X'})
            for x in args.resultlist]) + ".txt"
    report_path = os.path.join(args.outdir, outname)
    completed_entries = set()
    succs = tries = solvedps = totalps = 0
    if args.write: 
        os.makedirs(args.outdir, exist_ok=True)
        if args.resume:
            completed_entries, succs, tries, solvedps, totalps = recover_checker_report(report_path)
        outfd = open(report_path, "a" if args.resume else "w", encoding="utf-8")
        if completed_entries:
            print(
                f"Resuming {report_path}: skipping {len(completed_entries)} completed entries",
                file=sys.stderr,
            )
    else: print(args.outdir + "/" + outname)

    for glob_fmt in args.resultlist:
        for rdir in glob.glob(glob_fmt):
            sort_func = lambda x : int(x.split('.')[-1]) if x.split('.')[-1].isnumeric() else -1
            sorted_ls = sorted(os.listdir(args.codedir), key = sort_func)
            for f in sorted_ls:
                if(len(args.codelist) != 0 and f.split('.')[-1] not in args.codelist):
                    continue

                entry_key = f"{rdir}/{f}.check"
                if entry_key in completed_entries:
                    continue

                fd = open(os.path.join(args.codedir, f), "r")
                code = fd.read()
                fd.close()

                langid = f.split('.')[-2]

                pfx, sfx, grnd_truth = read_problem(code, langid)

                try:
                    fd = open(os.path.join(rdir, f + ".extract"), "r")
                    gen_asrts = [asrt.strip() for asrt in fd.read().split("-"*20)[:-1]]
                    fd.close()
                except:
                    continue # result extract file doesnt exist

                cc = source_directory(f, args.datasets, args.combinedcodesdir) if langid == "java" else args.combinedcodesdir

                toprint = f"{'#'*10} {rdir}/{f}.check {'#'*10}\n"
                reused_conformance_entry = None
                if reused_conformance is not None:
                    report_key = f"{rdir}/{f}.check"
                    canonical_key = os.path.normcase(os.path.abspath(os.path.normpath(report_key)))
                    reused_conformance_entry = reused_conformance.get(canonical_key)
                    if reused_conformance_entry is None:
                        reused_conformance_entry = reused_conformance.get(report_key)
                    if reused_conformance_entry is None:
                        raise KeyError(
                            f"No conformance scores for {report_key} in "
                            f"{args.reuse_conformance_from_check_file}"
                        )
                    if len(reused_conformance_entry["scores"]) != len(gen_asrts):
                        raise ValueError(
                            f"Conformance score count mismatch for {report_key}: "
                            f"report has {len(reused_conformance_entry['scores'])}, "
                            f"current candidates have {len(gen_asrts)}"
                        )

                if len(args.mask):
                    currmask = [False]*len(gen_asrts)
                    for idx in args.mask:
                        currmask[int(idx)] = True
                else:
                    args.mask = [str(i) for i in range(len(gen_asrts))]
                    currmask = [True]*len(gen_asrts)

                print("!"*10 + f" {rdir}/{f}", file=sys.stderr)
                
                valid_results = {}
                validity_scores = [0] * len(gen_asrts)
                conformance_scores = [None] * len(gen_asrts)
                prob_scores = [None] * len(gen_asrts)
                if run_valid:
                    valid_checks = ["null_check", "compile_check", "fuzz_check"]
                    valid_mask = currmask
                    for check_name in valid_checks:
                        print("!"*10 + f" Running {check_name}", file=sys.stderr)
                        result = CHECKERS[check_name](
                            langid, pfx, sfx, grnd_truth, gen_asrts, cc, valid_mask,
                            checker_kwargs_map.get(check_name, {})
                        )
                        valid_results[check_name] = result
                        toprint += f"{check_name}: {str(result)} {sum(bool(x) for x in result)}/{len(args.mask)}\n"
                        valid_mask = and_mask(valid_mask, bool_mask(result))

                    validity_scores = [int(x) for x in valid_mask]
                    toprint += f"validity_scores: {str(validity_scores)} {sum(validity_scores)}/{len(args.mask)}\n"

                if run_conf:
                    print("!"*10 + " Running rdtp_check", file=sys.stderr)
                    conformance_scores = CHECKERS["rdtp_check"](
                        langid, pfx, sfx, grnd_truth, gen_asrts, cc, currmask,
                        checker_kwargs_map.get("rdtp_check", {})
                    )
                    toprint += f"conformance_scores: {[format_score(x) for x in conformance_scores]}\n"
                elif reused_conformance_entry is not None:
                    conformance_scores = reused_conformance_entry["scores"]
                    toprint += f"conformance_scores: {conformance_scores}\n"
                    toprint += f"conformance_reused_from: {args.reuse_conformance_from_check_file}\n"
                
                if run_equiv:
                    print("!"*10 + " Running equiv_check", file=sys.stderr)
                    equiv_res = CHECKERS["equiv_check"](
                        langid, pfx, sfx, grnd_truth, gen_asrts, cc, currmask,
                        checker_kwargs_map.get("equiv_check", {})
                    )
                    toprint += f"equiv_res: {str(equiv_res)} {sum(bool(x) for x in equiv_res)}/{len(args.mask)}\n"
                else:
                    equiv_res = [0]*len(gen_asrts)
                    
                if run_prob:
                    print("!"*10 + " Running prob_check", file=sys.stderr)
                    raw_result_path = os.path.join(rdir, f)
                    prob_scores = CHECKERS["prob_check"](
                        langid, code, raw_result_path, gen_asrts, currmask,
                        checker_kwargs_map.get("prob_check", {}),
                    )
                    toprint += (
                        "prob_avg_scores: "
                        f"{[format_prob_field(x, 'avg_logprob') for x in prob_scores]}\n"
                    )

                final_candidate = None
                if run_default:
                    compiled_candidate_mask = and_mask(
                        currmask,
                        bool_mask(valid_results["null_check"]),
                        bool_mask(valid_results["compile_check"]),
                    )
                    threshold = None
                    if active_score_mode == "conformance":
                        threshold = (
                            reused_conformance_entry.get("threshold")
                            if reused_conformance_entry is not None else None
                        )
                        if threshold is None:
                            threshold = checker_kwargs_map.get("rdtp_check", {}).get(
                                "threshold", rdtpchecker.configs.get(langid, {}).get("threshold", 0.6)
                            )
                    active_candidates, final_candidate, tournament_matches = run_active_selection(
                        pfx + "\n" + sfx,
                        grnd_truth,
                        cc,
                        gen_asrts,
                        conformance_scores,
                        equiv_res,
                        validity_scores,
                        compiled_candidate_mask,
                        threshold,
                        outdir=os.path.join(
                            os.environ["CHECKER_TMP_DIR"], "active", "tournament", f
                        ),
                        rounds=2,
                        score_mode=active_score_mode,
                        logprob_scores=prob_scores,
                        selection_mode=args.selection_mode,
                    )
                    toprint += f"active_selection_mode: {args.selection_mode}\n"
                    toprint += f"active_score_mode: {active_score_mode}\n"
                    if active_score_mode == "conformance":
                        toprint += f"active_conformance_threshold: {threshold}\n"
                        active_score_field = "conformance"
                        active_score_label = "conformance, ascending"
                    else:
                        active_score_field = "logprob"
                        active_score_label = "avg_logprob, ascending"
                    toprint += f"active_candidates (index:{active_score_label}): "
                    if active_candidates:
                        toprint += ", ".join(
                            f"{candidate['index']}:{format_score(candidate[active_score_field])}"
                            for candidate in active_candidates
                        ) + "\n"
                    else:
                        toprint += "None\n"

                    match_summaries = []
                    for match in tournament_matches:
                        if "bye" in match:
                            match_summaries.append(
                                f"r{match['round']}: {match['bye']} bye"
                            )
                        else:
                            match_summaries.append(
                                f"r{match['round']}: {match['left']} vs {match['right']}"
                                f" -> {match['winner']} ({match['reason']})"
                            )
                    toprint += "active_tournament: " + (
                        "; ".join(match_summaries) if match_summaries else "no matches"
                    ) + "\n"
                    toprint += (
                        f"active_decision: candidate_{final_candidate['index']}\n"
                        if final_candidate is not None else "active_decision: None\n"
                    )

                    toprint += format_best_candidate("final_best_candidate", final_candidate)

                toprint += "#"*20 + "\n"

                if args.write:
                    outfd.write(toprint)
                    outfd.flush()
                    completed_entries.add(entry_key)
                else: print(toprint, end="")

                succs, tries = succs + sum(equiv_res), tries + len(args.mask)
                selected_equivalent = bool(
                    final_candidate and final_candidate.get("equivalence")
                )
                solvedps, totalps = solvedps + selected_equivalent, totalps + 1
    
    toprint = f"Successful tries / Total tries = {succs}/{tries}\n"
    toprint += f"Solved problems / Total problems = {solvedps}/{totalps}"
    if args.write:
        outfd.write(toprint)
        outfd.flush()
        outfd.close()
    else: print(toprint)
