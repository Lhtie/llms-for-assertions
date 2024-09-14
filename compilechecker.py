import re
import subprocess
import sys
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
        }}
    }}
}}
"""

def cs_cmplecheck(pfx, sfx, grnd_truth, asrt):
    namespace = cs_guessnamespace(pfx)
    fuzzfuncname = cs_guessfuncname(pfx)
    classname, classfuncs = angello_info[namespace]
    fuzzfunc = classfuncs[fuzzfuncname]

    grnd_truth, asrt = extrct_formula(grnd_truth, asrt)
    if not asrt: return False

    nvars, vardict, allvars = 0, {}, []
    for argtyp in fuzzfunc["args"]:
        newvar = fuzz_argname + str(nvars)
        allvars.append(newvar)
        if argtyp in vardict: vardict[argtyp] += [newvar]
        else: vardict[argtyp] = [newvar]
        nvars += 1

    old_addns, tfrmd_asrt = cs_anlyz_post(pfx, asrt, fuzzfuncname, classfuncs,
            fuzz_objname, fuzz_objname, fuzz_argname, fuzz_retvar)

    params = ",".join([fuzz_objname] + [",".join([f"{typ} {v}" for v in vardict[typ]])
        for typ in vardict])
    
    old_vals = old_addns
    
    func_call = ("" if fuzzfunc["rtyp"] == "void" \
            else f"{fuzzfunc['rtyp']} {fuzz_retvar} = ") + \
            fuzzfunc["call"](fuzz_objname, *allvars[:len(fuzzfunc["args"])]) + ";"

    post_cond = f"PexAssert.IsTrue({tfrmd_asrt});"

    code = cscode.format(namespace, classname, params, old_vals, func_call, post_cond)
    cmple_cmd = cs_cmple_cmd.format(namespace)

    fname = "/home/aman14/code/tmp/_compile_check.cs"
    fd = open(fname, "w")
    fd.write(code)
    fd.close()

    remote_cmds = subprocess.run(["bash", "-c", f"""
        ssh -p 3022 aman@localhost 'del test\\FuzzTest.cs test\\bin\\FuzzTest.dll test\\bin\\FuzzTest.pdb';
        scp -P 3022 {fname} 'aman@localhost:C:\\Users\\aman\\test\\FuzzTest.cs' &&
        ssh -p 3022 aman@localhost '{cmple_cmd}'
    """], stdout = sys.stderr)
    
    # assert remote_cmds.returncode == 0
    if remote_cmds.returncode != 0: print("!"*10 + " compile check failure", file=sys.stderr)
    return remote_cmds.returncode == 0


def py_cmplecheck(pfx, sfx, grnd_truth, asrt):
    # must be a better way to match indentation levels for python
    asrt = asrt.replace("\r", "\n").replace("\f", "\n").replace("\v", "\n").strip("\n")
    asrt = asrt.replace("\t", "    ") # pep8 prefers spaces
    curshift = re.match(r"^\s*", asrt).group(0)
    shift = re.match(r"^\s*", grnd_truth).group(0)
    code = "\n".join(
            [pfx] + [shift + l.removeprefix(curshift) for l in asrt.split("\n")] + [sfx])

    # code = "\n".join([pfx, asrt, sfx]) # simple
    
    fname = "/home/aman14/code/tmp/_compile_check.py"
    fd = open(fname, "w")
    fd.write(code)
    fd.close()

    proc = subprocess.run(["python3", "-m", "py_compile", fname],
                stderr=subprocess.DEVNULL)
    return proc.returncode == 0

def cmplecheck(langid, pfx, sfx, grnd_truth, asrt):

    if(langid == "py"):
        result = py_cmplecheck(pfx, sfx, grnd_truth, asrt)
        
    elif(langid == "cs"):
        result = cs_cmplecheck(pfx, sfx, grnd_truth, asrt)

    else: 
        assert False, "Incorrect language id: " + langid

    return result
