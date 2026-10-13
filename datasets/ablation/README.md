# Ablation dataset

All four sample groups use a unified `mut_xxx` directory layout (`mut_000` through `mut_033`). Each directory groups files from one sampled source version; the C2S sample is one directory containing its selected classes. `manifest.csv` records the source group, original source path and mutation ID, selected assertion, and new output path.

Each source group contributes at most 20 selected NL assertion/spec pairs. Java files are included only when they contain a selected assertion; surrounding implementation is retained and unselected `// @@@` assertion pairs are removed.
