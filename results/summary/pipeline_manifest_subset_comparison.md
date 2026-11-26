# Our pipeline: C2S subsets versus Buggy Code and Buggy Asrt

GPT-OSS-120B. Metrics are recomputed directly from checker report final candidates. Each manifest source/assertion line is mapped to its source-wide assertion ordinal and checker entry. All 416/97/100 entries were found. No validity/conformance filter.

## Common-method subsets

Matching uses class plus full method signature, including parameter names/types to distinguish overloads. All assertions in a matching method are included on each side; each task is counted once. This is a method-level subset comparison, not an assertion-paired or code-only experiment.

| Comparison | Dataset | Tasks | Acc | Prec |
|---|---|---:|---:|---:|
| buggycodes common methods | c2s | 87 | 90.8% (79/87) | 91.9% (79/86) |
| buggycodes common methods | buggycodes | 68 | 85.3% (58/68) | 86.6% (58/67) |
| buggyasrts common methods | c2s | 113 | 88.5% (100/113) | 90.1% (100/111) |
| buggyasrts common methods | buggyasrts | 88 | 68.2% (60/88) | 73.2% (60/82) |

## Same-GT paired subset: Buggy Code

Matching additionally requires normalized GT equality; whitespace and backslash escaping only are normalized. C2S results are repeated once per mutant counterpart so both sides have identical 44-pair weights. NL wording may still differ.

| Dataset | Tasks | Acc | Prec |
|---|---:|---:|---:|
| C2S, paired | 44 | 93.2% (41/44) | 93.2% (41/44) |
| Buggy Code, paired | 44 | 77.3% (34/44) | 79.1% (34/43) |
| C2S, unique | 42 | 92.9% (39/42) | 92.9% (39/42) |

Buggy Asrt changes GT. The manifests do not provide original sample IDs; matching solely on assertion ordinal or fuzzy GT similarity can pair different properties. Therefore no assertion-level pairing is claimed for Buggy Asrt. TreeSet/Trie/UnionFind tasks without common C2S manifest methods are excluded from common-method comparisons. The JSON includes excluded tasks and exact same-GT pairs; the CSV lists every method-subset task with its checker entry and outcome.
