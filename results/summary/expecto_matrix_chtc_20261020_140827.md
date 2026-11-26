| Prompt | Setting | C2S-Aug. (416) Acc | C2S-Aug. (416) Prec | C2S-Aug. Sub (96) Acc | C2S-Aug. Sub (96) Prec | Buggy Code (97) Acc | Buggy Code (97) Prec | Buggy Asrt. (100) Acc | Buggy Asrt. (100) Prec | Manual NL (78) Acc | Manual NL (78) Prec |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| Original | Expecto (no TC) | 53.1% | 57.4% | 36.5% | 45.5% | 57.7% | 63.6% | 52.0% | 55.9% | 47.4% | 52.1% |
| Original | Expecto (TC) | 53.6% | 59.0% | 35.4% | 46.6% | 67.0% | 77.4% | 45.0% | 51.1% | 57.7% | 64.3% |
| Original | Expecto (unit tests) | 48.1% | 58.7% | 34.4% | 47.8% | 44.3% | 65.2% | 18.0% | 42.9% | 57.7% | 62.5% |
| Original | Expecto (targeted) |  |  |  |  | 13.4% | 16.2% | 28.0% | 31.1% |  |  |
| Ours Prompt | Expecto (no TC) |  |  | 33.3% | 42.7% |  |  |  |  | 57.7% | 63.4% |
| Ours Prompt | Expecto (TC) |  |  | 36.5% | 45.5% |  |  |  |  |  |  |
| Ours Prompt | Expecto (unit tests) |  |  | 34.4% | 45.8% |  |  |  |  | 62.8% | 68.1% |
| Pipeline | Ours | 91.1% | 93.8% | 90.6% | 93.5% | 88.7% | 89.6% | 68.0% | 73.1% | 73.1% | 79.2% |


Original Manual NL unit-test scores use the previous experiment as a substitute for the incomplete matrix run. Blank cells indicate unavailable experiments.

Targeted GT-failing mutant-trace setting (v3): complete, 13/97 successful tasks and 80 outputs; Acc 13.4%, Prec 16.2%. Statuses: 67 counterexamples, 9 generation errors, 5 translation errors, 2 compilation errors, 1 trace-collection error. Testcase collection produced 288 traces across 96 tasks; one task had no eligible trace. Buggy Asrt targeted is complete: 28/100 no-counterexample tasks and 90 outputs (Acc 28.0%, Prec 31.1%). Statuses: 62 counterexamples, 5 trace-collection errors, 3 translation errors, 1 generation error, 1 compilation error. Collection supplied 283 GT-failing traces across 95 tasks; five tasks had no eligible trace. Old reference-based scores are historical and excluded.

C2S-Aug.: all three original-prompt settings contain 416 tasks. Correct/output counts: no TC 221/385; TC 223/378; unit tests 200/341. Ours: 379/404 correct/output across 416 tasks.
