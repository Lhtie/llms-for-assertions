# Fun2Spec 在本仓库 Java 数据上的适配

论文 PDF 保存在 [`../fun2spec.pdf`](../fun2spec.pdf)。Fun2Spec 原文面向 C++，通过“代码挖掘、契约生成、解析/编译、测试验证、错误反馈重试”生成并验证后置条件。本适配保留这条流程，把语言和验证器映射到本仓库现有的 Java 工具链；它不是原论文实现的逐行复刻。

## 数据对应关系

本仓库每个目标 assertion 都以 `// @@@` 开始，下一行通常是 `// assert ...;`。前者作为 NL 描述，后者作为 ground truth。`mut_###` 是变体分组；同一数据结构的多个变体仍按独立条目保存。清单记录源文件和行号，不复制大型 Java 类。

生成/更新清单：

```bash
python3 baseline/fun2spec/prepare_dataset.py
```

只处理部分数据集：

```bash
python3 baseline/fun2spec/prepare_dataset.py \
  --datasets naturalness c2s_aug buggyasrts buggycodes
```

默认输出为 `baseline/fun2spec/dataset_manifest.jsonl`，每行含数据集、mutation group、Java 源文件、类名、NL 描述、ground-truth assertion 和行号。没有相邻 `// assert` 的 NL 注释也会进入清单，`ground_truth` 记为 `null`。

## 提示模板

`run_java.py` 不调用仓库原有的 `prompting.py` 模板。它采用论文 Appendix A 的 Fun2Spec 指令结构，并把 C++ 函数、`POST(...)`、量词、返回值和单条后置条件等要求改写为 Java 及本仓库 checker 能解析的形式。输入保留 `// @@@` 后的 NL 描述和目标方法上下文，但会从 prompt 中移除紧邻的 ground-truth assertion，避免答案泄漏。模型返回 `POST(predicate)`；运行器解包为 `assert predicate;` 后交给现有 Java checker。

论文正文提到使用四个带逐步推理的 few-shot 示例，但 Appendix A 公布的 prompt instructions 没有给出这些示例的完整内容。因此该适配只复用了论文公开的指令模板，没有拿仓库自身的 `eg_java` 示例冒充论文示例。

## 与论文流程的映射

| Fun2Spec 阶段 | 本仓库适配 |
|---|---|
| Code Miner | `prepare_dataset.py` 索引每个 Java NL/assertion 对；`utils/dispatch.py` 将多 assertion 类拆成 checker 可独立处理的输入。 |
| LLM Generator | `main.py` / `prompting.py` 根据 `// @@@` 及 Java 代码生成 JML 风格 assertion。 |
| Parser / Translator | `checkers/nullchecker.py` 与 `codehelper/javahelper.py` 解析并转换 `\\old`、量词和蕴含等语法。 |
| Compile / Test | `checkers/compilechecker.py` 检查可编译性；`checkers/fuzzchecker.py` 用 Randoop 生成测试并检查 assertion。由于这些数据没有 Fun2Spec 所需的完整项目单测映射，用 Randoop fuzz 作为测试有效性的近似。 |
| Refinement feedback | `run_java.py` 将 parse、compile、Randoop fuzz 的失败阶段反馈给模型，并按 `--max-retries` 重试；每次尝试都会立即保存。 |

## 运行 Java 适配流程

先把带 `// @@@` 的源文件 dispatch 成每个文件一个 assertion 的输入，再运行迭代生成器。例如：

```bash
python3 utils/dispatch.py \
  --infile datasets/naturalness/mut_000/TreeSet.java \
  --datasets datasets \
  --outdir javacodes/fun2spec \
  --write

python3 baseline/fun2spec/run_java.py \
  --codedir javacodes/fun2spec \
  --datasets datasets \
  --modellist gpt-oss-api \
  --temp 0.6 \
  --max-retries 5 \
  --write
```

`--modellist` 使用 `llm.py` 中已有的模型别名。输出默认写到 `results/fun2spec/<模型名>/fun2spec-<温度>/`，包含每次生成的原始回答、提取出的 assertion，以及记录各轮验证结果的 `.fun2spec.json`。checker 的 parse/compile/fuzz 失败会触发重试；如果 checker 本身抛出异常，异常类型和消息也会记录为失败阶段并反馈。模型 API 的密钥仍由现有 `keysecrets.py` 或环境变量提供。

运行中断后可在相同参数下加 `--resume` 续跑：已成功、已跳过或已用完重试次数的输入会保留并跳过；其余输入从已保存的下一轮尝试继续。每次尝试结束都会更新原始回答、提取结果和 JSON 检查点。默认不加 `--resume` 时仍从头运行并覆盖对应输出。

```bash
python3 baseline/fun2spec/run_java.py \
  --codedir javacodes/fun2spec \
  --datasets datasets \
  --modellist gpt-oss-api \
  --temp 0.6 \
  --max-retries 5 \
  --write \
  --resume
```

这里的 Randoop 检查验证候选在生成测试上是否通过，不保证它符合 NL 意图或等价于 ground truth。可再用 `checker.py` 的 `equiv_check` 单独测 ground-truth 等价性。

## 指标解释

可以按 Fun2Spec 的 test-valid / test-invalid / compile-error 分类统计 checker 报告中的 `validity_scores`、`compile_check` 和 `fuzz_check`。这里的 test-valid 只表示候选 assertion 通过当前 Randoop 测试集，不代表它与意图或 ground truth 等价；语义准确性应另外看 `equiv_res`。NL 缺失或未能提取 assertion 的条目属于 invalid formatting；`true` 或明显恒真的 assertion 应单独作为 trivial 输出统计。

也可以用标准入口分开运行生成和检查：`main.py` 生成候选，`checker.py` 做 parse、compile、fuzz 和等价性检查。上面的 `run_java.py` 则用于试验 Fun2Spec 风格的自动反馈重试流程。
