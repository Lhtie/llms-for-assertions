#!/usr/bin/env bash
set -euo pipefail

REPO_ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/../.." && pwd)"
cd "$REPO_ROOT"

DATASET="naturalness"
CODEDIR="javacodes/fun2spec/$DATASET"

if [ ! -d "$CODEDIR" ] || ! find "$CODEDIR" -type f ! -name '*.extract' ! -name '*.logprob' -print -quit | grep -q .; then
  mkdir -p "$CODEDIR"
  while IFS= read -r -d '' cls; do
    python3 utils/dispatch.py --infile "$cls" --datasets datasets --outdir "$CODEDIR" --write
  done < <(find "datasets/$DATASET" -name '*.java' -print0 | sort -z)
fi

python3 baseline/fun2spec/run_java.py \
  --codedir "$CODEDIR" \
  --datasets datasets \
  --resultdir "results/fun2spec/$DATASET" \
  --modellist gpt-oss-api \
  --temp 0.6 \
  --max-retries 5 \
  --write
