if [ ! -d "javacodes/c2s_aug" ]; then
  for cls in $(ls datasets/c2s_aug/*.java); do
    python utils/dispatch.py --infile $cls --outdir javacodes/c2s_aug --write --obsonly
  done
fi

python checker.py \
    --active-from-check-file results/c2s_aug/checks/resultsQwen25-Coder-32B-Instructdefault-06-True.txt \
    --datasets datasets \
    --codedir javacodes/c2s_aug \
    --checkerkwargs '{"rdtp_check": {"mkey_backward": "qw25-coder-api", "mkey_nli": "qw25-coder-api"}}' \
    --outdir results/c2s_aug/checks/ \
    --write
