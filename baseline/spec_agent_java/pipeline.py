"""Paper-inspired Java Spec-Agent baseline using the repository's existing checks.

This is an adaptation, not the authors' unreleased implementation. Inputs are the
per-assertion Java files produced by utils.dispatch; outputs retain the layout
consumed by checker.py.
"""
from __future__ import annotations

import argparse
import json
import os
import re
import sys
from pathlib import Path
from typing import Any

ROOT = Path(__file__).resolve().parents[2]
if str(ROOT) not in sys.path:
    sys.path.insert(0, str(ROOT))

from llm import load_model, modelpaths, run_model
from prompting import extract
from checkers import compilechecker, fuzzchecker, nullchecker
from utils.problemreader import read_problem

SEPARATOR = "-" * 20


def select_logic(code: str) -> tuple[str, dict[str, bool]]:
    """Approximate paper's feature-based logic ladder for Java source."""
    without_comments = re.sub(r"/\*.*?\*/|//[^\n]*", " ", code, flags=re.S)
    loops = bool(re.search(r"\b(for|while|do)\b", without_comments))
    # Java objects/arrays and mutation stand in for heap reasoning. Java has no
    # explicit malloc, so conservatively treat reference/array operations as heap.
    heap = bool(re.search(
        r"\bnew\s+[A-Za-z_$]|\[\s*\]|\b(this|super)\b|\.\w+\s*=|\b\w+\s*\.\s*(add|remove|put|clear|set)\s*\(",
        without_comments,
    ))
    target = "FOSL" if loops and heap else "FOL" if loops else "Prop SL" if heap else "Prop"
    return target, {"loops": loops, "heap_approx": heap}


def candidate_logic(candidate: str) -> str:
    quantified = bool(re.search(r"\\(?:forall|exists)\b", candidate, re.I))
    separation = bool(re.search(r"(?:\\sep|\bstar\b|\*\s*\*)", candidate, re.I))
    if quantified and separation:
        return "FOSL"
    if quantified:
        return "FOL"
    if separation:
        return "Prop SL"
    return "Prop"


def reaches(candidate: str, target: str) -> bool:
    level = candidate_logic(candidate)
    if target == "Prop":
        return True
    if target == "FOL":
        return level in {"FOL", "FOSL"}
    if target == "Prop SL":
        return level in {"Prop SL", "FOSL"}
    return level == "FOSL"


def spec_prompt(code: str, target: str, feedback: str = "") -> list[dict[str, str]]:
    # Preserve only source/comment context. Per paper, tests are withheld from
    # generation and used only by validation.
    source = re.sub(r"(?m)^\s*//\s*@@@", "// Natural language property:", code)
    rules = {
        "Prop": "Boolean logic, comparisons, and implications.",
        "FOL": "Boolean logic plus bounded universal/existential quantification over Java arrays/collections.",
        "Prop SL": "Boolean logic plus heap/resource reasoning. Use Java assertion syntax for this project.",
        "FOSL": "Bounded quantification plus heap/resource reasoning, expressed in Java assertion syntax.",
    }[target]
    text = (
        "Synthesize the Java assertion (postcondition) for the natural-language property in the code.\n"
        f"Target expressivity: {target}. Allowed capability: {rules}\n"
        "Use the project's JML-like conventions: \\old(expr), \\result, and \\forall int i; range; predicate. "
        "Return exactly one assertion inside <code>...</code>. Do not add unrelated properties.\n"
        f"Java source:\n```java\n{source}\n```"
    )
    if feedback:
        text += "\nValidation/refinement feedback from the previous candidate:\n" + feedback
    return [{"role": "user", "content": text}]


def _is_valid_assertion(candidate: str) -> bool:
    return bool(candidate.strip()) and "assert" in candidate.lower()


def check_candidate(code: str, filename: str, candidate: str, max_fuzz_time: int) -> dict[str, Any]:
    pfx, sfx, ground_truth = read_problem(code, "java")
    cc = str(ROOT / "datasets" / "c2s_aug")
    try:
        null_ok = bool(nullchecker.nullcheck("java", pfx, sfx, ground_truth, candidate, cc))
    except Exception as exc:
        null_ok, null_err = False, f"{type(exc).__name__}: {exc}"
    else:
        null_err = None
    if not null_ok:
        return {"valid": False, "stage": "null", "message": null_err or "Rejected by null checker"}
    try:
        compile_ok = bool(compilechecker.cmplecheck("java", pfx, sfx, ground_truth, candidate, cc))
    except Exception as exc:
        compile_ok, compile_err = False, f"{type(exc).__name__}: {exc}"
    else:
        compile_err = None
    if not compile_ok:
        return {"valid": False, "stage": "compile", "message": compile_err or "Java compilation failed"}
    try:
        fuzz_ok = bool(fuzzchecker.fuzzcheck(
            "java", pfx, sfx, ground_truth, candidate, cc, "soundness",
            time_limit=max_fuzz_time,
        ))
    except Exception as exc:
        return {"valid": False, "stage": "fuzz", "message": f"{type(exc).__name__}: {exc}"}
    return {"valid": fuzz_ok, "stage": "fuzz", "message": "No counterexample found" if fuzz_ok else "Fuzz checker rejected candidate"}


def generate_one(args: argparse.Namespace, model: Any, tokenizer: Any, devices: Any,
                 input_path: Path, output_dir: Path) -> dict[str, Any]:
    code = input_path.read_text(encoding="utf-8")
    target, features = select_logic(code)
    feedback = ""
    attempts: list[dict[str, Any]] = []
    accepted = ""
    for attempt in range(1, args.max_attempts + 1):
        prompt = spec_prompt(code, target, feedback)
        response = run_model(args.model, model, tokenizer, devices, prompt, temp=0.0, max_tokens=args.max_tokens)
        candidate = extract("default", response, "java").strip()
        level_ok = reaches(candidate, target)
        validation = check_candidate(code, input_path.name, candidate, args.fuzz_seconds) if _is_valid_assertion(candidate) else {
            "valid": False, "stage": "parse", "message": "No assertion extracted from model response"
        }
        record = {"attempt": attempt, "candidate": candidate, "candidate_logic": candidate_logic(candidate),
                  "target_logic": target, "expressivity_ok": level_ok, "validation": validation,
                  "response": response}
        attempts.append(record)
        if validation["valid"] and level_ok:
            accepted = candidate
            break
        messages = []
        if not level_ok:
            messages.append(f"Candidate is only {candidate_logic(candidate)}; target requires {target} expressivity.")
        messages.append(f"{validation['stage']} validation failed: {validation['message']}")
        feedback = "\n".join(messages) + f"\nRejected candidate: {candidate}"

    output_dir.mkdir(parents=True, exist_ok=True)
    (output_dir / input_path.name).write_text("\n".join(x["response"] for x in attempts) + "\n", encoding="utf-8")
    (output_dir / (input_path.name + ".extract")).write_text(
        "\n".join(x["candidate"] for x in attempts) + "\n" + SEPARATOR + "\n", encoding="utf-8"
    )
    artifact = {
        "paper": "arXiv:2605.27531",
        "implementation": "Java adaptation; not the authors' implementation",
        "input": str(input_path), "target_logic": target, "features": features,
        "accepted": bool(accepted), "accepted_candidate": accepted or None,
        "attempts": attempts,
    }
    (output_dir / (input_path.name + ".spec-agent.json")).write_text(
        json.dumps(artifact, indent=2, ensure_ascii=False) + "\n", encoding="utf-8"
    )
    return artifact


def main() -> None:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--codedir", required=True, type=Path, help="Per-assertion files from utils.dispatch")
    parser.add_argument("--output", required=True, type=Path)
    parser.add_argument("--model", default="gpt-oss-api", choices=sorted(modelpaths))
    parser.add_argument("--codelist", nargs="*")
    parser.add_argument("--max-attempts", type=int, default=3)
    parser.add_argument("--max-tokens", type=int, default=400)
    parser.add_argument("--fuzz-seconds", type=int, default=3)
    args = parser.parse_args()
    if args.max_attempts < 1 or args.fuzz_seconds < 1:
        parser.error("--max-attempts and --fuzz-seconds must be positive")
    paths = sorted(p for p in args.codedir.iterdir() if p.is_file())
    if args.codelist:
        wanted = set(args.codelist)
        paths = [p for p in paths if p.name.rsplit(".", 1)[-1] in wanted]
    tokenizer, model, devices = load_model(args.model)
    try:
        for path in paths:
            result = generate_one(args, model, tokenizer, devices, path, args.output)
            print(f"{path.name}: accepted={result['accepted']} target={result['target_logic']} attempts={len(result['attempts'])}")
    finally:
        del model
        del tokenizer


if __name__ == "__main__":
    main()
