# 扩展 buggy benchmark 的 TC 采集结果（2026-10-08）

当前 197 条 assertion 全部完成，含 mut_000 中迁移后的原有样本。每条独立用 Randoop 运行种子 0、1、2，每个种子 3 秒，并发 2。未调用 LLM。

| 数据集 | assertion 数 | 正例状态 | 负例状态 | 选中正例 | 选中负例 |
|---|---:|---:|---:|---:|---:|
| buggycodes | 97 | 20675 | 20573 | 291 | 291 |
| buggyasrts | 100 | 25698 | 22009 | 300 | 300 |

各样本内去重后合计 **88,955 个状态**。每条都有 3 个正例和 3 个负例；generation-traces 中共 591 个正例、591 个负例。官方 TC 生成分支只使用 corrects 的最多 3 条，incorrects 和 heldout 保留供分析。

## 验证

- 当前 197 个样本 ID、GT、源码哈希与数据集一致。
- 全部 591 个最终 seed 运行成功结束，无不完整运行。
- 所有 88,955 个状态通过 adapter schema 的递归类型检查。
- 每条的正负计数与 cases 一致；examples 与 heldout 不重叠，合起来覆盖全部 cases；汇总 traces 与各条 examples 一致。
- 结果见 `validation.json`。可从仓库根目录复查：`PYTHONPATH=. python3 baseline/expecto_batch/testcases/buggy-expanded/validate.py`（需要 batch requirements）。

## 状态工厂修正

首轮发现部分变体的初始化方法本身被修改，导致工厂只能产生空对象或未合并的集合。对 10 条受影响的 buggycodes 样本进行了同预算重采：BitSet 改用 valueOf 初始化位模式；TreeSet 使用 backing map 和原 PRESENT 标记；Trie 构造节点、前缀计数和终止标记；UnionFind 设置合法 parent/rank/count。后三者仅在 TC 初始化时通过反射设置数据集类的内部状态，observer 仍调用数据集实现。TreeSet 的集合专用工厂也做了对应修改。

四类工厂各用 256 个 selector 状态与干净实现对照通过；重采 ID 见 `state-fixture-validation.json`。数据集源码、GT 和 compare 的 metric 均未改动。其他样本保留原有状态工厂；HashSet 继续使用已记录的只读 iterator fixture。

这些 TC 是独立构造的 old/new/参数/返回值，不是执行目标方法获得的实际轨迹。正负标签来自目标 assert（包括故意改错版本）；异常单独记录，不作为 false。这是有界且由 GT 指导的样例采集，不证明状态可达、覆盖完备或逻辑等价。

## 使用

在 Expecto batch 的 run 命令后添加：

```bash
--traces baseline/expecto_batch/testcases/buggy-expanded/generation-traces.json \
--require-traces
```

重采命令：

```bash
python3 -m baseline.expecto_batch.testcases \
  --group buggycodes buggyasrts \
  --output baseline/expecto_batch/testcases/buggy-expanded \
  --seconds 3 --seeds 0 1 2 --jobs 2
```

工具代码变化会使相关缓存指纹失效。当前结果经历了首轮采集和定向修正重采，今后用当前工具重采时，部分旧工具指纹记录可能重新运行；不会影响直接通过 `--traces` 使用已验证结果。
