import os
import sys
import argparse
import glob
import subprocess
import re
import traceback
import json

import checkers.nullchecker as nullchecker
import checkers.compilechecker as compilechecker
import checkers.fuzzchecker as fuzzchecker
import checkers.rdtpchecker as rdtpchecker
import checkers.equivchecker as equivchecker

langmap = {
        "py": ("#",     ),
        "cs": ("//",    ),
        "java": ("//",    ),
}

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

CHECKERS = {
    "null_check": check_gen(lambda *args, **kwargs: nullchecker.nullcheck(*args)),
    "compile_check": check_gen(lambda *args, **kwargs: compilechecker.cmplecheck(*args)),
    "fuzz_check": check_gen(lambda *args, check="soundness", **kwargs: fuzzchecker.fuzzcheck(*args, check)),
    "rdtp_check": check_gen(lambda *args, check="equality", **kwargs: rdtpchecker.rdtpcheck(*args, check=check, **kwargs),
                            failure_result=None, skipped_result=None),
    "equiv_check": check_gen(lambda *args, **kwargs: equivchecker.equivcheck(*args)),
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

def select_best(gen_asrts, validity_scores, conformance_scores, equivalence_scores, target_validity):
    best = None
    for i, (asrt, validity, conformance, equivalence) in enumerate(
            zip(gen_asrts, validity_scores, conformance_scores, equivalence_scores)):
        if validity != target_validity or conformance is None:
            continue
        if best is None or conformance > best["conformance"]:
            best = {
                "index": i,
                "validity": validity,
                "conformance": conformance,
                "equivalence": equivalence,
                "assert": asrt,
            }
    return best

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

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--combinedcodesdir", type=str, default="./combinedcodes")
    parser.add_argument("--codedir", type=str, default="./codes")
    parser.add_argument("--codelist", nargs='+', default=[])
    parser.add_argument("--resultlist", nargs='+', default=["./results/*/*/"])
    parser.add_argument("--outdir", type=str, default="./results/checks/")
    parser.add_argument("--write", default=False, action="store_true")
    parser.add_argument("--outname", type=str, default="")
    parser.add_argument("--mask", nargs='+', default=[])
    parser.add_argument("--checkerkwargs", type=str, default="")
    parser.add_argument("--checklist", nargs='+', default=["default"], choices=["default", "valid", "conf", "equiv"])
    
    args = parser.parse_args()
    checker_groups = {"default", "valid", "conf", "equiv"}
    unknown_checkers = [checker for checker in args.checklist if checker not in checker_groups]
    assert not unknown_checkers, f"Unknown checker groups in --checklist: {unknown_checkers}"
    run_default = "default" in args.checklist
    run_valid = run_default or "valid" in args.checklist
    run_conf = run_default or "conf" in args.checklist
    run_equiv = run_default or "equiv" in args.checklist
    checker_kwargs_map = parse_checker_kwargs(args.checkerkwargs)

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

                cmnt_tkn = langmap[langid][0]

                lines = code.split("\n")
                cmnt_idx = [i if "@@@" in l and l.strip().startswith(cmnt_tkn) else -1 for (i,l) in enumerate(lines)]
                asrtlno = max(cmnt_idx) + 1
                assert sum([i != -1 for i in cmnt_idx]) == 1, "too few or many assertions to work on"
                
                grnd_truth = lines[asrtlno].strip()
                if grnd_truth.startswith(cmnt_tkn):
                    grnd_truth = grnd_truth.strip(cmnt_tkn).strip()

                try:
                    fd = open(os.path.join(rdir, f + ".extract"), "r")
                    gen_asrts = [asrt.strip() for asrt in fd.read().split("-"*20)[:-1]]
                    fd.close()
                except:
                    continue # result extract file doesnt exist

                pfx, sfx = "\n".join(lines[:asrtlno]), "\n".join(lines[asrtlno+1:])
                cc = args.combinedcodesdir

                toprint = f"{'#'*10} {rdir}/{f}.check {'#'*10}\n"

                if len(args.mask):
                    currmask = [False]*len(gen_asrts)
                    for idx in args.mask:
                        currmask[int(idx)] = True
                else:
                    args.mask = [str(i) for i in range(len(gen_asrts))]
                    currmask = [True]*len(gen_asrts)

                print("!"*10 + f" {rdir}/{f}", file=sys.stderr)
                
                if run_valid:
                    valid_checks = ["null_check", "compile_check", "fuzz_check"]
                    valid_mask = currmask
                    for check_name in valid_checks:
                        print("!"*10 + f" Running {check_name}", file=sys.stderr)
                        result = CHECKERS[check_name](
                            langid, pfx, sfx, grnd_truth, gen_asrts, cc, valid_mask,
                            checker_kwargs_map.get(check_name, {})
                        )
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

                if run_default:
                    best_invalid = select_best(gen_asrts, validity_scores, conformance_scores, equiv_res, 0)
                    best_valid = select_best(gen_asrts, validity_scores, conformance_scores, equiv_res, 1)
                    toprint += format_best_candidate("best_validity_0", best_invalid)
                    toprint += format_best_candidate("best_validity_1", best_valid)

                toprint += "#"*20 + "\n"

                if args.write: outfd.write(toprint)
                else: print(toprint, end="")

                succs, tries = succs + sum(equiv_res), tries + len(args.mask)
                solvedps, totalps = solvedps + (sum(equiv_res) > 0), totalps + 1 
    
    toprint = f"Successful tries / Total tries = {succs}/{tries}\n"
    toprint += f"Solved problems / Total problems = {solvedps}/{totalps}"
    if args.write: outfd.write(toprint)
    else: print(toprint)
