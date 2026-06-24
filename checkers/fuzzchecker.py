import subprocess
import os
import shutil
import sys
import re
import glob

from codehelper.csharphelper import *
from codehelper.javahelper import javahelper
from codehelper.javahelper import third_party

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

javacode = """
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
{0}

import {1}.{2};

public class FuzzTest{3}{{
    public{4} void FuzzTest_{5}({2}{3} {6}{7}){{
        if ({6} == null) return ;   // ignore null test objects
        
        // copy old values
{8}

        // function call
{9}

        // compute forall
{10}

        // normal post condition
{11}
        Boolean normalpost = exec(() -> {12});
        if (normalpost == null || !normalpost)
            throw new RuntimeException("Normal Postcondition Violated");

        // exceptional post condition
{13}
        Boolean exceptionalpost = exec(() -> {14});
        if (exceptionalpost == null || !exceptionalpost)
            throw new RuntimeException("Exceptional Postcondition Violated");
    }}
    
    private static class Pair<A, B> {{
        private final A first;
        private final B second;

        private Pair(A first, B second) {{
            this.first = first;
            this.second = second;
        }}
    }}
    
    @SuppressWarnings("unchecked")
	private static <T> T get_from_array(Object arr, int index, T ex_val){{
		try {{
			return (T) Array.get(arr, index);
		}} catch (Exception fuzzexception) {{
			return null;
		}}
	}}
    
    private static <T> T exec(Supplier<T> supplier){{
		try {{
			return supplier.get();
		}} catch (Exception fuzzexception) {{
			return null;
		}}
	}}
 
    private static <T> Pair<T, String> func_call_supplier(Supplier<T> supplier){{
        try {{
            return new Pair<>(supplier.get(), null);
        }} catch (Exception fuzzexception){{
            String exceptionType = fuzzexception.getClass().getSimpleName();
            return new Pair<>(null, exceptionType);
        }}
    }}
    
    private static String func_call_runnable(Runnable runnable){{
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
def cs_handle_fuzz_testbench(pfx, sfx, grnd_truth, asrt):
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

    code = cscode.format(namespace, classname, params, '', '', '', '', asrt)
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

    # assert remote_cmds.returncode == 0
    if remote_cmds.returncode != 0: print("!"*10 + " fuzz check failure", file=sys.stderr)
    if remote_cmds.returncode != 0: return False

    reportdir = os.listdir(f"{dumpdir}/reports/")[0]
    passing_tests, total_tests = parse_pexreport(f"{dumpdir}/reports/{reportdir}/report.per")
    
    return passing_tests == total_tests

def cs_getpostcond(grnd_truth, asrt, check):
    if(check == "equality"):
        postcond_formula = f"({grnd_truth}) == ({asrt})"
    elif(check == "implication"):
        postcond_formula = f"!({grnd_truth}) || ({asrt})"
    elif(check == "soundness"):
        postcond_formula = f"({asrt})"
    else:
        assert False, f"Incorrect check : {check}"
    return postcond_formula

def cs_fuzzcheck(pfx, sfx, grnd_truth, asrt, check):
    if "TestFunction" in asrt:
        return cs_handle_fuzz_testbench(pfx, sfx, grnd_truth, asrt)    

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
    
    precond_formula = fuzzfunc["pre"](fuzz_objname, *allvars)
    pre_cond = f"PexAssume.IsTrue({precond_formula});"
    
    old_obs_vals = "\n".join([f"{t} Old_{re.sub('[^0-9a-zA-Z]+', '', c)} = {c};" 
        for t,c in cs_getobs(fuzz_objname, vardict, classfuncs)])
    old_obs_vals += old_addns
    
    func_call = ("" if fuzzfunc["rtyp"] == "void" \
            else f"{fuzzfunc['rtyp']} {fuzz_retvar} = ") + \
            fuzzfunc["call"](fuzz_objname, *allvars[:len(fuzzfunc["args"])]) + ";"

    allvars.append(fuzz_retvar)
    if fuzzfunc["rtyp"] in vardict: vardict[fuzzfunc["rtyp"]] += [fuzz_retvar]
    else: vardict[fuzzfunc["rtyp"]] = [fuzz_retvar]
    
    new_obs_vals = "\n".join([f"{t} New_{re.sub('[^0-9a-zA-Z]+', '', c)} = {c};"
        for t,c in cs_getobs(fuzz_objname, vardict, classfuncs)])
    
    postcond_formula = cs_getpostcond(grnd_truth, tfrmd_asrt, check)
    post_cond = f"PexAssert.IsTrue({postcond_formula});"

    code = cscode.format(namespace, classname, params, pre_cond, old_obs_vals, func_call, 
            new_obs_vals, post_cond)
    cmple_cmd = cs_cmple_cmd.format(namespace)
    pex_cmd = cs_pex_cmd.format(namespace)

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

    # assert remote_cmds.returncode == 0
    if remote_cmds.returncode != 0: print("!"*10 + " fuzz check failure", file=sys.stderr)
    if remote_cmds.returncode != 0: return False

    reportdir = os.listdir(f"{dumpdir}/reports/")[0]
    passing_tests, total_tests = parse_pexreport(f"{dumpdir}/reports/{reportdir}/report.per")
    
    return passing_tests == total_tests

def java_fuzzcheck(pfx, sfx, grnd_truth, asrt, combinedcodes, check, time_limit=30):
    jh = javahelper(pfx + '\n' + sfx)
    asrt = jh.extract_formula(asrt)
    asrt, old_addns, forall_addns, split_addns = jh.trans_formula(asrt)

    imports = "\n".join([f"import {x};" for x in jh.imports])
    package = combinedcodes.split("/")[-1]
    class_generic = jh.classname[jh.classname.find("<"):] if jh.classname.find("<") != -1 else ""
    func_generic = jh.funcs[-1]["generic"]
    func_generic = f" {func_generic}" if func_generic is not None else ""
    funcargs = jh.funcs[-1]["args"]
    funcargs = "".join([f", {typ} {var}" for var, typ in funcargs.items()])
    old_addns = "\n".join(["\t\t" + l for l in old_addns])
    forall_addns = "\n".join(["\t\t" + l for l in forall_addns])
    split_addns = "\n".join(["\t\t" + l for l in split_addns])
    func_call = jh.func_call(jh.funcs[-1])
    func_call = "\n".join(["\t\t" + l for l in func_call])
    
    if jh.funcs[-1]["iscstr"]:
        forall_addns = forall_addns.replace(jh.fuzz_objname, jh.fuzz_objname + "_final")
        split_addns = split_addns.replace(jh.fuzz_objname, jh.fuzz_objname + "_final")
        asrt = asrt.replace(jh.fuzz_objname, jh.fuzz_objname + "_final")

    code = javacode.format(
        imports, package, jh.namespace, class_generic, func_generic, jh.funcname, jh.fuzz_objname, funcargs, 
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

    randoop_jar = os.path.join(tmp_dir, "randoop/randoop-all-4.3.3.jar")
    randoop_path = os.path.join(tmp_dir, "randoop")
    jar_files = ":".join(glob.glob(os.path.join(tmp_dir, "*.jar")))    
    _ = subprocess.run([
            "javac",
            "-cp", f"{os.path.dirname(fname)}:{combinedcodes}:{jar_files}",
            fname,
            f"{combinedcodes}/{jh.namespace}.java"
        ], stderr=subprocess.DEVNULL)
    randoop_cmd = [
        "java", "-classpath", f"{randoop_jar}:{tmp_dir}:{os.path.dirname(combinedcodes)}:{jar_files}",
        "randoop.main.Main", "gentests",
        "--testclass=fuzztests.FuzzTest",
        "--unchecked-exception=ERROR",
        f"--time-limit={time_limit}",
        "--no-error-revealing-tests=false",
        "--no-regression-tests=true",
        "--output-limit=100",
        f"--junit-output-dir={tmp_dir}",
    ]
    proc = subprocess.run(randoop_cmd, stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True)

    # shutil.rmtree(tmp_dir)
    if proc.returncode != 0:
        print("!"*10 + " fuzz check failure", file=sys.stderr)
        print(proc.stdout)
        return False
    else:
        if "No error-revealing tests to output" in proc.stdout:
            return True
        return False

def fuzzcheck(langid, pfx, sfx, grnd_truth, asrt, cc, check, time_limit=30):
    if(langid == "py"):
        result = True

    elif(langid == "cs"):
        result = cs_fuzzcheck(pfx, sfx, grnd_truth, asrt, check)

    elif(langid == "java"):
        result = java_fuzzcheck(pfx, sfx, grnd_truth, asrt, cc, check, time_limit=time_limit)

    else: 
        assert False, "Incorrect language id: " + langid

    return result
