#!/usr/bin/env python3
"""Evaluate the selected Fun2Spec assertion for one or more datasets.

The reported accuracy is the fraction of all tasks whose selected assertion
passes this repository's Randoop-based equivalence checker. Tasks without a
valid Fun2Spec candidate count as incorrect.
"""

import argparse
import ast
import json
import re
import subprocess
import sys
import tempfile
from pathlib import Path


ROOT = Path(__file__).resolve().parents[2]
DEFAULT_DATASETS = ("buggyasrts", "buggycodes", "naturalness", "c2s_aug")


def load_selected(result_dir):
    """Return task-id -> assertion, using the attempt selected by run_java.py."""
    selected = {}
    for path in sorted(result_dir.glob("*.fun2spec.json")):
        data = json.loads(path.read_text(encoding="utf-8"))
        filename = Path(data.get("input", "")).name
        match = re.search(r"onedown\.java\.(\d+)$", filename)
        if not match:
            continue  # .java.0 helper inputs are not assertion tasks
        task_id = match.group(1)
        attempt_id = data.get("selected_attempt")
        attempt = next(
            (a for a in data.get("attempts", [])
             if a.get("attempt") == attempt_id and a.get("test_valid")),
            None,
        ) if attempt_id is not None else None
        assertion = attempt.get("assertion", "").strip() if attempt else ""
        if assertion:
            selected[task_id] = (filename, assertion)
        else:
            selected[task_id] = (filename, None)
    return selected


def run_equiv_checker(dataset, selected, code_root, datasets_root):
    """Run checker.py on selected assertions and return filename -> bool."""
    checked = {}
    runnable = [(tid, filename, assertion)
                for tid, (filename, assertion) in selected.items() if assertion]
    if not runnable:
        return checked

    with tempfile.TemporaryDirectory(prefix=f"fun2spec-report-{dataset}-") as tmp:
        temp_root = Path(tmp)
        candidates_dir = temp_root / "candidates"
        report_dir = temp_root / "report"
        candidates_dir.mkdir()
        report_dir.mkdir()
        for _, filename, assertion in runnable:
            (candidates_dir / f"{filename}.extract").write_text(
                assertion + "\n" + "-" * 20 + "\n", encoding="utf-8"
            )

        task_ids = sorted({tid for tid, _, _ in runnable}, key=int)
        command = [
            sys.executable, str(ROOT / "checker.py"),
            "--datasets", str(datasets_root),
            "--codedir", str(code_root / dataset),
            "--codelist", *task_ids,
            "--resultlist", str(candidates_dir),
            "--checklist", "equiv",
            "--outdir", str(report_dir),
            "--outname", "equiv.txt",
            "--write",
        ]
        subprocess.run(command, cwd=ROOT, check=True)
        report = (report_dir / "equiv.txt").read_text(encoding="utf-8", errors="replace")

    current = None
    for line in report.splitlines():
        header = re.match(r"#{10} (.+?)\.check #{10}", line)
        if header:
            current = Path(header.group(1)).name
            continue
        if current is not None and line.startswith("equiv_res:"):
            match = re.search(r"equiv_res:\s*(\[[^]]*\])", line)
            try:
                values = ast.literal_eval(match.group(1)) if match else []
            except (SyntaxError, ValueError):
                values = []
            checked[current] = bool(values and values[0])
            current = None
    return checked


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--datasets", nargs="+", default=list(DEFAULT_DATASETS),
                        help="Dataset names under results/fun2spec and javacodes/fun2spec")
    parser.add_argument("--result-root", type=Path, default=ROOT / "results/fun2spec")
    parser.add_argument("--code-root", type=Path, default=ROOT / "javacodes/fun2spec")
    parser.add_argument("--datasets-root", type=Path, default=ROOT / "datasets")
    args = parser.parse_args()

    print("dataset\ttasks\tselected_valid\tequiv\tacc")
    total_tasks = total_selected = total_equiv = 0
    for dataset in args.datasets:
        result_dir = args.result_root / dataset / "gpt-oss-120b" / "fun2spec-0.6"
        selected = load_selected(result_dir)
        checked = run_equiv_checker(dataset, selected, args.code_root, args.datasets_root)
        correct = sum(checked.get(filename, False) for filename, _ in selected.values())
        tasks = len(selected)
        selected_count = sum(assertion is not None for _, assertion in selected.values())
        acc = correct / tasks if tasks else 0.0
        print(f"{dataset}\t{tasks}\t{selected_count}\t{correct}\t{acc:.4f} ({100*acc:.1f}%)")
        total_tasks += tasks
        total_selected += selected_count
        total_equiv += correct

    acc = total_equiv / total_tasks if total_tasks else 0.0
    print(f"ALL\t{total_tasks}\t{total_selected}\t{total_equiv}\t{acc:.4f} ({100*acc:.1f}%)")


if __name__ == "__main__":
    main()
