#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")/.."

python3 checker.py \
  --datasets datasets/ablation \
  --codedir javacodes/ablation \
  --codelist {1..100} \
  --resultlist results/ablation/gpt-oss-120b/default-0.6-True \
  --selection-mode active \
  --checkerkwargs '{"rdtp_check":{"mkey_backward":"gpt-oss-api","mkey_nli":"gpt-oss-api","prompt_nli":"bidirectional_nli"}}' \
  --outdir results/ablation/active_conformance_bidir_nli \
  --write
