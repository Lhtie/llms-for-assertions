import os
import argparse
import glob
import subprocess
import re
from z3checker import *
from fuzzchecker import *

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

        # must be a better way to match indentation levels for python
        asrt = asrt.replace("\r", "\n").replace("\f", "\n").replace("\v", "\n").strip("\n")
        asrt = asrt.replace("\t", "    ") # pep8 prefers spaces
        curshift = re.match(r"^\s*", asrt).group(0)
        shift = re.match(r"^\s*", grnd_truth).group(0)
        code = "\n".join(
                [pfx] + [shift + l.removeprefix(curshift) for l in asrt.split("\n")] + [sfx])

        # code = "\n".join([pfx, asrt, sfx]) # simple
        
        fname = "/home/aman14/code/tmp/_compile_check." + langid
        fd = open(fname, "w")
        fd.write(code)
        fd.close()

        if(langid == "py"):
            proc = subprocess.run(["python3", "-m", "py_compile", fname],
                        stderr=subprocess.DEVNULL)
            result = proc.returncode == 0

        elif(langid == "cs"):
            result = True

        else: 
            assert False, "Incorrect language id: " + langid

        cmple.append(result)
    return cmple

def fuzz_check(langid, pfx, sfx, grnd_truth, gen_asrts, mask):
    fuzz = []
    for i, asrt in enumerate(gen_asrts):
        if not mask[i]:
            fuzz.append(False)
            continue

        result = fuzzcheck(langid, pfx, sfx, grnd_truth, asrt, "equality")
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
    args = parser.parse_args()

    succs, tries = 0, 0
    solvedps, totalps = 0, 0


    for glob_fmt in args.resultlist:
        for rdir in glob.glob(glob_fmt):

            for f in os.listdir(args.codedir):
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

                checks = [null_check, fuzz_check]

                currmask = [True]*len(gen_asrts)
                for chk in checks:
                    currmask = chk(langid, pfx, sfx, grnd_truth, gen_asrts, currmask)
                final = currmask

                print("#"*10, rdir + f + ".check", "#"*10)
                print(final, f"{sum(final)}/{len(final)}")
                print("#"*20)

                succs, tries = succs + sum(final), tries + len(final)
                solvedps, totalps = solvedps + (sum(final) > 0), totalps + 1 
    
    print(f"Successful tries / Total tries = {succs}/{tries}")
    print(f"Solved problems / Total problems = {solvedps}/{totalps}")
