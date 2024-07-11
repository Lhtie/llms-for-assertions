import re
import ast
import subprocess

# soooooooo bad

def csfindtype(pfx, var):
    for l in pfx.split("\n")[::-1]:
        if f"int {var}" in l: return "Int"
        elif f"bool {var}" in l: return "Bool"
        else: continue
    return "None"

def cs2decls(f_true, f_test, pfx):
    fvars = (f_true + " " + f_test).translate({ord(c): " " for c in "()!|&=;><-+0123456789"})
    fvars =  set(filter(lambda x : x, [y.strip() for y in fvars.split(" ")]))
    return([ f"{var} = {csfindtype(pfx, var)}('{var}')" for var in fvars ])

def cs2z3(expr):
    try: return str(ast.parse(expr.replace("||", " or ").replace("&&", " and ").\
            replace("!", " not ").replace(" not =", " != "), mode='eval').body)
    except: return expr

def boolopstr(x):
    if isinstance(x.op, ast.And): return f"And({','.join([str(y) for y in x.values])})"
    elif isinstance(x.op, ast.Or): return f"Or({','.join([str(y) for y in x.values])})"
    else: assert False

def unaryopstr(x):
    if isinstance(x.op, ast.Not): return f"Not({str(x.operand)})"
    else: ast.unparse(x)

def cs_z3check(pfx, sfx, grnd_truth, asrt, check):
    f_true, f_test = [
            re.match(r".*Assert[(](.*)[)]\s*;.*", x.strip()) for x in [grnd_truth, asrt]]
    assert f_true, "Ground truth assertion not in the required format"
    if f_test == None: return False

    f_true, f_test = f_true.group(1), f_test.group(1)
    decls = "\n".join(cs2decls(f_true, f_test, pfx))

    for name, cls in ast.__dict__.items():
        if(isinstance(cls, type)): cls.__str__ = lambda x : ast.unparse(x)
    ast.BoolOp.__str__ = boolopstr
    ast.UnaryOp.__str__ = unaryopstr

    f_true, f_test = cs2z3(f_true), cs2z3(f_test)

    if(check == "equality"):
        code = f"from z3 import *\n{decls}\n__f = (({f_true}) == ({f_test}))\n" + \
                "s = Solver()\ns.add(Not(__f))\nif s.check() == unsat: exit(42)\nelse: exit(142)"
    elif(check == "implication"):
        code = f"from z3 import *\n{decls}\n__f = Or(Not({f_true}), ({f_test}))\n" + \
                "s = Solver()\ns.add(Not(__f))\nif s.check() == unsat: exit(42)\nelse: exit(142)"
    else:
        assert False, f"Incorrect check : {check}"

    fname = "/home/aman14/code/tmp/_z3_check.py"
    fd = open(fname, "w")
    fd.write(code)
    fd.close()

    proc = subprocess.run(["python3", fname])
    # assert proc.returncode == 42 or proc.returncode == 142
    return proc.returncode == 42 


def z3check(langid, pfx, sfx, grnd_truth, asrt, check):
    if(langid == "py"):
        result = True

    elif(langid == "cs"):
        result = cs_z3check(pfx, sfx, grnd_truth, asrt, check)

    else: 
        assert False, "Incorrect language id: " + langid

    return result
