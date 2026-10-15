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
