# Targeted success audit (GPT-OSS-120B)

All 41 `no_counterexample` samples were audited using their actual worker_input.json,
not the pre-injection generation_input.json template. All selected worker traces
match captured actual executions whose collector GT label is false. Every generated
DSL was rechecked on every supplied trace with the repository's original schema
conversion/evaluation functions and DSL/Z3 compiler.

| Group | Tasks | Traces | All recorded GT labels false | All DSL checks accepted |
|---|---:|---:|---|---|
| buggycodes | 13 | 39 | Yes | Yes |
| buggyasrts | 28 | 82 | Yes | Yes |

This demonstrates that generation is accepting mutant/dataset behavior, as requested.
On the collected trace semantics these DSLs differ from GT. It does not independently
prove that every DSL-to-JML translation preserves semantics. `no_counterexample`
is not an equivalence proof; the final translation/comparison needs auditing.

## Acceptance rule

`expecto/src/utils/sat_check.py:sat_check_examples` checks every supplied trace
with `is_correct=True`. Any failed trace produces Err feedback, causing candidate
rejection/refinement. `incorrects` is not consumed by the Defects4J generator;
our targeted GT-false traces are intentionally placed in `corrects` as must-accept
behavior constraints. A single GT-false must-accept trace rules out candidates
equivalent to GT under the same semantics, but not candidates modified to fit
implementation behavior. A direct replay of the ArrayList(Collection) GT predicate
on the first targeted trace returned `Checked value: unsat`, as expected.

## Concrete finite-test miss

Sample: buggyasrts.ArrayList.ArrayList.6492d5669400

- Generated DSL/JML: non-null source implies new size == source size.
- Mutated GT: non-null source implies new size == source size + 1.
- First worker trace: empty non-null source, empty constructed collection.
  Generated DSL is true, GT is false.
- Existing Randoop result: no_counterexample.
- Deterministic invocation of the saved Java comparison harness: after its seed
  helper produces post-state size 10, supply a source collection of size 10.
  Candidate is true, GT false; the harness throws Normal Postcondition Violated.

The Java comparator can distinguish this case when supplied the counterexample;
Randoop missed it. This confirms a final finite-testing false negative for this
sample, independently of the DSL check. See ReplayComparison.java and
java_counterexample.txt. Original results and tables have not been rewritten.

## Reproduce

From the project root, in a Python environment with z3-solver and lark:

```bash
python results/summary/targeted_trace_audit/replay_dsl_checks.py
```

The replay extracts the original DSL utility functions to avoid importing the
LLM SDK; it does not modify their implementations. The JSON records each check.
For the deterministic Java example, compile ReplayComparison.java against the
saved sample's `classes/` directory plus `java-testgen/randoop/randoop-all-4.3.3.jar`,
and run ReplayComparison with the same classpath.
