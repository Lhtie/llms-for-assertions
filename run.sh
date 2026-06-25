#!/bin/bash

if [ ! -d "javacodes" ]; then
    for cls in $(ls combinedcodes/*.java); do
        python utils/dispatch.py --infile $cls --outdir javacodes --write --obsonly
    done
fi
if [ ! -d "javacodes_buggycodes" ]; then
    for cls in $(ls buggycodes/*.java); do
        python utils/dispatch.py --infile $cls --outdir javacodes_buggycodes --write --obsonly
    done
fi
if [ ! -d "javacodes_buggyasrts" ]; then
    for cls in $(ls buggyasrts/*.java); do
        python utils/dispatch.py --infile $cls --outdir javacodes_buggyasrts --write --obsonly
    done
fi
if [ ! -d "javacodes_naturalness" ]; then
    for cls in $(ls naturalness/*.java); do
        python utils/dispatch.py --infile $cls --outdir javacodes_naturalness --write --obsonly
    done
fi

# python nlasrtgen.py --codedir javacodes --modellist gpt4 --temp 0.3 --nsamples 3 --codelist {1..418} --resultdir results_nl --write

# python main.py --codedir javacodes --modellist qw32 --nsamples 3 --codelist {1..418} --resultdir ./results --write

python checker.py --codedir javacodes --codelist 42 --combinedcodes ./combinedcodes --resultlist ./results/gpt-oss-120b/* \
    --mask 0 1 2 3 4 \
    --checklist valid \
    # --write