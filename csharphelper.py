import re

fuzz_objname, fuzz_argname, fuzz_retvar = "obj", "arg", "New_Ret"

cs_cmple_cmd = "C:\\Windows\\Microsoft.NET\\Framework\\v4.0.30319\\Csc.exe /noconfig /nowarn:\"1701,1702\" /nostdlib+ /errorreport:prompt /warn:4 /define:\"DEBUG;TRACE\" /highentropyva-  /reference:\"C:\\Program Files (x86)\\Common Files\\Microsoft Shared\\ExtendedReflection\\0.94.51006.1\\bin\\Microsoft.ExtendedReflection.dll\" /reference:\"C:\\Program Files (x86)\\Microsoft Moles\\PublicAssemblies\\Microsoft.Pex.Framework.dll\" /reference:\"C:\\Program Files (x86)\\Reference Assemblies\\Microsoft\\Framework\\.NETFramework\\v4.0\\mscorlib.dll\" /reference:\"test\\bin\\nunit.framework.dll\" /reference:\"C:\\Program Files (x86)\\Reference Assemblies\\Microsoft\\Framework\\.NETFramework\\v4.0\\System.Core.dll\" /reference:\"C:\\Program Files (x86)\\Reference Assemblies\\Microsoft\\Framework\\.NETFramework\\v4.0\\System.dll\" /reference:\"test\\bin\\Utility.dll\" /reference:\"test\\bin\\{0}.dll\" /debug+ /debug:full /filealign:512 /optimize- /out:test\\bin\\FuzzTest.dll /target:library /utf8output test\\FuzzTest.cs test\\Factories\\{0}Factory.cs \"C:\\Users\\aman\\AppData\\Local\\Temp\\.NETFramework,Version=v4.0.AssemblyAttributes.cs\""

def csfunc(rtyp, args, isobs, call, pre):
    # return type, args type list, is observer,
    # how to call, what precond it assumes
    return {"rtyp":rtyp, "args":args, "isobs":isobs,
            "call":call, "pre":pre}

cs_generic = lambda f : (lambda *p : f"{p[0]}.{f}({','.join(p[1:])})")
cs_getter = lambda f : (lambda *p : f"{p[0]}.{f}")
cs_idxgetter = lambda t : (lambda *p : f"({t})({p[0]}[{p[1]}])")
cs_idxsetter = lambda : (lambda *p : f"{p[0]}[{p[1]}] = {p[2]}")

cs_idxrange = lambda *p : f"{p[1]} >= 0 && {p[1]} < {p[0]}.Count"
cs_trivial = lambda *p : f"true"

angello_info = {
    "ArrayList": ("ArrayList", {
        "Contains":     csfunc("bool",  ["int"],        True,   cs_generic("Contains"), cs_trivial), 
        "Count":        csfunc("int",   [],             True,   cs_getter("Count"),     cs_trivial), 
        "IndexOf":      csfunc("int",   ["int"],        True,   cs_generic("IndexOf"),  cs_trivial), 
        "LastIndexOf":  csfunc("int",   ["int"],        True,   cs_generic("LastIndexOf"),  cs_trivial), 
        "Add":          csfunc("int",   ["int"],        False,  cs_generic("Add"),      cs_trivial), 
        "Insert":       csfunc("void",  ["int", "int"], False,  cs_generic("Insert"),   cs_idxrange), 
        "Remove":       csfunc("void",  ["int"],        False,  cs_generic("Remove"),   cs_trivial), 
        "Set":          csfunc("void",  ["int", "int"], False,  cs_idxsetter(),         cs_idxrange),
        "Get":          csfunc("int",   ["int"],        False,  cs_idxgetter("int"),    cs_idxrange),
        "_size":        csfunc(None,    None,           False,  cs_getter("_size"),     None), 
        "_items":       csfunc(None,    None,           False,  cs_getter("_items"),    None), 
    }),        
    "BinaryHeap": ("BinaryHeap<int, int>", []),        
    "Dictionary": ("Dictionary<int, int>", []),
    "HashSet": ("HashSet<int>", []),
    "Queue": ("Queue<int>", []),    
    "Stack": ("Stack<int>", []),
    "UndirectedGraph": ("UndirectedGraph<int, Edge<int>>", []),
}

def closing_paren(string, start):
    if string[start] != "(":
        return start
    end, balance = start + 1, 1
    while end < len(string):
        if balance == 0: return end
        if string[end] == "(": balance += 1
        elif string[end] == ")": balance -= 1   
        end += 1
    return end

# just a hack
def cs_anlyz_post(pfx, asrt, fuzzfname, funcs):
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
            asrt = asrt.replace(arg, fuzz_argname + str(i))
        asrt = asrt.replace("this.", "")

        for fname in funcs:
            pieces, lstidx = [], 0
            for m in re.finditer(f"[^.\w]{fname}", asrt):
                end = closing_paren(asrt, m.span()[1])
                term = asrt[m.span()[0]:end]
                params = asrt[m.span()[1]+1:end-1].split(",")
                new_term = funcs[fname]["call"](fuzz_objname, *params)
                pieces += [asrt[lstidx:m.span()[0]+1], new_term]
                lstidx = end
            asrt = "".join(pieces + [asrt[lstidx:]])
        
        asrt = asrt.replace("RET", fuzz_retvar)
        old_exprs, old_addns = set(), ""
        for m in re.finditer(r"OLD", asrt):
            end = closing_paren(asrt, m.span()[1])
            old_exprs.add(asrt[m.span()[0]:end])
        for i,var in enumerate(old_exprs):
            old_addns += f"\nvar Old_var{str(i)} = {var[4:-1]};"
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

