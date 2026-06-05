#!/usr/bin/env python3
import argparse
import shutil
import subprocess
import sys
import traceback
from pathlib import Path


SEPARATOR = "-" * 20
DEFAULT_CHECKS = ("null_check", "compile_check", "fuzz_check")
LANGMAP = {
    "py": "#",
    "cs": "//",
    "java": "//",
}
PROFILES = {
    "naturalness": {
        "source_dir": Path("naturalness"),
        "codedir": Path("javacodes_naturalness"),
        "resultdir": Path("results/naturalness/groundtruth"),
        "outdir": Path("results/naturalness/checks"),
        "combinedcodes": Path("naturalness"),
        "extensions": ["java"],
    },
    "combinedcodes": {
        "source_dir": Path("combinedcodes"),
        "codedir": Path("javacodes"),
        "resultdir": Path("results/groundtruth"),
        "outdir": Path("results/checks"),
        "combinedcodes": Path("combinedcodes"),
        "extensions": ["java"],
    },
}


def run(cmd, *, cwd):
    print("+ " + " ".join(str(x) for x in cmd), file=sys.stderr)
    subprocess.run(cmd, cwd=cwd, check=True)


def clean_dir(path):
    if path.exists():
        shutil.rmtree(path)
    path.mkdir(parents=True, exist_ok=True)


def dispatch_sources(repo, source_dir, codedir, extensions, startidx, obsonly):
    clean_dir(codedir)

    source_files = []
    for extension in extensions:
        source_files.extend(source_dir.glob(f"*.{extension.lstrip('.')}"))
    source_files = sorted(set(source_files))
    if not source_files:
        raise FileNotFoundError(
            f"No source files matching {extensions} found in {source_dir}"
        )

    next_start = startidx
    for source in source_files:
        cmd = [
            sys.executable,
            "utils/dispatch.py",
            "--infile",
            str(source),
            "--outdir",
            str(codedir),
            "--write",
            "--startidx",
            str(next_start),
        ]
        if obsonly and source.suffix == ".java":
            cmd.append("--obsonly")
        run(cmd, cwd=repo)

        ids = numeric_suffixes(codedir)
        next_start = max(ids) if ids else next_start


def numeric_suffixes(codedir):
    suffixes = []
    for path in codedir.iterdir():
        if path.is_file() and path.name.rsplit(".", 1)[-1].isdigit():
            suffixes.append(int(path.name.rsplit(".", 1)[-1]))
    return suffixes


def comment_token_for_datapoint(path):
    langid = path.name.rsplit(".", 2)[-2]
    return LANGMAP[langid]


def assertion_from_datapoint(path):
    cmnt_tkn = comment_token_for_datapoint(path)
    lines = path.read_text().splitlines()
    marker_lines = [
        idx
        for idx, line in enumerate(lines)
        if "@@@" in line and line.strip().startswith(cmnt_tkn)
    ]
    if len(marker_lines) != 1:
        raise ValueError(f"{path} has {len(marker_lines)} assertion markers; expected 1")

    assertion_idx = marker_lines[0] + 1
    if assertion_idx >= len(lines):
        raise ValueError(f"{path} has an assertion marker without a following assertion")

    assertion = lines[assertion_idx].strip()
    if assertion.startswith(cmnt_tkn):
        assertion = assertion.removeprefix(cmnt_tkn).strip()
    if not assertion:
        raise ValueError(f"{path} has an empty groundtruth assertion")
    return assertion


def write_groundtruth_extracts(codedir, resultdir):
    clean_dir(resultdir)

    codelist = []
    for datapoint in sorted(codedir.iterdir(), key=datapoint_sort_key):
        if not datapoint.is_file():
            continue
        code_id = datapoint.name.rsplit(".", 1)[-1]
        if not code_id.isdigit() or code_id == "0":
            continue

        assertion = assertion_from_datapoint(datapoint)
        extract_path = resultdir / f"{datapoint.name}.extract"
        extract_path.write_text(f"{assertion}\n{SEPARATOR}\n")
        codelist.append(code_id)

    if not codelist:
        raise RuntimeError(f"No dispatched datapoints found in {codedir}")
    return codelist


def datapoint_sort_key(path):
    suffix = path.name.rsplit(".", 1)[-1]
    return (int(suffix) if suffix.isdigit() else -1, path.name)


def run_checker_py(repo, args, codelist):
    checks_dir = args.outdir
    checks_dir.mkdir(parents=True, exist_ok=True)

    cmd = [
        str(args.checker_python),
        "checker.py",
        "--codedir",
        str(args.codedir),
        "--combinedcodes",
        str(args.combinedcodes),
        "--resultlist",
        str(args.resultdir),
        "--outdir",
        str(checks_dir),
        "--outname",
        args.outname,
        "--checklist",
        *args.checklist,
        "--codelist",
        *codelist,
    ]
    if args.write:
        cmd.append("--write")
    run(cmd, cwd=repo)


def local_checkers():
    import checkers.nullchecker as nullchecker
    import checkers.compilechecker as compilechecker
    import checkers.fuzzchecker as fuzzchecker

    return {
        "null_check": lambda langid, pfx, sfx, grnd_truth, asrt, cc: nullchecker.nullcheck(
            langid, pfx, sfx, grnd_truth, asrt, cc
        ),
        "compile_check": lambda langid, pfx, sfx, grnd_truth, asrt, cc: compilechecker.cmplecheck(
            langid, pfx, sfx, grnd_truth, asrt, cc
        ),
        "fuzz_check": lambda langid, pfx, sfx, grnd_truth, asrt, cc: fuzzchecker.fuzzcheck(
            langid, pfx, sfx, grnd_truth, asrt, cc, "soundness"
        ),
    }


def local_run_checker(args, codelist):
    checkers = local_checkers()
    for check_name in args.checklist:
        if check_name not in checkers:
            raise ValueError(
                f"{check_name} is not supported by this script's local runner. "
                "Use --use-checker-py if you need checker.py-only checks."
            )

    args.outdir.mkdir(parents=True, exist_ok=True)
    if args.write:
        report_path = args.outdir / args.outname
        outfd = report_path.open("w")
        print(f"Writing checker report to {report_path}", file=sys.stderr)
    else:
        outfd = sys.stdout

    succs, tries = 0, 0
    solvedps, totalps = 0, 0
    codelist = set(codelist)

    try:
        for datapoint in sorted(args.codedir.iterdir(), key=datapoint_sort_key):
            if not datapoint.is_file():
                continue
            code_id = datapoint.name.rsplit(".", 1)[-1]
            if code_id not in codelist:
                continue

            code = datapoint.read_text()
            langid = datapoint.name.rsplit(".", 2)[-2]
            cmnt_tkn = LANGMAP[langid]
            lines = code.split("\n")
            cmnt_idx = [
                i if "@@@" in line and line.strip().startswith(cmnt_tkn) else -1
                for i, line in enumerate(lines)
            ]
            asrtlno = max(cmnt_idx) + 1
            assert sum(i != -1 for i in cmnt_idx) == 1, "too few or many assertions to work on"

            grnd_truth = lines[asrtlno].strip()
            if grnd_truth.startswith(cmnt_tkn):
                grnd_truth = grnd_truth.removeprefix(cmnt_tkn).strip()

            extract_path = args.resultdir / f"{datapoint.name}.extract"
            if not extract_path.exists():
                continue
            gen_asrts = [
                asrt.strip()
                for asrt in extract_path.read_text().split(SEPARATOR)[:-1]
            ]

            pfx = "\n".join(lines[:asrtlno])
            sfx = "\n".join(lines[asrtlno + 1 :])
            toprint = f"{'#' * 10} {args.resultdir}/{datapoint.name}.check {'#' * 10}\n"
            print("!" * 10 + f" {args.resultdir}/{datapoint.name}", file=sys.stderr)

            final = []
            for check_name in args.checklist:
                print("!" * 10 + f" Running {check_name}", file=sys.stderr)
                resmask = []
                cache = {}
                for i, asrt in enumerate(gen_asrts):
                    if asrt in cache:
                        resmask.append(cache[asrt])
                        continue
                    print("!" * 10 + f" Entry {i}", file=sys.stderr)
                    try:
                        result = checkers[check_name](
                            langid, pfx, sfx, grnd_truth, asrt, str(args.combinedcodes)
                        )
                    except Exception as exc:
                        print(
                            f"Error in entry {i}: error type - {type(exc).__name__}; error msg - {exc}",
                            file=sys.stderr,
                        )
                        traceback.print_exc()
                        result = False
                    resmask.append(result)
                    cache[asrt] = result
                toprint += f"{check_name}: {resmask} {sum(resmask)}/{len(resmask)}\n"
                final = resmask

            toprint += "#" * 20 + "\n"
            outfd.write(toprint)

            succs += sum(final)
            tries += len(final)
            solvedps += sum(final) > 0
            totalps += 1

        outfd.write(f"Successful tries / Total tries = {succs}/{tries}\n")
        outfd.write(f"Solved problems / Total problems = {solvedps}/{totalps}")
    finally:
        if args.write:
            outfd.close()


def parse_args(default_dataset):
    parser = argparse.ArgumentParser(
        description="Check groundtruth assertions for naturalness or combinedcodes."
    )
    parser.add_argument(
        "--dataset",
        choices=sorted(PROFILES),
        default=default_dataset,
        help="Default path profile to use.",
    )
    parser.add_argument("--source-dir", type=Path)
    parser.add_argument("--codedir", type=Path)
    parser.add_argument("--resultdir", type=Path)
    parser.add_argument("--outdir", type=Path)
    parser.add_argument("--combinedcodes", type=Path)
    parser.add_argument("--outname", default="groundtruth_checks.txt")
    parser.add_argument("--checklist", nargs="+", default=list(DEFAULT_CHECKS))
    parser.add_argument(
        "--extensions",
        nargs="+",
        help="Source extensions to dispatch from --source-dir. Profile default is java.",
    )
    parser.add_argument(
        "--codelist",
        nargs="+",
        default=[],
        help="Optional numeric datapoint ids to check. Defaults to every generated onedown datapoint.",
    )
    parser.add_argument(
        "--checker-python",
        type=Path,
        default=Path(sys.executable),
        help="Python executable used to run checker.py. Use the environment that has checker.py dependencies installed.",
    )
    parser.add_argument("--startidx", type=int, default=0)
    parser.add_argument(
        "--no-obsonly",
        action="store_true",
        help="Do not pass --obsonly to dispatch.py for Java files.",
    )
    parser.add_argument("--skip-dispatch", action="store_true")
    parser.add_argument("--skip-checker", action="store_true")
    parser.add_argument(
        "--use-checker-py",
        action="store_true",
        help="Call checker.py as a subprocess instead of the local null/compile/fuzz runner.",
    )
    parser.add_argument(
        "--no-write",
        dest="write",
        action="store_false",
        help="Print the checker report instead of writing it to --outdir/--outname.",
    )
    parser.set_defaults(write=True)
    return parser.parse_args()


def apply_profile_defaults(args):
    profile = PROFILES[args.dataset]
    for key in ("source_dir", "codedir", "resultdir", "outdir", "combinedcodes"):
        if getattr(args, key) is None:
            setattr(args, key, profile[key])
    if args.extensions is None:
        args.extensions = list(profile["extensions"])


def resolve_paths(repo, args):
    for key in ("source_dir", "codedir", "resultdir", "outdir", "combinedcodes"):
        value = getattr(args, key)
        if not value.is_absolute():
            value = repo / value
        setattr(args, key, value.resolve())

    if not args.checker_python.is_absolute() and args.checker_python.parent != Path("."):
        args.checker_python = (repo / args.checker_python).resolve()


def selected_codelist(all_codelist, requested):
    if not requested:
        return all_codelist

    requested = set(requested)
    codelist = [code_id for code_id in all_codelist if code_id in requested]
    missing = sorted(requested - set(codelist), key=int)
    if missing:
        raise ValueError(f"Requested codelist ids were not generated: {' '.join(missing)}")
    return codelist


def main(default_dataset="naturalness"):
    repo = Path(__file__).resolve().parent
    args = parse_args(default_dataset)
    apply_profile_defaults(args)
    resolve_paths(repo, args)

    if not args.skip_dispatch:
        dispatch_sources(
            repo,
            args.source_dir,
            args.codedir,
            args.extensions,
            args.startidx,
            not args.no_obsonly,
        )

    all_codelist = write_groundtruth_extracts(args.codedir, args.resultdir)
    codelist = selected_codelist(all_codelist, args.codelist)
    print(f"Wrote {len(all_codelist)} groundtruth extracts to {args.resultdir}", file=sys.stderr)
    print(f"Checking {len(codelist)} groundtruth extracts", file=sys.stderr)

    if not args.skip_checker:
        if args.use_checker_py:
            run_checker_py(repo, args, codelist)
        else:
            local_run_checker(args, codelist)


if __name__ == "__main__":
    main()
