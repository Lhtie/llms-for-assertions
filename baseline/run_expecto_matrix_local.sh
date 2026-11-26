#!/usr/bin/env bash
# One GPU job: start a persistent vLLM server, then run a dataset/settings matrix.
set -euo pipefail
# CHTC may run with a numeric UID absent from the container's /etc/passwd.
# Python getpass.getuser() checks these variables before calling getpwuid().
EXPECTO_JOB_USER="${LOGNAME:-${USER:-chtc-$(id -u)}}"
export LOGNAME="$EXPECTO_JOB_USER" USER="$EXPECTO_JOB_USER"
EXPECTO_MODEL_PATH=""
EXPECTO_DATASET=""
EXPECTO_SERVED_MODEL=""
EXPECTO_REASONING_PARSER=auto
EXPECTO_REQUESTED_REASONING=auto
EXPECTO_VLLM_PYTHON="$(command -v python3)"
EXPECTO_VLLM_EXPLICIT=0
EXPECTO_CLIENT_PYTHON="$EXPECTO_VLLM_PYTHON"
EXPECTO_TP=2
EXPECTO_PORT=8000
EXPECTO_CONTEXT=65536
EXPECTO_START_TIMEOUT=1800
EXPECTO_REQUESTED_RUN=""
EXPECTO_TRIAL_LIMIT=""
EXPECTO_OFFLINE=0
EXPECTO_PROJECT_ARCHIVE=""
EXPECTO_CUDA_HOME="${CUDA_HOME:-${CUDA_PATH:-}}"
EXPECTO_LOCAL_SETTINGS="no-tc tc unit-tc"
EXPECTO_TARGETED_GROUP=""
usage() {
  cat <<'HELP'
Usage: bash baseline/run_expecto_matrix_local.sh --model MODEL --dataset DATASET [options]
  --model MODEL        Local directory, HF model ID, or gpt-oss-120b alias
  --archive FILE       Extract a project archive here (auto: ./project.tar.gz if code/data are missing)
  --offline            Load cached/local weights only; do not download from HF
  --cuda-home DIR      CUDA Toolkit directory containing bin/nvcc
  --dataset NAME       c2s_aug, c2s_aug_sub, buggycodes, buggyasrts, naturalness
  --buggycodes-targeted-unit-tc  Only Buggy Code with freshly generated mutant traces
  --buggyasrts-targeted-unit-tc  Only Buggy Asrt with freshly generated GT-failing traces
  --targeted-unit-tc    Only targeted tests for --dataset buggycodes or buggyasrts
  --served-model-name NAME  Optional API model alias (default: model directory name)
  --reasoning-parser NAME   auto, none, or a vLLM parser name
  --reasoning-effort VALUE  auto, none, low, medium, high
  --vllm-python PATH    GPU Python environment (installs vLLM there if missing)
  --expecto-python PATH Python executable in your Expecto environment
  --tp N               Tensor-parallel GPU count (default 2)
  --port N             Local service port (default 8000)
  --context-length N   Model context length (default 65536)
  --startup-timeout N  Seconds to wait for vLLM (default 1800)
  --run-id NAME        Reuse a run ID to resume matching Expecto results
  --limit N            Trial: run first N tasks per setting; TC collection stays full
Run from the directory containing baseline/ and datasets/. Paths use the current directory.
Missing vLLM is installed automatically in ./.venv-vllm (or --vllm-python).
The Expecto environment must already be installed. No Docker or sudo is invoked.
HELP
}
while [[ "$#" -gt 0 ]]; do
  case "$1" in
    --model|--model-path) EXPECTO_MODEL_PATH="${2:?Missing model path}"; shift 2 ;;
    --archive) EXPECTO_PROJECT_ARCHIVE="${2:?Missing project archive}"; shift 2 ;;
    --cuda-home) EXPECTO_CUDA_HOME="${2:?Missing CUDA Toolkit directory}"; shift 2 ;;
    --offline) EXPECTO_OFFLINE=1; shift ;;
    --dataset) EXPECTO_DATASET="${2:?Missing dataset}"; shift 2 ;;
    --buggycodes-targeted-unit-tc) EXPECTO_LOCAL_SETTINGS=targeted-unit-tc; EXPECTO_TARGETED_GROUP=buggycodes; shift ;;
    --buggyasrts-targeted-unit-tc) EXPECTO_LOCAL_SETTINGS=targeted-unit-tc; EXPECTO_TARGETED_GROUP=buggyasrts; shift ;;
    --targeted-unit-tc) EXPECTO_LOCAL_SETTINGS=targeted-unit-tc; shift ;;
    --served-model-name) EXPECTO_SERVED_MODEL="${2:?Missing model alias}"; shift 2 ;;
    --reasoning-parser) EXPECTO_REASONING_PARSER="${2:?Missing parser}"; shift 2 ;;
    --reasoning-effort) EXPECTO_REQUESTED_REASONING="${2:?Missing reasoning effort}"; shift 2 ;;
    --vllm-python) EXPECTO_VLLM_PYTHON="${2:?Missing Python path}"; EXPECTO_VLLM_EXPLICIT=1; shift 2 ;;
    --expecto-python) EXPECTO_CLIENT_PYTHON="${2:?Missing Python path}"; shift 2 ;;
    --tp) EXPECTO_TP="${2:?Missing GPU count}"; shift 2 ;;
    --port) EXPECTO_PORT="${2:?Missing port}"; shift 2 ;;
    --context-length) EXPECTO_CONTEXT="${2:?Missing context length}"; shift 2 ;;
    --startup-timeout) EXPECTO_START_TIMEOUT="${2:?Missing timeout}"; shift 2 ;;
    --run-id) EXPECTO_REQUESTED_RUN="${2:?Missing run ID}"; shift 2 ;;
    --limit) EXPECTO_TRIAL_LIMIT="${2:?Missing limit}"; shift 2 ;;
    -h|--help) usage; exit 0 ;;
    *) echo "Unknown argument: $1" >&2; usage >&2; exit 2 ;;
  esac
done
if [[ "$EXPECTO_LOCAL_SETTINGS" == targeted-unit-tc ]]; then
  EXPECTO_DATASET="${EXPECTO_DATASET:-${EXPECTO_TARGETED_GROUP:-buggycodes}}"
  [[ "$EXPECTO_DATASET" == buggycodes || "$EXPECTO_DATASET" == buggyasrts ]] || { echo 'Targeted traces require --dataset buggycodes or buggyasrts.' >&2; exit 2; }
  [[ -z "$EXPECTO_TARGETED_GROUP" || "$EXPECTO_DATASET" == "$EXPECTO_TARGETED_GROUP" ]] || { echo 'Targeted preset conflicts with --dataset.' >&2; exit 2; }
fi
# All project/model/output paths are relative to the invocation directory.
if [[ -n "$EXPECTO_PROJECT_ARCHIVE" || ! -f baseline/run_expecto_matrix.sh || ( -n "$EXPECTO_DATASET" && ! -d "datasets/$EXPECTO_DATASET" ) ]]; then
  EXPECTO_PROJECT_ARCHIVE="${EXPECTO_PROJECT_ARCHIVE:-./project.tar.gz}"
  [[ -f "$EXPECTO_PROJECT_ARCHIVE" ]] || {
    echo "Project code/data are missing and archive not found: $EXPECTO_PROJECT_ARCHIVE. Transfer project.tar.gz alongside run_expecto.sh and the model directory." >&2
    exit 2
  }
  echo "Extracting $EXPECTO_PROJECT_ARCHIVE into the current directory..."
  tar -xzf "$EXPECTO_PROJECT_ARCHIVE" -C .
fi
[[ -f baseline/run_expecto_matrix.sh ]] || {
  echo 'The archive must contain baseline/run_expecto_matrix.sh at its top level. Rebuild it with baseline/pack_expecto.sh.' >&2; exit 2;
}
[[ -n "$EXPECTO_MODEL_PATH" ]] || { echo 'Specify a local directory or model ID with --model.' >&2; exit 2; }
if [[ -d "$EXPECTO_MODEL_PATH" ]]; then
  [[ "$EXPECTO_MODEL_PATH" = /* ]] || EXPECTO_MODEL_PATH="./${EXPECTO_MODEL_PATH#./}"
else
  case "$EXPECTO_MODEL_PATH" in
    gpt-oss-120b) EXPECTO_MODEL_PATH=openai/gpt-oss-120b ;;
    gpt-oss-20b) EXPECTO_MODEL_PATH=openai/gpt-oss-20b ;;
    /*|./*|../*) echo "Model directory does not exist: $EXPECTO_MODEL_PATH" >&2; exit 2 ;;
    *)
      [[ "$EXPECTO_MODEL_PATH" =~ ^[a-zA-Z0-9._-]+(/[a-zA-Z0-9._-]+)?$ ]] || {
        echo "Invalid model directory or model ID: $EXPECTO_MODEL_PATH" >&2; exit 2;
      } ;;
  esac
fi
if [[ "$EXPECTO_OFFLINE" == 1 ]]; then export HF_HUB_OFFLINE=1; fi
echo "Model source: $EXPECTO_MODEL_PATH"
case "$EXPECTO_DATASET" in
  c2s_aug|c2s_aug_sub|buggycodes|buggyasrts|naturalness) ;;
  *) echo 'Specify a supported dataset with --dataset.' >&2; exit 2 ;;
esac
[[ -d "datasets/$EXPECTO_DATASET" ]] || {
  echo "Missing dataset: ./datasets/$EXPECTO_DATASET. Include this dataset when packaging the project." >&2; exit 2;
}
EXPECTO_SERVED_MODEL="${EXPECTO_SERVED_MODEL:-$(basename "${EXPECTO_MODEL_PATH%/}")}"
[[ "$EXPECTO_SERVED_MODEL" =~ ^[a-zA-Z0-9._-]+$ ]] || { echo 'Use a simple --served-model-name (letters, numbers, dot, dash, underscore).' >&2; exit 2; }
EXPECTO_REQUESTED_RUN="${EXPECTO_REQUESTED_RUN:-$EXPECTO_DATASET-$EXPECTO_SERVED_MODEL-$(date +%Y%m%d-%H%M%S)}"
case "$EXPECTO_REQUESTED_REASONING" in auto|none|low|medium|high) ;; *) echo 'Invalid reasoning effort.' >&2; exit 2 ;; esac
for EXPECTO_NUM in "$EXPECTO_TP" "$EXPECTO_PORT" "$EXPECTO_CONTEXT" "$EXPECTO_START_TIMEOUT"; do
  [[ "$EXPECTO_NUM" =~ ^[1-9][0-9]*$ ]] || { echo 'Numeric options must be positive integers.' >&2; exit 2; }
done
[[ "$EXPECTO_PORT" -le 65535 ]] || { echo 'Invalid port.' >&2; exit 2; }
[[ -z "$EXPECTO_TRIAL_LIMIT" || "$EXPECTO_TRIAL_LIMIT" =~ ^[1-9][0-9]*$ ]] || { echo 'Invalid limit.' >&2; exit 2; }
[[ "$EXPECTO_REQUESTED_RUN" =~ ^[a-zA-Z0-9._-]+$ ]] || { echo 'Invalid run ID.' >&2; exit 2; }
EXPECTO_VLLM_PYTHON="$(command -v "$EXPECTO_VLLM_PYTHON")"
EXPECTO_CLIENT_PYTHON="$(command -v "$EXPECTO_CLIENT_PYTHON")"
# Upstream DSL sandboxes invoke python3 by name; keep them in the client env too.
export PATH="$(dirname "$EXPECTO_CLIENT_PYTHON"):$PATH"
if [[ "$EXPECTO_VLLM_EXPLICIT" == 0 && -x ./.venv-vllm/bin/python ]]; then
  EXPECTO_VLLM_PYTHON="$PWD/.venv-vllm/bin/python"
fi
EXPECTO_VLLM_INSTALL=0
if ! "$EXPECTO_VLLM_PYTHON" -c 'import vllm' 2> .expecto-vllm-import.log; then
  EXPECTO_VLLM_INSTALL=1
fi
if [[ "$EXPECTO_VLLM_EXPLICIT" == 0 && "$EXPECTO_VLLM_PYTHON" == "$PWD/.venv-vllm/bin/python" ]]; then
  if ! "$EXPECTO_VLLM_PYTHON" -c 'from importlib.metadata import version; import sys; sys.exit(0 if all(version(k)==v for k,v in {"vllm":"0.10.2","transformers":"4.57.1","tokenizers":"0.22.1"}.items()) else 1)' 2> .expecto-vllm-versions.log; then
    echo 'Managed vLLM environment does not match the project dependency pins; repairing it.'
    EXPECTO_VLLM_INSTALL=1
  fi
fi
if [[ "$EXPECTO_VLLM_INSTALL" == 1 ]]; then
  if [[ "$EXPECTO_VLLM_EXPLICIT" == 0 ]]; then
    if [[ ! -x ./.venv-vllm/bin/python ]]; then
      echo 'Creating isolated vLLM environment: ./.venv-vllm'
      "$EXPECTO_VLLM_PYTHON" -m venv ./.venv-vllm
    fi
    EXPECTO_VLLM_PYTHON="$PWD/.venv-vllm/bin/python"
  fi
  echo "Installing the project-pinned vLLM/Transformers/tokenizers stack using $EXPECTO_VLLM_PYTHON ..."
  "$EXPECTO_VLLM_PYTHON" -m pip install --no-cache-dir 'vllm==0.10.2' 'transformers==4.57.1' 'tokenizers==0.22.1' 2>&1 | tee .expecto-vllm-install.log
  if ! "$EXPECTO_VLLM_PYTHON" -c 'import vllm' 2> .expecto-vllm-import.log; then
    echo "vLLM import still fails after installation using: $EXPECTO_VLLM_PYTHON" >&2
    cat .expecto-vllm-import.log >&2
    exit 2
  fi
fi
if ! "$EXPECTO_CLIENT_PYTHON" -c 'import inspect_ai.model; import dotenv' 2> .expecto-client-import.log; then
  echo "Cannot import Expecto dependencies using: $EXPECTO_CLIENT_PYTHON" >&2
  cat .expecto-client-import.log >&2
  echo 'Select the Expecto environment with --expecto-python /path/to/env/bin/python.' >&2
  exit 2
fi
command -v java >/dev/null
command -v javac >/dev/null
EXPECTO_MODEL_FAMILY="$("$EXPECTO_CLIENT_PYTHON" -c 'import json,sys;from pathlib import Path;p=Path(sys.argv[1])/"config.json";print(json.loads(p.read_text()).get("model_type", "") if p.exists() else "")' "$EXPECTO_MODEL_PATH")"
EXPECTO_GPT_OSS=0
case "${EXPECTO_MODEL_PATH,,} ${EXPECTO_SERVED_MODEL,,} $EXPECTO_MODEL_FAMILY" in *gpt-oss*|*gpt_oss*) EXPECTO_GPT_OSS=1 ;; esac
# A runtime-only image can run CUDA programs yet lack an executable compiler.
# Probe execution, since executable bits alone do not detect a noexec mount.
EXPECTO_NVCC=""
EXPECTO_CUDA_CANDIDATES=()
if [[ -n "$EXPECTO_CUDA_HOME" ]]; then
  EXPECTO_CUDA_CANDIDATES+=("$EXPECTO_CUDA_HOME/bin/nvcc")
else
  IFS=: read -r -a EXPECTO_PATH_DIRS <<< "$PATH"
  for EXPECTO_PATH_DIR in "${EXPECTO_PATH_DIRS[@]}"; do
    EXPECTO_CUDA_CANDIDATES+=("${EXPECTO_PATH_DIR:-.}/nvcc")
  done
  EXPECTO_CUDA_CANDIDATES+=("$PWD/.cuda-12.8/bin/nvcc" /usr/local/cuda/bin/nvcc /usr/local/cuda-*/bin/nvcc /opt/cuda/bin/nvcc)
fi
: > .expecto-nvcc-check.log
for EXPECTO_NVCC_CANDIDATE in "${EXPECTO_CUDA_CANDIDATES[@]}"; do
  [[ -e "$EXPECTO_NVCC_CANDIDATE" ]] || continue
  echo "Checking $EXPECTO_NVCC_CANDIDATE" >> .expecto-nvcc-check.log
  if "$EXPECTO_NVCC_CANDIDATE" --version >> .expecto-nvcc-check.log 2>&1; then
    EXPECTO_NVCC="$EXPECTO_NVCC_CANDIDATE"
    break
  fi
done
if [[ -z "$EXPECTO_NVCC" && "$EXPECTO_GPT_OSS" == 1 && -z "$EXPECTO_CUDA_HOME" ]]; then
  echo 'No usable system nvcc; installing CUDA 12.8 compiler components into ./.cuda-12.8 (no sudo).'
  "$EXPECTO_CLIENT_PYTHON" baseline/expecto_batch/bootstrap_cuda.py --destination ./.cuda-12.8 2>&1 | tee .expecto-cuda-install.log
  if "$PWD/.cuda-12.8/bin/nvcc" --version >> .expecto-nvcc-check.log 2>&1; then
    EXPECTO_NVCC="$PWD/.cuda-12.8/bin/nvcc"
  fi
fi
if [[ -n "$EXPECTO_NVCC" ]]; then
  export CUDA_HOME="$(cd "$(dirname "$EXPECTO_NVCC")/.." && pwd)"
  export CUDA_PATH="$CUDA_HOME"
  export PATH="$CUDA_HOME/bin:$PATH"
  echo "CUDA compiler: $CUDA_HOME/bin/nvcc"
elif [[ "$EXPECTO_GPT_OSS" == 1 || -n "$EXPECTO_CUDA_HOME" ]]; then
  cat .expecto-nvcc-check.log >&2
  echo 'No usable nvcc found. GPT-OSS kernel compilation needs a CUDA Toolkit with an executable bin/nvcc. Use a CUDA development environment, or pass --cuda-home /path/to/cuda. A runtime-only image or an inaccessible PATH entry is insufficient; sudo is not required by this script.' >&2
  exit 2
fi
"$EXPECTO_VLLM_PYTHON" -c 'from importlib.metadata import version; print("Inference dependency versions:"); [(print(k+"="+version(k))) for k in ("vllm","torch","transformers","tokenizers","triton")]'
if [[ "$EXPECTO_GPT_OSS" == 1 ]]; then
  if ! "$EXPECTO_VLLM_PYTHON" -c 'from vllm.model_executor.models.gpt_oss import GptOssForCausalLM; print("GPT-OSS model-class import passed.")' > .expecto-vllm-model-import.log 2>&1; then
    echo 'GPT-OSS model-class import failed before weight loading; full underlying exception follows:' >&2
    cat .expecto-vllm-model-import.log >&2
    exit 2
  fi
fi
if [[ "$EXPECTO_REASONING_PARSER" == auto ]]; then
  EXPECTO_REASONING_PARSER=none
  if [[ "$EXPECTO_GPT_OSS" == 1 ]]; then EXPECTO_REASONING_PARSER=openai_gptoss; fi
fi
if [[ "$EXPECTO_REQUESTED_REASONING" == auto ]]; then
  EXPECTO_REQUESTED_REASONING=none
  if [[ "$EXPECTO_GPT_OSS" == 1 ]]; then EXPECTO_REQUESTED_REASONING=medium; fi
fi
export EXPECTO_REASONING_EFFORT="$EXPECTO_REQUESTED_REASONING"

export EXPECTO_RUN_ID="local-${EXPECTO_REQUESTED_RUN#local-}"
export EXPECTO_MODEL="local/$EXPECTO_SERVED_MODEL"
export EXPECTO_PYTHON="$EXPECTO_CLIENT_PYTHON"
export EXPECTO_BASE_URL="http://127.0.0.1:$EXPECTO_PORT/v1"
export EXPECTO_GROUPS="$EXPECTO_DATASET"
export EXPECTO_SETTINGS="$EXPECTO_LOCAL_SETTINGS"
export EXPECTO_PROMPT_VARIANT=default
export EXPECTO_LIMIT="$EXPECTO_TRIAL_LIMIT"
# This experiment creates its own ordinary and unit TC, not another preset's traces.
unset EXPECTO_TRACE_SOURCE EXPECTO_LOCAL_API_KEY
EXPECTO_RUN_DIR="./baseline/expecto-results/matrix-$EXPECTO_RUN_ID"
mkdir -p "$EXPECTO_RUN_DIR"
EXPECTO_SERVER_LOG="$EXPECTO_RUN_DIR/vllm-server.log"
EXPECTO_SERVER_PIDFILE="$EXPECTO_RUN_DIR/vllm-server.pid"
EXPECTO_SERVER_PID=""
EXPECTO_RAY_TMPDIR=""
cleanup() {
  EXPECTO_STATUS=$?
  trap - EXIT
  if [[ -n "$EXPECTO_SERVER_PID" ]]; then
    # Only terminate the private process group started by this invocation.
    kill -TERM -- "-$EXPECTO_SERVER_PID" 2>/dev/null || true
    for EXPECTO_ATTEMPT in {1..10}; do
      kill -0 -- "-$EXPECTO_SERVER_PID" 2>/dev/null || break
      sleep 1
    done
    kill -KILL -- "-$EXPECTO_SERVER_PID" 2>/dev/null || true
  fi
  if [[ "$EXPECTO_RAY_TMPDIR" == /tmp/er.* && -d "$EXPECTO_RAY_TMPDIR" ]]; then
    rm -rf -- "$EXPECTO_RAY_TMPDIR" || true
  fi
  exit "$EXPECTO_STATUS"
}
trap cleanup EXIT
trap 'exit 130' INT
trap 'exit 143' TERM

# CHTC's TMPDIR is too deep for Ray's AF_UNIX socket filenames (107 bytes).
# Allocate an owned short path explicitly; do not derive it from TMPDIR.
EXPECTO_RAY_TMPDIR="$(mktemp -d /tmp/er.XXXXXX)"
echo "Ray temporary directory: $EXPECTO_RAY_TMPDIR"

# Start a separate session so cleanup also reaches vLLM GPU worker processes.
"$EXPECTO_CLIENT_PYTHON" - "$EXPECTO_SERVER_LOG" "$EXPECTO_SERVER_PIDFILE" "$EXPECTO_VLLM_PYTHON" "$EXPECTO_MODEL_PATH" "$EXPECTO_TP" "$EXPECTO_PORT" "$EXPECTO_CONTEXT" "$EXPECTO_SERVED_MODEL" "$EXPECTO_REASONING_PARSER" "$EXPECTO_RAY_TMPDIR" <<'START'
import json
import os
from pathlib import Path
import socket
import subprocess
import sys

log, pidfile, python, model, tp, port, context, served_name, parser, ray_tmpdir = sys.argv[1:]
# Never accidentally use or kill an unrelated existing model service.
with socket.socket() as probe:
    probe.bind(('127.0.0.1', int(port)))
command = [python, '-m', 'vllm.entrypoints.openai.api_server', '--model', model,
           '--served-model-name', served_name, '--host', '127.0.0.1', '--port', port,
           '--tensor-parallel-size', tp, '--max-model-len', context,
           '--max-num-seqs', '1']
if parser != 'none':
    command += ['--reasoning-parser', parser]
env = dict(os.environ)
env['PATH'] = str(Path(python).parent) + os.pathsep + env.get('PATH', '')
env['RAY_TMPDIR'] = ray_tmpdir
with open(log, 'w') as stream:
    process = subprocess.Popen(command, env=env, stdin=subprocess.DEVNULL,
                               stdout=stream, stderr=subprocess.STDOUT, start_new_session=True)
Path(pidfile).write_text(str(process.pid))
Path(pidfile).with_name('vllm-config.json').write_text(json.dumps({'command':command, 'RAY_TMPDIR':ray_tmpdir}, indent=2))
START
EXPECTO_SERVER_PID="$(cat "$EXPECTO_SERVER_PIDFILE")"
echo "vLLM PID: $EXPECTO_SERVER_PID; log: $EXPECTO_SERVER_LOG"

"$EXPECTO_CLIENT_PYTHON" - "$EXPECTO_BASE_URL" "$EXPECTO_START_TIMEOUT" "$EXPECTO_SERVER_PID" "$EXPECTO_SERVER_LOG" "$EXPECTO_SERVED_MODEL" "$EXPECTO_DATASET" <<'READY'
import json
import os
from pathlib import Path
import sys
import time
from urllib.request import urlopen

url, timeout, pid, log, served_name, dataset = sys.argv[1:]
deadline = time.monotonic() + int(timeout)
last_error = ''
def startup_failed(message):
    print('\n===== vLLM server log (last 100 lines) =====', file=sys.stderr)
    try:
        print('\n'.join(Path(log).read_text(errors='replace').splitlines()[-100:]), file=sys.stderr)
    except OSError as error:
        print(f'Could not read server log: {error}', file=sys.stderr)
    sys.exit(message + '\nFull log: ' + log)

while time.monotonic() < deadline:
    try:
        with urlopen(url + '/models', timeout=5) as response:
            models = json.load(response)
        if served_name not in {entry['id'] for entry in models.get('data', [])}:
            sys.exit('Endpoint does not advertise expected model: ' + served_name)
        print(f'vLLM is ready; starting {dataset} settings: {os.environ["EXPECTO_SETTINGS"]} with {served_name}.', flush=True)
        break
    except Exception as error:
        last_error = str(error)
    try:
        os.kill(int(pid), 0)
    except ProcessLookupError:
        startup_failed('vLLM exited before readiness.')
    status = Path('/proc') / pid / 'stat'
    if status.exists() and status.read_text().rsplit(')',1)[-1].split()[0] == 'Z':
        startup_failed('vLLM exited before readiness.')
    time.sleep(2)
else:
    startup_failed('vLLM readiness timeout: ' + last_error)
READY

bash baseline/run_expecto_matrix.sh 2>&1 | tee "$EXPECTO_RUN_DIR/matrix.log"
echo "Finished $EXPECTO_DATASET experiment: $EXPECTO_RUN_DIR"
