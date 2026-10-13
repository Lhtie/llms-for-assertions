#!/usr/bin/env python3
"""Fun2Spec-style iterative assertion generation for dispatched Java inputs."""

import argparse
import json
import os
from pathlib import Path
import re
import sys
import tempfile


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


DELIMITER = "-" * 20


FUN2SPEC_PROMPT = r'''As an expert language model trained in understanding code, your task is to generate a postcondition (POST) for the provided Java method.

A postcondition is a predicate wrapped in POST(any_predicate) that represents a condition guaranteed to be true after the method returns.

Follow these rules to construct the postcondition:
1. Syntax: Wrap the postcondition in POST(any_predicate).
2. Implications: Use the symbol "=>" for logical implication. For example, condition1 => condition2 indicates that if condition1 is true, then condition2 must also be true.
3. Logical operators: You may use "&&" (logical AND) and "||" (logical OR) to combine multiple conditions within a single predicate. condition1 && condition2 indicates that both conditions must be true. condition1 || condition2 indicates that at least one of the conditions must be true.
4. Quantifiers: You may use the Java specification quantifier \forall to express universally quantified conditions, in the form \forall int i; range_condition; predicate. All values of i satisfying range_condition must satisfy predicate.
5. All predicates used in the postcondition should be valid expressions in the provided Java method's context and valid in this project's assertion syntax. The checker will parse and compile them.
6. Valid method names: All method calls used in the predicate should exist and be accessible in the context of the method. Do not invent hypothetical method names; instead, give a simpler postcondition.
7. Naming the return value: Use \result to refer to the method's return value. Use \old(expression) for a value from before the method executes.
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
    lines = code.splitlines()
    marker = [i for i, line in enumerate(lines)
              if "@@@" in line and line.strip().startswith("//")]
    if len(marker) != 1:
        raise ValueError("Expected exactly one // @@@ annotation in dispatched input")
    # The following line is the ground-truth assertion; keep it out of the prompt.
    target = lines[:marker[0] + 1] + lines[marker[0] + 2:]
    return [{"role": "user", "content": FUN2SPEC_PROMPT.format(code="\n".join(target))}]


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
        f"Failed stage: {stage}\n"
        "Revise the postcondition so it matches the method documentation and is valid "
        "in the Java assertion syntax specified above. Return only POST(predicate)."
    )
    prompt[-1]["content"] += message
    return prompt


def validate_candidate(code, assertion, filename, datasets, fallback, time_limit):
    langid = "java"
    prefix, suffix, ground_truth = read_problem(code, langid)
    combinedcodes = source_directory(filename, datasets, fallback)

    if not nullchecker.nullcheck(langid, prefix, suffix, ground_truth, assertion, combinedcodes):
        return "parse/translation"
    if not compilechecker.cmplecheck(
        langid, prefix, suffix, ground_truth, assertion, combinedcodes
    ):
        return "compilation"
    if not fuzzchecker.fuzzcheck(
        langid, prefix, suffix, ground_truth, assertion, combinedcodes,
        "soundness", time_limit=time_limit,
    ):
        return "Randoop test validation"
    return None


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
    args = parser.parse_args()

    if args.max_retries < 0:
        parser.error("--max-retries must be nonnegative")
    if not args.write:
        parser.error("Use --write to save raw candidates and validation summaries")

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

            for attempt in range(args.max_retries + 1):
                prompt = build_fun2spec_prompt(code)
                if feedback_stage is not None:
                    prompt = add_feedback(prompt, attempt, feedback_assertion, feedback_stage)
                response = run_model(mkey, model, tokenizer, devices, prompt, args.temp)
                assertion = extract_fun2spec_postcondition(response)
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
                        failure_stage = f"checker error: {type(exc).__name__}: {exc}"

                attempts.append({
                    "attempt": attempt,
                    "assertion": assertion,
                    "failure_stage": failure_stage,
                    "test_valid": failure_stage is None,
                })
                feedback_stage = failure_stage
                feedback_assertion = assertion

                raw_path.write_text(
                    ("\n" + DELIMITER + "\n").join(raw_candidates) + "\n" + DELIMITER + "\n",
                    encoding="utf-8",
                )
                extract_path.write_text(
                    ("\n" + DELIMITER + "\n").join(assertions) + "\n" + DELIMITER + "\n",
                    encoding="utf-8",
                )
                summary_path.write_text(
                    json.dumps({
                        "input": str(input_path),
                        "model": mkey,
                        "attempts": attempts,
                        "selected_attempt": next(
                            (item["attempt"] for item in attempts if item["test_valid"]), None
                        ),
                    }, ensure_ascii=False, indent=2) + "\n",
                    encoding="utf-8",
                )
                if failure_stage is None:
                    break
                print(f"{filename}: attempt {attempt} failed {failure_stage}")

        del model
        del tokenizer


if __name__ == "__main__":
    main()
