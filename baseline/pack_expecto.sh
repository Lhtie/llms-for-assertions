#!/usr/bin/env bash
# Package only the Expecto matrix and its runtime dependencies.
set -euo pipefail
EXPECTO_ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
cd "$EXPECTO_ROOT"
EXPECTO_ARCHIVE="${1:-project.tar.gz}"
EXPECTO_INPUTS=(
  baseline/expecto_batch baseline/expecto_jml baseline/expecto-artifact
  baseline/run_expecto_matrix.sh baseline/run_expecto_matrix_local.sh baseline/EXPECTO_USAGE.md
  run_expecto.sh
  codehelper utils checkers
  datasets/c2s_aug datasets/c2s_aug_sub datasets/buggycodes datasets/buggyasrts datasets/naturalness
  java-testgen java-thirdparty keysecrets.py prompting.py
)
for EXPECTO_INPUT in "${EXPECTO_INPUTS[@]}"; do
  [[ -e "$EXPECTO_INPUT" ]] || { echo "Missing required input: $EXPECTO_INPUT" >&2; exit 1; }
done
umask 077
tar --exclude='.git' --exclude='__pycache__' --exclude='*.pyc' \
    --exclude='*.class' --exclude='.venv' --exclude='venv' \
    --exclude='baseline/expecto_batch/testcases' \
    --exclude='baseline/expecto-artifact/logs' \
    --exclude='baseline/expecto-artifact/datasets' \
    -czf "$EXPECTO_ARCHIVE" "${EXPECTO_INPUTS[@]}"
echo "Created $EXPECTO_ARCHIVE (includes keysecrets.py; keep private)."
