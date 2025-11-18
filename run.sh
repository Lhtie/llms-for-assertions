#!/bin/bash

if [ ! -d "javacodes" ]; then
    for cls in $(ls combinedcodes/*.java); do
        python utils/dispatch.py --infile $cls --outdir javacodes --write --obsonly
    done
fi

# python nlasrtgen.py --codedir javacodes --modellist gpt4 --temp 0.3 --nsamples 3 --codelist {1..488} --resultdir results_nl --write

# python main.py --codedir javacodes --modellist qw32 --nsamples 3 --codelist {1..488} --resultdir ./results --write

python checker.py --codedir javacodes --codelist 46,48,63,430,440,441,446,458,459,460,465,477,222,230,243,245,249,261,269,273,276,279,281,290 --combinedcodes ./combinedcodes --resultlist ./results/Qwen2.5-Coder-32B-Instruct/* \
    --checklist fuzz_check \
    --mask 0 \
    # --write