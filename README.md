# Faithful Autoformalization of Natural Language Assertions

This repository contains a Java-only pipeline for generating candidate formal
assertions from natural-language `@@@` comments, then checking and reporting the
generated candidates.

## Repository Layout

- `datasets/`:
  - `c2s_aug/`: Main Java classes source files.
  - `c2s_aug_sub/`: Subset of Main Java classes source files.
  - `buggyasrts/`: Java source files that contains incorrect or missleading assertions.
  - `buggycodes/`: Java source files that contains twisted buggy code implementations.
  - `naturalness/`: Additional Java classes for naturalness experiments.
- `utils/dispatch.py`: Splits a dataset file into per-assertion inputs and creates one-down variants.
- `main.py`: Runs LLM generation over prepared input files and writes raw responses plus extracted assertions.
- `checker.py`: Runs validity, conformance, equivalence, and probability checks over generated assertions and writes a report.
- `prompting.py`: Builds Java assertion-generation prompts and extracts generated assertions from model output.
- `nlasrtgen.py`: Translates formal Java/JML-like assertions back into natural-language assertions for round-trip checks.
- `llm.py`: Loads local/API LLM backends and provides a shared generation wrapper.
- `codehelper/javahelper.py`: Parses Java code and translates Java/JML-like assertion syntax into checker test code.
- `checkers/`: Individual checker implementations:
  - `nullchecker.py`: Rejects malformed or untranslatable assertions.
  - `compilechecker.py`: Builds Java test scaffolding and checks `javac` compilation.
  - `fuzzchecker.py`: Uses Randoop to look for counterexamples.
  - `equivchecker.py`: Uses Randoop to test equivalence against ground truth.
  - `rdtpchecker.py`: Round-trip/conformance scoring through LLM/NLI prompts.
  - `probchecker.py`: Optional log-probability scoring for generated responses.
- `active.py`: Active learning step used to choose between candidates.
- `java-testgen/` and `java-thirdparty/`: JUnit, Randoop, and Java dependency jars used by the checkers.

## Requirements

The checked code path is Java-only, but the pipeline scripts are written in
Python. Install the Python dependencies with:

```bash
pip install -r requirements.txt
```

Required for the Java checker path:

- Python 3
- Java JDK with `javac` (`openjdk-21-jdk`)
- The bundled jars under `java-testgen/` and `java-thirdparty/`

Required for model generation:

- One of the model backends configured in `llm.py`
- A private local `keysecrets` module only if using API models that read `oai_key` or `together_key`

For a lightweight local sanity check, use `--checklist valid`; this avoids RDTP and probability model loading.

## Pipeline

The intended pipeline is:

1. Use `dispatch` to prepare per-assertion code inputs.
2. Use `main.py` to generate candidate assertions for each prepared input.
3. Use `checker.py` to check generated candidates and write a report.

### 1. Dispatch a Source File

Example for one dataset file:

```bash
python3 utils/dispatch.py \
  --infile datasets/c2s_aug/ArrayList.java \
  --outdir runs/codes \
  --write \
  --startidx 0
```

This writes files such as:

```text
runs/codes/c2s_aug.ArrayList1.java.0
runs/codes/c2s_aug.ArrayList1onedown.java.1
```

The final numeric suffix is useful with `--codelist`. For example, `--codelist 0`
selects files ending in `.0`.

### 2. Generate Candidates

Run generation with a selected model key from `llm.py`:

```bash
python3 main.py \
  --codedir runs/codes \
  --resultdir runs/results \
  --modellist gpt-oss \
  --codelist 0 \
  --nsamples 3 \
  --prompt default \
  --temp 0.0 \
  --write
```

For each input file, `main.py` writes:

```text
runs/results/<model-name>/default-0.0-True/<input-file>
runs/results/<model-name>/default-0.0-True/<input-file>.extract
```

Tip: add `--logprob` to record token log-probability summaries for each model
output. This writes an additional `.logprob` file next to the raw response and
can be used later by `probchecker.py` or `checker.py --checklist prob`.

```bash
python3 main.py ... --write --logprob
```

### 3. Check Candidates

Lightweight validity-only check:

```bash
python3 checker.py \
  --combinedcodesdir datasets/c2s_aug \
  --codedir runs/codes \
  --codelist 0 \
  --resultlist 'runs/results/*/*/' \
  --checklist valid \
  --checkerkwargs '{"fuzz_check":{"time_limit":1}}' \
  --outdir runs/checks \
  --write
```

Full default check:

```bash
python3 checker.py \
  --combinedcodesdir datasets/c2s_aug \
  --codedir runs/codes \
  --codelist 0 \
  --resultlist 'runs/results/*/*/' \
  --checklist default \
  --outdir runs/checks \
  --write
```

`default` runs validity checks, RDTP conformance scoring, equivalence checking,
and the active candidate-selection step. This path may load LLM backends.

To set the RDTP backward-translation model and scoring model, pass them
through `--checkerkwargs` under `rdtp_check`:

```bash
python3 checker.py \
  --combinedcodesdir datasets/c2s_aug \
  --codedir runs/codes \
  --codelist 0 \
  --resultlist 'runs/results/*/*/' \
  --checklist conf \
  --checkerkwargs '{"rdtp_check":{"mkey_backward":"gpt-oss","mkey_nli":"gpt-oss"}}'
```

Useful checker groups:

- `valid`: runs `null_check`, `compile_check`, and `fuzz_check`.
- `conf`: runs `rdtp_check`.
- `equiv`: runs `equiv_check`.
- `prob`: reads or computes log-probability scores.
- `default`: runs the main validity, conformance, equivalence, and active-selection workflow.

## Output Report

Checker reports include entries such as:

```text
null_check: [...]
compile_check: [...]
fuzz_check: [...]
validity_scores: [...]
conformance_scores: [...]
equiv_res: [...]
final_best_candidate:
```

When `--write` is passed, reports are written under `--outdir`. Without `--write`,
the report is printed to stdout.

## Notes

- The artifact currently supports Java inputs only.
- If API models are used, provide them through a private local module or environment-specific mechanism.

## Expecto baseline

See [Expecto Docker and batch commands](baseline/EXPECTO_USAGE_ZH.md), including
GPT-OSS-120B runs on `buggycodes`, `buggyasrts`, `c2s_aug_sub`, and `naturalness`.
