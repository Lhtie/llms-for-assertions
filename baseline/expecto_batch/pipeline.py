"""One source assertion per sample. Run with python -m baseline.expecto_batch.pipeline."""

import argparse
from collections import Counter
import csv
import hashlib
import json
from pathlib import Path
import sys

from .extract import scan, digest, source_digest
from .adapters import adapt
from .models import model_settings
from .compare import ROOT, command, compare


def write(path, value):
    path.write_text(json.dumps(value, ensure_ascii=False, indent=2) + "\n")


def require_complete_generation(generated):
    """Reject upstream search failures before invoking the DSL translator."""
    if generated.get("is_success") is False or generated.get("num_of_undefined", 0) > 0:
        raise ValueError(
            "Expecto did not finish DSL generation "
            f"(defined={generated.get('num_of_defined', 'unknown')}, "
            f"undefined={generated.get('num_of_undefined', 'unknown')}). "
            "The returned code may contain only placeholder declarations. "
            "See generation.json and generation_feedback.jsonl; "
            "retry this sample with --force after inspecting the feedback."
        )
    codes = generated.get("generated_codes")
    if not codes or not isinstance(codes[0], str) or not codes[0].strip():
        raise ValueError("Expecto returned no DSL; see generation.json")
    return codes[0]


def prepare(args):
    if not args.group:
        raise ValueError("prepare requires an explicit --group")
    rows = []
    inventory = []
    groups = [args.group] if isinstance(args.group, str) else args.group
    for group in dict.fromkeys(groups):
        for source in sorted((args.datasets / group).rglob("*.java")):
            found = scan(source, args.datasets)
            rows.extend(found)
            inventory.append(
                dict(
                    source=str(source.relative_to(args.datasets)), assertions=len(found)
                )
            )
    if not inventory:
        raise ValueError("No dataset Java files found")
    args.output.mkdir(parents=True, exist_ok=True)
    for row in rows:
        directory = args.output / row["id"]
        directory.mkdir(exist_ok=True)
        try:
            if row.get("extraction_error"):
                raise ValueError(row["extraction_error"])
            adapter = adapt(row)
            write(directory / "adapter.json", adapter)
            # This file, unlike sample.json, may be sent to the model.
            write(
                directory / "generation_input.json",
                dict(
                    project=row["group"],
                    bug_id=row["id"],
                    method_info=adapter["method_info"],
                    corrects={},
                    incorrects={},
                ),
            )
            row["preparation_status"] = "ready"
        except Exception as e:
            row.update(preparation_status="unsupported", error=str(e))
        write(directory / "sample.json", row)
    (args.output / "manifest.jsonl").write_text(
        "".join(json.dumps(r, ensure_ascii=False) + "\n" for r in rows)
    )
    write(args.output / "inventory.json", inventory)
    return rows


def report(args, rows):
    results = []
    for row in rows:
        path = args.output / row["id"] / "result.json"
        result = (
            json.loads(path.read_text())
            if path.exists()
            else dict(
                status=(
                    "pending" if row["preparation_status"] == "ready" else "unsupported"
                )
            )
        )
        results.append(
            dict(
                id=row["id"],
                group=row["group"],
                source=row["source"],
                assertion_line=row["assertion_line"],
                **result,
            )
        )
    (args.output / "results.jsonl").write_text(
        "".join(json.dumps(r, ensure_ascii=False) + "\n" for r in results)
    )
    with (args.output / "results.csv").open("w", newline="") as out:
        fields = [
            "id",
            "group",
            "source",
            "assertion_line",
            "status",
            "equivalent",
            "metric",
            "valid",
            "errors",
            "mismatches",
            "error",
        ]
        writer = csv.DictWriter(out, fields, extrasaction="ignore")
        writer.writeheader()
        writer.writerows(results)
    summary = dict(
        total=len(rows),
        statuses=dict(Counter(r["status"] for r in results)),
        by_group={
            g: dict(Counter(r["status"] for r in results if r["group"] == g))
            for g in sorted({r["group"] for r in rows})
        },
        ground_truth="literal assertion in each source, including deliberately corrupted assertions",
        comparison="checkers.equivchecker Java template, javahelper lowering, and Randoop error-revealing-test metric; finite testing, not an equivalence proof.",
        domain="Integer-specialized generic objects and adapter observer projections. Comparison uses Randoop-generated objects directly; bounded factories are used only for generation TC collection.",
    )
    write(args.output / "summary.json", summary)
    print(json.dumps(summary, ensure_ascii=False, indent=2))


def run(args, rows):
    if not args.group:
        raise ValueError("run requires an explicit --group")
    from .translate import translate_batch
    from .prompts import DEFAULT_ROOT_DESCRIPTION

    root_description = getattr(args, "root_description", DEFAULT_ROOT_DESCRIPTION)

    settings = model_settings(
        args.model,
        max_tokens=args.max_tokens,
        reasoning_effort=args.reasoning_effort,
        use_memo=args.memo,
    )
    candidates = json.loads(args.candidates.read_text()) if args.candidates else None
    traces = json.loads(args.traces.read_text()) if args.traces else {}
    groups = [args.group] if isinstance(args.group, str) else args.group
    selected = [
        r
        for r in rows
        if (not groups or r["group"] in groups)
        and (not args.class_name or r["class_name"] == args.class_name)
        and (not args.sample_id or r["id"] == args.sample_id)
    ]
    if getattr(args, "status", None):
        selected = [
            r for r in selected
            if (args.output / r["id"] / "result.json").exists()
            and json.loads((args.output / r["id"] / "result.json").read_text()).get("status")
            in args.status
        ]
    if args.limit:
        selected = selected[: args.limit]
    if not selected:
        raise ValueError("No samples match filters")
    tool_digest = hashlib.sha256(
        b"".join(
            p.read_bytes()
            for folder in [
                Path(__file__).parent,
                ROOT / "baseline/expecto_jml",
                ROOT / "codehelper",
                ROOT / "checkers",
            ]
            for p in sorted(folder.glob("*.py"))
        )
    ).hexdigest()
    for row in selected:
        d = args.output / row["id"]
        result = {}
        stage = "preparation"
        configuration = dict(
            **settings,
            max_attempts=args.max_attempts,
            n_completions=args.n_completions,
            seconds=args.test_seconds,
            seed=args.seed,
            generation_timeout=args.generation_timeout,
            trace=traces.get(row["id"]),
            require_traces=args.require_traces,
            candidate=candidates.get(row["id"]) if candidates is not None else None,
            generation_source="imported" if candidates is not None else "expecto",
            root_description=root_description,
            tool_digest=tool_digest,
        )
        fingerprint = digest(
            json.dumps(dict(row=row, config=configuration), sort_keys=True)
        )
        previous = d / "result.json"
        if row["preparation_status"] != "ready":
            write(previous, dict(status="unsupported", error=row.get("error", "Unsupported sample")))
            print(row["id"], "unsupported", flush=True)
            continue
        if (
            previous.exists()
            and not args.force
            and json.loads(previous.read_text()).get("fingerprint") == fingerprint
        ):
            print(row["id"], "cached", flush=True)
            continue
        try:
            if row["preparation_status"] != "ready":
                raise ValueError(row.get("error", "Unsupported sample"))
            if (
                source_digest(args.datasets / row["source"])
                != row["source_sha256"]
            ):
                raise ValueError(
                    "Source changed; rerun prepare in a new output directory"
                )
            adapter = json.loads((d / "adapter.json").read_text())
            stage = "generation"
            if candidates is not None:
                code = candidates[row["id"]]
                if not isinstance(code, str):
                    raise ValueError("Candidate must be a DSL string")
                write(
                    d / "generation.json",
                    dict(generated_codes=[code], source="imported"),
                )
            else:
                sample = json.loads((d / "generation_input.json").read_text())
                trace = traces.get(row["id"], {})
                for key in ("corrects", "incorrects"):
                    sample[key] = trace.get(key, {})
                if args.require_traces and not sample["corrects"]:
                    raise ValueError("Real correct traces required but absent")
                write(
                    d / "worker_input.json",
                    dict(
                        sample=sample,
                        **settings,
                        max_attempts=args.max_attempts,
                        n_completions=args.n_completions,
                        root_description=root_description,
                    ),
                )
                (d / "generation.json").unlink(missing_ok=True)
                rc = command(
                    [
                        sys.executable,
                        "-m",
                        "baseline.expecto_batch.worker",
                        d / "worker_input.json",
                        d / "generation.json",
                    ],
                    d,
                    "generation",
                    args.generation_timeout,
                )
                if rc != 0:
                    raise RuntimeError(
                        "Worker timeout"
                        if rc is None
                        else "Worker failed; see generation.log"
                    )
                generated = json.loads((d / "generation.json").read_text())
                # Preserve incomplete output for diagnosis, but never translate it.
                codes = generated.get("generated_codes")
                if codes and isinstance(codes[0], str):
                    (d / "spec.dsl").write_text(codes[0])
                code = require_complete_generation(generated)
            (d / "spec.dsl").write_text(code)
            stage = "translation"
            translation_notes = []
            candidate = translate_batch(code, adapter["mapping"], notes=translation_notes)
            write(d / "translation_notes.json", translation_notes)
            (d / "candidate.assert").write_text(candidate)
            stage = "comparison"
            result = compare(
                row, adapter, candidate, args.datasets, d, args.test_seconds, args.seed
            )
        except Exception as e:
            result = dict(status=stage + "_error", error=f"{type(e).__name__}: {e}")
            if stage == "comparison":
                result.update(equivalent=False, metric="equivchecker")
        result.update(
            fingerprint=fingerprint,
            configuration=configuration,
            test_cases_in_generation=(
                bool(traces.get(row["id"], {}).get("corrects"))
                if candidates is None
                else None
            ),
        )
        write(previous, result)
        print(row["id"], result["status"], flush=True)
        report(args, rows)


def main():
    p = argparse.ArgumentParser(description=__doc__)
    p.add_argument("command", choices=["prepare", "run", "report"])
    p.add_argument("--datasets", type=Path, default=ROOT / "datasets")
    p.add_argument(
        "--output", type=Path, default=ROOT / "baseline/expecto-results/batch"
    )
    p.add_argument(
        "--group", nargs="+",
        choices=["buggycodes", "buggyasrts", "c2s_aug_sub", "naturalness"],
        help="Explicit dataset groups; required for prepare and run.",
    )
    p.add_argument("--class", dest="class_name")
    p.add_argument("--sample-id")
    p.add_argument("--status", nargs="+", help="Run only samples whose saved result has one of these statuses, e.g. preparation_error.")
    p.add_argument(
        "--limit",
        type=int,
        help="Run only the first N assertion samples after filtering; omit to run all matches.",
    )
    p.add_argument(
        "--model",
        default="openai/gpt-4.1",
        help="Inspect model ID, e.g. together/openai/gpt-oss-120b (alias: gpt-oss-120b).",
    )
    p.add_argument(
        "--max-tokens",
        type=int,
        help="Completion budget; Together defaults to 8192, including reasoning.",
    )
    p.add_argument(
        "--reasoning-effort",
        choices=["low", "medium", "high"],
        help="Together GPT-OSS defaults to medium.",
    )
    p.add_argument(
        "--memo",
        action=argparse.BooleanOptionalAction,
        default=None,
        help="Upstream embedding memo: defaults off for Together, on otherwise; enabling it requires OpenAI embeddings.",
    )
    p.add_argument("--max-attempts", type=int, default=3)
    p.add_argument("--n-completions", type=int, default=1)
    p.add_argument("--generation-timeout", type=int, default=1800)
    from .prompts import DEFAULT_ROOT_DESCRIPTION
    p.add_argument(
        "--root-description",
        default=DEFAULT_ROOT_DESCRIPTION,
        help="Root spec description template; {description} inserts the current assertion description. Defaults to the local property with an instruction against additional method effects.",
    )
    p.add_argument("--test-seconds", type=int, default=30)
    p.add_argument("--seed", type=int, default=0)
    p.add_argument("--candidates", type=Path)
    p.add_argument(
        "--traces",
        type=Path,
        help="Import execution traces; without this option, generation uses no test cases.",
    )
    p.add_argument("--require-traces", action="store_true")
    p.add_argument("--force", action="store_true")
    a = p.parse_args()
    if a.command in {"prepare", "run"} and not a.group:
        p.error("prepare and run require --group; no dataset groups are selected by default")
    if not a.root_description.strip():
        p.error("--root-description must be nonempty")
    if a.max_tokens is not None and a.max_tokens <= 0:
        p.error("--max-tokens must be positive")
    a.datasets = a.datasets.resolve()
    a.output = a.output.resolve()
    if min(a.test_seconds, a.generation_timeout, a.max_attempts, a.n_completions) <= 0:
        p.error("Budgets must be positive")
    if a.command == "prepare":
        if (a.output / "manifest.jsonl").exists():
            p.error("Output already prepared; use a new directory to preserve results")
        rows = prepare(a)
    else:
        rows = [
            json.loads(line)
            for line in (a.output / "manifest.jsonl").read_text().splitlines()
        ]
    if a.command == "run":
        run(a, rows)
    report(a, rows)


if __name__ == "__main__":
    main()
