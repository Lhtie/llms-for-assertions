#!/bin/bash

python3 main.py --prompt "continue" --write 1 --modellist mc7 --nsamples 10 --codelist {7..11}
python3 main.py --prompt "continue" --write 1 --modellist ds7 --nsamples 10 --codelist {7..11}
python3 main.py --prompt "continue" --write 1 --modellist oc7 --nsamples 10 --codelist {7..11}

python3 main.py --prompt "enforce-fmt" --write 1 --modellist mc7 --nsamples 10 --codelist {7..11}
python3 main.py --prompt "enforce-fmt" --write 1 --modellist ds7 --nsamples 10 --codelist {7..11}
python3 main.py --prompt "enforce-fmt" --write 1 --modellist oc7 --nsamples 10 --codelist {7..11}

python3 main.py --prompt "one-shot" --write 1 --modellist mc7 --nsamples 10 --codelist {7..11}
python3 main.py --prompt "one-shot" --write 1 --modellist ds7 --nsamples 10 --codelist {7..11}
python3 main.py --prompt "one-shot" --write 1 --modellist oc7 --nsamples 10 --codelist {7..11}

python3 main.py --prompt "one-shot-enf" --write 1 --modellist mc7 --nsamples 10 --codelist {7..11}
python3 main.py --prompt "one-shot-enf" --write 1 --modellist ds7 --nsamples 10 --codelist {7..11}
python3 main.py --prompt "one-shot-enf" --write 1 --modellist oc7 --nsamples 10 --codelist {7..11}

python3 main.py --prompt "trivial" --write 1 --modellist mc7 --nsamples 10 
python3 main.py --prompt "trivial" --write 1 --modellist ds7 --nsamples 10 
python3 main.py --prompt "trivial" --write 1 --modellist oc7 --nsamples 10 

