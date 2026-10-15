| Setting | conf. | active | C2S-Aug. (416) Acc | C2S-Aug. (416) Prec | Buggy Code (97) Acc | Buggy Code (97) Prec | Buggy Asrt. (100) Acc | Buggy Asrt. (100) Prec | Manual NL (78) Acc | Manual NL (78) Prec |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| Oneshot | ✗ | ✗ | 85.3% | 85.3% | 82.5% | 82.5% | 66.0% | 66.0% | 57.7% | 57.7% |
| Conf-only | ✓ | ✗ | 86.8% | 86.8% | 83.5% | 83.5% | 68.0% | 68.0% | 62.8% | 67.1% |
| Ours | ✓ | ✓ | 91.1% | 93.8% | 88.7% | 89.6% | 68.0% | 73.1% | 73.1% | 79.2% |

Component comparison with GPT-OSS-120B on the four full datasets. Conf. denotes conformance scoring; active denotes active tournament selection. Oneshot returns the first generated candidate. Conf-only selects the candidate with the highest finite conformance score, breaking ties by generation order, without a score threshold or validity filter. Ours uses the complete pipeline. Acc is equivalent final outputs divided by all tasks, and Prec is equivalent final outputs divided by tasks with an output, using the same Randoop-based equivalence metric for all settings. Available active-rerun blocks replace corresponding original results.
