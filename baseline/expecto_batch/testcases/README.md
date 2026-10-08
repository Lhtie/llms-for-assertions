# 每条 assert 独立生成的 Randoop 状态样例

这些样例的标签由 `datasets/buggycodes`、`datasets/buggyasrts` 各文件的原始 assert 决定，包含故意改错的 assert。`corrects` 表示目标 assert 求值为 true，`incorrects` 表示 false；不表示程序行为正确或错误。生成工具不调用 LLM。

## 生成过程

1. 用与 batch 相同的 Java AST 提取器，为每条 assert 保留稳定 ID；不合并同一方法中的不同 assert。
2. 使用采集工具内的 `oracle_expression` 将本基准的目标 assert 直接转换为 Java：old 表达式读取独立旧对象，有限 forall 转为 IntStream.allMatch，蕴含转为短路逻辑。保留原始 &&/|| 的短路求值，避免 compare 使用的 javahelper 提前求值某些子表达式、把异常折叠为 false。未修改原有 compare，也不修改目标 assert；两者的异常处理并非完全相同。
3. 每条 assert 编译一个独立 `fuzztests.FuzzTest`。Randoop 通过 `methods.txt` 调用 `probe(int,int,int,int)`，四个整数分别驱动旧状态、新状态、方法参数和返回值的构造。
4. 工厂把 Randoop 输入映射为长度 0–5 的集合；元素候选为 null、-1、0、1、2、10、Integer.MIN_VALUE/MAX_VALUE，含重复元素模式。ArrayDeque/PriorityQueue 工厂不插入 null。整数参数覆盖 -1、0、1、旧 size-1、size、size+1 和 int 极值。布尔、集合、数组和 clone 返回值分别投影。优先用集合构造器从 JDK ArrayList 建立状态，避免 buggy add 阻止创建非空对象；Stack 使用 addAll。HashSet 依赖的数据集 HashMap 把迭代器方法留成返回 null 的占位实现，因此使用只读测试子类 SetFixture 补充 iterator，使 equals/toArray 可以访问相同的已插入元素；size/contains 等仍使用数据集实现。这个 fixture 与原样执行数据集类不同，已在每条 result.json 中标注；未修改任何数据集文件。
5. **不执行目标方法来构造前后状态**；old/new 是独立对象。此方案探索有界的 assert 状态空间，不保证状态对可由目标方法执行到达，也不覆盖任意 Java 对象或所有整数。
6. assert 正常求值后写出 entry/exit 状态和布尔标签；异常另计，不能当作 false。序列化也必须成功才保存。每个种子最多保存每类 2000 个唯一状态，继续统计执行次数。
7. 合并三个种子的结果，按完整 adapter 投影状态去重。若同一个投影出现矛盾标签，则报错，不输出可用 traces。
8. 正负例各按状态长度、元素、重复特征及参数值的特征覆盖贪心挑选最多 3 条；其余唯一状态存入 heldout。不是对均匀分布或最大多样性的保证。

## 文件

- `summary.json`：各 assert 的正负例数量、错误状态、种子、执行计数和预算。
- `generation-traces.json`：可直接给 batch `--traces` 使用的汇总。
- `<assert-id>/sample.json`、`adapter.json`：原始标签标准和投影 schema。
- `FuzzTest.java`、`methods.txt`：实际执行代码和 Randoop 入口。
- `raw-seed-*.jsonl`：各个种子保存的标签和状态；计数见 `counts-seed-*.json`。
- `cases.json`：跨种子去重后的全部状态样例。
- `examples.json`：各最多 3 个正负例，用于生成。
- `heldout.json`：剩余正负例，与 examples 按投影状态严格不相交；不代表独立分布采样。
- `compile*.log`、`randoop-seed-*.log`：诊断日志。Randoop 自身的错误测试不等于 assert 负例。

## 重跑

从项目根目录，在安装了 batch requirements、Java 和项目 Randoop jar 的环境运行：

```bash
python3 -m baseline.expecto_batch.testcases --seconds 3 --seeds 0 1 2 --jobs 2
```

默认输出就是本目录。每个 assert、每个种子单独运行 3 秒，编译和 JVM 启动不计入该预算。`--jobs` 是并发 assert 数；Java 堆上限每进程 512 MB（不含全部 JVM 开销）。相同配置和代码的已完成记录可跳过；`--force` 强制重跑。也可指定 `--sample-id ID`。修改预算或种子会改变缓存指纹并重新采集；使用新 `--output` 可以保留旧实验。固定种子使输入探索可追踪，但运行使用墙钟时间预算，并发和机器速度会影响最终探索长度，不保证逐字节重现相同样例集合。

**没有正例或负例只表示当前预算、工厂域和原始 assert 求值语义下没有找到，不证明其不存在。** compile_error/error/no_cases 样本没有可用状态，不能算作已覆盖。原始 ground truth 无法编译或数据集方法缺失时，应明确记录，不能悄悄替换 assert。

## 接入 Expecto

```bash
python3 -m baseline.expecto_batch.pipeline prepare --group buggycodes buggyasrts --output baseline/expecto-results/batch-with-tests
python3 -m baseline.expecto_batch.pipeline run \
  --group buggycodes buggyasrts \
  --output baseline/expecto-results/batch-with-tests \
  --model together/openai/gpt-oss-120b --no-memo \
  --traces baseline/expecto_batch/testcases/generation-traces.json --require-traces
```

需要配置模型 key；以上第二条会调用付费模型，本次采集没有运行它。

上游生成当前只使用前三个 corrects，不使用 incorrects。无正例的样本会因 `--require-traces` 报错，避免混入无样例模式。负例和 heldout 已保留，但本工具不修改现有 compare：compare 仍进行独立的 Randoop 表达式比较，尚未增加 heldout 批量评分入口。

此设置是 **ground-truth-guided** 的生成实验：虽然模型输入没有原始 assert 文本，样例标签源自它。实验报告应明确，不能描述成不利用 ground truth 的生成。


## c2s_aug_sub / naturalness

扩展采集使用 `--group c2s_aug_sub naturalness --output baseline/expecto_batch/testcases/extended`，其余预算和选择规则同上。集合类复用旧 buggy benchmark 的输入工厂（TreeSet 额外排除 null）；BitSet、HashMap、图、Trie、UnionFind 采用 batch 的公开 observer 工厂和 schema，泛型为 Integer。TC 使用 `trace_projection.py` 将这些 observer 序列化，和生成时的 adapter 字段一致；可空 record 在 is_null=true 时其余字段填类型默认值。原始 assert 和投影发生异常时均单独记错，不冒充负例。

输入取值域是有限的；新非集合类工厂不等同于旧 collection 工厂的逐值分布；BitSet 整数参数覆盖 -2、-1、0、1、旧 length±1、16 等边界。新旧 receiver 独立构造，字符串来自包含空串、前缀、非 ASCII 和 surrogate pair 的候选池，BitSet 为有界位集合，long[] 分高低 32 位保存。正负例仍各按同一 diverse 算法挑选最多 3 条；上游仅取 corrects 的前 3 条。

详细采集统计见 [extended/RUN_REPORT.md](extended/RUN_REPORT.md)，Docker 和 batch 命令见 [使用说明](../../EXPECTO_USAGE_ZH.md)。
