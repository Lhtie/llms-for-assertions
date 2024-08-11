import subprocess
import os
import shutil
import sys
import re
import itertools
from xml.etree import ElementTree
from csharphelper import *

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
[assembly: PexCoverageFilterType(PexCoverageDomain.UserCodeUnderTest, typeof({0}.{1}))] // bruh
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
        public void PUT_FuzzTest([PexAssumeUnderTest]{1} {2}) //bruh
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

cs_pex_cmd = "\"C:\\Program Files (x86)\\Microsoft Pex\\bin\\pex.exe\" test\\bin\\FuzzTest.dll /membernamefilter:M:PUT_FuzzTest! /methodnamefilter:PUT_FuzzTest! /namespacefilter:{0}.Test! /typefilter:FuzzTest! /NoConsole /donotopenreport /x86"

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

def cs_getpostcond(grnd_truth, asrt, check):
    f_true, f_test = [
            re.match(r".*Assert[(](.*)[)]\s*;.*", x.strip()) for x in [grnd_truth, asrt]]
    assert f_true, "Ground truth assertion not in the required format"
    if f_test == None: return None
    f_true, f_test = f_true.group(1), f_test.group(1)

    if(check == "equality"):
        postcond_formula = f"({f_true}) == ({f_test})"
    elif(check == "implication"):
        postcond_formula = f"!({f_true}) || ({f_test})"
    elif(check == "soundness"):
        postcond_formula = f"({f_test})"
    else:
        assert False, f"Incorrect check : {check}"
    return postcond_formula

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

def cs_fuzzcheck(pfx, sfx, grnd_truth, asrt, check):
    namespace = cs_guessnamespace(pfx)
    fuzzfuncname = cs_guessfuncname(pfx)
    classname, classfuncs = angello_info[namespace]
    fuzzfunc = classfuncs[fuzzfuncname]

    nvars, vardict, allvars = 0, {}, []
    for argtyp in fuzzfunc["args"]:
        newvar = fuzz_argname + str(nvars)
        allvars.append(newvar)
        if argtyp in vardict: vardict[argtyp] += [newvar]
        else: vardict[argtyp] = [newvar]
        nvars += 1

    old_addns, tfrmd_asrt = cs_anlyz_post(pfx, asrt, fuzzfuncname, classfuncs)

    params = ",".join([fuzz_objname] + [",".join([f"{typ} {v}" for v in vardict[typ]])
        for typ in vardict])
    
    precond_formula = fuzzfunc["pre"](fuzz_objname, *allvars)
    pre_cond = f"PexAssume.IsTrue({precond_formula});"
    
    old_obs_vals = "\n".join([f"{t} Old_{re.sub('[^0-9a-zA-Z]+', '', c)} = {c};" 
        for t,c in cs_getobs(fuzz_objname, vardict, classfuncs)])
    old_obs_vals += old_addns
    
    func_call = ("" if fuzzfunc["rtyp"] == "void" \
            else f"{fuzzfunc['rtyp']} {fuzz_retvar} = ") + \
            fuzzfunc["call"](fuzz_objname, *allvars) + ";"

    allvars.append(fuzz_retvar)
    if fuzzfunc["rtyp"] in vardict: vardict[fuzzfunc["rtyp"]] += [fuzz_retvar]
    else: vardict[fuzzfunc["rtyp"]] = [fuzz_retvar]
    
    new_obs_vals = "\n".join([f"{t} New_{re.sub('[^0-9a-zA-Z]+', '', c)} = {c};"
        for t,c in cs_getobs(fuzz_objname, vardict, classfuncs)])
    
    postcond_formula = cs_getpostcond(grnd_truth, tfrmd_asrt, check)
    post_cond = f"PexAssert.IsTrue({postcond_formula});"
    if not postcond_formula:
        return False

    code = cscode.format(namespace, classname, params, pre_cond, old_obs_vals, func_call, 
            new_obs_vals, post_cond)
    cmple_cmd = cs_cmple_cmd.format(namespace)
    pex_cmd = cs_pex_cmd.format(namespace)
    print(code)

    dumpdir = "/home/aman14/code/tmp"
    fname = "/home/aman14/code/tmp/_fuzz_check.cs"
    shutil.rmtree(f"{dumpdir}/reports/", ignore_errors=True)
    fd = open(fname, "w")
    fd.write(code)
    fd.close()

    remote_cmds = subprocess.run(["bash", "-c", f"""
        ssh -p 3022 aman@localhost 'rmdir /s /q test\\bin\\reports';
        ssh -p 3022 aman@localhost 'del test\\FuzzTest.cs test\\bin\\FuzzTest.dll test\\bin\\FuzzTest.pdb';
        scp -P 3022 {fname} 'aman@localhost:C:\\Users\\aman\\test\\FuzzTest.cs' &&
        ssh -p 3022 aman@localhost '{cmple_cmd}' &&
        ssh -p 3022 aman@localhost '{pex_cmd}' &&
        scp -r -P 3022 'aman@localhost:C:\\Users\\aman\\test\\bin\\reports' {dumpdir}
    """], stdout = sys.stderr)

    assert remote_cmds.returncode == 0

    reportdir = os.listdir(f"{dumpdir}/reports/")[0]
    passing_tests, total_tests = parse_pexreport(f"{dumpdir}/reports/{reportdir}/report.per")
    
    return passing_tests == total_tests

def fuzzcheck(langid, pfx, sfx, grnd_truth, asrt, check):
    if(langid == "py"):
        result = True

    elif(langid == "cs"):
        result = cs_fuzzcheck(pfx, sfx, grnd_truth, asrt, check)

    else: 
        assert False, "Incorrect language id: " + langid

    return result

