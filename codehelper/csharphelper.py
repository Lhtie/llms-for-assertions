import re
import itertools
from xml.etree import ElementTree

fuzz_objname, fuzz_argname, fuzz_retvar = "fuzzobj", "fuzzarg", "New_Ret"

cs_cmple_cmd = "C:\\Windows\\Microsoft.NET\\Framework\\v4.0.30319\\Csc.exe /noconfig /nowarn:\"1701,1702\" /nostdlib+ /errorreport:prompt /warn:4 /define:\"DEBUG;TRACE\" /highentropyva-  /reference:\"C:\\Program Files (x86)\\Common Files\\Microsoft Shared\\ExtendedReflection\\0.94.51006.1\\bin\\Microsoft.ExtendedReflection.dll\" /reference:\"C:\\Program Files (x86)\\Microsoft Moles\\PublicAssemblies\\Microsoft.Pex.Framework.dll\" /reference:\"C:\\Program Files (x86)\\Reference Assemblies\\Microsoft\\Framework\\.NETFramework\\v4.0\\mscorlib.dll\" /reference:\"test\\bin\\nunit.framework.dll\" /reference:\"C:\\Program Files (x86)\\Reference Assemblies\\Microsoft\\Framework\\.NETFramework\\v4.0\\System.Core.dll\" /reference:\"C:\\Program Files (x86)\\Reference Assemblies\\Microsoft\\Framework\\.NETFramework\\v4.0\\System.dll\" /reference:\"test\\bin\\Utility.dll\" /reference:\"test\\bin\\{0}.dll\" /debug+ /debug:full /filealign:512 /optimize- /out:test\\bin\\FuzzTest.dll /target:library /utf8output test\\FuzzTest.cs test\\Factories\\{0}Factory.cs \"C:\\Users\\aman\\AppData\\Local\\Temp\\.NETFramework,Version=v4.0.AssemblyAttributes.cs\""

cs_pex_cmd = "\"C:\\Program Files (x86)\\Microsoft Pex\\bin\\pex.exe\" test\\bin\\FuzzTest.dll /membernamefilter:M:PUT_FuzzTest! /methodnamefilter:PUT_FuzzTest! /namespacefilter:{0}.Test! /typefilter:FuzzTest! /NoConsole /donotopenreport /x86"

def csfunc(rtyp, args, isobs, ispur, call, pre):
    # return type, args type list, is observer, is pure func
    # how to call, what precond it assumes
    return {"rtyp":rtyp, "args":args, "isobs":isobs,
            "ispur":ispur, "call":call, "pre":pre}

cs_generic = lambda f : (lambda *p : f"{p[0]}.{f}({','.join(p[1:])})")
cs_getter = lambda f : (lambda *p : f"{p[0]}.{f}")
cs_idxgetter = lambda t : (lambda *p : f"({t})({p[0]}[{p[1]}])")
cs_idxsetter = lambda : (lambda *p : f"{p[0]}[{p[1]}] = {p[2]}")

cs_idxrange = lambda *p : f"{p[1]} >= 0 && {p[1]} < {p[0]}.Count"
cs_trivial = lambda *p : f"true"

angello_info = {
    "ArrayList": ("ArrayList", {
        "Contains":     csfunc("bool",  ["int"],        True,   True,   cs_generic("Contains"), cs_trivial), 
        "Count":        csfunc("int",   [],             True,   True,   cs_getter("Count"),     cs_trivial), 
        "IndexOf":      csfunc("int",   ["int"],        True,   True,   cs_generic("IndexOf"),  cs_trivial), 
        "LastIndexOf":  csfunc("int",   ["int"],        True,   True,   cs_generic("LastIndexOf"),  cs_trivial), 
        "Add":          csfunc("int",   ["int"],        False,  False,  cs_generic("Add"),      cs_trivial), 
        "Insert":       csfunc("void",  ["int", "int"], False,  False,  cs_generic("Insert"),   cs_idxrange), 
        "Remove":       csfunc("void",  ["int"],        False,  False,  cs_generic("Remove"),   cs_trivial), 
        "Set":          csfunc("void",  ["int", "int"], False,  False,  cs_idxsetter(),         cs_idxrange),
        "Get":          csfunc("int",   ["int"],        False,  True,   cs_idxgetter("int"),    cs_idxrange),
        "_size":        csfunc(None,    None,           False,  False,  cs_getter("_size"),     None), 
        "_items":       csfunc(None,    None,           False,  False,  cs_getter("_items"),    None), 
    }),
    "BinaryHeap": ("BinaryHeap<int, int>", []),
    "Dictionary": ("Dictionary<int, int>", []),
    "HashSet": ("HashSet<int>", []),
    "Queue": ("Queue<int>", []),
    "Stack": ("Stack<int>", []),
    "UndirectedGraph": ("UndirectedGraph<int, Edge<int>>", []),
}

def closing_paren(string, start):
    if string[start] not in "[({":
        return start
    left = string[start]
    right = {"[":"]", "(":")", "{":"}"}[left]
    end, balance = start + 1, 1
    while end < len(string):
        if balance == 0: return end
        if string[end] == left: balance += 1
        elif string[end] == right: balance -= 1   
        end += 1
    return end

# veryyyy specific, assumes formula is top level implication
def handle_implies(asrt):
    if "=>" in asrt:
        fp, sp = asrt.split("=>")
        return f"!({fp[1:]}) || ({sp[:-1]})"
    if "IMPLIES" in asrt:
        pieces, lstidx = [], 0
        for m in re.finditer(f"IMPLIES", asrt):
            end = closing_paren(asrt, m.span()[1])
            sep = m.span()[1]+1
            while(sep < end):
                if asrt[sep] == ",": break
                new_sep = closing_paren(asrt, sep)
                sep = max(sep+1, new_sep)
            fp = asrt[m.span()[0]+len("IMPLIES("):sep]
            sp = asrt[sep+1:end-1]
            new_term = f"(!({fp}) || ({sp}))"
            pieces += [asrt[lstidx:m.span()[0]], new_term]
            lstidx = end
        asrt = "".join(pieces + [asrt[lstidx:]])
        return asrt

    return asrt

# just a hack
def cs_anlyz_post(pfx, asrt, fuzzfname, funcs, old_objname, new_objname, argname, retvar):
    for l in pfx.split("\n")[::-1]:
        match = re.match(r".*public \w+ \w+ \w+[\[(]?([ \w,]*)[\])]?", l.strip())
        if match:
            if match.group(1): args = [arg.split()[1] for arg in match.group(1).split(",")]
            else: args = []
            if fuzzfname == "Set": args.append("value")
            assert len(funcs[fuzzfname]["args"]) == len(args)
            break

    if "PexAssumeUnderTest" in pfx:
        return "", asrt
    else:
        for i,arg in enumerate(args):
            subf = lambda m : m.group()[0]+argname+str(i) if m.group() else None
            asrt = re.sub(f"[^.\w]{arg}", subf, asrt)
        asrt = asrt.replace("this.", "")

        asrt = handle_implies(asrt)

        for fname in funcs:
            pieces, lstidx = [], 0
            for m in re.finditer(f"[^.\w]{fname}", asrt):
                end = closing_paren(asrt, m.span()[1])
                term = asrt[m.span()[0]:end]
                params = asrt[m.span()[1]+1:end-1].split(",")
                new_term = funcs[fname]["call"](new_objname, *params)
                pieces += [asrt[lstidx:m.span()[0]+1], new_term]
                lstidx = end
            asrt = "".join(pieces + [asrt[lstidx:]])
        
        asrt = asrt.replace("RET", retvar)
        old_exprs, old_addns = set(), ""
        for m in re.finditer(r"OLD", asrt):
            end = closing_paren(asrt, m.span()[1])
            old_exprs.add(asrt[m.span()[0]:end])
        for i,var in enumerate(old_exprs):
            old_addns += f"\nvar Old_var{str(i)} = {var[4:-1].replace(new_objname, old_objname)};"
            asrt = asrt.replace(var, f"Old_var{str(i)}")
            
        return old_addns, asrt

# just a hack
def cs_guessfuncname(pfx):
    for l in pfx.split("\n")[::-1]:
        match1 = re.match(r".*public void PUT_(.*)Contract[(].*", l.strip())
        match2 = re.match(r".*public \w+ \w+ (\w+).*", l.strip())
        if match1: return match1.group(1)
        if match2:
            if match2.group(1) == "this":
                for _l in pfx.split("\n")[::-1]:
                    if _l.strip() == "get": return "Get"
                    if _l.strip() == "set": return "Set"
            return match2.group(1)

# just a hack
def cs_guessnamespace(pfx):
    for l in pfx.split("\n")[::-1]:
        match = re.match(r".*namespace (\w+).*", l.strip())
        if match:
            return match.group(1)

def parse_pexreport(report):
    passing_tests, total_tests = 0, 0
    tree = ElementTree.parse(report)
    for test in tree.findall(".//generatedTest"):
        name = test.get("name")
        status = test.get("status")
        if name.find("TermDestruction") != -1:
            continue
        if status in ("assumptionviolation", "minimizationrequest", "pathboundsexceeded"):
            continue
        if status == "normaltermination":
            passing_tests += 1
        total_tests += 1
    return passing_tests, total_tests

def cs_getobs(obj, vdict, fdict):
    ret = []
    for f in fdict:
        if not fdict[f]["isobs"]:
            continue
        combos = itertools.product(*[vdict[typ] if typ in vdict else []
            for typ in fdict[f]["args"]])
        ret += [(fdict[f]["rtyp"], fdict[f]["call"](obj, *combo)) 
            for combo in combos]
    return ret

def extrct_formula(grnd_truth, asrt):
    f_true, f_test = [
            re.match(r".*Assert[(](.*)[)]\s*;.*", x.strip()) for x in [grnd_truth, asrt]]
    assert f_true, "Ground truth assertion not in the required format"
    if f_test == None or f_test.group(1).strip() == "":
        return f_true, None
    return f"({f_true.group(1)})", f"({f_test.group(1)})"
