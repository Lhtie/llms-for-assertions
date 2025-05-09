import os
import sys
import argparse
import glob
import subprocess
import re
import z3checker
import fuzzchecker
import compilechecker
import equivchecker

langmap = {
        "py": ("#",     ),
        "cs": ("//",    ),
}

def check_gen(func):
    def f(langid, pfx, sfx, grnd_truth, gen_asrts, mask):
        arr, dp = [], {}
        for i, asrt in enumerate(gen_asrts):
            if not mask[i]:
                arr.append(False)
                continue
            if asrt in dp:
                arr.append(dp[asrt])
                continue
            print("!"*10 + f" Entry {i}", file=sys.stderr)
            result = func(langid, pfx, sfx, grnd_truth, asrt)
            arr.append(result)
            dp[asrt] = result
        return arr
    return f

null_check      = check_gen(lambda *args : args[-1].strip() != "")
compile_check   = check_gen(compilechecker.cmplecheck)
fuzz_check      = check_gen(lambda *args : fuzzchecker.fuzzcheck(*args, "soundness"))
z3_check        = check_gen(lambda *args : z3checker.z3check(*args, "equality"))
equiv_check     = check_gen(equivchecker.equivcheck)

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--codedir", type=str, default="./codes")
    parser.add_argument("--codelist", nargs='+', default=[])
    parser.add_argument("--resultlist", nargs='+', default=["./results/*/*/"])
    parser.add_argument("--outdir", type=str, default="./results/checks/")
    parser.add_argument("--write", type=int, default=0)
    parser.add_argument("--outname", type=str, default="")
    parser.add_argument("--mask", nargs='+', default=[])
    
    args = parser.parse_args()

    if args.outname: outname = args.outname
    else: 
        outname = "N".join([x.translate({ord('.'):'', ord('/'):'', ord('*'):'X'})
            for x in args.resultlist]) + ".txt"
    if args.write: outfd = open(os.path.join(args.outdir, outname), "w")
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

                cmnt_tkn = langmap[langid]

                lines = code.split("\n")
                cmnt_idx = [i if "@@@" in l and l.strip().startswith(cmnt_tkn) else -1 for (i,l) in enumerate(lines)]
                asrtlno = max(cmnt_idx) + 1
                assert sum([i != -1 for i in cmnt_idx]) == 1, "too few or many assertions to work on"
                
                grnd_truth = lines[asrtlno]

                try:
                    fd = open(os.path.join(rdir, f + ".extract"), "r")
                    gen_asrts = fd.read().split("-"*20)[:-1]
                    fd.close()
                except:
                    continue # result extract file doesnt exist

                pfx, sfx = "\n".join(lines[:asrtlno]), "\n".join(lines[asrtlno+1:])

                # checks = [null_check, compile_check, fuzz_check, equiv_check]
                checks = [equiv_check]
                
                toprint = f"{'#'*10} {rdir}/{f}.check {'#'*10}\n"

                if len(args.mask):
                    currmask = [False]*len(gen_asrts)
                    for idx in args.mask:
                        currmask[int(idx)] = True
                else:
                    currmask = [True]*len(gen_asrts)

                print("!"*10 + f" {rdir}/{f}", file=sys.stderr)

                for chk in checks:
                    currmask = chk(langid, pfx, sfx, grnd_truth, gen_asrts, currmask)
                    toprint += f"{str(currmask)} {sum(currmask)}/{len(currmask)}\n"
                final = currmask

                toprint += "#"*20 + "\n"

                if args.write: outfd.write(toprint)
                else: print(toprint, end="")

                succs, tries = succs + sum(final), tries + len(final)
                solvedps, totalps = solvedps + (sum(final) > 0), totalps + 1 
    
    toprint = f"Successful tries / Total tries = {succs}/{tries}\n"
    toprint += f"Solved problems / Total problems = {solvedps}/{totalps}"
    if args.write: outfd.write(toprint)
    else: print(toprint)

