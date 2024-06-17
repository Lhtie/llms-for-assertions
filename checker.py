import os
import argparse
import glob
import subprocess
import re
import ast

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
        
        fuzz.append(True)
    return fuzz

def z3_check(langid, pfx, sfx, grnd_truth, gen_asrts, mask):
    z3 = []
    for i, asrt in enumerate(gen_asrts):
        if not mask[i]:
            z3.append(False)
            continue

        if(langid == "py"):
            result = True

        elif(langid == "cs"):
            f_true, f_test = [
                    re.match(r".*Assert[(](.*)[)]\s*;.*", x.strip()) for x in [grnd_truth, asrt]]
            assert f_true, "Ground truth assertion not in the required format"
            if f_test == None:
                z3.append(False)
                continue
            f_true, f_test = f_true.group(1), f_test.group(1)
            
            #print(pfx.split("\n")[-1])
            #print(f_true, "@@", f_test)
            
            # soooooooo bad
            def csfindtype(pfx, var):
                for l in pfx.split("\n")[::-1]:
                    if f"int {var}" in l: return "Int"
                    elif f"bool {var}" in l: return "Bool"
                    else: continue
                return "None"
            def cs2decls(f_true, f_test):
                fvars = (f_true + " " + f_test).translate({ord(c): " " for c in "()!|&=;><-+0123456789"})
                fvars =  set(filter(lambda x : x, [y.strip() for y in fvars.split(" ")]))
                return([ f"{var} = {csfindtype(pfx, var)}('{var}')" for var in fvars ])
            decls = "\n".join(cs2decls(f_true, f_test))
            for name, cls in ast.__dict__.items():
                if(isinstance(cls, type)): cls.__str__ = lambda x : ast.unparse(x)
            def boolopstr(x):
                if isinstance(x.op, ast.And): return f"And({','.join([str(y) for y in x.values])})"
                elif isinstance(x.op, ast.Or): return f"Or({','.join([str(y) for y in x.values])})"
                else: assert 0
            def unaryopstr(x):
                if isinstance(x.op, ast.Not): return f"Not({str(x.operand)})"
                else: ast.unparse(x)
            ast.BoolOp.__str__ = boolopstr
            ast.UnaryOp.__str__ = unaryopstr
            def cs2z3(expr):
                try: return str(ast.parse(expr.replace("||", " or ").replace("&&", " and ").\
                        replace("!", " not ").replace(" not =", " != "), mode='eval').body)
                except: return expr
            f_true, f_test = cs2z3(f_true), cs2z3(f_test)

            
            #code = f"from z3 import *\n{decls}\n__f = (({f_true}) == ({f_test}))\n" + \
            code = f"from z3 import *\n{decls}\n__f = Or(Not({f_true}), ({f_test}))\n" + \
                    "s = Solver()\ns.add(Not(__f))\nif s.check() == unsat: exit(42)\nelse: exit(142)"

            #print(f"{decls}\nOr(Not({f_true}), ({f_test}))")
            #print("------------")
            
            fname = "/home/aman14/code/tmp/_z3_check.py"
            fd = open(fname, "w")
            fd.write(code)
            fd.close()

            proc = subprocess.run(["python3", fname])
            #assert proc.returncode == 42 or proc.returncode == 142, f"returned {proc.returncode}"
            result = proc.returncode == 42
        else: 
            assert False, "Incorrect language id: " + langid

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

                fd = open(os.path.join(rdir, f + ".extract"), "r")
                gen_asrts = fd.read().split("-"*20)[:-1]
                fd.close()
                
                pfx, sfx = "\n".join(lines[:asrtlno]), "\n".join(lines[asrtlno+1:])

                nullity = null_check(langid, pfx, sfx, grnd_truth, gen_asrts, [True]*len(gen_asrts))
                z3 = z3_check(langid, pfx, sfx, grnd_truth, gen_asrts, nullity)
                #cmple = compile_check(langid, pfx, sfx, grnd_truth, gen_asrts, nullity)
                #fuzz = fuzz_check(langid, pfx, sfx, grnd_truth, gen_asrts, cmple)
                final = z3

                print("#"*10, rdir + f + ".check", "#"*10)
                print(final, f"{sum(final)}/{len(final)}")
                print("#"*20)

                succs, tries = succs + sum(final), tries + len(final)
                solvedps, totalps = solvedps + (sum(final) > 0), totalps + 1 
    
    print(f"Successful tries / Total tries = {succs}/{tries}")
    print(f"Solved problems / Total problems = {solvedps}/{totalps}")
