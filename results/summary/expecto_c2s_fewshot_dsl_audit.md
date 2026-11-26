# C2S Sub pipeline-fewshot no-TC DSL audit

Scope: 96 tasks; 32 no_counterexample, 43 counterexample, 15 compile_error, 2 translation_error, 4 generation_error. Acc=33.3%, Prec=42.7% (32/75).

The following manual labels concern all 43 comparison failures. They overlap, describe differences relative to the literal reference, and are not causal or mutually exclusive failure counts. Some NL descriptions omit reference premises; such differences are not necessarily generation errors.

| Label | Cases | Percentage of 43 comparison failures |
|---|---:|---:|
| premise_or_bound_differs_from_reference | 16 | 37.2% |
| entry_exit_reference_changed | 10 | 23.3% |
| additional_postconditions | 4 | 9.3% |
| incorrect_quantifier_nesting | 1 | 2.3% |

15/43 (34.9%) have no clear DSL semantic discrepancy identified. This does not certify equivalence. All 15 compile failures contain an unbound __expecto_jml_ variable diagnostic (old expressions hoisted outside stream lambda scope). 13/43 (30.2%) comparison failures have only Randoop object-contract diagnostics, without the generated exception-statement marker. Neither set should be relabelled correct without re-evaluation.

## c2s_aug_sub.ArrayDeque.addLast.a4a9d48022cd

Tags: premise_or_bound_differs_from_reference

DSL follows unconditional NL; GT additionally guards e != null. NL/GT alignment issue, not automatically an LLM error.

NL: The added element is contained in the deque after the operation.

GT: `assert e!=null => this.contains(e);`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.ArrayDeque.addLast.a4a9d48022cd/spec.dsl)

Contract-only diagnostics: False

## c2s_aug_sub.ArrayDeque.push.4245c21ffbae

Tags: no clear discrepancy

No clear DSL semantic discrepancy identified in this review; this is not a proof of equivalence.

NL: If the element is not null, then it is contained in the deque after push.

GT: `assert e!=null => this.contains(e);`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.ArrayDeque.push.4245c21ffbae/spec.dsl)

Contract-only diagnostics: False

## c2s_aug_sub.ArrayDeque.remove.464b9c69441e

Tags: no clear discrepancy

No clear DSL semantic discrepancy identified in this review; this is not a proof of equivalence.

NL: If the deque contained the element before removal, the method returns true.

GT: `assert \old(this.contains(o)) => \result==true;`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.ArrayDeque.remove.464b9c69441e/spec.dsl)

Contract-only diagnostics: False

## c2s_aug_sub.ArrayList.add.62ec5ca17db3

Tags: no clear discrepancy

No clear DSL semantic discrepancy identified in this review; this is not a proof of equivalence.

NL: If the index is valid, every element before the insertion point remains unchanged after the operation.

GT: `assert index>=0 && index<=\old(this.size()) => \forall int i; 0 <= i&&i < index; this.get(i)==null && \old(this.get(i))==null || this.get(i).equals(\old(this.get(i)));`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.ArrayList.add.62ec5ca17db3/spec.dsl)

Contract-only diagnostics: False

## c2s_aug_sub.ArrayList.add.39a7b673678a

Tags: no clear discrepancy

No clear DSL semantic discrepancy identified in this review; this is not a proof of equivalence.

NL: If the index is between 0 and the initial size of the list inclusive, then for every valid index from the insertion point to the old size of the list, the element at each subsequent index in the updated list is either null and was null in the old list, or is equal to the element at the previous index in the old list.

GT: `assert index>=0 && index<=\old(this.size()) => \forall int i; index <= i&&i <\old(this.size()); this.get(i+1) == null&&\old(this.get(i)) == null||this.get(i+1).equals(\old(this.get(i)));`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.ArrayList.add.39a7b673678a/spec.dsl)

Contract-only diagnostics: False

## c2s_aug_sub.ArrayList.clone.27b8d2347f72

Tags: entry_exit_reference_changed, additional_postconditions

Adds clone-size equality and compares clone to entry elements, whereas GT compares to exit receiver.

NL: Every element in the cloned list matches the corresponding element in the original list at the same index.

GT: `assert \forall int i; 0<=i && i<this.size(); ((ArrayList<?>) \result).get(i)==this.get(i);`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.ArrayList.clone.27b8d2347f72/spec.dsl)

Contract-only diagnostics: False

## c2s_aug_sub.ArrayList.remove.4fcdca318c70

Tags: additional_postconditions, incorrect_quantifier_nesting

Adds size decrease, unchanged prefix and return-value constraints. Shift/return constraints are incorrectly nested under the prefix forall; idx=0 makes that forall vacuous.

NL: If the index is valid, every element after the removed position is shifted left by one, preserving the original order.

GT: `assert index>=0 && index<\old(this.size()) => \forall int i; index<i && i<\old(this.size()-1); this.get(i)==null && \old(this.get(i+1))==null || this.get(i).equals(\old(this.get(i+1)));`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.ArrayList.remove.4fcdca318c70/spec.dsl)

Contract-only diagnostics: False

## c2s_aug_sub.ArrayList.set.8f27070f9b40

Tags: entry_exit_reference_changed

No clear DSL semantic discrepancy identified in this review; this is not a proof of equivalence.

NL: If the index is valid, every element after the replaced position remains unchanged.

GT: `assert index>=0 && index<\old(this.size()) => \forall int i; index<i && i<this.size(); this.get(i)==null && \old(this.get(i))==null || this.get(i).equals(\old(this.get(i)));`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.ArrayList.set.8f27070f9b40/spec.dsl)

Contract-only diagnostics: False

## c2s_aug_sub.ArrayList.toArray.432d5a8181ef

Tags: entry_exit_reference_changed

No clear DSL semantic discrepancy identified in this review; this is not a proof of equivalence.

NL: Every element in the list equals the corresponding element at the same index in the returned array.

GT: `assert \forall int i; 0<=i && i<this.size(); this.get(i)==null && \result[i]==null || this.get(i).equals(\result[i]);`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.ArrayList.toArray.432d5a8181ef/spec.dsl)

Contract-only diagnostics: False

## c2s_aug_sub.BitSet.clear.b76ddcc2a3e1

Tags: premise_or_bound_differs_from_reference

Invents toIndex <= entry_self.length; BitSet range validity in GT has no such upper bound.

NL: If the range is valid, every bit from fromIndex (inclusive) to toIndex (exclusive) is cleared to false after the operation.

GT: `assert fromIndex>=0 && toIndex>=fromIndex => \forall int i; fromIndex<=i && i<toIndex; this.get(i)==false;`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.BitSet.clear.b76ddcc2a3e1/spec.dsl)

Contract-only diagnostics: False

## c2s_aug_sub.BitSet.nextClearBit.c6fef0dac145

Tags: premise_or_bound_differs_from_reference

DSL follows unconditional NL, but GT guards fromIndex >= 0. Adapter bit_at_result also supplies a ret >= 0 default.

NL: The bit at the returned index is clear (false).

GT: `assert fromIndex>=0 => this.get(\result)==false;`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.BitSet.nextClearBit.c6fef0dac145/spec.dsl)

Contract-only diagnostics: False

## c2s_aug_sub.BitSet.nextClearBit.2ae42df3bed4

Tags: premise_or_bound_differs_from_reference

Invents fromIndex < entry_self.length.

NL: If fromIndex is valid, every bit from fromIndex up to (but not including) the returned index is set to true.

GT: `assert fromIndex>=0 => \forall int i; i>=fromIndex && i<\result; this.get(i)==true;`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.BitSet.nextClearBit.2ae42df3bed4/spec.dsl)

Contract-only diagnostics: False

## c2s_aug_sub.BitSet.nextSetBit.c2ecd2358533

Tags: premise_or_bound_differs_from_reference

Found is encoded ret >= 0 instead of GT fromIndex >= 0 && ret != -1; normal reachable outputs may coincide.

NL: If a next set bit is found, the bit at the returned index is set to true.

GT: `assert fromIndex>=0 && \result!=-1 => this.get(\result)==true;`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.BitSet.nextSetBit.c2ecd2358533/spec.dsl)

Contract-only diagnostics: False

## c2s_aug_sub.BitSet.nextSetBit.722d07e578fa

Tags: premise_or_bound_differs_from_reference

Found is encoded ret >= 0 instead of GT fromIndex >= 0 && ret != -1; normal reachable outputs may coincide.

NL: If a set bit is found, all bits from fromIndex up to but not including the returned index are clear.

GT: `assert fromIndex>=0 && \result!=-1 => \forall int i; i>=fromIndex && i<\result; this.get(i)==false;`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.BitSet.nextSetBit.722d07e578fa/spec.dsl)

Contract-only diagnostics: False

## c2s_aug_sub.BitSet.previousClearBit.6752af0897eb

Tags: premise_or_bound_differs_from_reference

Introduces ret >= 0 guard absent from NL and drops GT fromIndex >= -1; can omit required ret=-1 cases.

NL: Every bit between the returned index (exclusive) and the starting index (inclusive) is set to true.

GT: `assert fromIndex>=-1 => \forall int i; i>\result && i<=fromIndex; this.get(i)==true;`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.BitSet.previousClearBit.6752af0897eb/spec.dsl)

Contract-only diagnostics: False

## c2s_aug_sub.BitSet.previousSetBit.0fb41183e0df

Tags: premise_or_bound_differs_from_reference

Uses 0 <= fromIndex < entry length instead of GT fromIndex >= -1.

NL: Every bit between the returned index (exclusive) and fromIndex (inclusive) is false, provided fromIndex is valid.

GT: `assert fromIndex>=-1 => \forall int i; i>\result && i<=fromIndex; this.get(i)==false;`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.BitSet.previousSetBit.0fb41183e0df/spec.dsl)

Contract-only diagnostics: False

## c2s_aug_sub.BitSet.set.d98a1b993c3b

Tags: premise_or_bound_differs_from_reference

Invents toIndex <= entry length.

NL: If the range is valid, every bit from fromIndex (inclusive) to toIndex (exclusive) is set to true after the call.

GT: `assert fromIndex>=0 && toIndex>=fromIndex => \forall int i; fromIndex<=i && i<toIndex; this.get(i)==true;`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.BitSet.set.d98a1b993c3b/spec.dsl)

Contract-only diagnostics: False

## c2s_aug_sub.BitSet.set.2d9473f1d75b

Tags: premise_or_bound_differs_from_reference

Invents toIndex <= entry length.

NL: If the index range is valid, every bit in the range [fromIndex, toIndex) is set to the specified value after the operation.

GT: `assert fromIndex>=0 && toIndex>=fromIndex => \forall int i; fromIndex<=i && i<toIndex; this.get(i)==value;`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.BitSet.set.2d9473f1d75b/spec.dsl)

Contract-only diagnostics: False

## c2s_aug_sub.HashMap.HashMap.9516b12e2199

Tags: premise_or_bound_differs_from_reference

NL is unconditional; GT guards m != null. DSL follows NL; not automatically an LLM error.

NL: After construction, the size of this HashMap equals the size of the source map.

GT: `assert m!=null => this.size()==m.size();`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.HashMap.HashMap.9516b12e2199/spec.dsl)

Contract-only diagnostics: False

## c2s_aug_sub.HashMap.get.bbee9764abd7

Tags: entry_exit_reference_changed

Uses entry contains_key, whereas GT uses exit containsKey. Actual get is read-only but independent states need not be equal.

NL: If the map does not contain the specified key, the returned value is null.

GT: `assert !this.containsKey(key) => \result==null;`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.HashMap.get.bbee9764abd7/spec.dsl)

Contract-only diagnostics: True

## c2s_aug_sub.HashMap.get.bfc123b38842

Tags: entry_exit_reference_changed

Uses entry contains_key whereas GT uses exit containsKey.

NL: If the map contains the specified key, then the returned value is also contained in the map.

GT: `assert this.containsKey(key) => this.containsValue(\result);`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.HashMap.get.bfc123b38842/spec.dsl)

Contract-only diagnostics: True

## c2s_aug_sub.HashMap.put.611ab40ea00e

Tags: no clear discrepancy

No clear DSL semantic discrepancy identified in this review; this is not a proof of equivalence.

NL: If the return value is null, then either the key was not present in the map before this operation, or it was explicitly mapped to null.

GT: `assert \result==null => !\old(this.containsKey(key)) || \old(this.get(key))==null;`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.HashMap.put.611ab40ea00e/spec.dsl)

Contract-only diagnostics: True

## c2s_aug_sub.HashMap.put.71a0e210109c

Tags: additional_postconditions

Requires value_at_key == value, stronger than containsValue(value).

NL: After put, the map contains the specified key and the specified value.

GT: `assert this.containsKey(key) && this.containsValue(value);`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.HashMap.put.71a0e210109c/spec.dsl)

Contract-only diagnostics: True

## c2s_aug_sub.HashMap.put.1ea538ed671f

Tags: premise_or_bound_differs_from_reference

Uses entry contains_key as premise instead of GT result != null; NL/GT premise itself differs.

NL: If a previous mapping existed for the key, the returned value equals the value that was associated with the key before the put.

GT: `assert \result!=null => \old(this.get(key)).equals(\result);`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.HashMap.put.1ea538ed671f/spec.dsl)

Contract-only diagnostics: False

## c2s_aug_sub.HashMap.putAll.346040492f6e

Tags: no clear discrepancy

No clear DSL semantic discrepancy identified in this review; this is not a proof of equivalence.

NL: If the input map is not null, the size of this map after putAll equals the size of the input map.

GT: `assert m!=null => this.size()==m.size();`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.HashMap.putAll.346040492f6e/spec.dsl)

Contract-only diagnostics: True

## c2s_aug_sub.HashMap.remove.058669446782

Tags: no clear discrepancy

No clear DSL semantic discrepancy identified in this review; this is not a proof of equivalence.

NL: If the returned value is null, then either the key was not in the map before the removal, or the value previously mapped to the key was null.

GT: `assert \result==null => !\old(this.containsKey(key)) || \old(this.get(key))==null;`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.HashMap.remove.058669446782/spec.dsl)

Contract-only diagnostics: True

## c2s_aug_sub.HashMap.remove.976c04459917

Tags: no clear discrepancy

No clear DSL semantic discrepancy identified in this review; this is not a proof of equivalence.

NL: If a non-null value is returned, the key was present in the map before the removal.

GT: `assert \result!=null => \old(this.containsKey(key));`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.HashMap.remove.976c04459917/spec.dsl)

Contract-only diagnostics: True

## c2s_aug_sub.HashMap.remove.56a2d432bfe1

Tags: no clear discrepancy

No clear DSL semantic discrepancy identified in this review; this is not a proof of equivalence.

NL: The map no longer contains the specified key after it has been removed.

GT: `assert !this.containsKey(key);`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.HashMap.remove.56a2d432bfe1/spec.dsl)

Contract-only diagnostics: True

## c2s_aug_sub.HashMap.clone.03cdfa9a1093

Tags: no clear discrepancy

No clear DSL semantic discrepancy identified in this review; this is not a proof of equivalence.

NL: The returned clone is a distinct object from the original map.

GT: `assert \result!=this;`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.HashMap.clone.03cdfa9a1093/spec.dsl)

Contract-only diagnostics: True

## c2s_aug_sub.HashMap.clone.0e4cca325480

Tags: entry_exit_reference_changed

Compares clone size to entry receiver size instead of exit.

NL: The cloned map has the same number of key-value mappings as the original map.

GT: `assert ((HashMap<K,V>) \result).size()==this.size();`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.HashMap.clone.0e4cca325480/spec.dsl)

Contract-only diagnostics: True

## c2s_aug_sub.HashSet.HashSet.56000a245e51

Tags: no clear discrepancy

No clear DSL semantic discrepancy identified in this review; this is not a proof of equivalence.

NL: If the collection c is not null, the size of this set equals the size of c after construction.

GT: `assert c!=null => this.size()==c.size();`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.HashSet.HashSet.56000a245e51/spec.dsl)

Contract-only diagnostics: True

## c2s_aug_sub.HashSet.add.4e64f56b376e

Tags: no clear discrepancy

No clear DSL semantic discrepancy identified in this review; this is not a proof of equivalence.

NL: The set contains the added element after the operation.

GT: `assert this.contains(e);`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.HashSet.add.4e64f56b376e/spec.dsl)

Contract-only diagnostics: False

## c2s_aug_sub.HashSet.clone.611541d177dd

Tags: entry_exit_reference_changed, additional_postconditions

Adds distinct identity, size, empty, list-order equality and receiver frame constraints to set equality; uses entry receiver instead of exit.

NL: The cloned set is equal to the original set.

GT: `assert \result.equals(this);`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.HashSet.clone.611541d177dd/spec.dsl)

Contract-only diagnostics: True

## c2s_aug_sub.HashSet.clone.3365f7084ab0

Tags: entry_exit_reference_changed

Compares clone size to entry receiver size instead of exit.

NL: The cloned set has the same size as the original set.

GT: `assert ((HashSet<E>) \result).size()==this.size();`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.HashSet.clone.3365f7084ab0/spec.dsl)

Contract-only diagnostics: True

## c2s_aug_sub.HashSet.remove.e6f3e239c799

Tags: no clear discrepancy

No clear DSL semantic discrepancy identified in this review; this is not a proof of equivalence.

NL: The set does not contain the specified element after the removal operation.

GT: `assert !this.contains(o);`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.HashSet.remove.e6f3e239c799/spec.dsl)

Contract-only diagnostics: False

## c2s_aug_sub.PriorityQueue.PriorityQueue.5f9c50ee98bd

Tags: premise_or_bound_differs_from_reference

NL is unconditional; GT guards c != null. Not automatically an LLM error.

NL: After construction, the priority queue contains exactly as many elements as the source collection.

GT: `assert c!=null => this.size()==c.size();`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.PriorityQueue.PriorityQueue.5f9c50ee98bd/spec.dsl)

Contract-only diagnostics: False

## c2s_aug_sub.PriorityQueue.PriorityQueue.88be9e0e5ac1

Tags: premise_or_bound_differs_from_reference

Skips null source elements with is_some; GT checks all elements.

NL: If the collection is not null, every element from the collection is contained in this priority queue after initialization.

GT: `assert c!=null => \forall int i; 0<=i && i<c.size(); this.contains(c.toArray()[i]);`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.PriorityQueue.PriorityQueue.88be9e0e5ac1/spec.dsl)

Contract-only diagnostics: False

## c2s_aug_sub.PriorityQueue.remove.05d9f0ed8cf9

Tags: no clear discrepancy

No clear DSL semantic discrepancy identified in this review; this is not a proof of equivalence.

NL: If the element was in the queue before removal, the method returns true.

GT: `assert \old(this.contains(o)) => \result==true;`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.PriorityQueue.remove.05d9f0ed8cf9/spec.dsl)

Contract-only diagnostics: False

## c2s_aug_sub.PriorityQueue.remove.309868586ab7

Tags: no clear discrepancy

No clear DSL semantic discrepancy identified in this review; this is not a proof of equivalence.

NL: If the queue initially contains the specified element, then the size of the queue after removal is one less than the initial size.

GT: `assert\old(this.contains(o)) => this.size()==\old(this.size())-1;`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.PriorityQueue.remove.309868586ab7/spec.dsl)

Contract-only diagnostics: False

## c2s_aug_sub.PriorityQueue.removeAll.5778fbe62e40

Tags: premise_or_bound_differs_from_reference

Omits GT c != null guard and skips null elements.

NL: After removal, none of the elements remaining in the priority queue are contained in c.

GT: `assert c!=null => \forall int i; 0<=i && i<this.size(); !c.contains(this.get(i));`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.PriorityQueue.removeAll.5778fbe62e40/spec.dsl)

Contract-only diagnostics: False

## c2s_aug_sub.PriorityQueue.retainAll.584c6664b1fe

Tags: premise_or_bound_differs_from_reference

Omits GT c != null guard and skips null elements.

NL: After retainAll, every element remaining in the priority queue is contained in c.

GT: `assert c!=null => \forall int i; 0<=i && i<this.size(); c.contains(this.get(i));`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.PriorityQueue.retainAll.584c6664b1fe/spec.dsl)

Contract-only diagnostics: False

## c2s_aug_sub.PriorityQueue.toArray.54e47792ae06

Tags: entry_exit_reference_changed

Uses entry size instead of exit size.

NL: The length of the returned array equals the number of elements in the queue.

GT: `assert \result.length==this.size();`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.PriorityQueue.toArray.54e47792ae06/spec.dsl)

Contract-only diagnostics: False

## c2s_aug_sub.PriorityQueue.toArray.40bc6356df3a

Tags: entry_exit_reference_changed

Uses entry elements and size instead of exit.

NL: Every element in the queue appears at the same index in the returned array.

GT: `assert \forall int i; 0<=i && i<this.size(); this.get(i)==null && \result[i]==null || this.get(i).equals(\result[i]);`

DSL: [spec.dsl](/mnt/c/users/lhxlh/documents/uw-madison/research/llms-for-assertions/baseline/expecto-results/pipeline-fewshot/c2s_aug_sub/c2s_aug_sub-no-tc/c2s_aug_sub.PriorityQueue.toArray.40bc6356df3a/spec.dsl)

Contract-only diagnostics: False

