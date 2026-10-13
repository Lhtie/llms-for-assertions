#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")/.."

if [ ! -d "javacodes/ablation" ]; then
  for cls in $(ls datasets/ablation/mut_*/*.java); do
    python3 utils/dispatch.py \
      --infile "$cls" \
      --datasets datasets/ablation \
      --outdir javacodes/ablation \
      --write --obsonly
  done
fi

export CUDA_VISIBLE_DEVICES=0,1

python3 main.py \
  --codedir javacodes/ablation \
  --modellist gpt-oss-api \
  --temp 0.6 --nsamples 5 \
  --codelist {1..100} \
  --resultdir results/ablation \
  --logprob \
  --write
