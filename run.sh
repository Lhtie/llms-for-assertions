#!/bin/bash

if [ ! -d "javacodes" ]; then
    for cls in $(ls combinedcodes/*.java); do
        python utils/dispatch.py --infile $cls --outdir javacodes --write
    done
fi

python nlasrtgen.py --codedir javacodes --modellist ow32 --nsamples 10 --codelist {1..463} --resultdir results_nl --write

# python main.py --codedir javacodes --modellist gpt4 --nsamples 3 --codelist {1..463} --resultdir ./results --write

# python checker.py --codedir javacodes --codelist 2025 --resultlist ./results/java-pilot --write