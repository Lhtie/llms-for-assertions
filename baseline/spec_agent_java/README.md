# Spec-Agent Java adaptation

This directory contains a Java adaptation of the method in [Agentic Separation
Logic Specification Synthesis](https://arxiv.org/abs/2605.27531), not the
authors' implementation. The paper describes a C++ system and the authors do
not link a source repository from the paper or arXiv record. The runner reuses
this repository's model backends and Java null/compile/fuzz checkers.

## Install / run

No new Python package is required. The existing project dependencies, model
credentials, Java toolchain, and Randoop setup are used. First prepare
single-assertion inputs with the normal dispatcher, then run the baseline:

```bash
python3 utils/dispatch.py \
  --infile datasets/c2s_aug/ArrayList.java \
  --outdir runs/spec-agent/codes --write --startidx 0

python3 -m baseline.spec_agent_java.pipeline \
  --codedir runs/spec-agent/codes \
  --output runs/spec-agent/results \
  --model gpt-oss-api \
  --max-attempts 3 --max-tokens 400 --fuzz-seconds 3
```

The output directory contains raw responses, `.extract` files consumable by
`checker.py`, and `.spec-agent.json` records with target logic, feature
approximations, each candidate, validation outcome, and refinement feedback.
Only the final candidate satisfying both the validation checks and the
expressivity requirement is marked accepted. For analysis, run the regular
checker on all generated attempts, or use the per-sample JSON to select
accepted candidates.

```bash
python3 checker.py \
  --combinedcodesdir datasets/c2s_aug \
  --codedir runs/spec-agent/codes \
  --resultlist 'runs/spec-agent/results/' \
  --checklist valid --write --outdir runs/spec-agent/checks
```

## Adaptation notes and limits

- The paper's logic ladder is Prop, FOL, propositional separation logic, and
  first-order separation logic. The Java feature selector uses loop detection
  for quantification and a conservative source heuristic for heap use.
- Java assertions use the conventions already understood by this repository:
  `\\old`, `\\result`, and bounded `\\forall`. There is no executable
  separation-logic runtime here; consequently, heap reasoning is represented
  through ordinary Java/JML-style assertions and does not implement the paper's
  points-to or separating-conjunction semantics.
- Existing fuzz checking is reused as the counterexample oracle. It is bounded
  randomized testing, not libFuzzer and not a proof of correctness.
- Existing checked inputs provide the property assertion after each `@@@`
  comment. The runner withholds that assertion from generation, but the normal
  Java checker uses it to build/validate the candidate harness.
- Default model is `gpt-oss-api`, which uses this repository's Together API
  configuration. Select any supported key listed by `llm.py` with `--model`.

## Paper

Paper: Suresh, Korczynski, and Vanegue, arXiv:2605.27531 (2026),
<https://arxiv.org/abs/2605.27531>. The execution container cannot resolve
arxiv.org, so the PDF is not vendored; follow the link to download it.

