"""Replay saved translation/compile failures without model calls or source writes."""

import argparse
from collections import Counter
import json
from pathlib import Path

from .compare import ROOT, compare
from .extract import source_digest
from .pipeline import write
from .translate import translate_batch


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument(
        "--batch", type=Path, default=ROOT / "baseline/expecto-results/batch"
    )
    parser.add_argument("--output", type=Path, required=True)
    parser.add_argument("--datasets", type=Path, default=ROOT / "datasets")
    parser.add_argument("--compile-only", action="store_true")
    parser.add_argument("--test-seconds", type=int, default=30)
    args = parser.parse_args()
    if args.test_seconds <= 0:
        parser.error("--test-seconds must be positive")
    args.output = args.output.resolve()
    args.datasets = args.datasets.resolve()
    args.output.mkdir(parents=True, exist_ok=False)
    results = []
    for file in sorted(args.batch.glob("*/result.json")):
        previous = json.loads(file.read_text())
        if previous.get("status") not in {"translation_error", "compile_error"}:
            continue
        source = file.parent
        directory = args.output / source.name
        directory.mkdir()
        result = dict(
            id=source.name, previous_status=previous["status"],
            previous_error=previous.get("error"), translated=False
        )
        stage = "translation"
        try:
            row = json.loads((source / "sample.json").read_text())
            adapter = json.loads((source / "adapter.json").read_text())
            if (
                source_digest(args.datasets / row["source"])
                != row["source_sha256"]
            ):
                raise ValueError("Dataset source changed since original run")
            dsl = (source / "spec.dsl").read_text()
            (directory / "spec.dsl").write_text(dsl)
            write(directory / "sample.json", row)
            write(directory / "adapter.json", adapter)
            notes = []
            candidate = translate_batch(dsl, adapter["mapping"], notes=notes)
            write(directory / "translation_notes.json", notes)
            (directory / "candidate.assert").write_text(candidate)
            result["translated"] = True
            stage = "comparison"
            result.update(
                compare(
                    row,
                    adapter,
                    candidate,
                    args.datasets,
                    directory,
                    args.test_seconds,
                    compile_only=args.compile_only,
                )
            )
        except Exception as error:
            result.update(
                status=stage + "_error", error=f"{type(error).__name__}: {error}"
            )
        write(directory / "result.json", result)
        results.append(result)
        print(result["id"], result["status"], flush=True)
        write(args.output / "results.json", results)
        write(
            args.output / "summary.json",
            dict(
                total=len(results),
                translated=sum(r["translated"] for r in results),
                statuses=dict(Counter(r["status"] for r in results)),
                model_calls=0,
                compile_only=args.compile_only,
            ),
        )
    print(
        (args.output / "summary.json").read_text()
        if results
        else "No translation or compile errors found"
    )


if __name__ == "__main__":
    main()
