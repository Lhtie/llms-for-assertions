# Running the Expecto Baseline

## 1. Start Docker

From the repository root on the host:

```bash
docker pull prosyslab/expecto-artifact
docker run --rm -it -v "$PWD:/repo" -w /repo prosyslab/expecto-artifact zsh
```

Inside the container:

```bash
cd /repo
python3 -m pip install -r baseline/expecto_batch/requirements.txt
export TOGETHER_API_KEY='your Together API key'
```

Select the dataset once; all subsequent commands use these variables:

```bash
EXPECTO_GROUP=c2s_aug_sub
EXPECTO_TC="baseline/expecto_batch/testcases/${EXPECTO_GROUP}-unit"
EXPECTO_OUT="baseline/expecto-results/${EXPECTO_GROUP}-gpt-oss-unit-tc"
```

Supported datasets: `c2s_aug_sub`, `c2s_aug`, `buggycodes`, `buggyasrts`, `naturalness`, and `examples`.

## 2. Generate Test Cases

```bash
python3 -u -m baseline.expecto_batch.testcases \
  --group "$EXPECTO_GROUP" --output "$EXPECTO_TC" \
  --label-mode groundtruth \
  --seconds 3 --seeds 0 1 2 --jobs 4
```

This executes the target methods and records input states, output states, and return values. The reference assertion labels normal executions as positive or negative; exceptions are recorded separately. Up to three positive examples per task are selected for generation and saved in `$EXPECTO_TC/generation-traces.json`.

Matching test-case caches are reused. Add `--force` to regenerate them.

## 3. Prepare the Dataset

```bash
python3 -m baseline.expecto_batch.pipeline prepare \
  --group "$EXPECTO_GROUP" --output "$EXPECTO_OUT"
```

Preparation creates the task manifest, DSL-compatible schemas, and generation inputs. Run it once for each new output directory. If source files change, regenerate the test cases and prepare a new output directory.

## 4. Run Generation and Evaluation

```bash
python3 -u -m baseline.expecto_batch.pipeline run \
  --group "$EXPECTO_GROUP" --output "$EXPECTO_OUT" \
  --model together/openai/gpt-oss-120b \
  --no-memo --max-tokens 8192 --reasoning-effort medium \
  --traces "$EXPECTO_TC/generation-traces.json" \
  --require-traces --test-seconds 30
```

The pipeline generates a DSL specification for the stated natural-language property, translates it into a Java/JML-like assertion, and compares it with the reference using Randoop. Results appear in `$EXPECTO_OUT/results.csv`, `results.jsonl`, and `summary.json`. `no_counterexample` means that finite testing found no difference; it is not a formal equivalence proof.

Repeat the same command to resume. Results with matching configuration fingerprints are skipped, including cached failures. Changes to settings, traces, or relevant tool code can invalidate the cache. Add `--limit 1` for a trial run, or `--force` to rerun selected tasks. To retry only failures, combine `--status generation_error translation_error compile_error preparation_error` with `--force`.

For generation without test cases, use a separate output directory, prepare it as above, and omit `--traces` and `--require-traces` from the run command. With `--require-traces`, tasks lacking positive examples are recorded as errors rather than silently switching to generation without test cases.

## Run all three settings inside the prosyslab container

Assume CHTC/HTCondor has already started `prosyslab/expecto-artifact` and the
project is present in the job's writable working directory. From the repository root:

```bash
bash baseline/run_expecto_matrix.sh --check-env
bash baseline/run_expecto_matrix.sh
```

The default runs **inside the existing container**. It never invokes Docker,
apt, systemctl, or sudo. It locates the repository from the script path; `/repo`
is not required. The environment check installs the three batch parser dependencies
in a unique writable temporary directory, checks Java and DSL imports, then exits
without generating testcases or making LLM calls. Network access to PyPI is
required for dependency installation, and Together access is required for generation.

The launcher uses `TOGETHER_API_KEY` if set; otherwise it reads the string literal
`together_key` from the repository-root `keysecrets.py`. Keys are not printed.
The complete repository must be available, including local
`baseline/expecto-artifact` sources, the four datasets, and JARs under
`java-testgen` and `java-thirdparty`. Arrange file transfer and output return in
the CHTC submit file; container startup is managed by HTCondor, not this script.

The matrix covers `c2s_aug_sub`, `buggycodes`, `buggyasrts`, and `naturalness`,
with `no-tc`, `tc`, and `unit-tc` settings for each dataset (12 runs).
Both TC settings collect at most **three distinct positive examples and zero
negatives** per task, with ground-truth labels. Independent TC constructs old/new
states, arguments and returns; unit TC invokes the real method. Collection stops
retaining cases after three positives; failed or negative candidate probes may
still be attempted to locate those positives. No extra positives or heldout
cases are saved. If bounded search finds fewer than three, the actual count is
kept; tasks with zero positives fail trace preflight rather than reverting to no-TC.
All settings use the default NL-translation prompt and the same current checker,
seed 0 and 30-second evaluation budget.

Outputs are isolated from earlier experiments:

- Results: `baseline/expecto-results/matrix-<run-id>/<dataset>-<setting>/`
- Testcases: `baseline/expecto-results/matrix-<run-id>/testcases/<dataset>-<setting>/`

To resume, reuse the run ID printed at startup:

```bash
EXPECTO_RUN_ID=my-experiment bash baseline/run_expecto_matrix.sh
```

A new run ID collects fresh cases; the same ID reuses matching collection caches
and completed pipeline results. Optional variables: `EXPECTO_TC_JOBS` (4),
`EXPECTO_TEST_SECONDS` (30), `EXPECTO_MODEL` (`together/openai/gpt-oss-120b`).
For a trial, `EXPECTO_LIMIT=1` limits LLM evaluation to one task per dataset/setting;
testcase collection still covers all tasks.

On a local host that should start Docker itself, explicitly use:

```bash
bash baseline/run_expecto_matrix.sh --docker
```

Only `--docker` may install/start Docker and require sudo. It uses
`EXPECTO_IMAGE` (default `prosyslab/expecto-artifact`) and mounts the project.
Do not use `--docker` inside a CHTC execution container.

## CHTC: transfer a project archive and unpack inside the original image

Prepare `project.tar.gz` from the project root (the exclusions avoid old reports
and huge testcase caches; the source collector remains included):

```bash
tar --exclude='./.git' --exclude='./results' \
    --exclude='./baseline/expecto-results' \
    --exclude='./baseline/expecto_batch/testcases' \
    --exclude='./project.tar.gz' --exclude='__pycache__' \
    -czf project.tar.gz .
```

Include `keysecrets.py` with `together_key`, local `baseline/expecto-artifact`
sources, datasets and Java JARs. Put these three files in the CHTC submission
directory:

- `project.tar.gz`
- `baseline/run_expecto_matrix.sh` copied as `run_expecto_matrix.sh`
- `baseline/expecto_chtc.sub` copied as `expecto_chtc.sub`

Submit from the CHTC access point:

```bash
chmod +x run_expecto_matrix.sh
condor_submit expecto_chtc.sub
```

HTCondor starts `prosyslab/expecto-artifact`; the wrapper unpacks the archive,
finds the project regardless of whether the archive includes a top-level folder,
and runs the 12-setting matrix. No Docker command or sudo is used in the job.
If running manually inside an already started container, the equivalent command is:

```bash
bash run_expecto_matrix.sh --archive project.tar.gz experiment1
```

The returned `expecto-output/` contains `run-id.txt`, `exit-code.txt` and
`results-and-testcases.tar.gz`. Outputs are packaged on normal completion and
ordinary script failures; scheduler eviction or forced termination is not a
checkpoint guarantee. The results archive excludes source code and keysecrets.py.
The supplied submit file requests 30GB disk; increase it to fit your input archive,
unpacked project, container and generated files. Container Python dependency
installation and Together generation require outbound network access.

Archive mode also copies the current run into the job working directory at
`expecto-results/matrix-<run-id>/`, including testcases, on exit. Set
`transfer_output_files = expecto-results, expecto-output` in your HTCondor submit file.

## C2S Sub prompt experiment: pipeline few-shot examples and JML syntax

Inside the original Expecto container, from the project root:

```bash
EXPECTO_RUN_ID=c2s-sub-pipeline-fewshot \
EXPECTO_GROUPS=c2s_aug_sub \
EXPECTO_PROMPT_VARIANT=pipeline-fewshot \
EXPECTO_TRACE_SOURCE=baseline/expecto_batch/experiment_inputs/matrix-chtc-20261020-140827 \
bash baseline/run_expecto_matrix.sh
```

This runs all three settings on C2S Sub, holding generation traces fixed to the
previous matrix (the two trace files are bundled in `experiment_inputs`). Outputs
are separate at `baseline/expecto-results/matrix-c2s-sub-pipeline-fewshot/`.
The generation prompt uses `prompting.transform`'s default Java instructions and
all four original few-shot examples, including JML syntax rules. An explicit
adapter instruction asks for Expecto DSL output instead of the JML `<code>`
format. The upstream DSL system prompt, predicate signature, root description,
refinement algorithm, model defaults and scoring remain unchanged. This is a
prompt-content ablation, not direct JML generation. The reference assertion is
never supplied in the current-task prompt. An example prompt is saved at
`results/summary/expecto_c2s_pipeline_fewshot_prompt.txt`.

For archive-based CHTC execution, use the same environment variables before:

```bash
bash run_expecto_matrix.sh --archive project.tar.gz c2s-sub-pipeline-fewshot
```

Rebuild the project archive after updating the code; `pack_expecto.sh` now includes
`prompting.py` and the bundled trace files. The prompt variant and hash of
`prompting.py` are saved in each result configuration and cache fingerprint.

### Naturalness with the pipeline prompt (all three settings)

Repack the updated project, then inside the Expecto container run:

```bash
bash run_expecto_matrix.sh --archive project.tar.gz --naturalness-pipeline-fewshot
```

For an already unpacked project:

```bash
bash baseline/run_expecto_matrix.sh --naturalness-pipeline-fewshot
```

This runs Naturalness no-TC, TC, and unit-TC with the pipeline few-shot/JML
instructions adapted to DSL output. It reuses the original matrix's bundled
Naturalness examples (78 tasks, three positives each, zero negatives). Results
are isolated at `baseline/expecto-results/matrix-naturalness-pipeline-fewshot/`;
archive mode copies this run into the outer `expecto-results/` directory on exit.

To run only Naturalness pipeline-fewshot no-TC and unit-TC, skipping ordinary TC:

```bash
bash run_expecto_matrix.sh --archive project.tar.gz --naturalness-pipeline-fewshot --skip-tc
```

Repack after updating the script. Inside an unpacked project use
`bash baseline/run_expecto_matrix.sh --naturalness-pipeline-fewshot --skip-tc`.

## Buggycodes: targeted, mutation-oriented unit tests

Generated data is stored separately at:

```text
baseline/expecto-results/targeted-mutant-traces/testcases/buggycodes-targeted-unit-tc/
```

To reproduce collection in an environment with Java and the batch parser dependencies:

```bash
python3 -u -m baseline.expecto_batch.targeted_testcases --jobs 4
```

The default uses the saved buggycodes unit-TC manifest. If that manifest is not
available, prepare a new buggycodes manifest with `pipeline prepare` and pass its
path with `--manifest`. The collector validates source hashes and reuses matching
execution caches; use `--force` to regenerate, or `--sample-id` for one testpoint.
Healthy reference source files from `datasets/c2s_aug` and
`datasets/naturalness/mut_000` must also be present to reproduce the reference IO.

The collector evaluates GT on real mutant executions and exports at most three
GT-failing traces. Reference=true/mutant=false witnesses with the same entry
state are preferred. No GT-passing fallback or reference output is supplied.
GT-evaluation exceptions are recorded separately, not treated as GT=false.
Java 11 uses local compile copies without the source-only @java.io.Serial annotation.

### Run Buggy Code or Buggy Asrt with targeted GT-failing traces

Buggy Asrt uses the actual dataset implementation and evaluates each sample's
mutated GT. Inputs on which that GT is false provide distinguishing examples
against a candidate equivalent to the mutated GT. Every supplied trace comes
from that execution; reference outputs are not supplied. The shared collector
prioritizes confirmed reference/mutant regressions when available, but Buggy
Asrt can have identical implementation behavior on both sides, so actual
GT-failing corner cases remain eligible without any implementation difference.

Start local vLLM and run only Buggy Asrt targeted tests:

```bash
bash run_expecto.sh --model gpt-oss-120b --dataset buggyasrts --targeted-unit-tc
```

Using the configured API backend in the Expecto environment:

```bash
bash baseline/run_expecto_matrix.sh --buggyasrts-targeted-unit-tc
```

Archive mode: `bash run_expecto.sh --archive project.tar.gz --buggyasrts-targeted-unit-tc`.
To collect only the testcases, pass `--group buggyasrts` to
`python3 -m baseline.expecto_batch.targeted_testcases` (optionally `--manifest`
and `--output`). Runs create a `buggyasrts-targeted-unit-tc` results directory and
its own testcase subdirectory. Rebuild the project archive after updating code.

From the project directory, to start local vLLM and run only the targeted setting:

```bash
bash run_expecto.sh --model gpt-oss-120b --dataset buggycodes --buggycodes-targeted-unit-tc
```

The root entry forwards `--model` runs to the local GPU launcher; without
`--model` it forwards to the matrix runner using its configured API backend.

```bash
bash baseline/run_expecto_matrix.sh --buggycodes-targeted-unit-tc
```

In CHTC with the rebuilt project archive and updated outer script:

```bash
bash run_expecto_matrix.sh --archive project.tar.gz --buggycodes-targeted-unit-tc
```

This preset creates a fresh manifest and selects up to three GT-failing mutant
execution traces per task at runtime (`mutant_gt_failing_v3`). The upstream API
calls these must-accept constraints `corrects`; the field does not claim GT
correctness. `incorrects` is empty. Tasks without eligible traces are reported
individually as `trace_collection_error`; other tasks continue to generation.
This tests consistency with buggy implementation behavior and may conflict with
NL requirements. Missing witnesses are not proof that a mutant is correct.

Old targeted testcase folders have been removed; rebuild the archive with
`bash baseline/pack_expecto.sh` to avoid transferring the old bundled examples.
The run ID defaults to `buggycodes-targeted-mutant-<timestamp>`. Results and new
testcases are under `baseline/expecto-results/matrix-<run-id>/`; archive mode
copies the run to the outer `expecto-results/` as usual.

## Local GPT-OSS-120B through a persistent vLLM server

The local launcher allocates a short private `/tmp/er.XXXXXX` directory and
passes it as `RAY_TMPDIR` to vLLM and its workers. This avoids Ray Unix socket
filenames exceeding the 107-byte limit under deep CHTC scratch paths. The path
is recorded in `vllm-config.json` and cleaned up on launcher exit; experiment
results continue to use `baseline/expecto-results/`.

Expecto workers should call one persistent GPU model server instead of loading
120B weights again for each testpoint. Start the server in your GPU/vLLM environment
(the path below is a placeholder for your downloaded model directory):

```bash
vllm serve /path/to/gpt-oss-120b --served-model-name gpt-oss-120b --host 0.0.0.0 --port 8000 --tensor-parallel-size 2 --max-model-len 65536 --reasoning-parser openai_gptoss
```

The TP=2 and 65536 context choices mirror the existing `llm.py` configuration;
GPU requirements and quantization support still depend on your actual hardware,
weights and vLLM version. This command belongs in the GPU environment, not the
CPU-only Expecto artifact container. The current vLLM recipe is documented at
https://github.com/vllm-project/recipes/blob/main/OpenAI/GPT-OSS.md .
Confirm the server is ready and advertises `gpt-oss-120b`:

```bash
curl http://127.0.0.1:8000/v1/models
```

Then in the Expecto environment, for buggycodes targeted unit tests:

```bash
bash baseline/run_expecto_matrix.sh --buggycodes-targeted-unit-tc --local-gpt-oss=http://127.0.0.1:8000/v1
```

For archive input:

```bash
bash run_expecto_matrix.sh --archive project.tar.gz --buggycodes-targeted-unit-tc --local-gpt-oss=http://GPU_HOST:8000/v1
```

Replace `GPU_HOST` with an address reachable from the job container. `127.0.0.1`
is the client's own network namespace; it only works when the model service is
reachable there. On CHTC, allocate the GPU job/service through the scheduler;
the Expecto container does not itself start vLLM or request GPUs. A local Docker
container launched using `--docker` may need explicit host networking or a
reachable host address instead of loopback.

The local flag selects `local/gpt-oss-120b` (Inspect model
`openai-api/local/gpt-oss-120b`), disables cloud embedding memo, and skips reading
Together credentials. A dummy local API key is used unless you set
`EXPECTO_LOCAL_API_KEY` to match an authenticated server. Reasoning blocks are
removed from model output before Expecto parses the final DSL answer. The served
model name must match the model name requested by the client.

Local runs use a `local-` run-ID prefix to separate results from Together runs.
The selected endpoint is recorded in result configuration and cache fingerprints.
Use a new explicit run ID if changing weights behind the same endpoint.

For a direct pipeline no-TC trial (prepare the output once first):

```bash
python3 -m baseline.expecto_batch.pipeline prepare --group buggycodes --output baseline/expecto-results/local-gpt-oss-trial
python3 -u -m baseline.expecto_batch.pipeline run --group buggycodes --output baseline/expecto-results/local-gpt-oss-trial --model local/gpt-oss-120b --base-url http://127.0.0.1:8000/v1 --no-memo --max-tokens 8192 --reasoning-effort medium --limit 1
```

Inspect's OpenAI-compatible provider naming is documented at
https://inspect.aisi.org.uk/providers.html#openai-compatible .

## One script: local model + selected dataset

```bash
bash baseline/run_expecto_matrix_local.sh --model /path/to/gpt-oss-120b --dataset c2s_aug --vllm-python /path/to/vllm-env/bin/python --expecto-python /path/to/expecto-env/bin/python
```

`--model` accepts a local weights directory, a Hugging Face model ID, or the aliases
`gpt-oss-120b` / `gpt-oss-20b` (resolved to `openai/<alias>` if no local directory
exists). Local model paths are resolved only against the current working directory. Hub IDs use the GPU environment's HF cache and may download
missing weights; pass `--offline` to require local/cached weights only.
`--dataset` is one of `c2s_aug`
(full C2S), `c2s_aug_sub`, `buggycodes`, `buggyasrts`, or `naturalness`.
The API model alias defaults to the weights directory's basename; override with
`--served-model-name` when needed. For example:

```bash
bash baseline/run_expecto_matrix_local.sh --model /path/to/gpt-oss-120b --dataset naturalness
bash baseline/run_expecto_matrix_local.sh --model /path/to/Qwen2.5-Coder-32B-Instruct --dataset buggycodes
```

If both dependency sets are installed in the current environment, omit the two
Python options. Otherwise the server and client use their respective interpreters;
Missing vLLM is installed automatically: by default in `./.venv-vllm`, or in
the explicit `--vllm-python` environment when provided. The default isolated
environment preserves the original Expecto interpreter. The Expecto environment
and Java/Javac must already be available.

The script starts one persistent vLLM server, waits for its advertised model,
then calls `run_expecto_matrix.sh` for the selected dataset's **no-TC, TC, unit-TC**
settings, using the original Expecto NL prompt. Both TC settings collect fresh
examples (at most three positives and zero negatives), or reuse matching caches
when resuming the same run ID. It does not reuse another experiment's testcase
preset. Only the private vLLM process group is stopped on normal or error exit.
An occupied port is rejected rather than reusing an unrelated service.

GPT-OSS is recognized from its path/name or `config.json` model_type and uses
`openai_gptoss` reasoning parser and medium effort automatically. Other models
have no reasoning parser/effort by default; use `--reasoning-parser` and
`--reasoning-effort` to configure reasoning models such as Qwen3. `none` explicitly
disables these options.

Other options: `--tp 2`, `--context-length 65536`, `--port 8000`,
`--startup-timeout 1800`, `--run-id NAME`, `--limit 1` (LLM trial only; TC collection
still covers all tasks). Default GPU count/context mirror `llm.py`; adjust for
your hardware and model. No Docker or sudo is invoked: run inside an allocated
GPU environment/job with the local weights and Expecto dependencies available.
On CHTC the scheduler must allocate GPUs beforehand.

Default output directory:
`baseline/expecto-results/matrix-local-<dataset>-<model-alias>-<timestamp>/`.
It contains each dataset/setting's results, `testcases/`, `vllm-server.log`,
`vllm-config.json` and `matrix.log`. Model keys use `local/<model-alias>`.

If code or the selected dataset is missing, the launcher automatically extracts
`./project.tar.gz` into the current directory. Use `--archive FILE` to explicitly
extract another project archive. Arrange output transfer in your job wrapper. `pack_expecto.sh` includes this generic launcher and
full C2S sources, but not model weights or Python environments.


The local launcher uses the **current working directory** for all relative model,
project and output paths. It does not change directories or discover a project
root, regardless of the script filename. After extracting the project into the
current directory, the layout should be:

```text
./run_expecto.sh
./gpt-oss-120b/
./baseline/run_expecto_matrix.sh
./datasets/c2s_aug/
```

Then run:

```bash
bash run_expecto.sh --model ./gpt-oss-120b --dataset c2s_aug
```

The model may also be specified as `gpt-oss-120b` when that directory exists here.
Outputs stay under `./baseline/expecto-results/`.

If you initially transfer only `run_expecto.sh`, `project.tar.gz` and the model
directory, the same command automatically extracts the project here first:

```bash
bash run_expecto.sh --model ./gpt-oss-120b --dataset c2s_aug
```

Build the archive with the updated `baseline/pack_expecto.sh` so it includes
`baseline/run_expecto_matrix.sh`, the Python modules and `datasets/c2s_aug/`.

### Automatic vLLM installation

The local launcher checks `import vllm`. If missing, it creates `./.venv-vllm`
and installs the repository-pinned `vllm==0.10.2` there, then starts the server.
Subsequent runs reuse that environment. With `--vllm-python`, the install targets
that explicitly selected interpreter instead. Pip output is saved to
`.expecto-vllm-install.log`; import errors to `.expecto-vllm-import.log`.
Installation requires access to the package index. GPU/driver compatibility
still applies. No activation or separate install command is required:

```bash
bash run_expecto.sh --model ./gpt-oss-120b --dataset c2s_aug
```

When GPT-OSS has no usable system `nvcc`, the local launcher downloads NVIDIA's
CUDA 12.8 compiler, runtime headers/libraries, and CCCL archives into
`./.cuda-12.8`, verifies their SHA256 checksums, and exports the CUDA paths.
This requires outbound HTTPS and a writable, executable job directory, but no
sudo. It does not install GPU drivers or a host C++ compiler. Include the new
`baseline/expecto_batch/bootstrap_cuda.py` when rebuilding `project.tar.gz`.
An explicit `--cuda-home` remains authoritative and is checked without fallback.

For GPT-OSS startup diagnostics the launcher imports `GptOssForCausalLM` before
starting the API server and prints the full underlying exception if that import
fails. `Model architectures [...] failed to be inspected` alone is a wrapper
error, not an out-of-memory diagnosis. Details are retained in
`.expecto-vllm-model-import.log`.
The auto-managed `.venv-vllm` now pins the project's inference stack together:
`vllm==0.10.2`, `transformers==4.57.1`, and `tokenizers==0.22.1`. Existing managed
environments with different versions are repaired automatically; an explicitly
selected, already-importable `--vllm-python` environment is not downgraded.
