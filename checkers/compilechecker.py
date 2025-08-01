import re
import subprocess
import sys
import os
import shutil
import glob

from codehelper.csharphelper import *
from codehelper.javahelper import javahelper
from codehelper.javahelper import third_party, combinedcodes

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

javacode = """
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
{0}

import combinedcodes.{1};

public class FuzzTest{2}{{
    public void FuzzTest_{3}({1}{2} {4}{5}){{
        if ({4} == null) return ;   // ignore null test objects
        
        // copy old values
{6}

        // function call
{7}

        // compute forall
{8}

        // normal post condition
{9}
        Boolean normalpost = exec(() -> {10});
        if (normalpost == null || !normalpost)
            throw new RuntimeException("Normal Postcondition Violated");

        // exceptional post condition
{11}
        Boolean exceptionalpost = exec(() -> {12});
        if (exceptionalpost == null || !exceptionalpost)
            throw new RuntimeException("Exceptional Postcondition Violated");
    }}
    
    public static class Pair<A, B> {{
        public final A first;
        public final B second;

        public Pair(A first, B second) {{
            this.first = first;
            this.second = second;
        }}
    }}
    
    public static <T> T exec(Supplier<T> supplier){{
		try {{
			return supplier.get();
		}} catch (Exception fuzzexception) {{
			return null;
		}}
	}}
 
    public static <T> Pair<T, String> func_call_supplier(Supplier<T> supplier){{
        try {{
            return new Pair<>(supplier.get(), null);
        }} catch (Exception fuzzexception){{
            String exceptionType = fuzzexception.getClass().getSimpleName();
            return new Pair<>(null, exceptionType);
        }}
    }}
    
    public static String func_call_runnable(Runnable runnable){{
        try {{
            runnable.run();
            return null;
        }} catch (Exception fuzzexception){{
            return fuzzexception.getClass().getSimpleName();
        }}
    }}
}}
"""

tmp_dir = "./checktmp"

# handle test bench generations
def cs_handle_cmple_testbench(pfx, sfx, grnd_truth, asrt):
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
    
    asrt = asrt.split("\n")
    for i,l in enumerate(asrt):
        match = re.match(r".*TestFunction[(]([^()]*)[)].*", l.strip())
        if match:
            if match.group(1): args = [arg.split()[1] for arg in match.group(1).split(",")]
            else: args = []
            asrt = "\n".join(asrt[i:])
            break
    
    tfunc_start = asrt.find('{')
    asrt = asrt[tfunc_start+1:closing_paren(asrt, tfunc_start)-1]

    if len(classfuncs[fuzzfuncname]['args']) != len(args):
        print("!"*10 + f" TestFunction args don't match {len(classfuncs[fuzzfuncname]['args'])},{len(args)}",
                file=sys.stderr)

    for i,arg in enumerate(args):
        subf = lambda m : m.group()[0]+fuzz_argname+str(i) if m.group() else None
        asrt = re.sub(f"[^.\w]{arg}", subf, asrt)

    asrt = asrt.replace("this", fuzz_objname)

    params = ",".join([fuzz_objname] + [",".join([f"{typ} {v}" for v in vardict[typ]])
        for typ in vardict])

    asrt = asrt.replace("Debug.Assert", "PexAssert.IsTrue")

    code = cscode.format(namespace, classname, params, '', '', asrt)
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

def cs_cmplecheck(pfx, sfx, grnd_truth, asrt):
    if "TestFunction" in asrt:
        return cs_handle_cmple_testbench(pfx, sfx, grnd_truth, asrt)    

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

def java_cmplecheck(pfx, sfx, grnd_truth, asrt):
    jh = javahelper(pfx + '\n' + sfx)
    asrt = jh.extract_formula(asrt)
    asrt, old_addns, forall_addns, split_addns = jh.trans_formula(asrt)

    imports = "\n".join([f"import {x};" for x in jh.imports])
    generic = jh.classname[jh.classname.find("<"):]
    funcargs = jh.funcs[jh.funcname]["args"]
    funcargs = "".join([f", {typ} {var}" for var, typ in funcargs.items()])
    old_addns = "\n".join(["\t\t" + l for l in old_addns])
    forall_addns = "\n".join(["\t\t" + l for l in forall_addns])
    split_addns = "\n".join(["\t\t" + l for l in split_addns])
    func_call = jh.func_call(jh.funcname, jh.funcs[jh.funcname]["args"].keys())
    func_call = "\n".join(["\t\t" + l for l in func_call])
    
    if jh.funcs[jh.funcname]["iscstr"]:
        forall_addns = forall_addns.replace(jh.fuzz_objname, jh.fuzz_objname + "_final")
        split_addns = split_addns.replace(jh.fuzz_objname, jh.fuzz_objname + "_final");
        asrt = asrt.replace(jh.fuzz_objname, jh.fuzz_objname + "_final");

    code = javacode.format(
        imports, jh.namespace, generic, jh.funcname, jh.fuzz_objname, funcargs, 
        old_addns, func_call, forall_addns, split_addns, asrt, "", "true"
    )

    if os.path.exists(tmp_dir):
        shutil.rmtree(tmp_dir)
    os.makedirs(tmp_dir, exist_ok=False)
    
    for file in third_party:
        if os.path.isdir(file):
            shutil.copytree(file, os.path.join(tmp_dir, os.path.basename(file)), dirs_exist_ok=True)
        else:
            shutil.copyfile(file, os.path.join(tmp_dir, os.path.basename(file)))

    os.makedirs(os.path.join(tmp_dir, "fuzztests"), exist_ok=False)
    fname = os.path.join(tmp_dir, "fuzztests/FuzzTest.java")
    with open(fname, "w") as fd:
        fd.write(code)

    jar_files = ":".join(glob.glob(os.path.join(tmp_dir, "*.jar")))
    proc = subprocess.run([
            "javac",
            "-cp", f"{os.path.dirname(fname)}:{combinedcodes}:{jar_files}",
            fname,
            f"{combinedcodes}/{jh.namespace}.java"
        ], stderr=subprocess.DEVNULL)
    
    shutil.rmtree(tmp_dir)
    return proc.returncode == 0

def cmplecheck(langid, pfx, sfx, grnd_truth, asrt):

    if(langid == "py"):
        result = py_cmplecheck(pfx, sfx, grnd_truth, asrt)
        
    elif(langid == "cs"):
        result = cs_cmplecheck(pfx, sfx, grnd_truth, asrt)
    
    elif(langid == "java"):
        result = java_cmplecheck(pfx, sfx, grnd_truth, asrt)

    else: 
        assert False, "Incorrect language id: " + langid

    return result
