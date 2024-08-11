import os
import argparse
import glob
import subprocess
import re
from z3checker import *
from fuzzchecker import *
from compilechecker import *

langmap = {
        "py": ("#",     ),
        "cs": ("//",    ),
}


def null_check(langid, pfx, sfx, grnd_truth, gen_asrts, mask):
    nullity = []
    for i, asrt in enumerate(gen_asrts):
        if not mask[i]:
            nullity.append(False)
            continue
        nullity.append(asrt.strip() != "")
    return nullity


def compile_check(langid, pfx, sfx, grnd_truth, gen_asrts, mask):
    cmple = []
    for i, asrt in enumerate(gen_asrts):
        if not mask[i]:
            cmple.append(False)
            continue

        result = cmplecheck(langid, pfx, sfx, grnd_truth, asrt)
        cmple.append(result)
    return cmple

def fuzz_check(langid, pfx, sfx, grnd_truth, gen_asrts, mask):
    fuzz = []
    for i, asrt in enumerate(gen_asrts):
        if not mask[i]:
            fuzz.append(False)
            continue

        result = fuzzcheck(langid, pfx, sfx, grnd_truth, asrt, "soundness")
        fuzz.append(result)
    return fuzz

def z3_check(langid, pfx, sfx, grnd_truth, gen_asrts, mask):
    z3 = []
    for i, asrt in enumerate(gen_asrts):
        if not mask[i]:
            z3.append(False)
            continue

        result = z3check(langid, pfx, sfx, grnd_truth, asrt, "equality")
        z3.append(result)
    return z3


if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--codedir", type=str, default="./codes")
    parser.add_argument("--codelist", nargs='+', default=[])
    parser.add_argument("--resultlist", nargs='+', default=["./results/*/*/"])
    parser.add_argument("--outdir", type=str, default="./results/checks/")
    parser.add_argument("--write", type=int, default=0)
    parser.add_argument("--outname", type=str, default="")
    
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

                checks = [null_check, compile_check, fuzz_check]
                
                toprint = f"{'#'*10} {rdir}/{f}.check {'#'*10}\n"

                currmask = [True]*len(gen_asrts)
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

