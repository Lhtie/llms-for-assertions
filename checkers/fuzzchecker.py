from utils.sourcepaths import java_source_info
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

public class FuzzTest{{
    @randoop.TestValue public static final String fuzzSeed0 = "seed0";
    @randoop.TestValue public static final String fuzzSeed1 = "seed1";
    @randoop.TestValue public static final String fuzzSeed2 = "seed2";
    @randoop.TestValue public static final int fuzzIntSeed0 = 0;
    @randoop.TestValue public static final int fuzzIntSeed1 = 1;
    @randoop.TestValue public static final int fuzzIntSeed2 = 2;

    @SuppressWarnings("unchecked")
    public static {2}{15} makeFuzzInput() {{
        return ({2}{15}) constructSeededObject({2}.class, 0);
    }}

    public{4} void FuzzTest_{5}({2}{15} {6}{7}){{
        if ({6} == null) return ;   // ignore null test objects

        // Give the receiver a useful non-empty state before testing its method.
        seedStructure({6});
        
        // copy old values
{8}

        // function call
{9}

        // compute forall
{10}

        // Normal postconditions apply only when the operation returned normally.
        if (exceptionType == null) {{
{11}
        Boolean normalpost = exec(() -> {12});
        if (normalpost == null || !normalpost)
            throw new RuntimeException("Normal Postcondition Violated");
        }} else {{
        // Exceptional postcondition
{13}
        Boolean exceptionalpost = exec(() -> {14});
        if (exceptionalpost == null || !exceptionalpost)
            throw new RuntimeException("Exceptional Postcondition Violated");
        }}
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
	private static <FuzzHelperType> FuzzHelperType get_from_array(Object arr, int index, FuzzHelperType ex_val){{
		try {{
			return (FuzzHelperType) Array.get(arr, index);
		}} catch (Exception fuzzexception) {{
			return null;
		}}
	}}
    
    private static <FuzzHelperType> FuzzHelperType exec(Supplier<FuzzHelperType> supplier){{
		try {{
			return supplier.get();
		}} catch (Exception fuzzexception) {{
			return null;
		}}
	}}
 
    private static <FuzzHelperType> Pair<FuzzHelperType, String> func_call_supplier(Supplier<FuzzHelperType> supplier){{
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

    private static void seedStructure(Object target) {{
        if (target == null) return;
        java.lang.reflect.Method[] methods = target.getClass().getMethods();
        java.util.Arrays.sort(methods, java.util.Comparator
            .comparingInt((java.lang.reflect.Method m) -> seedPriority(m.getName()))
            .thenComparing(java.lang.reflect.Method::toString));
        for (java.lang.reflect.Method method : methods) {{
            String name = method.getName();
            if (method.isBridge() || method.isSynthetic() || java.lang.reflect.Modifier.isStatic(method.getModifiers())) continue;
            if (!(name.equals("addVertex") || name.equals("addEdge") || name.equals("add") || name.equals("addAll") || name.equals("put") ||
                  name.equals("putAll") || name.equals("offer") || name.equals("push") || name.equals("addElement") ||
                  name.equals("insert") || name.equals("union") || name.equals("set"))) continue;
            Class<?>[] types = method.getParameterTypes();
            if (types.length == 0 || types.length > 3) continue;
            for (int attempt = 0; attempt < 3; attempt++) {{
                Object[] args = new Object[types.length];
                boolean supported = true;
                for (int i = 0; i < types.length; i++) {{
                    Class<?> type = types[i];
                    int value = attempt + i;
                    if (type == String.class || type == Object.class) args[i] = "seed" + value;
                    else if (type.isAssignableFrom(java.util.ArrayList.class)) {{
                        java.util.ArrayList<Object> values = new java.util.ArrayList<>();
                        values.add("seed" + value); values.add("seed" + (value + 10)); args[i] = values;
                    }} else if (type.isAssignableFrom(java.util.LinkedHashSet.class)) {{
                        java.util.LinkedHashSet<Object> values = new java.util.LinkedHashSet<>();
                        values.add("seed" + value); values.add("seed" + (value + 10)); args[i] = values;
                    }} else if (type.isAssignableFrom(java.util.LinkedHashMap.class)) {{
                        java.util.LinkedHashMap<Object, Object> values = new java.util.LinkedHashMap<>();
                        values.put("key" + value, "value" + value); args[i] = values;
                    }} else if (type == int.class || type == Integer.class) args[i] = value;
                    else if (type == long.class || type == Long.class) args[i] = (long) value;
                    else if (type == boolean.class || type == Boolean.class) args[i] = value % 2 == 0;
                    else if (type == char.class || type == Character.class) args[i] = (char) ('a' + value);
                    else if (type.isArray() && (type.getComponentType() == String.class || type.getComponentType() == Object.class)) {{
                        Object array = java.lang.reflect.Array.newInstance(type.getComponentType(), 1);
                        java.lang.reflect.Array.set(array, 0, "seed" + value); args[i] = array;
                    }} else {{ supported = false; break; }}
                }}
                if (supported) try {{ method.invoke(target, args); }} catch (ReflectiveOperationException | RuntimeException ignored) {{ }}
            }}
        }}
    }}

    private static int seedPriority(String name) {{
        return name.equals("addVertex") ? 0 : name.equals("add") || name.equals("put") || name.equals("push") ? 1 :
               name.equals("addEdge") ? 2 : 3;
    }}

    private static Object constructSeededObject(Class<?> type, int depth) {{
        if (depth > 4) return null;
        java.lang.reflect.Constructor<?>[] constructors = type.getConstructors();
        java.util.Arrays.sort(constructors, java.util.Comparator.comparingInt(java.lang.reflect.Constructor::getParameterCount));
        for (java.lang.reflect.Constructor<?> constructor : constructors) {{
            Class<?>[] types = constructor.getParameterTypes();
            Object[] args = new Object[types.length];
            boolean supported = true;
            for (int i = 0; i < types.length; i++) {{
                Class<?> argType = types[i];
                if (argType == String.class) args[i] = "";
                else if (argType == Object.class) args[i] = new Object();
                else if (argType.isAssignableFrom(java.util.ArrayList.class)) args[i] = new java.util.ArrayList<>();
                else if (argType.isAssignableFrom(java.util.LinkedHashSet.class)) args[i] = new java.util.LinkedHashSet<>();
                else if (argType.isAssignableFrom(java.util.LinkedHashMap.class)) args[i] = new java.util.LinkedHashMap<>();
                else if (argType == int.class || argType == Integer.class) args[i] = 0;
                else if (argType == long.class || argType == Long.class) args[i] = 0L;
                else if (argType == boolean.class || argType == Boolean.class) args[i] = false;
                else if (argType == char.class || argType == Character.class) args[i] = 'a';
                else if (argType.isArray()) args[i] = java.lang.reflect.Array.newInstance(argType.getComponentType(), 0);
                else if (argType.getName().equals("org.jgrapht.Graph")) {{
                    try {{
                        Class<?> graphImpl = Class.forName("org.jgrapht.graph.DefaultDirectedGraph");
                        args[i] = graphImpl.getConstructor(Class.class).newInstance(String.class);
                    }} catch (ReflectiveOperationException ex) {{ supported = false; break; }}
                }} else if (argType.isEnum() && argType.getEnumConstants().length > 0) args[i] = argType.getEnumConstants()[0];
                else if (!argType.isInterface() && !java.lang.reflect.Modifier.isAbstract(argType.getModifiers())) args[i] = constructSeededObject(argType, depth + 1);
                else {{ supported = false; break; }}
                if (args[i] == null) {{ supported = false; break; }}
            }}
            if (!supported) continue;
            try {{ return constructor.newInstance(args); }} catch (ReflectiveOperationException | RuntimeException ignored) {{ }}
        }}
        return null;
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
        asrt = re.sub(rf"[^.\w]{arg}", subf, asrt)

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
    package, source_root, source_file = java_source_info(combinedcodes, jh.namespace)
    class_generic = jh.classname[jh.classname.find("<"):] if jh.classname.find("<") != -1 else ""
    func_generic = jh.funcs[-1]["generic"]
    func_generic = f" {func_generic}" if func_generic is not None else ""
    funcargs = jh.funcs[-1]["args"]
    funcargs = "".join([f", {typ} {var}" for var, typ in funcargs.items()])
    type_substitutions = {}
    class_type_args = ""
    if class_generic:
        concrete_types = []
        for declaration in class_generic[1:-1].split(","):
            parts = declaration.strip().split(None, 2)
            variable = parts[0]
            bound = " ".join(parts[1:])
            concrete = "Integer" if re.search(r"\b(Number|Integer|Long|Double|Float)\b", bound) else "String"
            type_substitutions[variable] = concrete
            concrete_types.append(concrete)
        class_type_args = "<" + ", ".join(concrete_types) + ">"
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
        old_addns, func_call, forall_addns, split_addns, asrt, "", "true", class_type_args
    )
    for variable, concrete in type_substitutions.items():
        code = re.sub(rf"\b{re.escape(variable)}\b", concrete, code)

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

    factory_check = os.path.join(tmp_dir, "fuzztests/FactoryCheck.java")
    with open(factory_check, "w") as fd:
        fd.write("""package fuzztests;
public class FactoryCheck {
    public static void main(String[] args) {
        if (FuzzTest.makeFuzzInput() == null) System.exit(2);
    }
}
""")

    randoop_jar = os.path.join(tmp_dir, "randoop/randoop-all-4.3.3.jar")
    randoop_path = os.path.join(tmp_dir, "randoop")
    jar_files = ":".join(glob.glob(os.path.join(tmp_dir, "*.jar")))    
    compiled = subprocess.run([
            "javac",
            "-cp", f"{tmp_dir}:{source_root}:{jar_files}:{randoop_jar}",
            "-sourcepath", source_root,
            "-d", tmp_dir,
            fname,
            factory_check,
            source_file
        ], stderr=subprocess.DEVNULL)
    if compiled.returncode != 0:
        return False
    factory_proc = subprocess.run([
        "java", "-classpath", f"{tmp_dir}:{source_root}:{jar_files}:{randoop_jar}", "fuzztests.FactoryCheck"
    ], stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True)
    if factory_proc.returncode != 0:
        return False
    randoop_cmd = [
        "java", "-classpath", f"{randoop_jar}:{tmp_dir}:{source_root}:{jar_files}",
        "randoop.main.Main", "gentests",
        "--testclass=fuzztests.FuzzTest",
        "--unchecked-exception=ERROR",
        "--forbid-null=true",
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
