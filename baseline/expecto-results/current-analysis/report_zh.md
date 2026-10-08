# 当前 Expecto 结果分析


范围：6 个结果目录、229 个唯一 assertion、458 个运行项。所有 manifest 与 results ID 一致，无 pending。读取保存文件，不重跑模型，不修改结果分类。no_counterexample=correct，counterexample=incorrect，其余=error。

## 汇总


| 数据集 | TC | 总数 | correct | incorrect | error |
| --- | --- | --- | --- | --- | --- |
| buggyasrts | no-tc | 66 | 25 (37.88%) | 38 (57.58%) | 3 (4.55%) |
| buggycodes | no-tc | 20 | 11 (55.00%) | 7 (35.00%) | 2 (10.00%) |
| buggyasrts | tc | 66 | 28 (42.42%) | 22 (33.33%) | 16 (24.24%) |
| buggycodes | tc | 20 | 6 (30.00%) | 4 (20.00%) | 10 (50.00%) |
| c2s_aug_sub | no-tc | 104 | 51 (49.04%) | 20 (19.23%) | 33 (31.73%) |
| c2s_aug_sub | tc | 104 | 55 (52.88%) | 14 (13.46%) | 35 (33.65%) |
| naturalness | no-tc | 39 | 29 (74.36%) | 6 (15.38%) | 4 (10.26%) |
| naturalness | tc | 39 | 34 (87.18%) | 2 (5.13%) | 3 (7.69%) |

buggy 合计：无 TC 36/86 correct、45 incorrect、5 error；有 TC 34/86 correct、26 incorrect、26 error。总体 correct 从 116/229 (50.66%) 到 123/229 (53.71%)，数据集之间 TC 效果不一致。

## 与上一轮的可比性


当前各生成运行均使用新 root-description，测试预算 30 秒。上一轮对话中的 c2s correct 为 14/30、naturalness 为 5/5；当前为 51/55、29/34。但比较器已改变：当前 compare.py 统一使用 javahelper + equivchecker + Randoop，不再有上一轮 observer_compare 路径。输入工厂、异常处理、错误判定和实际覆盖都可能不同，不能把增长全部归因于 prompt。c2s no-tc 的 tool_digest 为 ee47dcd…，其余当前生成为 2b030a…，还存在工具版本差异。

## 配对变化


### buggy


| 无TC→有TC | correct | incorrect | error |
| --- | --- | --- | --- |
| correct | 22 | 0 | 14 |
| incorrect | 11 | 22 | 12 |
| error | 1 | 4 | 0 |

### c2s_aug_sub


| 无TC→有TC | correct | incorrect | error |
| --- | --- | --- | --- |
| correct | 44 | 1 | 6 |
| incorrect | 8 | 12 | 0 |
| error | 3 | 1 | 29 |

### naturalness


| 无TC→有TC | correct | incorrect | error |
| --- | --- | --- | --- |
| correct | 29 | 0 | 0 |
| incorrect | 4 | 1 | 1 |
| error | 1 | 1 | 2 |

naturalness 的原 29 条 correct 全保留，新增 5 条：4 条 incorrect、1 条 error 转 correct，净 +12.82 个百分点，主要在 TreeSet。c2s 新增 11 条 correct、损失 7 条，净 +4（+3.85 个百分点）。buggy 新增 12 条 correct、原有 14 条转 error，净 -2；TC 对生成成功项可能有帮助，但类型失败抵消了收益。

## error 分解


| 数据集 | TC | unsupported | generation_error | translation_error | compile_error |
| --- | --- | --- | --- | --- | --- |
| buggyasrts | no-tc | 0 | 2 | 1 | 0 |
| buggycodes | no-tc | 0 | 0 | 2 | 0 |
| buggyasrts | tc | 0 | 15 | 1 | 0 |
| buggycodes | tc | 0 | 10 | 0 | 0 |
| c2s_aug_sub | no-tc | 8 | 2 | 5 | 18 |
| c2s_aug_sub | tc | 8 | 5 | 7 | 15 |
| naturalness | no-tc | 0 | 1 | 1 | 2 |
| naturalness | tc | 0 | 1 | 0 | 2 |

1. **Java 量词作用域错误**：c2s 18/15 个 compile_error、naturalness 2/2 个，全部出现未定义 __expecto_jml_*。例如 BitSet.and 的旧 observer 被转成 `var OLD_var2=exec(() -> old.get(__expecto_jml_1))`，变量却只在后续 allMatch lambda 内定义；继而还会出现 Object && Object 类型错误。Trie 前缀计数量词也有同样问题。这些不能归因为模型没翻译出正确语义。

2. **TC 的全 null 列表类型问题**：buggy TC 25 个 generation_error 中，23 个是未完成定义，2 个是 worker 崩溃；22 个最终反馈出现 list[nonetype] 与 list[option[int]] 冲突（按最终反馈包含该诊断统计，不代表已证明全部失败仅由此造成）。例如 ArrayList.add 的正例包含 [None,None]，编译器把它当 list[nonetype]，模型随后尝试修改签名又被拒绝。c2s TC 5 个 generation_error 中 3 个最终反馈也出现此冲突。

3. **不支持的 DSL 子集**：无显式体 helper、后状态索引读取 entry observer、无有限范围量词、缺 is_some 保护的 unwrap 等仍导致 translation_error。

## 语义问题是否改善


已有 DSL 显示目标局部化有所改善：例如 c2s ArrayDeque.clone 的不同对象性质可以仅生成 !same_receiver；大量 HashMap/Trie 性质不再扩写成完整方法契约。不过旧/新状态混淆仍突出：clone、toArray 用 entry size/entry elements 替代 GT exit；ArrayList.set 后缀量词以 entry size 替代 GT exit size。

自然语言到逻辑还剩几个清晰反例：
- TreeSet.remove TC 写成 ret==is_some(o)，没有旧 contains。
- TreeSet.pollLast TC 只要求 ret>=旧所有元素，没有成员关系；old={1,2},ret=3 可满足 DSL 而违反 GT。
- buggyasrts ArrayList/Vector.clone 把 !equals（内容不同）写成 !same_receiver（身份不同）。
- PriorityQueue.offer 的 size+1 性质仍多加 ret=true。
- ArrayList.remove TC 的 contains helper 与 DSL 内建函数重名，无法翻译。
- PriorityQueue.retainAll TC helper ElemIn 只有 len(coll)>=0，实际恒真。

## 当前评价标签的两个重要问题


**counterexample 可被其它对象契约污染。** java_equivcheck_passed 仅判断 stdout 是否含 No error-revealing tests to output，未区分错误源。HashSet 构造 DSL 与 GT 形式基本一致仍标 incorrect，保存 ErrorTest 实际断言 set.toArray().length==set.size() 失败。按保存代码标记统计：buggy no-tc 6 项仅对象契约/4 项混合，TC 3 项仅对象契约/2 项混合；c2s 两版各 2 项仅对象契约、3 项混合；naturalness 没有这种标记。其余 exception-only 也不能自动认为是规范不等价，仍需检查异常位置。保持用户指定分类，不据此重新标 correct。

**correct 不保证非空有效状态被充分比较。** 当前不保存 valid/errors/mismatches 覆盖计数；Randoop 的总方法执行次数不能代替进入 FuzzTest 并通过非空对象保护的次数。明确例：c2s TC BitSet.nextClearBit 最终 spec=true，仍标 correct，而 GT fromIndex>=0⇒get(ret)==false 显然非恒真。UnionFind 两版 9/9 correct，但至少 addElement 的 entry/exit 前件静态不同；不能据此认定九条全部等价。这需要调用覆盖/状态计数和有目的的对象工厂核验。

## 建议下一步


优先修复 TC [None,None] 的 option 类型推断和 Java 量词作用域提升；评价只计 harness 中明确的 DSL/GT mismatch，另列对象契约失败；增加有效调用、异常、旧新状态以及真假覆盖计数。之后固定同一个 comparator、工具版本和测试预算，做仅改变根 description 的对照，再判断 prompt 的实际收益。剩余语义训练重点是 entry/exit、单向蕴含与等价、集合 equals/对象身份以及 helper 的量词。

## 按类表现


### c2s_aug_sub


| 类 | 无TC C | 无TC I | 无TC E | 有TC C | 有TC I | 有TC E |
| --- | --- | --- | --- | --- | --- | --- |
| ArrayDeque | 6 | 2 | 4 | 7 | 1 | 4 |
| ArrayList | 10 | 7 | 0 | 9 | 4 | 4 |
| BitSet | 9 | 0 | 21 | 10 | 0 | 20 |
| DefaultListenableGraph | 4 | 0 | 0 | 3 | 0 | 1 |
| HashMap | 12 | 0 | 1 | 12 | 0 | 1 |
| HashSet | 0 | 5 | 0 | 0 | 5 | 0 |
| PriorityQueue | 8 | 6 | 7 | 13 | 4 | 4 |
| Stack | 2 | 0 | 0 | 1 | 0 | 1 |

### naturalness


| 类 | 无TC C | 无TC I | 无TC E | 有TC C | 有TC I | 有TC E |
| --- | --- | --- | --- | --- | --- | --- |
| TreeSet | 5 | 6 | 2 | 10 | 2 | 1 |
| Trie | 15 | 0 | 2 | 15 | 0 | 2 |
| UnionFind | 9 | 0 | 0 | 9 | 0 | 0 |

证据文件：compare.py、checkers/equivchecker.py；BitSet.and 与 Trie.add.5600b759335b 的 compile.log；HashSet.HashSet.56000a245e51 的 counterexamples/ErrorTest0.java；buggy TC ArrayList.add.f57b0e571519 的 generation_feedback.jsonl；BitSet.nextClearBit.c6fef0dac145 的 spec.dsl 和 result.json。per_sample.csv 保存全部 458 个运行项的 description、GT、DSL、candidate、原始状态、编译日志及诊断；标记基于已保存日志，没有运行新的等价证明。
