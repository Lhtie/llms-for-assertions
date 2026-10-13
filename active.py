import argparse
import glob
import math
import os
import re
import shutil
import subprocess
import sys

from codehelper.javahelper import javahelper, third_party
from utils.problemreader import read_problem
from utils.sourcepaths import java_source_info


def select_confident_candidates(gen_asrts, conformance_scores, equivalence_scores,
                               validity_scores, candidate_mask, threshold):
    """Return eligible candidates above the conformance threshold, low score first."""
    candidates = []
    for i, (asrt, conformance, equivalence, validity) in enumerate(
            zip(gen_asrts, conformance_scores, equivalence_scores, validity_scores)):
        if i >= len(candidate_mask) or not candidate_mask[i] or conformance is None:
            continue
        try:
            score = float(conformance)
        except (TypeError, ValueError):
            # Scores reread from a check report are strings; a missing one is "None".
            continue
        if not math.isfinite(score) or score <= threshold:
            continue
        candidates.append({
            "index": i,
            "validity": validity,
            "conformance": score,
            "equivalence": equivalence,
            "assert": asrt,
        })
    return sorted(candidates, key=lambda candidate: (candidate["conformance"], candidate["index"]))


def run_active_tournament(code, groundtruth, combinedcodes, candidates, outdir,
                          rounds=2, left_label_prefix="candidate"):
    """Pair adjacent candidates in score order; each winner advances a round."""
    survivors = list(candidates)
    matches = []
    round_idx = 0
    while len(survivors) > 1:
        winners = []
        for pair_idx in range(0, len(survivors), 2):
            left = survivors[pair_idx]
            if pair_idx + 1 == len(survivors):
                winners.append(left)
                matches.append({"round": round_idx, "bye": left["index"]})
                continue

            right = survivors[pair_idx + 1]
            left_label = f"{left_label_prefix}_{left['index']}"
            right_label = f"{left_label_prefix}_{right['index']}"
            match_dir = os.path.join(outdir, f"round_{round_idx}_pair_{pair_idx // 2}")
            # Real executions cannot separate two candidates that both hold on
            # the implementation, so compare on arbitrary old/new state pairs.
            decision = run_active(
                code, groundtruth, combinedcodes,
                left["assert"], right["assert"],
                rounds=rounds, outdir=match_dir, mode="independent",
                left_label=left_label, right_label=right_label,
            )
            if decision == left_label:
                winner, reason = left, "active"
            elif decision == right_label:
                winner, reason = right, "active"
            else:
                # An inconclusive active comparison still has to eliminate one
                # candidate. Keep the higher-conformance member of this pair.
                winner, reason = right, "higher-conformance fallback"
            winners.append(winner)
            matches.append({
                "round": round_idx,
                "left": left["index"],
                "right": right["index"],
                "decision": decision,
                "winner": winner["index"],
                "reason": reason,
            })
        survivors = winners
        round_idx += 1
    return (survivors[0] if survivors else None), matches


def run_active_selection(code, groundtruth, combinedcodes, gen_asrts,
                         conformance_scores, equivalence_scores, validity_scores,
                         candidate_mask, threshold, outdir, rounds=2):
    """Filter candidates and run the active pairwise elimination tournament."""
    candidates = select_confident_candidates(
        gen_asrts, conformance_scores, equivalence_scores, validity_scores,
        candidate_mask, threshold,
    )
    final_candidate, matches = run_active_tournament(
        code, groundtruth, combinedcodes, candidates, outdir, rounds=rounds,
    )
    return candidates, final_candidate, matches


FUZZTEST_TEMPLATE = """
package fuzztests;

import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.Objects;
{imports}

import {package}.{classname};

public class {fuzztest_class} {{
    @randoop.TestValue public static final String fuzzSeed0 = "seed0";
    @randoop.TestValue public static final String fuzzSeed1 = "seed1";
    @randoop.TestValue public static final String fuzzSeed2 = "seed2";
    @randoop.TestValue public static final int fuzzIntSeed0 = 0;
    @randoop.TestValue public static final int fuzzIntSeed1 = 1;
    @randoop.TestValue public static final int fuzzIntSeed2 = 2;
    // Groundtruth verdict of the most recent replayed call.
    public static boolean lastGroundtruthPass = true;

{methods}

    @SuppressWarnings("unchecked")
    public static {classname}{class_type_args} makeFuzzInput() {{
        return ({classname}{class_type_args}) constructSeededObject({classname}.class, 0);
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
    private static <T> T get_from_array(Object arr, int index, T ex_val) {{
        try {{
            return (T) Array.get(arr, index);
        }} catch (Exception fuzzexception) {{
            return null;
        }}
    }}

    private static <T> T exec(Supplier<T> supplier) {{
        try {{
            return supplier.get();
        }} catch (Exception fuzzexception) {{
            return null;
        }}
    }}

    private static <T> Pair<T, String> func_call_supplier(Supplier<T> supplier) {{
        try {{
            return new Pair<>(supplier.get(), null);
        }} catch (Exception fuzzexception) {{
            String exceptionType = fuzzexception.getClass().getSimpleName();
            return new Pair<>(null, exceptionType);
        }}
    }}

    private static String func_call_runnable(Runnable runnable) {{
        try {{
            runnable.run();
            return null;
        }} catch (Exception fuzzexception) {{
            return fuzzexception.getClass().getSimpleName();
        }}
    }}

    private static int seedPriority(String name) {{
        return name.equals("addVertex") ? 0 : name.equals("add") || name.equals("put") || name.equals("push") ? 1 :
               name.equals("addEdge") ? 2 : 3;
    }}

    private static void seedStructure(Object target, String seedPrefix, int attempts) {{
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
            for (int attempt = 0; attempt < attempts; attempt++) {{
                Object[] args = new Object[types.length];
                boolean supported = true;
                for (int i = 0; i < types.length; i++) {{
                    Class<?> type = types[i];
                    int value = attempt + i;
                    if (type == String.class || type == Object.class) args[i] = seedPrefix + value;
                    else if (type.isAssignableFrom(java.util.ArrayList.class)) {{
                        java.util.ArrayList<Object> values = new java.util.ArrayList<>();
                        values.add(seedPrefix + value); values.add(seedPrefix + (value + 10)); args[i] = values;
                    }} else if (type.isAssignableFrom(java.util.LinkedHashSet.class)) {{
                        java.util.LinkedHashSet<Object> values = new java.util.LinkedHashSet<>();
                        values.add(seedPrefix + value); values.add(seedPrefix + (value + 10)); args[i] = values;
                    }} else if (type.isAssignableFrom(java.util.LinkedHashMap.class)) {{
                        java.util.LinkedHashMap<Object, Object> values = new java.util.LinkedHashMap<>();
                        values.put(seedPrefix + "key" + value, seedPrefix + "value" + value); args[i] = values;
                    }} else if (type == int.class || type == Integer.class) args[i] = value;
                    else if (type == long.class || type == Long.class) args[i] = (long) value;
                    else if (type == boolean.class || type == Boolean.class) args[i] = value % 2 == 0;
                    else if (type == char.class || type == Character.class) args[i] = (char) ('a' + value);
                    else if (type.isArray() && (type.getComponentType() == String.class || type.getComponentType() == Object.class)) {{
                        Object array = java.lang.reflect.Array.newInstance(type.getComponentType(), 1);
                        java.lang.reflect.Array.set(array, 0, seedPrefix + value); args[i] = array;
                    }} else {{ supported = false; break; }}
                }}
                if (supported) try {{ method.invoke(target, args); }} catch (ReflectiveOperationException | RuntimeException ignored) {{ }}
            }}
        }}
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


def normalize_assert(asrt):
    asrt = asrt.strip()
    if not asrt.startswith("assert"):
        asrt = f"assert {asrt};"
    elif not asrt.endswith(";"):
        asrt += ";"
    return asrt


def prefixed(lines, prefix):
    text = "\n".join(lines)
    names = [
        r"OLD_var\d+(?:_forallidx\d+)?(?:_sample)?",
        r"fuzzexpr\d+",
        r"forall_holds_forallidx\d+",
    ]
    pattern = r"\b(" + "|".join(names) + r")\b"
    return re.sub(pattern, lambda m: prefix + m.group(1), text)


def formula_parts(code, asrt, prefix):
    jh = javahelper(code)
    formula = jh.extract_formula(normalize_assert(asrt))
    formula, old_addns, forall_addns, split_addns = jh.trans_formula(formula)
    if jh.funcs[-1]["iscstr"]:
        forall_addns = [l.replace(jh.fuzz_objname, jh.fuzz_objname + "_final")
                        for l in forall_addns]
        split_addns = [l.replace(jh.fuzz_objname, jh.fuzz_objname + "_final")
                       for l in split_addns]
        formula = formula.replace(jh.fuzz_objname, jh.fuzz_objname + "_final")

    return {
        "old": prefixed(old_addns, prefix),
        "forall": prefixed(forall_addns, prefix),
        "split": prefixed(split_addns, prefix),
        "expr": prefixed([formula], prefix),
    }


def formula_parts_state(code, asrt, prefix):
    jh = javahelper(code)
    jh.fuzz_objname = jh.fuzz_objname + "_new"
    formula = jh.extract_formula(normalize_assert(asrt))
    formula, old_addns, forall_addns, split_addns = jh.trans_formula(formula)
    old_addns = [line.replace("_new", "_old") for line in old_addns]

    return {
        "old": prefixed(old_addns, prefix),
        "forall": prefixed(forall_addns, prefix),
        "split": prefixed(split_addns, prefix),
        "expr": prefixed([formula], prefix),
    }


def indent(text, level=2):
    if not text:
        return ""
    pad = "    " * level
    return "\n".join(pad + line if line else "" for line in text.splitlines())


def method_signature(base_jh, method_name):
    class_generic = base_jh.classname[base_jh.classname.find("<"):] \
        if base_jh.classname.find("<") != -1 else ""
    func_generic = base_jh.funcs[-1]["generic"]
    func_generic = f" {func_generic}" if func_generic is not None else ""
    funcargs = "".join([f", {typ} {var}" for var, typ in base_jh.funcs[-1]["args"].items()])
    return (
        f"public{func_generic} void {method_name}"
        f"({base_jh.namespace}{class_generic} {base_jh.fuzz_objname}{funcargs})"
    )


def state_method_signature(base_jh, method_name):
    class_generic = base_jh.classname[base_jh.classname.find("<"):] \
        if base_jh.classname.find("<") != -1 else ""
    func_generic = base_jh.funcs[-1]["generic"]
    func_generic = f" {func_generic}" if func_generic is not None else ""
    rettyp = base_jh.funcs[-1]["rtyp"]
    funcargs = "".join([f", {typ} {var}" for var, typ in base_jh.funcs[-1]["args"].items()])
    retarg = f", {rettyp} {base_jh.fuzz_retvar}" if rettyp != "void" else ""
    return (
        f"public{func_generic} void {method_name}"
        f"({base_jh.namespace}{class_generic} {base_jh.fuzz_objname}_old, "
        f"{base_jh.namespace}{class_generic} {base_jh.fuzz_objname}_new"
        f"{funcargs}{retarg}, int fuzzOldSeeds, int fuzzNewSeeds)"
    )


def func_call_code(base_jh):
    return "\n".join(base_jh.func_call(base_jh.funcs[-1]))


def condition_expr(condition_kind):
    if condition_kind == "left_pass_right_fail":
        return "leftPass && !rightPass"
    if condition_kind == "left_fail_right_pass":
        return "!leftPass && rightPass"
    raise AssertionError(f"Unknown condition kind: {condition_kind}")


def build_witness_method_dependent(code, method_name, left_asrt, right_asrt, condition_kind):
    base_jh = javahelper(code)
    left = formula_parts(code, left_asrt, "left_")
    right = formula_parts(code, right_asrt, "right_")

    old_code = "\n".join(x for x in [left["old"], right["old"]] if x)
    post_code = "\n".join(x for x in [
        left["forall"], right["forall"],
        left["split"], right["split"],
    ] if x)
    condition = condition_expr(condition_kind)

    return f"""
    {method_signature(base_jh, method_name)} {{
        if ({base_jh.fuzz_objname} == null) return;

        seedStructure({base_jh.fuzz_objname}, "seed", 3);

        // copy old values
{indent(old_code)}

        // function call
{indent(func_call_code(base_jh))}

        // compute assertions
{indent(post_code)}
        boolean leftPass = Boolean.TRUE.equals(exec(() -> {left["expr"]}));
        boolean rightPass = Boolean.TRUE.equals(exec(() -> {right["expr"]}));
        if ({condition}) {{
            throw new RuntimeException("ACTIVE_WITNESS_{condition_kind}");
        }}
    }}
"""


def build_witness_method_independent(code, method_name, left_asrt, right_asrt, condition_kind):
    base_jh = javahelper(code)
    left = formula_parts_state(code, left_asrt, "left_")
    right = formula_parts_state(code, right_asrt, "right_")

    old_code = "\n".join(x for x in [left["old"], right["old"]] if x)
    post_code = "\n".join(x for x in [
        left["forall"], right["forall"],
        left["split"], right["split"],
    ] if x)
    condition = condition_expr(condition_kind)

    return f"""
    {state_method_signature(base_jh, method_name)} {{
        if ({base_jh.fuzz_objname}_old == null || {base_jh.fuzz_objname}_new == null) return;

        // Distinct old/new states of fuzzer-chosen sizes; identical ones hide
        // old- vs new-state differences.
        seedStructure({base_jh.fuzz_objname}_old, "old", Math.floorMod(fuzzOldSeeds, 4));
        if ({base_jh.fuzz_objname}_new != {base_jh.fuzz_objname}_old) seedStructure({base_jh.fuzz_objname}_new, "seed", Math.floorMod(fuzzNewSeeds, 4));

        // copy old values
{indent(old_code)}

        // compute assertions
{indent(post_code)}
        boolean leftPass = Boolean.TRUE.equals(exec(() -> {left["expr"]}));
        boolean rightPass = Boolean.TRUE.equals(exec(() -> {right["expr"]}));
        if ({condition}) {{
            throw new RuntimeException("ACTIVE_WITNESS_{condition_kind}");
        }}
    }}
"""


def build_witness_method(code, method_name, left_asrt, right_asrt, condition_kind, mode):
    if mode == "dependent":
        return build_witness_method_dependent(code, method_name, left_asrt, right_asrt, condition_kind)
    if mode == "independent":
        return build_witness_method_independent(code, method_name, left_asrt, right_asrt, condition_kind)
    raise AssertionError(f"Unknown active mode: {mode}")


def build_groundtruth_method_dependent(code, method_name, groundtruth):
    base_jh = javahelper(code)
    gt = formula_parts(code, groundtruth, "gt_")
    post_code = "\n".join(x for x in [gt["forall"], gt["split"]] if x)
    return f"""
    {method_signature(base_jh, method_name)} {{
        if ({base_jh.fuzz_objname} == null) return;

        seedStructure({base_jh.fuzz_objname}, "seed", 3);

        // copy old values
{indent(gt["old"])}

        // function call
{indent(func_call_code(base_jh))}

        // check groundtruth
{indent(post_code)}
        lastGroundtruthPass = Boolean.TRUE.equals(exec(() -> {gt["expr"]}));
    }}
"""


def build_groundtruth_method_independent(code, method_name, groundtruth):
    base_jh = javahelper(code)
    gt = formula_parts_state(code, groundtruth, "gt_")
    post_code = "\n".join(x for x in [gt["forall"], gt["split"]] if x)
    return f"""
    {state_method_signature(base_jh, method_name)} {{
        if ({base_jh.fuzz_objname}_old == null || {base_jh.fuzz_objname}_new == null) return;

        // Distinct old/new states of fuzzer-chosen sizes; identical ones hide
        // old- vs new-state differences.
        seedStructure({base_jh.fuzz_objname}_old, "old", Math.floorMod(fuzzOldSeeds, 4));
        if ({base_jh.fuzz_objname}_new != {base_jh.fuzz_objname}_old) seedStructure({base_jh.fuzz_objname}_new, "seed", Math.floorMod(fuzzNewSeeds, 4));

        // copy old values
{indent(gt["old"])}

        // check groundtruth
{indent(post_code)}
        lastGroundtruthPass = Boolean.TRUE.equals(exec(() -> {gt["expr"]}));
    }}
"""


def build_groundtruth_method(code, method_name, groundtruth, mode):
    if mode == "dependent":
        return build_groundtruth_method_dependent(code, method_name, groundtruth)
    if mode == "independent":
        return build_groundtruth_method_independent(code, method_name, groundtruth)
    raise AssertionError(f"Unknown active mode: {mode}")


def build_fuzztest(code, combinedcodes, methods, fuzztest_class):
    base_jh = javahelper(code)
    package, _, _ = java_source_info(combinedcodes, base_jh.namespace)
    imports = "\n".join([f"import {x};" for x in base_jh.imports])
    class_generic = base_jh.classname[base_jh.classname.find("<"):] \
        if base_jh.classname.find("<") != -1 else ""
    # Randoop cannot generate method calls when the test class exposes unresolved
    # type variables. Specialize class type parameters to concrete types.
    methods = "\n".join(methods)
    class_type_args = ""
    if class_generic:
        concrete_types = []
        for declaration in class_generic[1:-1].split(","):
            parts = declaration.strip().split(None, 2)
            bound = " ".join(parts[1:])
            concrete = "Integer" if re.search(r"\b(Number|Integer|Long|Double|Float)\b", bound) else "String"
            methods = methods.replace(base_jh.namespace + class_generic, base_jh.namespace + "<CLASS_TYPE_ARGS>")
            methods = re.sub(rf"\b{re.escape(parts[0])}\b", concrete, methods)
            concrete_types.append(concrete)
        class_type_args = "<" + ", ".join(concrete_types) + ">"
        methods = methods.replace("<CLASS_TYPE_ARGS>", class_type_args)
    return FUZZTEST_TEMPLATE.format(
        imports=imports,
        package=package,
        classname=base_jh.namespace,
        fuzztest_class=fuzztest_class,
        class_type_args=class_type_args,
        methods=methods,
    )


def prepare_workdir(workdir):
    if os.path.exists(workdir):
        shutil.rmtree(workdir)
    os.makedirs(os.path.join(workdir, "fuzztests"), exist_ok=True)
    for file in third_party:
        if os.path.isdir(file):
            shutil.copytree(file, os.path.join(workdir, os.path.basename(file)), dirs_exist_ok=True)
        else:
            shutil.copyfile(file, os.path.join(workdir, os.path.basename(file)))


def compile_fuzztest(workdir, combinedcodes, classname, fuzztest_class):
    fname = os.path.join(workdir, "fuzztests", f"{fuzztest_class}.java")
    _, source_root, source_file = java_source_info(combinedcodes, classname)
    randoop_jar = os.path.join(workdir, "randoop", "randoop-all-4.3.3.jar")
    jar_files = ":".join(glob.glob(os.path.join(workdir, "*.jar")))
    proc = subprocess.run([
        "javac",
        "-cp", f"{workdir}:{source_root}:{jar_files}:{randoop_jar}",
        "-sourcepath", source_root,
        "-d", workdir,
        fname,
        source_file,
    ], stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True)
    return proc


def run_randoop(workdir, combinedcodes, fuzztest_class, time_limit, seed):
    randoop_jar = os.path.join(workdir, "randoop", "randoop-all-4.3.3.jar")
    jar_files = ":".join(glob.glob(os.path.join(workdir, "*.jar")))
    cmd = [
        "java", "-classpath", f"{randoop_jar}:{workdir}:{os.path.dirname(combinedcodes)}:{jar_files}",
        "randoop.main.Main", "gentests",
        f"--testclass=fuzztests.{fuzztest_class}",
        "--unchecked-exception=ERROR",
        f"--time-limit={time_limit}",
        "--no-error-revealing-tests=false",
        "--no-regression-tests=true",
        "--output-limit=100",
        f"--junit-output-dir={workdir}",
        f"--randomseed={seed}",
    ]
    return subprocess.run(cmd, stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True)


def filter_error_tests(workdir, method_name):
    kept_classes = []
    test_pattern = re.compile(
        r"\n    @Test\n    public void test\d+\(\) throws Throwable \{.*?\n    \}\n",
        re.DOTALL,
    )
    target_pattern = re.compile(
        r"// during test generation this statement threw.*?\n\s*.*\."
        + re.escape(method_name) + r"\(",
        re.DOTALL,
    )
    for path in sorted(glob.glob(os.path.join(workdir, "ErrorTest[0-9]*.java"))):
        text = open(path, "r").read()
        kept = []
        for match in test_pattern.finditer(text):
            block = match.group(0)
            if target_pattern.search(block):
                kept.append(block)
        if not kept:
            continue
        filtered = test_pattern.sub("", text).replace("\n}", "\n" + "".join(kept) + "\n}")
        open(path, "w").write(filtered)
        kept_classes.append(os.path.splitext(os.path.basename(path))[0])
    return kept_classes


def compile_error_tests(workdir, combinedcodes):
    jar_files = ":".join(glob.glob(os.path.join(workdir, "*.jar")))
    sources = glob.glob(os.path.join(workdir, "ErrorTest*.java"))
    if not sources:
        return None
    return subprocess.run([
        "javac",
        "-cp", f"{workdir}:{os.path.dirname(combinedcodes)}:{jar_files}",
        *sources,
    ], stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True)


def run_junit(workdir, combinedcodes, test_classes):
    jar_files = ":".join(glob.glob(os.path.join(workdir, "*.jar")))
    results = {}
    for test_class in test_classes:
        proc = subprocess.run([
            "java",
            "-cp", f"{workdir}:{os.path.dirname(combinedcodes)}:{jar_files}",
            "org.junit.runner.JUnitCore",
            test_class,
        ], stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True)
        results[test_class] = proc.returncode == 0
    return results


def active_direction(code, groundtruth, left_asrt, right_asrt, combinedcodes,
                     workdir, time_limit, seed, method_name, condition_kind,
                     gt_pass_choice, gt_fail_choice, mode):
    base_jh = javahelper(code)
    witness_class = "WitnessFuzzTest"
    groundtruth_class = "GroundTruthFuzzTest"
    witness_code = build_fuzztest(code, combinedcodes, [
        build_witness_method(code, method_name, left_asrt, right_asrt, condition_kind, mode),
    ], witness_class)

    prepare_workdir(workdir)
    witness_path = os.path.join(workdir, "fuzztests", f"{witness_class}.java")
    groundtruth_path = os.path.join(workdir, "fuzztests", f"{groundtruth_class}.java")
    open(witness_path, "w").write(witness_code)

    compile_proc = compile_fuzztest(workdir, combinedcodes, base_jh.namespace, witness_class)
    if compile_proc.returncode != 0:
        return {"decision": None, "reason": "WitnessFuzzTest did not compile", "stderr": compile_proc.stderr}

    randoop_proc = run_randoop(workdir, combinedcodes, witness_class, time_limit, seed)
    if randoop_proc.returncode != 0:
        return {"decision": None, "reason": "Randoop failed", "stderr": randoop_proc.stderr}
    if "No error-revealing tests to output" in randoop_proc.stdout:
        return {"decision": None, "reason": "Randoop found no distinguishing test"}

    groundtruth_code = build_fuzztest(code, combinedcodes, [
        build_groundtruth_method(code, method_name, groundtruth, mode),
    ], groundtruth_class)
    open(groundtruth_path, "w").write(groundtruth_code)
    compile_proc = compile_fuzztest(workdir, combinedcodes, base_jh.namespace, groundtruth_class)
    if compile_proc.returncode != 0:
        return {"decision": None, "reason": "GroundTruthFuzzTest did not compile", "stderr": compile_proc.stderr}

    kept_classes = filter_error_tests(workdir, method_name)
    if not kept_classes:
        return {"decision": None, "reason": f"Randoop found no {method_name} test"}
    for path in glob.glob(os.path.join(workdir, "ErrorTest[0-9]*.java")):
        text = open(path, "r").read()
        text = text.replace(f"fuzztests.{witness_class}", f"fuzztests.{groundtruth_class}")
        # Earlier calls in a sequence may violate the groundtruth too; only the
        # distinguishing call (the one that threw) decides.
        text = re.sub(
            r"(// during test generation this statement threw[^\n]*\n[^\n]*\."
            + re.escape(method_name) + r"\([^\n]*\n)",
            lambda m: m.group(1) + "        org.junit.Assert.assertTrue("
            f"fuzztests.{groundtruth_class}.lastGroundtruthPass);\n",
            text,
        )
        open(path, "w").write(text)
    compile_errors = compile_error_tests(workdir, combinedcodes)
    if compile_errors is None or compile_errors.returncode != 0:
        return {"decision": None, "reason": f"{method_name} replay tests did not compile"}
    junit_results = run_junit(workdir, combinedcodes, kept_classes)
    if not junit_results:
        return {"decision": None, "reason": f"{method_name} replay tests did not run"}

    groundtruth_passes = all(junit_results.values())
    decision = gt_pass_choice if groundtruth_passes else gt_fail_choice
    return {"decision": decision, "reason": f"{method_name} chose {decision}"}


def active_round(code, groundtruth, left_asrt, right_asrt, combinedcodes, outdir,
                 round_idx, time_limit, mode, left_label, right_label):
    decisions = []
    for offset, (method_name, condition_kind, gt_pass_choice, gt_fail_choice) in enumerate([
        ("ActiveLeftPassRightFail", "left_pass_right_fail", left_label, right_label),
        ("ActiveLeftFailRightPass", "left_fail_right_pass", right_label, left_label),
    ]):
        workdir = os.path.join(outdir, f"round_{round_idx}_{method_name}")
        result = active_direction(
            code, groundtruth, left_asrt, right_asrt, combinedcodes,
            workdir, time_limit, seed=round_idx * 2 + offset + 1,
            method_name=method_name, condition_kind=condition_kind,
            gt_pass_choice=gt_pass_choice, gt_fail_choice=gt_fail_choice,
            mode=mode,
        )
        print(f"round {round_idx} {method_name}: {result['reason']}")
        if result["decision"] is not None:
            decisions.append(result["decision"])

    if len(set(decisions)) == 1 and decisions:
        return {"decision": decisions[0], "reason": f"distinguishing tests chose {decisions[0]}"}
    if decisions:
        return {"decision": None, "reason": f"conflicting decisions: {decisions}"}
    return {"decision": None, "reason": "distinguishing tests could not be replayed on groundtruth"}


def run_active(code, groundtruth, combinedcodesdir, left_asrt, right_asrt, rounds=2,
               time_limit=30, outdir="./checktmp/active", mode="dependent",
               left_label="left", right_label="right"):
    for round_idx in range(rounds):
        result = active_round(
            code, groundtruth, left_asrt, right_asrt,
            combinedcodesdir, outdir, round_idx, time_limit,
            mode, left_label, right_label,
        )
        print(f"round {round_idx}: {result['reason']}")
        if result["decision"] is not None:
            print(f"decision: {result['decision']}")
            return result["decision"]

    print("decision: unknown")
    return None


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("--codefile", required=True)
    parser.add_argument("--combinedcodesdir", default="./combinedcodes")
    parser.add_argument("--left", required=True, help="first candidate assertion or formula")
    parser.add_argument("--right", required=True, help="second candidate assertion or formula")
    parser.add_argument("--mode", choices=["dependent", "independent"], default="dependent")
    parser.add_argument("--left-label", default="left")
    parser.add_argument("--right-label", default="right")
    parser.add_argument("--rounds", type=int, default=2)
    parser.add_argument("--time-limit", type=int, default=30)
    parser.add_argument("--outdir", default="./checktmp/active")
    args = parser.parse_args()

    raw_code = open(args.codefile, "r").read()
    langid = args.codefile.split(".")[-2]
    assert langid == "java", "active.py currently supports Java only"
    pfx, sfx, groundtruth = read_problem(raw_code, langid)
    code = pfx + "\n" + sfx

    run_active(
        code, groundtruth, args.combinedcodesdir, args.left, args.right,
        rounds=args.rounds, time_limit=args.time_limit, outdir=args.outdir,
        mode=args.mode, left_label=args.left_label, right_label=args.right_label,
    )


if __name__ == "__main__":
    main()
