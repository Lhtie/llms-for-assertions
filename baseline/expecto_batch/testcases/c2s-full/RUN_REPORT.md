# Full C2S test-case generation report

This directory contains independently generated test cases for all 416
documented assertions in `datasets/c2s_aug` (19 source classes). The 14
assertions without an `@@@` natural-language description are intentionally
excluded from this NL-to-spec benchmark.

Generation used Randoop for 3 seconds with seeds 0, 1, and 2 for every
assertion. Each generated state contains an entry receiver, exit receiver,
parameters, and return value. The assertion in the dataset is evaluated on the
state to assign its positive or negative label; the target method is not
executed to obtain a method trace.

Final validated totals:

- 416 sample IDs and source hashes checked
- 415 samples with at least one valid case
- 1 sample with no valid case
- 173,897 distinct typed states: 122,370 positive and 51,527 negative
- 1,181 positive and 975 negative prompt examples selected
- all three seed runs completed for every sample
- all stored values conform to their DSL schemas
- prompt examples and held-out states are disjoint and together cover every
  saved state
- 832 generated Java harnesses (416 comparison and 416 TC harnesses) compile

The only sample with no valid state is
`c2s_aug.Path.add.168607acb1f9`. Its assertion indexes
`getEdgePath().get(size() - 1)`, while `Path.size()` returns the node-path
length. A coherent path has one fewer edge than nodes, so that index is always
outside the edge list (and is `-1` for the empty path). The source assertion is
preserved and the sample remains in the 416-sample denominator. With
`--require-traces`, its TC run is deliberately reported as `generation_error`
instead of silently falling back to no-TC.

There are 123 samples with fewer than three examples on at least one side: 90
have no sampled negative state, 32 have one or two examples on one side, and
the `Path.add` sample has no valid state. This is a property of the assertion
and bounded state domain, not a compilation failure. Full per-sample counts
are in `validation.json` and `summary.json`.

Object-bearing classes (`AttributeList`, `RoleList`, `RoleUnresolvedList`, and
`Path`) retain their real Java object types. Their DSL projection exposes
separate equality and reference-identity relations rather than encoding
objects with hash codes. Collection, floating-point, array, and buffer inputs
use bounded typed projections documented in the generated adapter files.

No LLM was called while preparing or validating these test cases.
