#!/usr/bin/env python3
"""Fun2Spec-style iterative assertion generation for dispatched Java inputs."""

import argparse
import json
import os
from pathlib import Path
import re
import sys
import tempfile
from types import SimpleNamespace


# Running this file directly puts baseline/fun2spec, rather than the repository
# root, on sys.path. Add the root so the existing project modules are importable.
REPO_ROOT = Path(__file__).resolve().parents[2]
if str(REPO_ROOT) not in sys.path:
    sys.path.insert(0, str(REPO_ROOT))

# The existing checkers keep fixed subdirectories under CHECKER_TMP_DIR.
# Give this run its own root so concurrent checker processes cannot collide.
_checker_tmp = None
if not os.environ.get("CHECKER_TMP_DIR"):
    _checker_tmp = tempfile.TemporaryDirectory(prefix="fun2spec-checker-")
    os.environ["CHECKER_TMP_DIR"] = _checker_tmp.name

from checkers import compilechecker, fuzzchecker, nullchecker
from llm import load_model, modelpaths, run_model
from utils.problemreader import read_problem
from utils.sourcepaths import source_directory
from utils.onedown import closing_paren, get_funcs


DELIMITER = "-" * 20


FUN2SPEC_PROMPT = r'''As an expert language model trained in understanding code, your task is to generate a postcondition (POST) for the provided Java method.

A postcondition is a predicate wrapped in POST(any_predicate) that represents a condition guaranteed to be true after the method returns.

Follow these rules to construct the postcondition:
1. Syntax: Wrap the postcondition in POST(any_predicate).
2. Implications: Use the symbol "=>" for logical implication. For example, condition1 => condition2 indicates that if condition1 is true, then condition2 must also be true.
3. Logical operators: You may use "&&" (logical AND) and "||" (logical OR) to combine multiple conditions within a single predicate. condition1 && condition2 indicates that both conditions must be true. condition1 || condition2 indicates that at least one of the conditions must be true.
4. Quantifiers: You may use the Java specification quantifier \forall to express universally quantified conditions, in the form \forall int i; range_condition; predicate. All values of i satisfying range_condition must satisfy predicate.
5. All predicates used in the postcondition should be valid expressions in the provided Java method's context and valid in this project's assertion syntax. The checker will parse and compile them.
6. Valid method names and state: Use only public methods and fields that an external Java test can access. Do not refer to private or package-private implementation fields or helper methods. Do not invent hypothetical method names; instead, give a simpler postcondition.
7. Naming results: {result_instruction} Use \old(expression) for a value from before the method executes.
8. Trivial postcondition: If no specific predicates must hold for the method, return the trivial postcondition POST(true).
9. Single postcondition: Return only one postcondition for the method.
10. Use names and qualifications as they appear in the Java code.

Think through the method behavior, then return only the postcondition in the form POST(predicate). Do not return Java code or an explanation.

Java method and its documentation:
```java
{code}
```'''


def build_fun2spec_prompt(code):
    """Use the paper's Appendix A instruction template, adapted to Java syntax."""
    code = move_target_method_to_end(code)
    lines = code.splitlines()
    marker = [i for i, line in enumerate(lines)
              if "@@@" in line and line.strip().startswith("//")]
    if len(marker) != 1:
        raise ValueError("Expected exactly one // @@@ annotation in dispatched input")
    # The following line is the ground-truth assertion; keep it out of the prompt.
    target = lines[:marker[0] + 1] + lines[marker[0] + 2:]
    target_method = target_method_info(code)
    if target_method["is_constructor"]:
        result_instruction = (
            "This target is a constructor, so it has no \\result. Describe the constructed "
            "object using this."
        )
    elif target_method["return_type"] == "void":
        result_instruction = "This target returns void, so do not use \\result."
    else:
        result_instruction = "Use \\result to refer to the method's return value."
    return [{"role": "user", "content": FUN2SPEC_PROMPT.format(
        code="\n".join(target), result_instruction=result_instruction,
    )}]


def target_method_info(code):
    """Describe the declaration containing the input's single @@@ marker."""
    lines = code.splitlines()
    marker_lines = [i for i, line in enumerate(lines) if "@@@" in line and line.strip().startswith("//")]
    if len(marker_lines) != 1:
        raise ValueError("Expected exactly one // @@@ annotation in dispatched input")
    starts = [line for line in get_funcs(lines, "java") if line <= marker_lines[0]]
    if not starts:
        raise ValueError("Could not locate a Java method for the // @@@ annotation")
    start = starts[-1]
    class_source = re.sub(r"/\*.*?\*/|//[^\n]*", "", code, flags=re.S)
    class_match = re.search(r"\bpublic\s+class\s+(\w+)\b", class_source)
    if class_match is None:
        raise ValueError("Could not identify Java class name")
    class_name = class_match.group(1)
    declaration = lines[start].strip()
    constructor = re.search(rf"\b{re.escape(class_name)}\s*\(", declaration) is not None
    method_match = re.search(
        r"^(?:(?:public|protected|private|static|final|synchronized|abstract|native|default)\s+)*"
        r"(?:<[^>]+>\s*)?([\w.$<>?\[\],]+)\s+\w+\s*\(", declaration
    )
    return_type = "void" if constructor else (method_match.group(1) if method_match else "")
    return {"is_constructor": constructor, "return_type": return_type, "start": start}


def move_target_method_to_end(code):
    """Put the annotated method last so the existing checker selects it."""
    lines = code.splitlines()
    info = target_method_info(code)
    start = info["start"]
    marker_line = next(i for i, line in enumerate(lines) if "@@@" in line and line.strip().startswith("//"))
    opening = next((i for i in range(start, marker_line + 1) if "{" in lines[i]), None)
    if opening is None:
        return code
    end = closing_paren(lines, opening)
    if end <= opening or end > len(lines):
        return code

    block_start = start
    while block_start > 0:
        previous = lines[block_start - 1].strip()
        if not previous or previous.startswith(("//", "/*", "*", "*/", "@")):
            block_start -= 1
        else:
            break
    block = lines[block_start:end]
    remaining = lines[:block_start] + lines[end:]
    class_close = next((i for i in range(len(remaining) - 1, -1, -1)
                        if remaining[i].strip() == "}"), None)
    if class_close is None:
        return code
    return "\n".join(remaining[:class_close] + block + remaining[class_close:])


def extract_fun2spec_postcondition(response):
    """Unwrap Fun2Spec's POST(...) response and convert it to checker input."""
    text = response.strip()
    fenced = re.search(r"```(?:\w+)?\s*(.*?)\s*```", text, re.DOTALL)
    if fenced:
        text = fenced.group(1).strip()

    match = re.search(r"\bPOST\s*\(", text)
    if match:
        start = match.end()
        depth = 1
        for index in range(start, len(text)):
            if text[index] == "(":
                depth += 1
            elif text[index] == ")":
                depth -= 1
                if depth == 0:
                    formula = text[start:index].strip()
                    return f"assert {formula};" if formula else ""
        return ""

    # Accept a bare Java assertion as a recovery path; the prompt still asks
    # for the original POST(...) wrapper.
    assertion = re.search(r"\bassert\s+(.+?);?\s*$", text, re.DOTALL)
    if assertion:
        formula = assertion.group(1).strip().removesuffix(";").strip()
        return f"assert {formula};" if formula else ""
    return ""


def add_feedback(prompt, attempt, assertion, stage):
    message = (
        "\n\nAutomated Fun2Spec-style validation feedback for your previous candidate:\n"
        f"Attempt: {attempt}\n"
        f"Previous assertion: {assertion or '[no assertion extracted]'}\n"
        f"Failed stage and compiler/parser details: {stage}\n"
        "Revise the postcondition so it matches the method documentation and is valid "
        "in the Java assertion syntax specified above. Return only POST(predicate)."
    )
    prompt[-1]["content"] += message
    return prompt


def validate_candidate(code, assertion, filename, datasets, fallback, time_limit):
    code = move_target_method_to_end(code)
    langid = "java"
    prefix, suffix, ground_truth = read_problem(code, langid)
    combinedcodes = source_directory(filename, datasets, fallback)

    if not nullchecker.nullcheck(langid, prefix, suffix, ground_truth, assertion, combinedcodes):
        return "parse/translation"
    compile_diagnostics = []
    original_run = compilechecker.subprocess.run

    def capture_javac(*args, **kwargs):
        command = args[0] if args else kwargs.get("args")
        if isinstance(command, (list, tuple)) and command and command[0] == "javac":
            kwargs["stdout"] = compilechecker.subprocess.PIPE
            kwargs["stderr"] = compilechecker.subprocess.PIPE
            kwargs["text"] = True
            result = original_run(*args, **kwargs)
            diagnostic = (result.stderr or result.stdout or "").strip()
            if diagnostic:
                compile_diagnostics.append(diagnostic)
            return SimpleNamespace(returncode=result.returncode)
        return original_run(*args, **kwargs)

    compilechecker.subprocess.run = capture_javac
    try:
        compiled = compilechecker.cmplecheck(
            langid, prefix, suffix, ground_truth, assertion, combinedcodes
        )
    finally:
        compilechecker.subprocess.run = original_run
    if not compiled:
        details = compile_diagnostics[0] if compile_diagnostics else "no javac diagnostics captured"
        return f"compilation: {details[:2000]}"
    if not fuzzchecker.fuzzcheck(
        langid, prefix, suffix, ground_truth, assertion, combinedcodes,
        "soundness", time_limit=time_limit,
    ):
        return "Randoop test validation"
    return None


def atomic_write_text(path, text):
    """Replace one checkpoint file atomically so a killed run keeps its prior data."""
    temporary = path.with_name(path.name + ".tmp")
    temporary.write_text(text, encoding="utf-8")
    os.replace(temporary, path)


def split_saved_candidates(path):
    if not path.is_file():
        return []
    return [part.strip() for part in path.read_text(encoding="utf-8").split(DELIMITER)
            if part.strip()]


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--codedir", type=Path, required=True,
                        help="Dispatched Java inputs containing one // @@@ assertion per file.")
    parser.add_argument("--datasets", type=Path, default=Path("datasets"))
    parser.add_argument("--combinedcodesdir", type=Path, default=None)
    parser.add_argument("--resultdir", type=Path, default=Path("results/fun2spec"))
    parser.add_argument("--modellist", nargs="+", required=True, choices=sorted(modelpaths))
    parser.add_argument("--codelist", nargs="+", default=[])
    parser.add_argument("--temp", type=float, default=0.0)
    parser.add_argument("--max-retries", type=int, default=5,
                        help="Number of refinements after the initial candidate.")
    parser.add_argument("--time-limit", type=int, default=30)
    parser.add_argument("--write", action="store_true")
    parser.add_argument("--resume", action="store_true",
                        help="Continue incomplete inputs from their saved attempt (requires --write).")
    args = parser.parse_args()

    if args.max_retries < 0:
        parser.error("--max-retries must be nonnegative")
    if not args.write:
        parser.error("Use --write to save raw candidates and validation summaries")
    if args.resume and not args.write:
        parser.error("--resume requires --write")

    args.resultdir.mkdir(parents=True, exist_ok=True)
    fallback = args.combinedcodesdir or args.datasets

    for mkey in args.modellist:
        model_path = modelpaths[mkey]
        model_name = model_path.split("/")[-1]
        output_dir = args.resultdir / model_name / f"fun2spec-{args.temp}"
        output_dir.mkdir(parents=True, exist_ok=True)
        tokenizer, model, devices = load_model(mkey)

        for filename in sorted(os.listdir(args.codedir)):
            input_path = args.codedir / filename
            if not input_path.is_file() or filename.endswith((".extract", ".logprob")):
                continue
            if args.codelist and filename.split(".")[-1] not in args.codelist:
                continue

            code = input_path.read_text(encoding="utf-8")
            raw_path = output_dir / filename
            extract_path = output_dir / f"{filename}.extract"
            summary_path = output_dir / f"{filename}.fun2spec.json"
            raw_candidates = []
            assertions = []
            attempts = []
            feedback_stage = None
            feedback_assertion = None

            if args.resume and summary_path.is_file():
                try:
                    previous = json.loads(summary_path.read_text(encoding="utf-8"))
                    previous_attempts = previous.get("attempts", [])
                    is_complete = (
                        previous.get("selected_attempt") is not None
                        or previous.get("skipped", False)
                        or len(previous_attempts) >= args.max_retries + 1
                    )
                    if is_complete:
                        print(f"{filename}: resume skipped (already complete)")
                        continue

                    attempts = previous_attempts
                    raw_candidates = split_saved_candidates(raw_path)[:len(attempts)]
                    while len(raw_candidates) < len(attempts):
                        raw_candidates.append("[previous raw response unavailable]")
                    assertions = [item.get("assertion", "") for item in attempts]
                    if attempts:
                        feedback_stage = attempts[-1].get("failure_stage")
                        feedback_assertion = attempts[-1].get("assertion", "")
                    print(f"{filename}: resuming at attempt {len(attempts)}")
                except (OSError, ValueError, TypeError) as exc:
                    print(f"{filename}: could not read checkpoint ({exc}); restarting")

            def save_outputs():
                atomic_write_text(raw_path,
                    ("\n" + DELIMITER + "\n").join(raw_candidates) + "\n" + DELIMITER + "\n",
                )
                atomic_write_text(extract_path,
                    ("\n" + DELIMITER + "\n").join(assertions) + "\n" + DELIMITER + "\n",
                )
                atomic_write_text(summary_path,
                    json.dumps({
                        "input": str(input_path),
                        "model": mkey,
                        "attempts": attempts,
                        "selected_attempt": next(
                            (item["attempt"] for item in attempts if item["test_valid"]), None
                        ),
                        "skipped": any(item.get("skipped", False) for item in attempts),
                    }, ensure_ascii=False, indent=2) + "\n",
                )

            for attempt in range(len(attempts), args.max_retries + 1):
                try:
                    prompt = build_fun2spec_prompt(code)
                    if feedback_stage is not None:
                        prompt = add_feedback(prompt, attempt, feedback_assertion, feedback_stage)
                    response = run_model(mkey, model, tokenizer, devices, prompt, args.temp)
                    assertion = extract_fun2spec_postcondition(response)
                except Exception as exc:
                    error = f"{type(exc).__name__}: {exc}"
                    attempts.append({
                        "attempt": attempt,
                        "assertion": "",
                        "failure_stage": f"skipped after error: {error}",
                        "test_valid": False,
                        "skipped": True,
                    })
                    raw_candidates.append(f"[Skipped after error: {error}]")
                    assertions.append("")
                    save_outputs()
                    print(f"{filename}: skipped after attempt {attempt} error: {error}")
                    break

                raw_candidates.append(response)
                assertions.append(assertion)

                if not assertion:
                    failure_stage = "invalid formatting (no <code> assertion extracted)"
                else:
                    try:
                        failure_stage = validate_candidate(
                            code, assertion, filename, args.datasets, fallback, args.time_limit
                        )
                    except Exception as exc:
                        error = f"{type(exc).__name__}: {exc}"
                        attempts.append({
                            "attempt": attempt,
                            "assertion": assertion,
                            "failure_stage": f"skipped after error: {error}",
                            "test_valid": False,
                            "skipped": True,
                        })
                        save_outputs()
                        print(f"{filename}: skipped after attempt {attempt} error: {error}")
                        break

                attempts.append({
                    "attempt": attempt,
                    "assertion": assertion,
                    "failure_stage": failure_stage,
                    "test_valid": failure_stage is None,
                })
                feedback_stage = failure_stage
                feedback_assertion = assertion

                save_outputs()
                if failure_stage is None:
                    break
                print(f"{filename}: attempt {attempt} failed {failure_stage}")

        del model
        del tokenizer


if __name__ == "__main__":
    main()
