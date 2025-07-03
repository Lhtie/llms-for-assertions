#!/bin/bash

# Set environmental variables, create directories, or do any other preparation
# unzip deepseek-coder-6.7b-instructD.zip

# Permissions may be tricky depending on the application logic.
# One option is to copy the source code from /app to the current working
# directory and run it from here
for file in /app/*; do
  if [ "$(basename "$file")" != "run_chtc.sh" ]; then
    cp -r "$file" .
  fi
done

# run the main python script. Add arguments as needed.
# /bin/bash run.sh
if [ ! -d "javacodes" ]; then
  for cls in $(ls combinedcodes/*.java); do
    python utils/dispatch.py --infile $cls --outdir javacodes --write
  done
fi

python nlasrtgen.py \
    --codedir javacodes \
    --modellist qw32 \
    --temp 0.3 --nsamples 10 \
    --codelist {1..487} \
    --resultdir results_nl \
    --write