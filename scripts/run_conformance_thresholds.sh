#!/usr/bin/env bash
# Reuse saved conformance scores; independently run a threshold/active sweep.
set -euo pipefail
PIPELINE_PYTHON="${PIPELINE_PYTHON:-python3}"
PIPELINE_THRESHOLDS=(0.3 0.5 0.6 0.7 0.9)
PIPELINE_DATASETS=(c2s_aug naturalness buggyasrts buggycodes)
PIPELINE_PREPARE_ONLY=0
PIPELINE_RESUME=(--resume)
PIPELINE_LIMIT=0
PIPELINE_OUTPUT_ROOT=""
PIPELINE_KEEP_WORK=0
while [[ $# -gt 0 ]]; do
  case "$1" in
    --thresholds)
      shift; PIPELINE_THRESHOLDS=()
      while [[ $# -gt 0 && "$1" != --* ]]; do PIPELINE_THRESHOLDS+=("$1"); shift; done
      [[ ${#PIPELINE_THRESHOLDS[@]} -gt 0 ]] || { echo '--thresholds requires values.' >&2; exit 2; } ;;
    --datasets)
      shift; PIPELINE_DATASETS=()
      while [[ $# -gt 0 && "$1" != --* ]]; do PIPELINE_DATASETS+=("$1"); shift; done
      [[ ${#PIPELINE_DATASETS[@]} -gt 0 ]] || { echo '--datasets requires at least one name.' >&2; exit 2; } ;;
    --limit) PIPELINE_LIMIT="${2:?Missing limit}"; shift 2 ;;
    --output-root) PIPELINE_OUTPUT_ROOT="${2:?Missing output directory}"; shift 2 ;;
    --prepare-only) PIPELINE_PREPARE_ONLY=1; shift ;;
    --force) PIPELINE_RESUME=(); shift ;;
    --keep-work) PIPELINE_KEEP_WORK=1; shift ;;
    -h|--help)
      echo 'Usage: bash scripts/run_conformance_thresholds.sh [--thresholds 0.3 0.5 0.6 0.7 0.9] [--datasets c2s_aug naturalness buggyasrts buggycodes] [--limit N] [--prepare-only] [--force] [--keep-work] [--output-root DIR]'
      echo 'Reuses saved conformance scores; no LLM model or model path is required.'
      exit 0 ;;
    *) echo "Unknown argument: $1" >&2; exit 2 ;;
  esac
done
[[ "$PIPELINE_LIMIT" =~ ^[0-9]+$ ]] || { echo '--limit must be a nonnegative integer.' >&2; exit 2; }
if [[ ! -f checker.py && -f /app/checker.py ]]; then
  shopt -s dotglob nullglob
  for item in /app/*; do
    [[ "$(basename "$item")" == run_chtc.sh ]] || cp -a "$item" .
  done
fi
[[ -f checker.py && -f utils/dispatch.py ]] || { echo 'Run from the project directory.' >&2; exit 2; }
export CUDA_VISIBLE_DEVICES="${CUDA_VISIBLE_DEVICES:-0,1}"
export VLLM_WORKER_MULTIPROC_METHOD="${VLLM_WORKER_MULTIPROC_METHOD:-spawn}"
PIPELINE_JOB_USER="${LOGNAME:-${USER:-chtc-$(id -u)}}"
export LOGNAME="$PIPELINE_JOB_USER" USER="$PIPELINE_JOB_USER"
if [[ -z "${RAY_TMPDIR:-}" || "${#RAY_TMPDIR}" -gt 25 ]]; then export RAY_TMPDIR=/tmp; fi
shopt -s nullglob
PIPELINE_DISPATCH_TMP=""
trap 'if [[ -n "$PIPELINE_DISPATCH_TMP" ]]; then rm -rf -- "$PIPELINE_DISPATCH_TMP"; fi' EXIT
for threshold in "${PIPELINE_THRESHOLDS[@]}"; do
  [[ "$threshold" =~ ^(0(\.[0-9]+)?|1(\.0+)?)$ ]] || { echo "Invalid threshold: $threshold (expected 0..1)." >&2; exit 2; }
done
for threshold in "${PIPELINE_THRESHOLDS[@]}"; do
for dataset in "${PIPELINE_DATASETS[@]}"; do
  case "$dataset" in
    c2s_aug) report_name=resultsgpt-oss-120bdefault-06-True.txt ;;
    naturalness|buggyasrts|buggycodes) report_name="results${dataset}gpt-oss-120bdefault-06-True.txt" ;;
    *) echo "Unsupported dataset: $dataset" >&2; exit 2 ;;
  esac
  source_report="results/$dataset/checks/$report_name"
  [[ -f "$source_report" ]] || { echo "Missing source report: $source_report" >&2; exit 2; }
  output="results/$dataset/checks/active_conformance_threshold_${threshold//./p}"
  if [[ -n "$PIPELINE_OUTPUT_ROOT" ]]; then output="$PIPELINE_OUTPUT_ROOT/$dataset/active_conformance_threshold_${threshold//./p}"; fi
  mkdir -p "$output/inputs"
  # Existing checker reports identify the exact saved generations to replay.
  # Strip old aggregate footers, which describe the original selection setting.
  awk -v max="$PIPELINE_LIMIT" '
    /^########## / { n++; if(max>0 && n>max) exit; inside=1 }
    inside { print }
    /^####################$/ { inside=0 }
  ' "$source_report" > "$output/source_checks.txt"
  mapfile -t tasks < <(sed -n 's/^########## \(.*\) ##########[[:space:]]*$/\1/p' "$output/source_checks.txt")
  [[ ${#tasks[@]} -gt 0 ]] || { echo "No tasks in $source_report" >&2; exit 2; }
  missing=0
  for task in "${tasks[@]}"; do
    name="$(basename "${task%.check}")"
    [[ -f "$output/inputs/$name" ]] || missing=1
  done
  if [[ "$missing" == 1 ]]; then
    # Dispatch each required Java source once into an isolated temporary folder.
    # Match by source-local assertion ordinal; original global numbering may differ.
    PIPELINE_DISPATCH_TMP="$(mktemp -d "$output/dispatch.XXXXXX")"
    declare -A dispatched=()
    for task in "${tasks[@]}"; do
      name="$(basename "${task%.check}")"
      [[ -f "$output/inputs/$name" ]] && continue
      # Resolve package/class prefix using the numeric suffix before 'onedown'.
      prefix="$(printf '%s\n' "$name" | sed -E 's/[0-9]+onedown\.java\.[0-9]+$//')"
      source="datasets/${prefix//./\/}.java"
      if [[ -z "${dispatched[$source]:-}" ]]; then
        [[ -f "$source" ]] || { echo "Missing Java source: $source" >&2; exit 2; }
        "$PIPELINE_PYTHON" utils/dispatch.py --infile "$source" --outdir "$PIPELINE_DISPATCH_TMP" --write --obsonly
        dispatched[$source]=1
      fi
      stem="${name%.*}"
      matches=("$PIPELINE_DISPATCH_TMP/$stem".*)
      [[ ${#matches[@]} -eq 1 ]] || { echo "Could not align dispatched input for $name" >&2; exit 2; }
      cp "${matches[0]}" "$output/inputs/$name"
    done
    rm -rf -- "$PIPELINE_DISPATCH_TMP"
    PIPELINE_DISPATCH_TMP=""
    unset dispatched
  fi
  echo "$dataset: ${#tasks[@]} existing tasks; results: $output"
  [[ "$PIPELINE_PREPARE_ONLY" == 0 ]] || continue
  if [[ "$PIPELINE_KEEP_WORK" == 1 ]]; then
    mkdir -p "$output/active_work"
    export CHECKER_TMP_DIR="$PWD/$output/active_work"
    [[ "$output" != /* ]] || export CHECKER_TMP_DIR="$output/active_work"
  fi
  "$PIPELINE_PYTHON" -u checker.py \
    --datasets datasets \
    --codedir "$output/inputs" \
    --active-from-check-file "$output/source_checks.txt" \
    --active-score conformance --selection-mode active --active-threshold "$threshold" \
    --outdir "$output" --outname "$report_name" \
    --write "${PIPELINE_RESUME[@]}" 2>&1 | tee -a "$output/experiment.log"
done
done
