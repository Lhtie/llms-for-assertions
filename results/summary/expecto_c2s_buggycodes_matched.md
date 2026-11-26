# Expecto: C2S vs Buggy Code on manifest-matched tasks

44 Buggy Code tasks map to 42 unique C2S tasks. Matching requires the same class, full method signature and normalized GT; only whitespace and doubled backslashes are normalized. NL wording may differ. The 53 unmatched tasks are excluded, not assigned failures.

C2S (paired) repeats each C2S outcome once per matched mutant, preserving the same 44-row task weighting on both sides. C2S (unique) counts each of the 42 distinct C2S tasks once.

| Setting | C2S paired Acc | C2S paired Prec | Buggy matched Acc | Buggy matched Prec | C2S unique Acc | C2S unique Prec |
|---|---:|---:|---:|---:|---:|---:|
| no-tc | 56.8% | 62.5% | 50.0% | 53.7% | 54.8% | 60.5% |
| tc | 52.3% | 65.7% | 52.3% | 62.2% | 50.0% | 63.6% |
| unit-tc | 56.8% | 69.4% | 34.1% | 51.7% | 54.8% | 67.6% |
| targeted-unit-tc |  |  | 15.9% | 20.0% |  |  |

Acc = no_counterexample / all matched tasks. Prec = no_counterexample / (no_counterexample + counterexample). Errors count as no output. These are finite-testing outcomes, not equivalence proofs.

Targeted C2S results are unavailable; its row reports only the matched Buggy Code tasks. The full Buggy Code targeted result is 13/97 no-counterexample tasks and 80 outputs, using GT-failing mutant traces (v3).

This alignment cannot establish the construction history or explain differences causally; the retained manifests can differ in NL wording, and generation/evaluation use different code versions. See the pair CSV and JSON unmatched list for audit.
