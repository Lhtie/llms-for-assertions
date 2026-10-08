"""CLI: python -m baseline.expecto_jml INPUT.dsl [-o OUTPUT.jml]."""
import argparse
import json
from pathlib import Path
import sys

from .translator import TranslationError, translate


def main(argv=None):
    parser = argparse.ArgumentParser(description="Translate Expecto DSL to this project's simplified assert syntax")
    parser.add_argument("input", type=Path, help="UTF-8 DSL file or sample_results.json")
    parser.add_argument("-o", "--output", type=Path, help="Write only after successful translation")
    parser.add_argument("--mapping", type=Path, help="JSON object: DSL field path -> observer/list template (project) or field path (openjml)")
    parser.add_argument("--sample-id", help="Select exactly one sample from sample_results.json")
    parser.add_argument("--entry", default="spec", help="Entry predicate name (default: spec)")
    parser.add_argument("--dialect", choices=["project", "openjml"], default="project",
                        help="project: assert statement (default); openjml: ensures annotation")
    parser.add_argument("--expression", action="store_true",
                        help="Output only the expression after assert (project dialect)")
    args = parser.parse_args(argv)
    try:
        source = args.input.read_text(encoding="utf-8")
        if args.input.suffix.lower() == ".json":
            rows = json.loads(source)
            if not isinstance(rows, list) or not all(isinstance(row, dict) for row in rows):
                raise TranslationError("Expected a sample_results.json array")
            selected = [row for row in rows if args.sample_id is None or str(row.get("id")) == args.sample_id]
            if len(selected) != 1:
                raise TranslationError("Select exactly one sample with --sample-id")
            source = selected[0].get("specification")
            if not isinstance(source, str) or not source.strip():
                raise TranslationError("Selected sample has no DSL specification")
        elif args.sample_id:
            raise TranslationError("--sample-id requires a JSON input")
        mapping = json.loads(args.mapping.read_text(encoding="utf-8")) if args.mapping else {}
        if not isinstance(mapping, dict):
            raise TranslationError("Mapping file must contain a JSON object")
        result = translate(source, mapping=mapping, entry=args.entry,
                           dialect=args.dialect, expression_only=args.expression)
        if args.output:
            args.output.write_text(result, encoding="utf-8")
        else:
            sys.stdout.write(result)
    except (OSError, ValueError) as exc:
        parser.exit(2, f"error: {exc}\n")


if __name__ == "__main__":
    main()
