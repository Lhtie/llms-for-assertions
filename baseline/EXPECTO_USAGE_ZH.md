## Expecto baseline

buggy benchmark 已扩展为 `buggycodes` 97 条、`buggyasrts` 100 条 assert，原有文件位于各组的 `mut_000/`，新增变体位于 `mut_NNN/`，batch 递归扫描。原有样本迁移后 ID 改变，旧输出和 traces 不能直接用于新目录结构。请使用新 output 重新 prepare；旧 generation-traces 不包含新增样本。扩展说明及重新生成 TC 的命令见 [benchmark_expansion](../benchmark_expansion/README.md)。

`pipeline prepare` 和 `pipeline run` 必须显式传入 `--group`，不再默认选择数据集；支持多个 group，例如 `--group buggycodes buggyasrts`。`report` 无需指定 group。

### 配置 assertion 任务的根 spec

`pipeline run` 默认将当前 assertion 的 description 放入根 `spec` 的描述，并要求只表达这条性质，不补充其它方法效果。参数名称和 entry/exit schema 保持原有约定。

默认模板为：

```text
Translate this description into an equivalent Expecto DSL spec: {description}. Express only the stated property; use the method code only as context.
```

可用 `--root-description` 自定义描述模板，`{description}` 会替换为当前样本的 description，其它花括号保持原样。例如在原来的 run 命令后添加：

```bash
--root-description 'Translate this description into an equivalent Expecto DSL spec: {description}. Express only the stated property; use the method code only as context.'
```

要复现实验中的旧根描述，可使用 `--root-description 'This is entry point of the specification'`。每条样本的展开描述保存在 `root_description.txt`，实际模型消息仍见 `generation_feedback.jsonl`。此设置会写入运行配置和缓存 fingerprint；改变设置后旧缓存不会被误用。对照实验建议使用新的输出目录。

原生 Defects4J 默认描述不变；Python 的 `generate_spec_per_method(..., root_description=...)` 和 `defects4j_tree_search(root_description=...)` 也接受自定义根描述。

### 启动 Docker

在宿主机的项目根目录执行：

```bash
docker pull prosyslab/expecto-artifact
docker run --rm -it -v "$PWD:/repo" -w /repo prosyslab/expecto-artifact zsh
```

进入容器后：

```bash
python3 -m pip install -r baseline/expecto_batch/requirements.txt
export TOGETHER_API_KEY='你的 Together API key'
```

### buggycodes + buggyasrts：GPT-OSS-120B，不加 TC

下面通过 `--group buggycodes buggyasrts` 显式处理两个目录的全部 assert。已使用[新版 batch prompt](baseline/expecto_batch/prompts.py)：参考 method code，将当前 description 翻译成 formal spec。Ground truth 使用文件中的原始 assert，包括故意改错的版本。

```bash
cd /repo
python3 -m baseline.expecto_batch.pipeline prepare \
  --group buggycodes buggyasrts \
  --output baseline/expecto-results/buggy-gpt-oss-no-tc
python3 -m baseline.expecto_batch.pipeline run \
  --group buggycodes buggyasrts \
  --output baseline/expecto-results/buggy-gpt-oss-no-tc \
  --model together/openai/gpt-oss-120b \
  --no-memo --max-tokens 8192 --reasoning-effort medium
```

### buggycodes + buggyasrts：GPT-OSS-120B，加 TC

使用已有的 `generation-traces.json`，生成阶段每条 assert 提供 3 个正例。样例由 Randoop 生成独立的新旧状态，并按原始 assert 标注；不是执行目标方法得到的真实调用记录。

```bash
cd /repo
python3 -m baseline.expecto_batch.pipeline prepare \
  --group buggycodes buggyasrts \
  --output baseline/expecto-results/buggy-gpt-oss-tc
python3 -m baseline.expecto_batch.pipeline run \
  --group buggycodes buggyasrts \
  --output baseline/expecto-results/buggy-gpt-oss-tc \
  --model together/openai/gpt-oss-120b \
  --no-memo --max-tokens 8192 --reasoning-effort medium \
  --traces baseline/expecto_batch/testcases/generation-traces.json \
  --require-traces
```

如需重新生成 TC：`python3 -m baseline.expecto_batch.testcases --seconds 3 --seeds 0 1 2 --jobs 2 --force`。

两个版本都会在生成后翻译 DSL，并用 Java/Randoop 与 ground truth 比较。结果见各自输出目录的 `results.csv`、`summary.json`；每条的实际 prompt 见 `generation_prompt.txt`。`no_counterexample` 仅表示有限测试未发现差异。

只跑一个目录时，在 `prepare` 和 `run` 中都使用 `--group buggycodes` 或 `--group buggyasrts`；试跑可加 `--limit 1`。每个输出目录只需 `prepare` 一次，续跑直接执行同一条 `run`；失败结果也会缓存，重试加 `--force`。

### 官方 Defects4J：不加 TC

仍在同一容器内，使用镜像自带的数据和官方 `openai/gpt-4.1-mini` 模型。此入口使用官方方法级 prompt，不使用上面的 batch prompt。

```bash
export OPENAI_API_KEY='你的 OpenAI API key'
cd /workspace/expecto-artifact
test -f datasets/defects4j.jsonl

# 限制官方评价阶段的并发；通过 JSON 配置加载。
cat > /tmp/expecto-lowmem.json <<'JSON'
{"MAX_CONSUMER_PROCESSES": 2, "MAX_SUBPROCESS_CONCURRENT": 2, "MAX_SANDBOXES": 2}
JSON
export EXPECTO_CONFIG_FILE=/tmp/expecto-lowmem.json

python3 scripts/executor.py \
  --task defects4j --solver defects4j_tree_search \
  --model openai/gpt-4.1-mini \
  --base_dir /repo/baseline/expecto-results/official-defects4j \
  --exp_name no-tc \
  --n_completions 3 --max_attempts 5 \
  --max_connections 2 --max_subprocesses 2 --max_sandboxes 2 \
  --dsl --use_memo \
  --scorers defects4j --export-sample-results \
  --sample-results-benchmark defects4j --sample-results-variant without_tc
```

不传 `--use_test_cases` 即生成时不加 TC；评价仍使用官方执行记录。省略 `--limit` 跑全部方法，试跑加 `--limit 1`。结果保存在挂载的 `baseline/expecto-results/official-defects4j/` 下；降低并发不消除上游全量加载数据的内存开销。

### c2s_aug_sub + naturalness：GPT-OSS-120B，不加 TC

在同一个 Docker 容器内，项目根目录执行。每个输出目录只准备一次：

```bash
cd /repo
for group in c2s_aug_sub naturalness; do
  python3 -m baseline.expecto_batch.pipeline prepare \
    --group "$group" \
    --output "baseline/expecto-results/${group}-gpt-oss-no-tc"
done
```

运行全部样本（续跑也使用这一段）：

```bash
for group in c2s_aug_sub naturalness; do
  python3 -m baseline.expecto_batch.pipeline run \
    --group "$group" \
    --output "baseline/expecto-results/${group}-gpt-oss-no-tc" \
    --model together/openai/gpt-oss-120b \
    --no-memo --max-tokens 8192 --reasoning-effort medium \
    --test-seconds 30
done
```

已有 `testcases/generation-traces.json` 仅适用于 buggycodes/buggyasrts；这两个新目录使用下面的 extended TC 文件。


### c2s_aug_sub + naturalness：加 TC

采集结果保存在 `baseline/expecto_batch/testcases/extended/`，无需重复采集即可使用。每条 assert 独立运行 Randoop，以原始 assert 的真假作为正负标签；同 buggy benchmark，Expecto 生成阶段只使用最多 3 个正例。负例和剩余 heldout 保留供分析。

重新采集或续跑（不调用 LLM）：

```bash
python3 -m baseline.expecto_batch.testcases \
  --group c2s_aug_sub naturalness \
  --output baseline/expecto_batch/testcases/extended \
  --seconds 3 --seeds 0 1 2 --jobs 2
```

在配置好 `TOGETHER_API_KEY` 的 Docker 内启动 TC batch：

```bash
cd /repo
for group in c2s_aug_sub naturalness; do
  out="baseline/expecto-results/${group}-gpt-oss-tc"
  if [ ! -f "$out/manifest.jsonl" ]; then
    python3 -m baseline.expecto_batch.pipeline prepare \
      --group "$group" --output "$out"
  fi
  python3 -m baseline.expecto_batch.pipeline run \
    --group "$group" --output "$out" \
    --model together/openai/gpt-oss-120b \
    --no-memo --max-tokens 8192 --reasoning-effort medium \
    --traces baseline/expecto_batch/testcases/extended/generation-traces.json \
    --require-traces --test-seconds 30
done
```

`--require-traces` 防止没有正例的有效样本静默退化成无 TC 运行。缺少 NL description 的 8 条内部 assert 仍标记 unsupported。TC 是独立构造 old/new/参数/返回值后求值的状态样例，不是目标方法的真实调用轨迹；因此是利用 ground truth 标签的生成实验。异常单独计数，不作负例。最终 compare 仍独立执行 Randoop；本次没有增加 heldout 批量评分入口。

### 只重试 preparation_error

`preparation_error` 表示调用 LLM 前的输入检查失败。TreeSet 曾因 CRLF 换行在 `read_text()` 中被转换，导致源码哈希误报变化；现已统一按原始字节校验，真实源码修改仍会被拒绝。缺少 description 的样本记为 `unsupported`。

修复代码后，不必重新 prepare，可只重试已有的失败项，保留其他样本的结果：

```bash
python3 -m baseline.expecto_batch.pipeline run \
  --group naturalness \
  --output baseline/expecto-results/naturalness-gpt-oss-no-tc \
  --status preparation_error \
  --model together/openai/gpt-oss-120b \
  --no-memo --max-tokens 8192 --reasoning-effort medium
```

`--status` 根据已保存的 result.json 筛选，在 `--limit` 之前应用。TC 任务重试时须同时保留原来的 `--traces`、`--require-traces` 等运行参数。

比较入口统一后，旧结果目录中的 FuzzTest.java 仍是历史文件；重新执行比较才会生成新版本。已有 TC 的内容不变，TC 采集程序仍保留状态工厂。


### 统一 equivalence metric

四个数据集现在都由 `compare.py` 直接复用 `checkers/equivchecker.py` 的 `javacode` 模板，以及相同的 javahelper 展开逻辑和 Randoop 结果判定。默认预算 30 秒，Randoop 仅注册 `fuzztests.FuzzTest`。两个公式相等时 normalpost 为 true；normalpost 为 null/false 时抛异常。仅当进程成功且标准输出包含 `No error-revealing tests to output` 时 `equivalent=true`，其余执行结果为 false；编译/执行失败仍保留具体错误状态。
