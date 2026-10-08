"""Batch equivalence scoring using checkers.equivchecker's Java semantics."""

import os
import re
import subprocess
from contextlib import ExitStack
from pathlib import Path

ROOT = Path(__file__).resolve().parents[2]


def command(args, directory, label, timeout, *, stderr_path=None):
    with ExitStack() as stack:
        log = stack.enter_context((directory / (label + ".log")).open("w"))
        stderr = stack.enter_context(stderr_path.open("w")) if stderr_path else subprocess.STDOUT
        try:
            process = subprocess.run(
                [str(x) for x in args], cwd=ROOT, stdout=log,
                stderr=stderr, timeout=timeout,
            )
            return process.returncode
        except subprocess.TimeoutExpired:
            return None


def render_harness(row, adapter, candidate, datasets):
    from checkers.equivchecker import javacode
    from codehelper.javahelper import javahelper

    helper = javahelper((datasets / row["source"]).read_text())
    helper.fuzz_objname = "fuzzobj_new"
    left, old_left, forall_left, split_left = helper.trans_formula(helper.extract_formula(candidate))
    # Match the Integer domain of the batch adapter, including multi-argument casts.
    ground_truth = re.sub(
        r"<\s*([EKVT](?:\s*,\s*[EKVT])*)\s*>",
        lambda m: "<" + ",".join("Integer" for _ in m[1].split(",")) + ">",
        row["ground_truth"],
    )
    right, old_right, forall_right, split_right = helper.trans_formula(helper.extract_formula(ground_truth))
    old = "\n".join(line.replace("_new", "_old") for line in old_left + old_right)
    quantifiers = "\n".join(forall_left + forall_right)
    split = "\n".join(split_left + split_right)
    parameters = "".join(f", {p['type']} {p['name']}" for p in adapter["java_parameters"])
    if adapter["java_return"]:
        parameters += f", {adapter['java_return']} {helper.fuzz_retvar}"
    cls = row["class_name"]
    code = javacode.format(
        "\n".join(row["imports"]), row["package"], cls, "", "", row["method_name"],
        "fuzzobj_old", "fuzzobj_new", parameters, old, quantifiers,
        split, f"({left}) == ({right})", "", "true",
    )
    receiver = adapter.get("java_receiver", f"{cls}<Integer>")
    for name in ("fuzzobj_old", "fuzzobj_new"):
        code = code.replace(f"{cls} {name}", f"{receiver} {name}")
    return code


def compare(row, adapter, candidate, datasets, directory, seconds=30, seed=0, *, compile_only=False):
    from checkers.equivchecker import java_equivcheck_passed

    code = render_harness(row, adapter, candidate, datasets)
    harness = directory / "FuzzTest.java"
    harness.write_text(code)
    classes = directory / "classes"
    classes.mkdir(exist_ok=True)
    jars = list((ROOT / "java-testgen").rglob("*.jar")) + list(
        (ROOT / "java-thirdparty").glob("*.jar")
    )
    cp = os.pathsep.join(map(str, [classes] + jars))
    # java.io.Serial is a source-only annotation introduced after Java 11.
    # Compile a local copy without it so the official Docker JDK can load the
    # benchmark. Preserve the dataset and all executable code verbatim.
    source = datasets / row["source"]
    source_text = source.read_text()
    compatible_text = re.sub(
        r"(?m)^[ \t]*@java\.io\.Serial[ \t]*(?=\r?$)", "", source_text
    )
    if compatible_text != source_text:
        source = directory / "java_sources" / row["source"]
        source.parent.mkdir(parents=True, exist_ok=True)
        source.write_text(compatible_text)
    rc = command(
        [
            "javac",
            "-cp",
            cp,
            "-sourcepath",
            datasets,
            "-d",
            classes,
            source,
            harness,
        ],
        directory,
        "compile",
        120,
    )
    if rc != 0:
        return dict(status="compile_timeout" if rc is None else "compile_error", equivalent=False, metric="equivchecker")
    if compile_only:
        return dict(status="compiled")
    # Discard obsolete diagnostics from the previous comparator.
    (directory / "counts.json").unlink(missing_ok=True)
    rc = command(
        [
            "java", "-cp", cp, "randoop.main.Main", "gentests",
            "--testclass=fuzztests.FuzzTest",
            "--unchecked-exception=ERROR",
            "--time-limit=" + str(seconds),
            "--randomseed=" + str(seed),
            "--no-error-revealing-tests=false",
            "--no-regression-tests=true",
            "--output-limit=100",
            "--junit-output-dir=" + str(directory / "counterexamples"),
        ], directory, "randoop", seconds + 60,
        stderr_path=directory / "randoop.stderr.log",
    )
    if rc != 0:
        return dict(status="comparison_timeout" if rc is None else "comparison_error",
                    equivalent=False, metric="equivchecker")
    stdout = (directory / "randoop.log").read_text()
    passed = java_equivcheck_passed(rc, stdout)
    return dict(status="no_counterexample" if passed else "counterexample",
                equivalent=passed, metric="equivchecker")
