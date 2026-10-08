# c2s_aug_sub / naturalness TC 采集结果

每条有效 assert 独立运行 Randoop：每个种子 3 秒，种子 0、1、2，并发 2。标签来自文件中的原始 assert。没有调用 LLM。

| 数据集 | 有效样本 | 正例状态 | 负例状态 | 选中正例 | 选中负例 |
|---|---:|---:|---:|---:|---:|
| c2s_aug_sub | 96 | 38571 | 22629 | 288 | 288 |
| naturalness | 39 | 6735 | 5037 | 117 | 114 |

135 条有效样本均选出 3 个正例，134 条另选出 3 个负例。官方 Expecto TC 分支只使用最多 3 个 corrects；incorrects 和 heldout 保留供分析。

全部 72972 个唯一状态通过 schema 类型校验；examples 与 heldout 不重叠；所有种子正常结束。34 种不同 observer mapping 的代表样例通过上游纯转换函数及 DSL 类型检查（隔离执行纯转换函数，未启动 Z3/LLM）。Java 回归检查覆盖旧 benchmark 行为、旧状态读取、null 返回值和 long 高低位投影。

集合类复用旧 buggy benchmark 的 Randoop 工厂；TreeSet 排除 null。非集合类使用扩展 observer 工厂，BitSet 下标覆盖 -2、-1、0、1、length±1、16。样例为独立生成的 old/new/参数/返回值，不是执行目标方法的真实轨迹；是 ground-truth-guided 设置，不保证状态可达、均匀采样或逻辑等价。求值或序列化异常单独计数，不作为负例。

## 没有负例的样本

`naturalness.UnionFind.addElement.c28c2e3032f6` 的原 assert 为 `!this.contains(element) => element.equals(this.find(element))`。当元素存在时蕴含前件为假，结果为 true；当元素不存在时 find 会抛异常，因此采集到正常 true 和异常，没有把异常伪装成 false。该条仍有 3 个正例，可以按官方 TC 设置运行。

## 缺少 NL description 的内部 assert

以下 8 条沿用 batch 的 unsupported 状态，不提供 generation traces：

- `c2s_aug_sub.ArrayDeque.circularClear.90105abfcffb`：`c2s_aug_sub/ArrayDeque.java:273`，assert has no immediately preceding @@@ description
- `c2s_aug_sub.ArrayDeque.circularClear.91283b420379`：`c2s_aug_sub/ArrayDeque.java:274`，assert has no immediately preceding @@@ description
- `c2s_aug_sub.ArrayDeque.DeqSpliterator.a8596cbb77d9`：`c2s_aug_sub/ArrayDeque.java:962`，assert has no immediately preceding @@@ description
- `c2s_aug_sub.ArrayDeque.DeqSpliterator.bdd259280c81`：`c2s_aug_sub/ArrayDeque.java:963`，assert has no immediately preceding @@@ description
- `c2s_aug_sub.HashMap.clone.03cdfa9a1093`：`c2s_aug_sub/HashMap.java:673`，assert has no immediately preceding @@@ description
- `c2s_aug_sub.PriorityQueue.removeAt.3ec77827a508`：`c2s_aug_sub/PriorityQueue.java:592`，assert has no immediately preceding @@@ description
- `c2s_aug_sub.PriorityQueue.siftDownComparable.f12477fe8478`：`c2s_aug_sub/PriorityQueue.java:663`，assert has no immediately preceding @@@ description
- `c2s_aug_sub.PriorityQueue.siftDownUsingComparator.7863c308b21c`：`c2s_aug_sub/PriorityQueue.java:683`，assert has no immediately preceding @@@ description

## 文件和命令

- `generation-traces.json`：给 batch `--traces` 使用。
- `summary.json`：每条断言的样例数、种子预算和执行结果。
- `validation.json`：离线校验汇总。
- 每条样本目录保留 `cases.json`、`examples.json`、`heldout.json`、原始 seed 数据、Java harness 和日志。

采集及启动 TC batch 的完整命令见 [使用说明](../../../EXPECTO_USAGE_ZH.md)。
