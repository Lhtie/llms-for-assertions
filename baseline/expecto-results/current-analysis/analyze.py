"""Snapshot saved results without rerunning generation or evaluation."""
from pathlib import Path
import json,csv,re
from collections import Counter
B=Path(__file__).resolve().parents[1];O=Path(__file__).resolve().parent
cat=lambda s:'correct' if s=='no_counterexample' else 'incorrect' if s=='counterexample' else 'error'
notes={
'c2s_aug_sub.ArrayDeque.clone.701546b404fa':'GT 比较 ret.size 与 exit this.size；两版使用 entry_self.size，前后状态错误仍然存在。',
'c2s_aug_sub.HashSet.HashSet.56000a245e51':'两版 DSL 的非空 c⇒exit size==c size 与目标基本对应；保存 ErrorTest 的错误是 Contract failed: set.toArray().length==set.size()，不能当作已证 DSL 语义差异。',
'c2s_aug_sub.HashSet.clone.611541d177dd':'静态有 receiver 不变/列表顺序相等等额外约束；但已保存反例仅含 Randoop 的对象契约断言，不能据此证明这些约束造成差异。',
'c2s_aug_sub.ArrayList.remove.5415d76908a4':'TC 生成名为 contains 的 helper，与内建函数重名，报 Redefining builtin contains is unsupported；主体是旧包含⇒ret true。',
'c2s_aug_sub.ArrayList.set.8f27070f9b40':'GT 后缀量词上界是 exit size，DSL 使用 entry size，状态改变时范围不同。',
'c2s_aug_sub.PriorityQueue.offer.bd6ba8a6d8fe':'两版在 size+1 外多加 ret==true，仍有局部性质扩写。',
'c2s_aug_sub.PriorityQueue.retainAll.584c6664b1fe':'TC 的 ElemIn helper 仅 len(coll)>=0，为恒真，丢失真正的成员关系；没有恒真 spec 不代表没有恒真 helper。',
'c2s_aug_sub.BitSet.nextClearBit.c6fef0dac145':'TC 最终 spec=true，但被标 no_counterexample。GT 可以为假；这是有限域/实际调用覆盖或评价可信度问题，不能当真实等价。',
'naturalness.TreeSet.remove.d913918ad50c':'无 TC 把单向蕴含改成 ret==旧包含；TC ret==is_some(o) 完全没有检查旧集合成员关系。',
'naturalness.TreeSet.pollLast.75dd51a71ba3':'TC 仅要求返回值>=旧所有元素，未要求返回值属于旧集合/等于旧 last；例如 old={1,2},ret=3 满足 DSL 但不满足 GT。',
'naturalness.UnionFind.addElement.a058f8380e33':'两版均以 entry !contains 为前件，GT 使用 exit !contains；尽管标 correct，静态不等价。',
'buggyasrts.ArrayList.clone.1a050be53dfd':'GT 是内容不等 !result.equals(this)，两版写成对象身份不同 !same_receiver；内容相等的不同对象即可区分。',
'buggyasrts.Vector.clone.e4ef28adfac7':'内容 equals 与对象身份 same_receiver 混淆。',
}
rows=[];summaries=[];runs={};manifests={}
for stem in ['buggy','c2s_aug_sub','naturalness']:
 for tc in ['no-tc','tc']:
  p=B/f'{stem}-gpt-oss-{tc}';rs=[json.loads(l) for l in (p/'results.jsonl').read_text().splitlines() if l.strip()];runs[stem,tc]={r['id']:r for r in rs}
  ms={m['id']:m for m in map(json.loads,(p/'manifest.jsonl').read_text().splitlines())};manifests[stem,tc]=ms
  assert set(ms)==set(runs[stem,tc])
  for g in sorted({r['group'] for r in rs}):
   subset=[r for r in rs if r['group']==g];cs=Counter(cat(r['status']) for r in subset)
   summaries.append(dict(dataset=g,tc=tc,total=len(subset),**{c:cs[c] for c in ['correct','incorrect','error']},statuses=dict(Counter(r['status'] for r in subset))))
  for r in rs:
   d=p/r['id'];m=ms[r['id']];dsl=(d/'spec.dsl').read_text() if (d/'spec.dsl').exists() else '';cand=(d/'candidate.assert').read_text() if (d/'candidate.assert').exists() else ''
   diag=[];compile_log=(d/'compile.log').read_text() if (d/'compile.log').exists() else ''
   fs=list((d/'counterexamples').glob('ErrorTest*.java'));ce='\n'.join(f.read_text() for f in fs)
   contract='Contract failed:' in ce;exception='during test generation this statement threw an exception' in ce
   origin=('mixed' if contract and exception else 'contract_only' if contract else 'exception_only' if exception else 'unknown') if r['status']=='counterexample' else ''
   feedback=d/'generation_feedback.jsonl';ff=[json.loads(l) for l in feedback.read_text().splitlines()] if feedback.exists() else []
   final='\n'.join(str(x.get('final_feedback') or '')+'\n'+str(x.get('postprocess_error') or '') for x in ff)
   allnull='list[nonetype]' in final
   if r['status']=='compile_error' and 'symbol:   variable __expecto_jml_' in compile_log:diag.append('量词索引在 OLD_var 提升后超出作用域，属于 Java 转换层错误。')
   if r['status']=='generation_error' and allnull:diag.append('最终反馈出现 list[nonetype]：全 null 列表与 list[option[int]] schema 的类型推断冲突。')
   if origin=='contract_only':diag.append('保存 ErrorTest 只有 Randoop 对象契约失败，未出现异常揭示标记；不是已证 DSL/GT 不等价。')
   elif origin=='mixed':diag.append('ErrorTest 混合对象契约失败和异常，需分开归因。')
   if r['id'] in notes:diag.append(notes[r['id']])
   if r.get('error'):diag.append(r['error'])
   rows.append(dict(dataset=r['group'],tc=tc,id=r['id'],status=r['status'],category=cat(r['status']),description=m.get('description',''),ground_truth=m['ground_truth'],dsl=dsl,candidate=cand,error=r.get('error',''),counterexample_origin=origin,final_feedback_all_null_type=allnull,observations='\n'.join(diag),compile_log=compile_log,tool_digest=r.get('configuration',{}).get('tool_digest',''),test_seconds=r.get('configuration',{}).get('seconds',''),root_description=r.get('configuration',{}).get('root_description','')))
with (O/'per_sample.csv').open('w',newline='') as f:
 w=csv.DictWriter(f,fieldnames=list(rows[0]));w.writeheader();w.writerows(rows)
(O/'summary.json').write_text(json.dumps(summaries,ensure_ascii=False,indent=2)+'\n')
def table(h,data):
 return '\n'.join(['| '+' | '.join(h)+' |','| '+' | '.join(['---']*len(h))+' |']+['| '+' | '.join(str(v).replace('|','\\|').replace('\n',' ') for v in r)+' |' for r in data])
parts=['# 当前 Expecto 结果分析\n','范围：6 个结果目录、229 个唯一 assertion、458 个运行项。所有 manifest 与 results ID 一致，无 pending。读取保存文件，不重跑模型，不修改结果分类。no_counterexample=correct，counterexample=incorrect，其余=error。',
'## 汇总\n',table(['数据集','TC','总数','correct','incorrect','error'],[[s['dataset'],s['tc'],s['total']]+[f"{s[k]} ({s[k]/s['total']:.2%})" for k in ['correct','incorrect','error']] for s in summaries]),
'buggy 合计：无 TC 36/86 correct、45 incorrect、5 error；有 TC 34/86 correct、26 incorrect、26 error。总体 correct 从 116/229 (50.66%) 到 123/229 (53.71%)，数据集之间 TC 效果不一致。',
'## 与上一轮的可比性\n',
'当前各生成运行均使用新 root-description，测试预算 30 秒。上一轮对话中的 c2s correct 为 14/30、naturalness 为 5/5；当前为 51/55、29/34。但比较器已改变：当前 compare.py 统一使用 javahelper + equivchecker + Randoop，不再有上一轮 observer_compare 路径。输入工厂、异常处理、错误判定和实际覆盖都可能不同，不能把增长全部归因于 prompt。c2s no-tc 的 tool_digest 为 ee47dcd…，其余当前生成为 2b030a…，还存在工具版本差异。',
'## 配对变化\n']
for stem in ['buggy','c2s_aug_sub','naturalness']:
 ct=Counter((cat(r['status']),cat(runs[stem,'tc'][id]['status'])) for id,r in runs[stem,'no-tc'].items())
 parts += [f'### {stem}\n',table(['无TC→有TC','correct','incorrect','error'],[[c]+[ct[c,d] for d in ['correct','incorrect','error']] for c in ['correct','incorrect','error']])]
parts+=['naturalness 的原 29 条 correct 全保留，新增 5 条：4 条 incorrect、1 条 error 转 correct，净 +12.82 个百分点，主要在 TreeSet。c2s 新增 11 条 correct、损失 7 条，净 +4（+3.85 个百分点）。buggy 新增 12 条 correct、原有 14 条转 error，净 -2；TC 对生成成功项可能有帮助，但类型失败抵消了收益。',
'## error 分解\n',table(['数据集','TC','unsupported','generation_error','translation_error','compile_error'],[[s['dataset'],s['tc']]+[s['statuses'].get(k,0) for k in ['unsupported','generation_error','translation_error','compile_error']] for s in summaries]),
'1. **Java 量词作用域错误**：c2s 18/15 个 compile_error、naturalness 2/2 个，全部出现未定义 __expecto_jml_*。例如 BitSet.and 的旧 observer 被转成 `var OLD_var2=exec(() -> old.get(__expecto_jml_1))`，变量却只在后续 allMatch lambda 内定义；继而还会出现 Object && Object 类型错误。Trie 前缀计数量词也有同样问题。这些不能归因为模型没翻译出正确语义。',
'2. **TC 的全 null 列表类型问题**：buggy TC 25 个 generation_error 中，23 个是未完成定义，2 个是 worker 崩溃；22 个最终反馈出现 list[nonetype] 与 list[option[int]] 冲突（按最终反馈包含该诊断统计，不代表已证明全部失败仅由此造成）。例如 ArrayList.add 的正例包含 [None,None]，编译器把它当 list[nonetype]，模型随后尝试修改签名又被拒绝。c2s TC 5 个 generation_error 中 3 个最终反馈也出现此冲突。',
'3. **不支持的 DSL 子集**：无显式体 helper、后状态索引读取 entry observer、无有限范围量词、缺 is_some 保护的 unwrap 等仍导致 translation_error。',
'## 语义问题是否改善\n',
'已有 DSL 显示目标局部化有所改善：例如 c2s ArrayDeque.clone 的不同对象性质可以仅生成 !same_receiver；大量 HashMap/Trie 性质不再扩写成完整方法契约。不过旧/新状态混淆仍突出：clone、toArray 用 entry size/entry elements 替代 GT exit；ArrayList.set 后缀量词以 entry size 替代 GT exit size。',
'自然语言到逻辑还剩几个清晰反例：\n- TreeSet.remove TC 写成 ret==is_some(o)，没有旧 contains。\n- TreeSet.pollLast TC 只要求 ret>=旧所有元素，没有成员关系；old={1,2},ret=3 可满足 DSL 而违反 GT。\n- buggyasrts ArrayList/Vector.clone 把 !equals（内容不同）写成 !same_receiver（身份不同）。\n- PriorityQueue.offer 的 size+1 性质仍多加 ret=true。\n- ArrayList.remove TC 的 contains helper 与 DSL 内建函数重名，无法翻译。\n- PriorityQueue.retainAll TC helper ElemIn 只有 len(coll)>=0，实际恒真。',
'## 当前评价标签的两个重要问题\n',
'**counterexample 可被其它对象契约污染。** java_equivcheck_passed 仅判断 stdout 是否含 No error-revealing tests to output，未区分错误源。HashSet 构造 DSL 与 GT 形式基本一致仍标 incorrect，保存 ErrorTest 实际断言 set.toArray().length==set.size() 失败。按保存代码标记统计：buggy no-tc 6 项仅对象契约/4 项混合，TC 3 项仅对象契约/2 项混合；c2s 两版各 2 项仅对象契约、3 项混合；naturalness 没有这种标记。其余 exception-only 也不能自动认为是规范不等价，仍需检查异常位置。保持用户指定分类，不据此重新标 correct。',
'**correct 不保证非空有效状态被充分比较。** 当前不保存 valid/errors/mismatches 覆盖计数；Randoop 的总方法执行次数不能代替进入 FuzzTest 并通过非空对象保护的次数。明确例：c2s TC BitSet.nextClearBit 最终 spec=true，仍标 correct，而 GT fromIndex>=0⇒get(ret)==false 显然非恒真。UnionFind 两版 9/9 correct，但至少 addElement 的 entry/exit 前件静态不同；不能据此认定九条全部等价。这需要调用覆盖/状态计数和有目的的对象工厂核验。',
'## 建议下一步\n',
'优先修复 TC [None,None] 的 option 类型推断和 Java 量词作用域提升；评价只计 harness 中明确的 DSL/GT mismatch，另列对象契约失败；增加有效调用、异常、旧新状态以及真假覆盖计数。之后固定同一个 comparator、工具版本和测试预算，做仅改变根 description 的对照，再判断 prompt 的实际收益。剩余语义训练重点是 entry/exit、单向蕴含与等价、集合 equals/对象身份以及 helper 的量词。',
'## 按类表现\n']
for stem in ['c2s_aug_sub','naturalness']:
 dd=[]
 for cls in sorted({id.split('.')[1] for id in runs[stem,'no-tc']}):
  row=[cls]
  for t in ['no-tc','tc']:
   cs=Counter(cat(r['status']) for id,r in runs[stem,t].items() if id.split('.')[1]==cls);row += [cs[k] for k in ['correct','incorrect','error']]
  dd.append(row)
 parts += [f'### {stem}\n',table(['类','无TC C','无TC I','无TC E','有TC C','有TC I','有TC E'],dd)]
parts+=['证据文件：compare.py、checkers/equivchecker.py；BitSet.and 与 Trie.add.5600b759335b 的 compile.log；HashSet.HashSet.56000a245e51 的 counterexamples/ErrorTest0.java；buggy TC ArrayList.add.f57b0e571519 的 generation_feedback.jsonl；BitSet.nextClearBit.c6fef0dac145 的 spec.dsl 和 result.json。per_sample.csv 保存全部 458 个运行项的 description、GT、DSL、candidate、原始状态、编译日志及诊断；标记基于已保存日志，没有运行新的等价证明。']
(O/'report_zh.md').write_text('\n\n'.join(parts)+'\n')
print('Saved',len(rows),'run items,',len({r['id'] for r in rows}),'unique assertions')
print(json.dumps(summaries,ensure_ascii=False))
