#!/usr/bin/env bash
# Run directly inside the prosyslab image. Use --docker only on a Docker host.
# Outputs are isolated by run ID; reusing an ID resumes it.
set -euo pipefail
export EXPECTO_PYTHON="${EXPECTO_PYTHON:-python3}"
# Preset works both before and after archive extraction via inherited settings.
EXPECTO_ARGUMENTS=()
for EXPECTO_ARGUMENT in "$@"; do
  if [[ "$EXPECTO_ARGUMENT" == --pipeline-fewshot || "$EXPECTO_ARGUMENT" == --naturalness-pipeline-fewshot ]]; then
    if [[ "$EXPECTO_ARGUMENT" == --naturalness-pipeline-fewshot ]]; then
      export EXPECTO_GROUPS=naturalness
      export EXPECTO_RUN_ID="${EXPECTO_RUN_ID:-naturalness-pipeline-fewshot}"
    else
      export EXPECTO_GROUPS=c2s_aug_sub
      export EXPECTO_RUN_ID="${EXPECTO_RUN_ID:-c2s-sub-pipeline-fewshot}"
    fi
    export EXPECTO_PROMPT_VARIANT=pipeline-fewshot
    export EXPECTO_TRACE_SOURCE=baseline/expecto_batch/experiment_inputs/matrix-chtc-20261020-140827
  elif [[ "$EXPECTO_ARGUMENT" == --local-gpt-oss || "$EXPECTO_ARGUMENT" == --local-gpt-oss=* ]]; then
    export EXPECTO_MODEL=local/gpt-oss-120b
    if [[ "$EXPECTO_ARGUMENT" == --local-gpt-oss=* ]]; then
      export EXPECTO_BASE_URL="${EXPECTO_ARGUMENT#*=}"
      [[ -n "$EXPECTO_BASE_URL" ]] || { echo 'Local endpoint cannot be empty.' >&2; exit 2; }
    else
      export EXPECTO_BASE_URL="${EXPECTO_BASE_URL:-http://127.0.0.1:8000/v1}"
    fi
  elif [[ "$EXPECTO_ARGUMENT" == --buggycodes-targeted-unit-tc || "$EXPECTO_ARGUMENT" == --buggyasrts-targeted-unit-tc ]]; then
    EXPECTO_TARGETED_GROUP="${EXPECTO_ARGUMENT#--}"
    export EXPECTO_GROUPS="${EXPECTO_TARGETED_GROUP%-targeted-unit-tc}"
    export EXPECTO_SETTINGS=targeted-unit-tc
    export EXPECTO_RUN_ID="${EXPECTO_RUN_ID:-$EXPECTO_GROUPS-targeted-gt-failing-$(date +%Y%m%d-%H%M%S)}"
    export EXPECTO_PROMPT_VARIANT="${EXPECTO_PROMPT_VARIANT:-default}"
    unset EXPECTO_TRACE_SOURCE
  elif [[ "$EXPECTO_ARGUMENT" == --skip-tc ]]; then
    export EXPECTO_SETTINGS="no-tc unit-tc"
  else
    EXPECTO_ARGUMENTS+=("$EXPECTO_ARGUMENT")
  fi
done
set -- "${EXPECTO_ARGUMENTS[@]}"
if [[ "${EXPECTO_MODEL:-}" == local/* || "${EXPECTO_MODEL:-}" == openai-api/local/* ]]; then
  EXPECTO_LOCAL_RUN="${EXPECTO_RUN_ID:-$(date +%Y%m%d-%H%M%S)}"
  export EXPECTO_RUN_ID="local-${EXPECTO_LOCAL_RUN#local-}"
fi
# Archive mode is also the HTCondor entry point; no other run script is needed.
if [[ "${1:-}" == --archive ]]; then
EXPECTO_JOB_DIR="$PWD"
EXPECTO_ARCHIVE="${2:?Usage: run_expecto_matrix.sh --archive project.tar.gz [run-id]}"
[[ "$EXPECTO_ARCHIVE" = /* ]] || EXPECTO_ARCHIVE="$EXPECTO_JOB_DIR/$EXPECTO_ARCHIVE"
[[ -f "$EXPECTO_ARCHIVE" ]] || { echo "Archive not found: $EXPECTO_ARCHIVE" >&2; exit 2; }
export EXPECTO_RUN_ID="${3:-${EXPECTO_RUN_ID:-chtc-$(date +%Y%m%d-%H%M%S)}}"
[[ "$EXPECTO_RUN_ID" =~ ^[a-zA-Z0-9._-]+$ ]] || { echo 'Invalid run ID' >&2; exit 2; }
EXPECTO_UNPACK_DIR="$(mktemp -d "$EXPECTO_JOB_DIR/expecto-project.XXXXXXXX")"
tar -xzf "$EXPECTO_ARCHIVE" -C "$EXPECTO_UNPACK_DIR"
mapfile -d '' EXPECTO_RUNNERS < <(find "$EXPECTO_UNPACK_DIR" -type f -path '*/baseline/run_expecto_matrix.sh' -print0)
[[ "${#EXPECTO_RUNNERS[@]}" -eq 1 ]] || {
  echo 'Expected exactly one baseline/run_expecto_matrix.sh in the archive.' >&2
  exit 2
}
EXPECTO_PROJECT_DIR="$(dirname "$(dirname "${EXPECTO_RUNNERS[0]}")")"

# Return outputs even if generation fails partway through.
collect_outputs() {
  EXPECTO_EXIT_CODE=$?
  trap - EXIT
  set +e
  EXPECTO_RETURN_DIR="$EXPECTO_JOB_DIR/expecto-results"
  mkdir -p "$EXPECTO_RETURN_DIR"
  EXPECTO_COPY_CODE=0
  if [[ -d "$EXPECTO_PROJECT_DIR/baseline/expecto-results/matrix-$EXPECTO_RUN_ID" ]]; then
    cp -a "$EXPECTO_PROJECT_DIR/baseline/expecto-results/matrix-$EXPECTO_RUN_ID" "$EXPECTO_RETURN_DIR/"
    EXPECTO_COPY_CODE=$?
  fi
  EXPECTO_OUTPUT_DIR="$EXPECTO_JOB_DIR/expecto-output"
  mkdir -p "$EXPECTO_OUTPUT_DIR"
  printf '%s\n' "$EXPECTO_RUN_ID" > "$EXPECTO_OUTPUT_DIR/run-id.txt"
  printf '%s\n' "$EXPECTO_EXIT_CODE" > "$EXPECTO_OUTPUT_DIR/exit-code.txt"
  EXPECTO_PATHS=()
  for EXPECTO_PATH in "baseline/expecto-results/matrix-$EXPECTO_RUN_ID"; do
    [[ ! -d "$EXPECTO_PROJECT_DIR/$EXPECTO_PATH" ]] || EXPECTO_PATHS+=("$EXPECTO_PATH")
  done
  tar -czf "$EXPECTO_OUTPUT_DIR/results-and-testcases.tar.gz" \
    -C "$EXPECTO_PROJECT_DIR" "${EXPECTO_PATHS[@]}" --files-from /dev/null
  EXPECTO_PACK_CODE=$?
  if [[ "$EXPECTO_EXIT_CODE" -eq 0 && "$EXPECTO_PACK_CODE" -ne 0 ]]; then
    EXPECTO_EXIT_CODE="$EXPECTO_PACK_CODE"
  fi
  if [[ "$EXPECTO_EXIT_CODE" -eq 0 && "$EXPECTO_COPY_CODE" -ne 0 ]]; then
    EXPECTO_EXIT_CODE="$EXPECTO_COPY_CODE"
  fi
  exit "$EXPECTO_EXIT_CODE"
}
trap collect_outputs EXIT
echo "Project: $EXPECTO_PROJECT_DIR; run ID: $EXPECTO_RUN_ID"
cd "$EXPECTO_PROJECT_DIR"
bash baseline/run_expecto_matrix.sh

exit
fi
EXPECTO_ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
cd "$EXPECTO_ROOT"
case "${1:-}" in
  ""|--inside|--docker|--check-env) ;;
  *) echo "Usage: bash baseline/run_expecto_matrix.sh [--inside|--docker|--check-env] [--buggycodes-targeted-unit-tc|--buggyasrts-targeted-unit-tc] [--local-gpt-oss[=URL]]. To start vLLM with --model and --dataset, use bash run_expecto.sh --model MODEL --dataset DATASET [--targeted-unit-tc]." >&2; exit 2 ;;
esac
if [[ -z "${TOGETHER_API_KEY:-}" && "${EXPECTO_MODEL:-}" != local/* && "${EXPECTO_MODEL:-}" != openai-api/local/* ]]; then
    TOGETHER_API_KEY="$("$EXPECTO_PYTHON" - <<'KEY'
import ast
from pathlib import Path
import sys

path = Path('keysecrets.py')
if not path.is_file():
    sys.exit('Set TOGETHER_API_KEY or define together_key in the project-root keysecrets.py.')
try:
    tree = ast.parse(path.read_text())
    value = None
    for node in tree.body:
        targets = node.targets if isinstance(node, ast.Assign) else ([node.target] if isinstance(node, ast.AnnAssign) else [])
        if any(isinstance(target, ast.Name) and target.id == 'together_key' for target in targets):
            value = ast.literal_eval(node.value)
    if not isinstance(value, str) or not value.strip():
        raise ValueError()
except (SyntaxError, ValueError, TypeError):
    sys.exit('keysecrets.py must define together_key as a nonempty string literal; alternatively set TOGETHER_API_KEY.')
sys.stdout.write(value)
KEY
)"
    export TOGETHER_API_KEY
fi
export TOGETHER_API_KEY
export EXPECTO_RUN_ID="${EXPECTO_RUN_ID:-$(date +%Y%m%d-%H%M%S)}"
[[ "$EXPECTO_RUN_ID" =~ ^[a-zA-Z0-9._-]+$ ]] || { echo "Invalid run ID" >&2; exit 2; }
echo "Run ID: $EXPECTO_RUN_ID (reuse EXPECTO_RUN_ID to resume)"
if [[ "${1:-}" == --docker ]]; then
  if ! command -v docker >/dev/null; then
    echo 'Docker is missing; installing docker.io (Debian/Ubuntu host).'
    command -v apt-get >/dev/null || { echo 'Install Docker Desktop or Docker Engine first.' >&2; exit 1; }
    sudo apt-get update
    sudo apt-get install -y docker.io
  fi
  if ! docker info >/dev/null 2>&1; then
    if command -v systemctl >/dev/null; then
      sudo systemctl start docker
    else
      sudo service docker start
    fi
  fi
  EXPECTO_DOCKER=(docker)
  if ! docker info >/dev/null 2>&1; then
    EXPECTO_DOCKER=(sudo --preserve-env=TOGETHER_API_KEY,EXPECTO_RUN_ID,EXPECTO_TC_JOBS,EXPECTO_TEST_SECONDS,EXPECTO_MODEL,EXPECTO_LIMIT,EXPECTO_PROMPT_VARIANT,EXPECTO_GROUPS,EXPECTO_TRACE_SOURCE,EXPECTO_SETTINGS,EXPECTO_BASE_URL,EXPECTO_LOCAL_API_KEY,EXPECTO_REASONING_EFFORT docker)
    "${EXPECTO_DOCKER[@]}" info >/dev/null
  fi
  "${EXPECTO_DOCKER[@]}" pull "${EXPECTO_IMAGE:-prosyslab/expecto-artifact}"
  # Key is passed via the environment, never written into the container image.
  "${EXPECTO_DOCKER[@]}" run --rm --init --user "$(id -u):$(id -g)" \
    -e TOGETHER_API_KEY -e EXPECTO_RUN_ID -e EXPECTO_TC_JOBS \
    -e EXPECTO_TEST_SECONDS -e EXPECTO_MODEL -e EXPECTO_LIMIT \
    -e EXPECTO_PROMPT_VARIANT -e EXPECTO_GROUPS -e EXPECTO_TRACE_SOURCE \
    -e EXPECTO_SETTINGS \
    -e EXPECTO_BASE_URL -e EXPECTO_LOCAL_API_KEY -e EXPECTO_REASONING_EFFORT \
    -v "$EXPECTO_ROOT:/repo" -w /repo \
    "${EXPECTO_IMAGE:-prosyslab/expecto-artifact}" \
    bash baseline/run_expecto_matrix.sh --inside
  exit
fi
EXPECTO_DEPS="$(mktemp -d "${TMPDIR:-/tmp}/expecto-batch-deps.XXXXXXXX")"
trap 'rm -rf -- "$EXPECTO_DEPS"' EXIT
"$EXPECTO_PYTHON" -m pip install --target "$EXPECTO_DEPS" -r baseline/expecto_batch/requirements.txt
export PYTHONPATH="$EXPECTO_DEPS:$EXPECTO_ROOT:$EXPECTO_ROOT/baseline/expecto-artifact:$EXPECTO_ROOT/baseline/expecto-artifact/expecto${PYTHONPATH:+:$PYTHONPATH}"
"$EXPECTO_PYTHON" -c 'from expecto.src.DSL.compiler import DSLCompiler, make_solver'
java -version
javac -version
"$EXPECTO_PYTHON" -c 'from tree_sitter_languages import get_parser; get_parser("java")'
if [[ "${1:-}" == --check-env ]]; then
  echo 'Environment ready; no testcases or LLM calls were made.'
  exit 0
fi
EXPECTO_RESULTS="baseline/expecto-results/matrix-$EXPECTO_RUN_ID"
EXPECTO_CASES="$EXPECTO_RESULTS/testcases"
mkdir -p "$EXPECTO_RESULTS" "$EXPECTO_CASES"
EXPECTO_EXTRA=()
if [[ -n "${EXPECTO_LIMIT:-}" ]]; then EXPECTO_EXTRA=(--limit "$EXPECTO_LIMIT"); fi
if [[ -n "${EXPECTO_BASE_URL:-}" ]]; then EXPECTO_EXTRA+=(--base-url "$EXPECTO_BASE_URL"); fi
EXPECTO_EXTRA+=(--reasoning-effort "${EXPECTO_REASONING_EFFORT:-medium}")
read -r -a EXPECTO_SELECTED_GROUPS <<< "${EXPECTO_GROUPS:-c2s_aug_sub buggycodes buggyasrts naturalness}"
read -r -a EXPECTO_SELECTED_SETTINGS <<< "${EXPECTO_SETTINGS:-no-tc tc unit-tc}"
for EXPECTO_SETTING in "${EXPECTO_SELECTED_SETTINGS[@]}"; do
  case "$EXPECTO_SETTING" in
    no-tc|tc|unit-tc|targeted-unit-tc) ;;
    *) echo "Unsupported setting: $EXPECTO_SETTING" >&2; exit 2 ;;
  esac
done
if [[ " ${EXPECTO_SELECTED_SETTINGS[*]} " == *" targeted-unit-tc "* ]]; then
  [[ ( "${EXPECTO_SELECTED_GROUPS[*]}" == buggycodes || "${EXPECTO_SELECTED_GROUPS[*]}" == buggyasrts ) && -z "${EXPECTO_TRACE_SOURCE:-}" ]] || {
    echo 'targeted-unit-tc requires buggycodes or buggyasrts and fresh GT-failing traces; use --buggycodes-targeted-unit-tc or --buggyasrts-targeted-unit-tc.' >&2
    exit 2
  }
fi
echo "Datasets: ${EXPECTO_SELECTED_GROUPS[*]}; settings: ${EXPECTO_SELECTED_SETTINGS[*]}; prompt: ${EXPECTO_PROMPT_VARIANT:-default}"
if [[ -n "${EXPECTO_TRACE_SOURCE:-}" ]]; then
  for EXPECTO_GROUP in "${EXPECTO_SELECTED_GROUPS[@]}"; do
    for EXPECTO_SETTING in "${EXPECTO_SELECTED_SETTINGS[@]}"; do
      [[ "$EXPECTO_SETTING" != no-tc ]] || continue
      EXPECTO_TRACE_FILE="$EXPECTO_TRACE_SOURCE/testcases/$EXPECTO_GROUP-$EXPECTO_SETTING/generation-traces.json"
      [[ -f "$EXPECTO_TRACE_FILE" ]] || {
        echo "Missing testcase input: $EXPECTO_TRACE_FILE. Rebuild project.tar.gz using baseline/pack_expecto.sh." >&2
        exit 2
      }
      if [[ "$EXPECTO_SETTING" == targeted-unit-tc ]]; then
        "$EXPECTO_PYTHON" - "$EXPECTO_TRACE_FILE" "$EXPECTO_ROOT" <<'PROVENANCE'
import hashlib
import json
from pathlib import Path
import sys

path, root = Path(sys.argv[1]), Path(sys.argv[2])
provenance = json.loads(path.with_name('provenance.json').read_text())
traces = json.loads(path.read_text())
if set(traces) != set(provenance):
    sys.exit('Targeted testcase IDs do not match their provenance.')
for sid, record in provenance.items():
    source = root / 'datasets' / record['source']
    if hashlib.sha256(source.read_bytes()).hexdigest() != record['source_sha256']:
        sys.exit(f'Targeted testcases are stale: source changed for {sid}. Regenerate and repack them.')
print(f'Checked source fingerprints for {len(provenance)} targeted testpoints.')
PROVENANCE
      fi
    done
  done
fi
for EXPECTO_GROUP in "${EXPECTO_SELECTED_GROUPS[@]}"; do
  case "$EXPECTO_GROUP" in
    c2s_aug|c2s_aug_sub|buggycodes|buggyasrts|naturalness) ;;
    *) echo "Unsupported dataset: $EXPECTO_GROUP" >&2; exit 2 ;;
  esac
  [[ -d "datasets/$EXPECTO_GROUP" ]] || { echo "Missing datasets/$EXPECTO_GROUP" >&2; exit 1; }
  for EXPECTO_SETTING in "${EXPECTO_SELECTED_SETTINGS[@]}"; do
    EXPECTO_OUT="$EXPECTO_RESULTS/$EXPECTO_GROUP-$EXPECTO_SETTING"
    EXPECTO_TRACES=()
    if [[ "$EXPECTO_SETTING" == targeted-unit-tc && ! -f "$EXPECTO_OUT/manifest.jsonl" ]]; then
      "$EXPECTO_PYTHON" -m baseline.expecto_batch.pipeline prepare --group "$EXPECTO_GROUP" --output "$EXPECTO_OUT"
    fi
    if [[ "$EXPECTO_SETTING" != no-tc ]]; then
      EXPECTO_TC="$EXPECTO_CASES/$EXPECTO_GROUP-$EXPECTO_SETTING"
      EXPECTO_COLLECTOR=()
      if [[ "$EXPECTO_SETTING" == tc ]]; then EXPECTO_COLLECTOR=(--independent); fi
      if [[ -n "${EXPECTO_TRACE_SOURCE:-}" ]]; then
        mkdir -p "$EXPECTO_TC"
        cp "$EXPECTO_TRACE_SOURCE/testcases/$EXPECTO_GROUP-$EXPECTO_SETTING/generation-traces.json" "$EXPECTO_TC/generation-traces.json"
        if [[ "$EXPECTO_SETTING" == targeted-unit-tc ]]; then
          for EXPECTO_META in provenance.json validation.json coverage.csv RUN_REPORT.md; do
            cp "$EXPECTO_TRACE_SOURCE/testcases/$EXPECTO_GROUP-$EXPECTO_SETTING/$EXPECTO_META" "$EXPECTO_TC/$EXPECTO_META"
          done
        fi
      elif [[ "$EXPECTO_SETTING" == targeted-unit-tc ]]; then
        "$EXPECTO_PYTHON" -u -m baseline.expecto_batch.targeted_testcases \
          --group "$EXPECTO_GROUP" \
          --manifest "$EXPECTO_OUT/manifest.jsonl" --output "$EXPECTO_TC" \
          --jobs "${EXPECTO_TC_JOBS:-4}"
      else
      "$EXPECTO_PYTHON" -u -m baseline.expecto_batch.testcases \
        --group "$EXPECTO_GROUP" --output "$EXPECTO_TC" \
        --label-mode groundtruth --positive-only --max-cases 3 \
        --bounded-only --seconds 1 --seeds 0 --jobs "${EXPECTO_TC_JOBS:-4}" \
        "${EXPECTO_COLLECTOR[@]}"
      fi
      "$EXPECTO_PYTHON" - "$EXPECTO_TC/generation-traces.json" "$EXPECTO_SETTING" <<'CHECK'
import json, sys
traces = json.load(open(sys.argv[1]))
for sid, trace in traces.items():
    assert len(trace.get('corrects', {})) <= 3, sid
    if sys.argv[2] == 'targeted-unit-tc':
        # An empty task is reported individually by pipeline.run; it must not
        # abort every other task before any generation can start.
        assert not trace.get('incorrects'), sid
    else:
        assert not trace.get('incorrects'), sid
if sys.argv[2] == 'targeted-unit-tc':
    from pathlib import Path
    metadata = json.loads(Path(sys.argv[1]).with_name('validation.json').read_text())
    assert metadata['trace_policy'] == 'mutant_gt_failing_v3'
    missing = sum(not t.get('corrects') for t in traces.values())
    print(f'Verified GT-failing mutant traces; {missing} empty entries will be reported individually, without stopping other tasks.')
else:
    print('Verified: at most three positive examples and zero negatives per task.')
CHECK
      EXPECTO_TRACES=(--traces "$EXPECTO_TC/generation-traces.json" --require-traces)
    fi
    if [[ ! -f "$EXPECTO_OUT/manifest.jsonl" ]]; then
      "$EXPECTO_PYTHON" -m baseline.expecto_batch.pipeline prepare --group "$EXPECTO_GROUP" --output "$EXPECTO_OUT"
    fi
    "$EXPECTO_PYTHON" -u -m baseline.expecto_batch.pipeline run \
      --group "$EXPECTO_GROUP" --output "$EXPECTO_OUT" \
      --model "${EXPECTO_MODEL:-together/openai/gpt-oss-120b}" \
      --no-memo --max-tokens 8192 \
      --test-seconds "${EXPECTO_TEST_SECONDS:-30}" --seed 0 \
      --prompt-variant "${EXPECTO_PROMPT_VARIANT:-default}" \
      "${EXPECTO_TRACES[@]}" "${EXPECTO_EXTRA[@]}"
  done
done
echo "Finished. Results: $EXPECTO_RESULTS; testcases: $EXPECTO_CASES"
