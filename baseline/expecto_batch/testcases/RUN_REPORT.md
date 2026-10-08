# 本次采集结果

全部 86 条 assert 已独立完成 Randoop 采集，均得到至少三个正例和三个负例。每条使用种子 0、1、2，每个种子 3 秒；本次并发 4，未调用 LLM。

| 数据集 | assert 数 | 去重正例 | 去重负例 |
|---|---:|---:|---:|
| buggycodes | 20 | 3392 | 2308 |
| buggyasrts | 66 | 10840 | 9247 |

共 25787 条按样本独立去重的状态记录。生成 examples 共 516 条（每条 assert 正负各三条），其余 25271 条存于各目录 heldout.json。不同 assert 之间不去重。

验证：五项测试通过，包含真实 Java/Randoop 标签与异常隔离、蕴含短路、null 分支、空量词和 old 索引读取。全部 examples 经上游原始值转换函数验证与 entry/exit schema 兼容；全部样本验证了去重计数及 examples/heldout 无交集、无遗漏。所有种子进程正常退出。

状态对由受限工厂构造，不表示真实目标方法执行。HashSet 使用 SetFixture 补充数据集缺失的 iterator；标签仍由原始 assert 求值。详细机制和限制见 README.md。此采集器直接保留 Java 短路求值，与原有 compare 的部分异常折叠行为有区别。上游 Expecto 生成只使用 corrects，暂不使用已保存的 incorrects。
