#!/bin/bash

if [ ! -d "javacodes" ]; then
    for cls in $(ls combinedcodes/*.java); do
        python utils/dispatch.py --infile $cls --outdir javacodes --write --obsonly
    done
fi

# python nlasrtgen.py --codedir javacodes --modellist gpt4 --temp 0.3 --nsamples 3 \
#     --codelist 101 103 104 106 107 117 119 121 124 125 127 130 133 139 142 147 153 155 160 165 167 173 175 177 180 185 193 203 209 210 212 213 214 221 224 226 232 238 240 244 246 248 253 264 272 276 293 294 297 302 310 313 321 322 326 327 332 342 346 355 364 367 368 370 372 373 382 383 393 396 405 406 410 412 423 450 457 458 459 464 469 472 488 \
#     --resultdir results_nl --write

# python main.py --codedir javacodes --modellist gpt4 --nsamples 3 --codelist {1..488} --resultdir ./results --write

python checker.py --codedir javacodes --codelist 1 --resultlist ./results/Qwen2.5-Coder-32B-Instruct/* \
    --checklist compile_check fuzz_check equiv_check \
    --mask 0 \
    # --write