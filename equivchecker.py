import subprocess
import os
import shutil
import sys
import re
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
        public void PUT_FuzzTest([PexAssumeUnderTest]{1} {2}, [PexAssumeUnderTest]{1} {3}) //bruh
        {{
            {4}
            {5}
            {6}
            {7}
        }}
    }}
}}
"""

def cs_getpostcond(grnd_truth, asrt):
    return f"({grnd_truth}) == ({asrt})"

def cs_equivcheck(pfx, sfx, grnd_truth, asrt):
    namespace = cs_guessnamespace(pfx)
    fuzzfuncname = cs_guessfuncname(pfx)
    classname, classfuncs = angello_info[namespace]
    fuzzfunc = classfuncs[fuzzfuncname]
    old_objname, new_objname = f"{fuzz_objname}_old", f"{fuzz_objname}_new"

    grnd_truth, asrt = extrct_formula(grnd_truth, asrt)
    if not asrt: return False

    nvars, vardict, allvars = 0, {}, []
    for argtyp in fuzzfunc["args"]:
        newvar = fuzz_argname + str(nvars)
        allvars.append(newvar)
        if argtyp in vardict: vardict[argtyp] += [newvar]
        else: vardict[argtyp] = [newvar]
        nvars += 1
    if fuzzfunc["rtyp"] != "void":
        allvars.append(fuzz_retvar)
        if fuzzfunc["rtyp"] in vardict: vardict[fuzzfunc["rtyp"]] += [fuzz_retvar]
        else: vardict[fuzzfunc["rtyp"]] = [fuzz_retvar]

    old_addns, tfrmd_asrt = cs_anlyz_post(pfx, asrt, fuzzfuncname, classfuncs,
            old_objname, new_objname, fuzz_argname, fuzz_retvar)

    params = ",".join([new_objname] + [",".join([f"{typ} {v}" for v in vardict[typ]])
        for typ in vardict])

    precond_o = fuzzfunc["pre"](old_objname, *allvars)
    precond_n = fuzzfunc["pre"](new_objname, *allvars)
    pre_cond = f"PexAssume.IsTrue(({precond_o}) && ({precond_n}));"
    
    old_obs_vals = "\n".join([
        f"{t} Old_{re.sub('[^0-9a-zA-Z]+', '', c.replace(old_objname, fuzz_objname))} = {c};" 
        for t,c in cs_getobs(old_objname, vardict, classfuncs)])
    old_obs_vals += old_addns
    
    new_obs_vals = "\n".join([
        f"{t} New_{re.sub('[^0-9a-zA-Z]+', '', c.replace(new_objname, fuzz_objname))} = {c};"
        for t,c in cs_getobs(new_objname, vardict, classfuncs)])
    
    postcond_formula = cs_getpostcond(grnd_truth, tfrmd_asrt)
    
    # at least for observer methods retvar is fixed
    if fuzzfunc["ispur"]:
        postcond_formula  = f"({postcond_formula}) || "
        postcond_formula += f"!(({fuzz_retvar} == {fuzzfunc['call'](old_objname, *allvars[:len(fuzzfunc['args'])])})"
        postcond_formula += f" && ({fuzz_retvar} == {fuzzfunc['call'](new_objname, *allvars[:len(fuzzfunc['args'])])}))"

    post_cond = f"PexAssert.IsTrue({postcond_formula});"

    code = cscode.format(namespace, classname, old_objname, params, pre_cond, 
            old_obs_vals, new_obs_vals, post_cond)
    cmple_cmd = cs_cmple_cmd.format(namespace)
    pex_cmd = cs_pex_cmd.format(namespace)

    dumpdir = "/home/aman14/code/tmp"
    fname = "/home/aman14/code/tmp/_equiv_check.cs"
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

    # assert remote_cmds.returncode == 0
    if remote_cmds.returncode != 0: print("!"*10 + " equiv check failure", file=sys.stderr)
    if remote_cmds.returncode != 0: return False

    reportdir = os.listdir(f"{dumpdir}/reports/")[0]
    passing_tests, total_tests = parse_pexreport(f"{dumpdir}/reports/{reportdir}/report.per")
    
    return passing_tests == total_tests

def equivcheck(langid, pfx, sfx, grnd_truth, asrt):
    if(langid == "py"):
        result = True

    elif(langid == "cs"):
        result = cs_equivcheck(pfx, sfx, grnd_truth, asrt)

    else: 
        assert False, "Incorrect language id: " + langid

    return result

