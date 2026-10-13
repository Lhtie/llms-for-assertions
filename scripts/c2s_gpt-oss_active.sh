if [ ! -d "javacodes/c2s_aug" ]; then
  for cls in $(ls datasets/c2s_aug/*.java); do
    python utils/dispatch.py --infile $cls --outdir javacodes/c2s_aug --write --obsonly
  done
fi

python checker.py \
    --active-from-check-file results/c2s_aug/checks/resultsgpt-oss-120bdefault-06-True.txt \
    --datasets datasets \
    --codedir javacodes/c2s_aug \
    --checkerkwargs '{"rdtp_check": {"mkey_backward": "gpt-oss", "mkey_nli": "gpt-oss"}}' \
    --outdir results/c2s_aug/checks/ \
    --write
