#!/usr/bin/env bash
# Invoke from the project directory; all paths stay relative to that directory.
set -euo pipefail
EXPECTO_ENTRY=baseline/run_expecto_matrix.sh
EXPECTO_BOOTSTRAP_ARCHIVE=./project.tar.gz
EXPECTO_PREVIOUS_ARG=""
for EXPECTO_ARG in "$@"; do
  if [[ "$EXPECTO_PREVIOUS_ARG" == --archive ]]; then
    EXPECTO_BOOTSTRAP_ARCHIVE="$EXPECTO_ARG"
  fi
  case "$EXPECTO_ARG" in
    --model|--model-path) EXPECTO_ENTRY=baseline/run_expecto_matrix_local.sh ;;
  esac
  EXPECTO_PREVIOUS_ARG="$EXPECTO_ARG"
done
if [[ ! -f "$EXPECTO_ENTRY" ]]; then
  [[ -f "$EXPECTO_BOOTSTRAP_ARCHIVE" ]] || {
    echo "Missing ./$EXPECTO_ENTRY and archive $EXPECTO_BOOTSTRAP_ARCHIVE. Transfer project.tar.gz alongside run_expecto.sh." >&2
    exit 2
  }
  echo "Extracting $EXPECTO_BOOTSTRAP_ARCHIVE into the current directory..."
  # Keep the active outer launcher intact while extracting the project payload.
  tar --exclude=run_expecto.sh -xzf "$EXPECTO_BOOTSTRAP_ARCHIVE" -C .
fi
[[ -f "$EXPECTO_ENTRY" ]] || { echo "Archive must contain $EXPECTO_ENTRY at its top level. Rebuild it with baseline/pack_expecto.sh." >&2; exit 2; }
exec bash "$EXPECTO_ENTRY" "$@"
