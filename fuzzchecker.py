import subprocess
import os
import shutil
import sys
import re
import itertools
from xml.etree import ElementTree

cscode = """
// AssemblyInfo.cs
using System.Runtime.CompilerServices;
using System.Runtime.InteropServices;
// PexAssemblyInfo.cs
using Microsoft.Pex.Framework.Coverage;
using Microsoft.Pex.Framework.Creatable;
using Microsoft.Pex.Framework.Explorable;
using Microsoft.Pex.Framework.Instrumentation;
using Microsoft.Pex.Framework.Moles;
using Microsoft.Pex.Framework.Using;
// contract
using Microsoft.Pex.Framework;
using Microsoft.Pex.Framework.Exceptions;
using Microsoft.Pex.Framework.Generated;
using Microsoft.Pex.Framework.Settings;
using Microsoft.Pex.Framework.Validation;
using NUnit.Framework;
using System;
using System.Net;
using System.Reflection;
using System.Text;
using {0};
using {0}.Utility;

// AssemblyInfo.cs
[assembly: AssemblyTitle("FuzzTest")]
[assembly: AssemblyDescription("")]
[assembly: AssemblyConfiguration("")]
[assembly: AssemblyCompany("")]
[assembly: AssemblyProduct("FuzzTest")]
[assembly: AssemblyCopyright("Copyleft")]
[assembly: AssemblyTrademark("")]
[assembly: AssemblyCulture("")]
[assembly: AssemblyVersion("1.0.0.0")]
[assembly: AssemblyFileVersion("1.0.0.0")]
[assembly: ComVisible(false)]
// PexAssemblyInfo.cs
[assembly: PexAssemblySettings(TestFramework = "NUnit")]
[assembly: PexAssemblyUnderTest("{0}")]
[assembly: PexInstrumentAssembly("System.Core")]
[assembly: PexUseTypeAttribute(typeof({0}EqualityComparer))]
[assembly: PexCoverageFilterAssembly(PexCoverageDomain.UserOrTestCode, "System.Core")]
[assembly: PexCoverageFilterType(PexCoverageDomain.UserOrTestCode, typeof({0}EqualityComparer))]
[assembly: PexCoverageFilterType(PexCoverageDomain.UserCodeUnderTest, typeof({0}.{1}))]
[assembly: PexCreatableFactoryForDelegates]
[assembly: PexAllowedContractRequiresFailureAtTypeUnderTestSurface]
[assembly: PexAllowedXmlDocumentedException]
[assembly: PexAssumeContractEnsuresFailureAtBehavedSurface]
[assembly: PexChooseAsBehavedCurrentBehavior]
[assembly: PexInstrumentAssembly("Microsoft.VisualBasic", InstrumentationLevel = PexInstrumentationLevel.Excluded)]

// contract
namespace {0}.Test
{{
    [TestFixture, PexClass]
    public partial class FuzzTest
    {{
        [PexMethod]
        public void PUT_FuzzTest([PexAssumeUnderTest]{1} {2})
        {{
            {3}
            {4}
            {5}
            {6}
            {7}
        }}
    }}
}}
"""

cs_cmple_cmd = "C:\\Windows\\Microsoft.NET\\Framework\\v4.0.30319\\Csc.exe /noconfig /nowarn:\"1701,1702\" /nostdlib+ /errorreport:prompt /warn:4 /define:\"DEBUG;TRACE\" /highentropyva-  /reference:\"C:\\Program Files (x86)\\Common Files\\Microsoft Shared\\ExtendedReflection\\0.94.51006.1\\bin\\Microsoft.ExtendedReflection.dll\" /reference:\"C:\\Program Files (x86)\\Microsoft Moles\\PublicAssemblies\\Microsoft.Pex.Framework.dll\" /reference:\"C:\\Program Files (x86)\\Reference Assemblies\\Microsoft\\Framework\\.NETFramework\\v4.0\\mscorlib.dll\" /reference:\"test\\bin\\nunit.framework.dll\" /reference:\"C:\\Program Files (x86)\\Reference Assemblies\\Microsoft\\Framework\\.NETFramework\\v4.0\\System.Core.dll\" /reference:\"C:\\Program Files (x86)\\Reference Assemblies\\Microsoft\\Framework\\.NETFramework\\v4.0\\System.dll\" /reference:\"test\\bin\\Utility.dll\" /reference:\"test\\bin\\{0}.dll\" /debug+ /debug:full /filealign:512 /optimize- /out:test\\bin\\FuzzTest.dll /target:library /utf8output test\\FuzzTest.cs test\\Factories\\{0}Factory.cs \"C:\\Users\\aman\\AppData\\Local\\Temp\\.NETFramework,Version=v4.0.AssemblyAttributes.cs\""

cs_pex_cmd = "\"C:\\Program Files (x86)\\Microsoft Pex\\bin\\pex.exe\" test\\bin\\FuzzTest.dll /membernamefilter:M:PUT_FuzzTest! /methodnamefilter:PUT_FuzzTest! /namespacefilter:{0}.Test! /typefilter:FuzzTest! /NoConsole /donotopenreport"

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

def csfunc(rtyp, args, isobs, call, pre):
    return {"rtyp":rtyp, "args":args, "isobs":isobs,
            "call":call, "pre":pre}

cs_generic = lambda f : (lambda *p : f"{p[0]}.{f}({','.join(p[1:])})")
cs_getter = lambda f : (lambda *p : f"{p[0]}.{f}")
cs_idxgetter = lambda t : (lambda *p : f"({t})({p[0]}[{p[1]}])")
cs_idxsetter = lambda : (lambda *p : f"{p[0]}[{p[1]}] = {p[2]}")

cs_idxrange = lambda *p : f"{p[1]} >= 0 && {p[1]} < {p[0]}.Count"
cs_trivial = lambda *p : f"true"

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

def cs_fuzzcheck(pfx, sfx, grnd_truth, asrt, check):
    info = {
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
        }),        
        "BinaryHeap": ("BinaryHeap<int, int>", []),        
        "Dictionary": ("Dictionary<int, int>", []),        
        "HashSet": ("HashSet<int>", []),        
        "Queue": ("Queue<int>", []),        
        "Stack": ("Stack<int>", []),        
        "UndirectedGraph": ("UndirectedGraph<int, Edge<int>>", []),        
    }

    namespace = "ArrayList"
    fuzzfuncname = "Count"
    objname, argname = "obj", "arg"
    classname, classfuncs = info[namespace]
    fuzzfunc = classfuncs[fuzzfuncname]

    nvars, vardict = 0, {}
    for argtyp in fuzzfunc["args"]:
        if argtyp in vardict: vardict[argtyp] += [argname + str(nvars)]
        else: vardict[argtyp] = [argname + str(nvars)]
        nvars += 1

    params = ",".join([objname] + [",".join([f"{typ} {v}" 
        for v in vardict[typ]]) for typ in vardict])
    
    precond_formula = fuzzfunc["pre"](objname, *[argname + str(j) for j in range(nvars)])
    pre_cond = f"PexAssume.IsTrue({precond_formula});"
    
    old_vars = "\n".join([f"{t} Old_{re.sub('[^0-9a-zA-Z]+', '', c)} = {c};" 
        for t,c in cs_getobs(objname, vardict, classfuncs)])
    
    func_call = ("" if fuzzfunc["rtyp"] == "void" else f"{fuzzfunc['rtyp']} New_Ret = ") + \
            fuzzfunc["call"](objname, *[argname + str(j) for j in range(nvars)]) + ";"

    if fuzzfunc["rtyp"] in vardict: vardict[fuzzfunc["rtyp"]] += ["New_Ret"]
    else: vardict[fuzzfunc["rtyp"]] = ["New_Ret"]
    
    new_vars = "\n".join([f"{t} New_{re.sub('[^0-9a-zA-Z]+', '', c)} = {c};"
        for t,c in cs_getobs(objname, vardict, classfuncs)])
    
    post_cond = "PexAssert.IsTrue(true);"

    code = cscode.format(namespace, classname, params, pre_cond, old_vars, func_call, new_vars, post_cond)
    cmple_cmd = cs_cmple_cmd.format(namespace)
    pex_cmd = cs_pex_cmd.format(namespace)

    print(code)

    dumpdir = "/home/aman14/code/tmp"
    shutil.rmtree(f"{dumpdir}/reports/", ignore_errors=True)

    fname = "/home/aman14/code/tmp/_fuzz_check.cs"
    fd = open(fname, "w")
    fd.write(code)
    fd.close()

    script = subprocess.run(["bash", "-c", f"""
        ssh -p 3022 aman@localhost 'rmdir /s /q test\\bin\\reports';
        ssh -p 3022 aman@localhost 'del test\\FuzzTest.cs test\\bin\\FuzzTest.dll test\\bin\\FuzzTest.pdb';
        scp -P 3022 {fname} 'aman@localhost:C:\\Users\\aman\\test\\FuzzTest.cs' &&
        ssh -p 3022 aman@localhost '{cmple_cmd}' &&
        ssh -p 3022 aman@localhost '{pex_cmd}' &&
        scp -r -P 3022 'aman@localhost:C:\\Users\\aman\\test\\bin\\reports' {dumpdir}
    """], stdout = sys.stderr)
    assert script.returncode == 0

    reportdir = os.listdir(f"{dumpdir}/reports/")[0]
    passing_tests, total_tests = parse_pexreport(f"{dumpdir}/reports/{reportdir}/report.per")
    print(passing_tests, total_tests)
    
    return True

cs_fuzzcheck(None,None,None,"true",None)

def fuzzcheck(langid, pfx, sfx, grnd_truth, asrt, check):
    if(langid == "py"):
        result = True

    elif(langid == "cs"):
        result = cs_fuzzcheck(pfx, sfx, grnd_truth, asrt, check)

    else: 
        assert False, "Incorrect language id: " + langid

    return result

