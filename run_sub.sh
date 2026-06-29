#!/bin/bash

if [ ! -d "javacodes_sub" ]; then
    for cls in $(ls combinedcodes_sub/*.java); do
        python utils/dispatch.py --infile $cls --outdir javacodes_sub --write --obsonly
    done
fi

python main.py \
  --codedir javacodes_sub \
  --modellist claude-opus \
  --temp 0.6 --nsamples 5 \
  --codelist {27..34} 67 68 \
  --resultdir results/combinedcodes_sub \
  --write

python checker.py \
  --codedir javacodes_sub \
  --combinedcodes combinedcodes_sub \
  --codelist {1..96} \
  --resultlist results/combinedcodes_sub/claude-opus-4-8/* \
  --checkerkwargs '{"rdtp_check": {"mkey_backward": "claude-opus", "mkey_nli": "claude-opus"}}' \
  --write
