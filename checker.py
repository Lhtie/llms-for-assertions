import os
import argparse
import glob
import subprocess
import re

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
        
        fname = "/home/aman14/tmp/_compile_check." + langid
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
        
        fuzz.append(True)
    return fuzz

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--codedir", type=str, default="./codes")
    parser.add_argument("--codelist", nargs='+', default=[])
    parser.add_argument("--resultlist", nargs='+', default=["./results/*/*/"])
    args = parser.parse_args()

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

                fd = open(os.path.join(rdir, f + ".extract"), "r")
                gen_asrts = fd.read().split("-"*20)[:-1]
                fd.close()
                
                pfx, sfx = "\n".join(lines[:asrtlno]), "\n".join(lines[asrtlno+1:])

                nullity = null_check(langid, pfx, sfx, grnd_truth, gen_asrts, [True]*len(gen_asrts))
                cmple = compile_check(langid, pfx, sfx, grnd_truth, gen_asrts, nullity)
                fuzz = fuzz_check(langid, pfx, sfx, grnd_truth, gen_asrts, cmple)

                print("#"*10, rdir + f + ".fuzzcheck", "#"*10)
                print(fuzz, f"{sum(fuzz)}/{len(fuzz)}")
                print("#"*20)
