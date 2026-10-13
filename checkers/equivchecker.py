from utils.sourcepaths import java_source_info
import subprocess
import os
import shutil
import sys
import re
import glob
import tempfile

from codehelper.csharphelper import *
from codehelper.javahelper import javahelper
from codehelper.javahelper import third_party
from checkers.randoop_config import RANDOOP_SEED

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
    @randoop.TestValue public static final String fuzzOldSeed0 = "old0";
    @randoop.TestValue public static final String fuzzOldSeed1 = "old1";
    @randoop.TestValue public static final String fuzzOldSeed2 = "old2";
    @randoop.TestValue public static final int fuzzIntSeed0 = 0;
    @randoop.TestValue public static final int fuzzIntSeed1 = 1;
    @randoop.TestValue public static final int fuzzIntSeed2 = 2;

    @SuppressWarnings("unchecked")
    public static {2}{16} makeFuzzInput() {{
        return ({2}{16}) constructSeededObject({2}.class, 0);
    }}

    public{4} void FuzzTest_{5}({2}{16} {6}, {2}{16} {7}{8}){{
        if ({6} == null || {7} == null) return ;   // ignore null test objects
        
        // Seed both copies with small valid but distinct states. Comparing only
        // identical states can hide differences between old- and new-state terms.
{15}

        // copy old values
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
    
    private static <T> T exec(Supplier<T> supplier){{
		try {{
			return supplier.get();
		}} catch (Exception fuzzexception) {{
			return null;
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

    private static void seedStructure(Object target, String seedPrefix) {{
        if (target == null) return;
        java.lang.reflect.Method[] methods = target.getClass().getMethods();
        java.util.Arrays.sort(methods, java.util.Comparator
            .comparingInt((java.lang.reflect.Method m) -> seedPriority(m.getName()))
            .thenComparing(java.lang.reflect.Method::toString));
        for (java.lang.reflect.Method method : methods) {{
            String name = method.getName();
            if (method.isBridge() || method.isSynthetic()) continue;
            // These operations commonly create useful states for collections,
            // trees, maps, queues, sets, tries, graphs, and union-find structures.
            if (!(name.equals("add") || name.equals("addAll") || name.equals("put") ||
                  name.equals("putAll") || name.equals("offer") ||
                  name.equals("push") || name.equals("addElement") || name.equals("insert") ||
                  name.equals("addVertex") || name.equals("addEdge") || name.equals("union") ||
                  name.equals("set"))) continue;
            Class<?>[] types = method.getParameterTypes();
            if (types.length == 0 || types.length > 3) continue;
            for (int attempt = 0; attempt < 3; attempt++) {{
                Object[] args = new Object[types.length];
                boolean supported = true;
                for (int i = 0; i < types.length; i++) {{
                    Class<?> type = types[i];
                    int value = attempt + i;
                    if (type == String.class || type == Object.class) args[i] = seedPrefix + value;
                    else if (type.isAssignableFrom(java.util.ArrayList.class) ||
                             type.isAssignableFrom(java.util.LinkedHashSet.class)) {{
                        java.util.Collection<Object> values = type.isAssignableFrom(java.util.ArrayList.class)
                            ? new java.util.ArrayList<>() : new java.util.LinkedHashSet<>();
                        values.add(seedPrefix + value); values.add(seedPrefix + (value + 10));
                        args[i] = values;
                    }} else if (type.isAssignableFrom(java.util.LinkedHashMap.class)) {{
                        java.util.Map<Object, Object> values = new java.util.LinkedHashMap<>();
                        values.put(seedPrefix + "key" + value, seedPrefix + "value" + value); args[i] = values;
                    }} else if (type.isInterface()) {{
                        supported = false; break;
                    }} else if (type == int.class || type == Integer.class) args[i] = value;
                    else if (type == long.class || type == Long.class) args[i] = (long) value;
                    else if (type == short.class || type == Short.class) args[i] = (short) value;
                    else if (type == byte.class || type == Byte.class) args[i] = (byte) value;
                    else if (type == double.class || type == Double.class) args[i] = (double) value;
                    else if (type == float.class || type == Float.class) args[i] = (float) value;
                    else if (type == boolean.class || type == Boolean.class) args[i] = (value % 2 == 0);
                    else if (type == char.class || type == Character.class) args[i] = (char) ('a' + value);
                    else if (type.isArray()) {{
                        Object array = java.lang.reflect.Array.newInstance(type.getComponentType(), 1);
                        Class<?> component = type.getComponentType();
                        if (component == String.class || component == Object.class) java.lang.reflect.Array.set(array, 0, seedPrefix + value);
                        else if (component == int.class) java.lang.reflect.Array.setInt(array, 0, value);
                        else {{ supported = false; break; }}
                        args[i] = array;
                    }} else {{ supported = false; break; }}
                }}
                if (supported) {{
                    try {{ method.invoke(target, args); }} catch (ReflectiveOperationException | RuntimeException ignored) {{ }}
                }}
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
                else if (argType == short.class || argType == Short.class) args[i] = (short) 0;
                else if (argType == byte.class || argType == Byte.class) args[i] = (byte) 0;
                else if (argType == double.class || argType == Double.class) args[i] = 0.0;
                else if (argType == float.class || argType == Float.class) args[i] = 0.0f;
                else if (argType == boolean.class || argType == Boolean.class) args[i] = false;
                else if (argType == char.class || argType == Character.class) args[i] = 'a';
                else if (argType.isArray()) args[i] = java.lang.reflect.Array.newInstance(argType.getComponentType(), 0);
                else if (argType.getName().equals("org.jgrapht.Graph")) {{
                    try {{
                        Class<?> graphImpl = Class.forName("org.jgrapht.graph.DefaultDirectedGraph");
                        args[i] = graphImpl.getConstructor(Class.class).newInstance(String.class);
                    }} catch (ReflectiveOperationException ex) {{ supported = false; break; }}
                }}
                else if (argType.isEnum() && argType.getEnumConstants().length > 0) args[i] = argType.getEnumConstants()[0];
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

_checker_tmp = None
_tmp_root = os.environ.get("CHECKER_TMP_DIR")
if not _tmp_root:
    _checker_tmp = tempfile.TemporaryDirectory(prefix="llms-assertions-equiv-")
    _tmp_root = _checker_tmp.name
tmp_dir = os.path.join(_tmp_root, "equiv")

def cs_getpostcond(grnd_truth, asrt):
    return f"({grnd_truth}) == ({asrt})"

def cs_equivcheck(pfx, sfx, grnd_truth, asrt):
    if "TestFunction" in asrt:
        return False

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

def java_equivcheck_passed(returncode, stdout):
    """Shared result rule for this checker and the Expecto batch adapter."""
    return returncode == 0 and "No error-revealing tests to output" in stdout


def java_equivcheck(pfx, sfx, grnd_truth, asrt, combinedcodes):
    jh = javahelper(pfx + '\n' + sfx)
    jh.fuzz_objname = jh.fuzz_objname + "_new"
    asrt = jh.extract_formula(asrt)
    grnd_truth = jh.extract_formula(grnd_truth)
    asrt, old_addns_asrt, forall_addns_asrt, split_addns_asrt = jh.trans_formula(asrt)
    grnd_truth, old_addns_gt, forall_addns_gt, split_addns_gt = jh.trans_formula(grnd_truth)
    old_addns = old_addns_asrt + old_addns_gt
    forall_addns = forall_addns_asrt + forall_addns_gt
    split_addns = split_addns_asrt + split_addns_gt

    imports = "\n".join([f"import {x};" for x in jh.imports])
    package, source_root, source_file = java_source_info(combinedcodes, jh.namespace)
    class_generic = jh.classname[jh.classname.find("<"):] if jh.classname.find("<") != -1 else ""
    # Randoop cannot generate method calls when the test class exposes unresolved
    # type variables. Specialize class type parameters to concrete, commonly
    # constructible types so it can instantiate the harness and its receivers.
    type_substitutions = {}
    class_type_args = ""
    if class_generic:
        declarations = class_generic[1:-1].split(",")
        concrete_types = []
        for declaration in declarations:
            parts = declaration.strip().split(None, 2)
            variable = parts[0]
            bound = " ".join(parts[1:])
            concrete = "Integer" if re.search(r"\b(Number|Integer|Long|Double|Float)\b", bound) else "String"
            type_substitutions[variable] = concrete
            concrete_types.append(concrete)
        class_type_args = "<" + ", ".join(concrete_types) + ">"
    func_generic = jh.funcs[-1]["generic"]
    func_generic = f" {func_generic}" if func_generic is not None else ""
    objarg_new = jh.fuzz_objname
    objarg_old = jh.fuzz_objname.replace("_new", "_old")
    rettyp = jh.funcs[-1]["rtyp"]
    funcargs = jh.funcs[-1]["args"]
    funcargs = "".join([f", {typ} {var}" for var, typ in funcargs.items()]) \
                + (f", {rettyp} {jh.fuzz_retvar}" if rettyp != "void" else "")
    old_addns = "\n".join(["\t\t" + l.replace("_new", "_old") for l in old_addns])
    forall_addns = "\n".join(["\t\t" + l for l in forall_addns])
    split_addns = "\n".join(["\t\t" + l for l in split_addns])

    code = javacode.format(
        imports, package, jh.namespace, class_generic, func_generic, jh.funcname,
        objarg_old, objarg_new, funcargs, old_addns, forall_addns,
        split_addns, f"({asrt}) == ({grnd_truth})", "", "true",
        f"seedStructure({objarg_old}, \"old\");\n        if ({objarg_new} != {objarg_old}) seedStructure({objarg_new}, \"seed\");",
        class_type_args
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
        Object first = FuzzTest.makeFuzzInput();
        Object second = FuzzTest.makeFuzzInput();
        if (first == null || second == null || first == second) System.exit(2);
    }
}
""")

    randoop_jar = os.path.join(tmp_dir, "randoop/randoop-all-4.3.3.jar")
    randoop_path = os.path.join(tmp_dir, "randoop")
    jar_files = ":".join(glob.glob(os.path.join(tmp_dir, "*.jar")))
    compile = subprocess.run([
            "javac",
            "-cp", f"{tmp_dir}:{source_root}:{jar_files}:{randoop_jar}",
            "-sourcepath", source_root,
            "-d", tmp_dir,
            fname,
            factory_check,
            source_file
        ], stderr=subprocess.DEVNULL)
    if compile.returncode != 0:
        print("!"*10 + " equiv check cannot compile", file=sys.stderr)
        return False

    factory_proc = subprocess.run([
        "java", "-classpath", f"{tmp_dir}:{source_root}:{jar_files}:{randoop_jar}",
        "fuzztests.FactoryCheck"
    ], stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True)
    if factory_proc.returncode != 0:
        return False

    randoop_cmd = [
        "java", "-classpath", f"{randoop_jar}:{tmp_dir}:{source_root}:{jar_files}",
        "randoop.main.Main", "gentests",
        "--testclass=fuzztests.FuzzTest",
        "--unchecked-exception=ERROR",
        "--forbid-null=true",
        "--time-limit=30",
        "--no-error-revealing-tests=false",
        "--no-regression-tests=true",
        "--output-limit=100",
        f"--junit-output-dir={tmp_dir}",
        f"--randomseed={RANDOOP_SEED}",
    ]
    proc = subprocess.run(randoop_cmd, stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True)

    # shutil.rmtree(tmp_dir)
    if proc.returncode != 0:
        print("!"*10 + " equiv check failure", file=sys.stderr)
        print(proc.stdout)
        return False
    else:
        if java_equivcheck_passed(proc.returncode, proc.stdout):
            return True
        return False

def equivcheck(langid, pfx, sfx, grnd_truth, asrt, cc):
    if(langid == "py"):
        result = True

    elif(langid == "cs"):
        result = cs_equivcheck(pfx, sfx, grnd_truth, asrt)

    elif(langid == "java"):
        result = java_equivcheck(pfx, sfx, grnd_truth, asrt, cc)

    else: 
        assert False, "Incorrect language id: " + langid

    return result
