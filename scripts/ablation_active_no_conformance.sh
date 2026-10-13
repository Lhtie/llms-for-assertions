#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")/.."

python3 checker.py \
  --datasets datasets/ablation \
  --codedir javacodes/ablation \
  --codelist {1..100} \
  --resultlist results/ablation/gpt-oss-120b/default-0.6-True \
  --selection-mode active \
  --active-score logprob \
  --outdir results/ablation/active_no_conformance \
  --write
