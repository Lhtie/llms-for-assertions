#!/bin/bash

python3 main.py --prompt "continue" --write 1 --modellist mc7 --nsamples 10 --codelist 2 5 6 7 8 9 10 11 12 69 23 28 101 43 109 92 37 14 43
python3 main.py --prompt "continue" --write 1 --modellist ds7 --nsamples 10 --codelist 2 5 6 7 8 9 10 11 12 69 23 28 101 43 109 92 37 14 43
python3 main.py --prompt "continue" --write 1 --modellist oc7 --nsamples 10 --codelist 2 5 6 7 8 9 10 11 12 69 23 28 101 43 109 92 37 14 43

python3 main.py --prompt "enforce-fmt" --write 1 --modellist mc7 --nsamples 10 --codelist 2 5 6 7 8 9 10 11 12 69 23 28 101 43 109 92 37 14 43
python3 main.py --prompt "enforce-fmt" --write 1 --modellist ds7 --nsamples 10 --codelist 2 5 6 7 8 9 10 11 12 69 23 28 101 43 109 92 37 14 43
python3 main.py --prompt "enforce-fmt" --write 1 --modellist oc7 --nsamples 10 --codelist 2 5 6 7 8 9 10 11 12 69 23 28 101 43 109 92 37 14 43

python3 main.py --prompt "one-shot" --write 1 --modellist mc7 --nsamples 10 --codelist 2 5 6 7 8 9 10 11 12 69 23 28 101 43 109 92 37 14 43
python3 main.py --prompt "one-shot" --write 1 --modellist ds7 --nsamples 10 --codelist 2 5 6 7 8 9 10 11 12 69 23 28 101 43 109 92 37 14 43
python3 main.py --prompt "one-shot" --write 1 --modellist oc7 --nsamples 10 --codelist 2 5 6 7 8 9 10 11 12 69 23 28 101 43 109 92 37 14 43

python3 main.py --prompt "one-shot-enf" --write 1 --modellist mc7 --nsamples 10 --codelist 2 5 6 7 8 9 10 11 12 69 23 28 101 43 109 92 37 14 43
python3 main.py --prompt "one-shot-enf" --write 1 --modellist ds7 --nsamples 10 --codelist 2 5 6 7 8 9 10 11 12 69 23 28 101 43 109 92 37 14 43
python3 main.py --prompt "one-shot-enf" --write 1 --modellist oc7 --nsamples 10 --codelist 2 5 6 7 8 9 10 11 12 69 23 28 101 43 109 92 37 14 43

python3 main.py --prompt "trivial" --write 1 --modellist mc7 --nsamples 10 --codelist 2 5 6 7 8 9 10 11 12 69 23 28 101 43 109 92 37 14 43
python3 main.py --prompt "trivial" --write 1 --modellist ds7 --nsamples 10 --codelist 2 5 6 7 8 9 10 11 12 69 23 28 101 43 109 92 37 14 43
python3 main.py --prompt "trivial" --write 1 --modellist oc7 --nsamples 10 --codelist 2 5 6 7 8 9 10 11 12 69 23 28 101 43 109 92 37 14 43


