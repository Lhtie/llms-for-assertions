import os
import sys
import argparse
import glob
import subprocess
import re
import traceback
import json
import ast

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
    return (
        f"{label}:\n"
        f"  index: {candidate['index']}\n"
        f"  validity: {candidate['validity']}\n"
        f"  conformance: {format_score(candidate['conformance'])}\n"
        f"  equivalence: {candidate['equivalence']}\n"
        f"  assert: {candidate['assert']}\n"
    )


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
            "active_conformance_threshold:", "active_candidates:",
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


def format_active_output(candidates, final_candidate, tournament_matches, threshold):
    output = [f"active_conformance_threshold: {threshold}"]
    if candidates:
        pool = ", ".join(
            f"{candidate['index']}:{format_score(candidate['conformance'])}"
            for candidate in candidates
        )
    else:
        pool = "None"
    output.append(f"active_candidates (index:conformance, ascending): {pool}")
    match_summaries = []
    for match in tournament_matches:
        if "bye" in match:
            match_summaries.append(f"r{match['round']}: {match['bye']} bye")
        else:
            match_summaries.append(
                f"r{match['round']}: {match['left']} vs {match['right']}"
                f" -> {match['winner']} ({match['reason']})"
            )
    output.append("active_tournament: " + ("; ".join(match_summaries) if match_summaries else "no matches"))
    output.append(
        f"active_decision: candidate_{final_candidate['index']}"
        if final_candidate is not None else "active_decision: None"
    )
    output.append(format_best_candidate("final_best_candidate", final_candidate).rstrip())
    return "\n".join(output)


def rerun_active_from_check_file(check_file, codedir, datasets, combinedcodesdir,
                                 checker_kwargs, threshold_override=None):
    """Rerun only active for entries in a prior checker report."""
    report = open(check_file, "r").read()
    lines = report.splitlines(keepends=True)
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
    for block in entries:
        header = header_pattern.match(block.splitlines()[0])
        result_path = header.group(1).removesuffix(".check")
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
            updated_entries.append(block.rstrip() + f"\nactive_error: {exc}\n")
            continue

        langid = filename.split(".")[-2]
        if langid != "java":
            updated_entries.append(block.rstrip() + "\nactive_error: active rerun currently supports Java only\n")
            continue
        _, _, groundtruth = read_problem(source, langid)
        null_results = parse_report_value(block, "null_check")
        compile_results = parse_report_value(block, "compile_check")
        validity_scores = parse_report_value(block, "validity_scores")
        conformance_scores = parse_report_value(block, "conformance_scores")
        equivalence_scores = parse_report_value(block, "equiv_res")
        expected_size = len(gen_asrts)
        if (not all(isinstance(values, list) and len(values) >= expected_size for values in
                    (null_results, compile_results, validity_scores, conformance_scores))):
            updated_entries.append(
                block.rstrip() + "\nactive_error: report lacks aligned null/compile/validity/conformance arrays\n"
            )
            continue
        if not isinstance(equivalence_scores, list) or len(equivalence_scores) < expected_size:
            equivalence_scores = [None] * expected_size
        candidate_mask = [bool(null_results[i]) and bool(compile_results[i]) for i in range(expected_size)]
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
            outdir=os.path.join("./checktmp/active/rerun", filename), rounds=2,
        )
        updated_entries.append(replace_active_report_section(
            block, format_active_output(candidates, winner, matches, threshold)
        ))
    return "".join(updated_entries)

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--datasets", default="./datasets", help="Dataset root for group-prefixed input filenames")
    parser.add_argument("--combinedcodesdir", type=str, default="./combinedcodes")
    parser.add_argument("--codedir", type=str, default="./codes")
    parser.add_argument("--codelist", nargs='+', default=[])
    parser.add_argument("--resultlist", nargs='+', default=["./results/*/*/"])
    parser.add_argument("--outdir", type=str, default="./results/checks/")
    parser.add_argument("--write", default=False, action="store_true")
    parser.add_argument("--outname", type=str, default="")
    parser.add_argument("--mask", nargs='+', default=[])
    parser.add_argument("--checkerkwargs", type=str, default="")
    parser.add_argument("--active-from-check-file", type=str, default="",
                        help="Rerun active selection from a prior checker report without rerunning checks")
    parser.add_argument("--active-threshold", type=float, default=None,
                        help="Override the conformance threshold for active-only reruns")
    parser.add_argument("--checklist", nargs='+', default=["default"], choices=["default", "valid", "conf", "equiv", "prob"])
    
    args = parser.parse_args()
    checker_groups = {"default", "valid", "conf", "equiv", "prob"}
    unknown_checkers = [checker for checker in args.checklist if checker not in checker_groups]
    assert not unknown_checkers, f"Unknown checker groups in --checklist: {unknown_checkers}"
    run_default = "default" in args.checklist
    run_valid = run_default or "valid" in args.checklist
    run_conf = run_default or "conf" in args.checklist
    run_equiv = run_default or "equiv" in args.checklist
    run_prob = "prob" in args.checklist
    checker_kwargs_map = parse_checker_kwargs(args.checkerkwargs)

    if args.active_from_check_file:
        active_report = rerun_active_from_check_file(
            args.active_from_check_file,
            args.codedir,
            args.datasets,
            args.combinedcodesdir,
            checker_kwargs_map,
            threshold_override=args.active_threshold,
        )
        output_name = args.outname or (os.path.basename(args.active_from_check_file) + ".active.txt")
        if args.write:
            os.makedirs(args.outdir, exist_ok=True)
            with open(os.path.join(args.outdir, output_name), "w") as outfd:
                outfd.write(active_report)
        else:
            print(active_report, end="")
        sys.exit(0)

    if args.outname: outname = args.outname
    else: 
        outname = "N".join([x.translate({ord('.'):'', ord('/'):'', ord('*'):'X'})
            for x in args.resultlist]) + ".txt"
    if args.write: 
        os.makedirs(args.outdir, exist_ok=True)
        outfd = open(os.path.join(args.outdir, outname), "w")
    else: print(args.outdir + "/" + outname)

    succs, tries = 0, 0
    solvedps, totalps = 0, 0

    for glob_fmt in args.resultlist:
        for rdir in glob.glob(glob_fmt):
            sort_func = lambda x : int(x.split('.')[-1]) if x.split('.')[-1].isnumeric() else -1
            sorted_ls = sorted(os.listdir(args.codedir), key = sort_func)
            for f in sorted_ls:
                if(len(args.codelist) != 0 and f.split('.')[-1] not in args.codelist):
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

                if len(args.mask):
                    currmask = [False]*len(gen_asrts)
                    for idx in args.mask:
                        currmask[int(idx)] = True
                else:
                    args.mask = [str(i) for i in range(len(gen_asrts))]
                    currmask = [True]*len(gen_asrts)

                print("!"*10 + f" {rdir}/{f}", file=sys.stderr)
                
                valid_results = {}
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

                if run_default:
                    compiled_candidate_mask = and_mask(
                        currmask,
                        bool_mask(valid_results["null_check"]),
                        bool_mask(valid_results["compile_check"]),
                    )
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
                        outdir="./checktmp/active/tournament",
                        rounds=2,
                    )
                    toprint += f"active_conformance_threshold: {threshold}\n"
                    toprint += "active_candidates (index:conformance, ascending): "
                    if active_candidates:
                        toprint += ", ".join(
                            f"{candidate['index']}:{format_score(candidate['conformance'])}"
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

                if args.write: outfd.write(toprint)
                else: print(toprint, end="")

                succs, tries = succs + sum(equiv_res), tries + len(args.mask)
                solvedps, totalps = solvedps + (sum(equiv_res) > 0), totalps + 1 
    
    toprint = f"Successful tries / Total tries = {succs}/{tries}\n"
    toprint += f"Solved problems / Total problems = {solvedps}/{totalps}"
    if args.write: outfd.write(toprint)
    else: print(toprint)
