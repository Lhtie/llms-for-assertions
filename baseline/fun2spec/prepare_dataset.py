#!/usr/bin/env python3
"""Index the repository's Java NL-assertion pairs for a Fun2Spec-style run."""

import argparse
import json
import re
from collections import Counter
from pathlib import Path


REPO_ROOT = Path(__file__).resolve().parents[2]
DEFAULT_DATA_ROOT = REPO_ROOT / "datasets"
DEFAULT_OUTPUT = Path(__file__).resolve().parent / "dataset_manifest.jsonl"
NL_MARKER = re.compile(r"^\s*//\s*@@@\s?(.*)$")
ASSERTION_COMMENT = re.compile(r"^\s*//\s*(assert\b.*)$")
CLASS_DECL = re.compile(
    r"(?m)^\s*(?:(?:public|protected|private|abstract|final|static)\s+)*"
    r"class\s+([A-Za-z_$][\w$]*)\b"
)


def read_records(data_root: Path, dataset_names):
    counts = Counter()
    for dataset_name in dataset_names:
        dataset_root = data_root / dataset_name
        if not dataset_root.is_dir():
            print(f"warning: dataset directory not found: {dataset_root}")
            continue

        for source_path in sorted(dataset_root.rglob("*.java")):
            try:
                source = source_path.read_text(encoding="utf-8")
            except UnicodeDecodeError:
                source = source_path.read_text(encoding="utf-8", errors="replace")
            lines = source.splitlines()
            class_match = CLASS_DECL.search(source)
            class_name = class_match.group(1) if class_match else source_path.stem
            relative_path = source_path.relative_to(REPO_ROOT).as_posix()

            for line_index, line in enumerate(lines):
                marker = NL_MARKER.match(line)
                if not marker:
                    continue

                gt = None
                gt_line = None
                next_index = line_index + 1
                while next_index < len(lines) and not lines[next_index].strip():
                    next_index += 1
                if next_index < len(lines):
                    gt_match = ASSERTION_COMMENT.match(lines[next_index])
                    if gt_match:
                        gt = gt_match.group(1).strip()
                        gt_line = next_index + 1

                rel_to_dataset = source_path.relative_to(dataset_root)
                group = next(
                    (part for part in rel_to_dataset.parts[:-1] if part.startswith("mut_")),
                    "original",
                )
                record = {
                    "id": f"{dataset_name}/{rel_to_dataset.as_posix()}:{line_index + 1}",
                    "dataset": dataset_name,
                    "mutation_group": group,
                    "source_file": relative_path,
                    "class_name": class_name,
                    "annotation_line": line_index + 1,
                    "ground_truth_line": gt_line,
                    "natural_language": marker.group(1).strip(),
                    "ground_truth": gt,
                }
                counts[dataset_name] += 1
                yield record, counts


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--data-root", type=Path, default=DEFAULT_DATA_ROOT)
    parser.add_argument(
        "--datasets",
        nargs="+",
        default=None,
        help="Dataset directory names; defaults to every directory under --data-root.",
    )
    parser.add_argument("--output", type=Path, default=DEFAULT_OUTPUT)
    args = parser.parse_args()

    names = args.datasets
    if names is None:
        names = sorted(path.name for path in args.data_root.iterdir() if path.is_dir())

    args.output.parent.mkdir(parents=True, exist_ok=True)
    counts = Counter()
    total = 0
    with args.output.open("w", encoding="utf-8") as output:
        for record, _ in read_records(args.data_root.resolve(), names):
            output.write(json.dumps(record, ensure_ascii=False) + "\n")
            counts[record["dataset"]] += 1
            total += 1

    print(f"Wrote {total} assertion records to {args.output}")
    for name in names:
        print(f"  {name}: {counts[name]}")


if __name__ == "__main__":
    main()
