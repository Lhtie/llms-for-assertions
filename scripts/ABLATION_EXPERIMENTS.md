# Ablation experiment scripts

Run the full suite from any working directory with:

```bash
bash scripts/ablation_run_all.sh
```

The generation script dispatches `datasets/ablation` into `javacodes/ablation`,
then calls `main.py` once with `gpt-oss-api`, five samples, temperature 0.6, and
`--logprob`. The generated responses and their logprob records are saved under
`results/ablation/gpt-oss-120b/default-0.6-True`.

Checker reports are saved separately under `results/ablation/`:

- `problog_only`: highest-logprob candidate, no conformance or active tournament.
- `conformance_only`: highest-conformance candidate, no active tournament.
- `active_no_conformance`: active tournament with logprob as its fallback score.
- `active_conformance_direct`, `active_conformance_simple`,
  `active_conformance_bidir_nli`, and `active_conformance_no_context`: active
  tournament selection using conformance scores under the named RDTP variation.
  Each variation has a separate script.

The checker runs the default validity and equivalence checks alongside
selection so the reports remain comparable; the selection mode controls which
score chooses the final candidate. To run only one phase, use
`ablation_generate.sh` followed by the corresponding checker script.
Each `checker.py` process gets a unique temporary directory on the system's
local temporary filesystem (normally `/tmp`) and removes it when the process
exits, so checker scripts can run concurrently without interfering with one
another's Randoop files. Set `CHECKER_TMP_DIR` to override the scratch root.

The selected files use `package mut_xxx;` to match the unified directory
layout, allowing `dispatch.py` and the checker to locate and compile the source.
