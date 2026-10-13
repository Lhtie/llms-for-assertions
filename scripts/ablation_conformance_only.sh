#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")/.."

python3 checker.py \
  --datasets datasets/ablation \
  --codedir javacodes/ablation \
  --codelist {1..100} \
  --resultlist results/ablation/gpt-oss-120b/default-0.6-True \
  --selection-mode conformance-only \
  --checkerkwargs '{"rdtp_check":{"mkey_backward":"gpt-oss-api","mkey_nli":"gpt-oss-api"}}' \
  --outdir results/ablation/conformance_only \
  --write
