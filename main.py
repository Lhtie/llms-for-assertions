import torch
from transformers import AutoTokenizer, AutoModelForCausalLM
import os
import argparse
from prompting import *
from secrets import *

modelpaths = {
        "ds7":      "deepseek-ai/deepseek-coder-6.7b-instruct",
        "mc7":      "/home/aman14/models/Magicoder-S-DS-6.7B",
        "oc7":      "/home/aman14/models/OpenCodeInterpreter-DS-6.7B",
#        "oc33":     "/home/aman14/models/OpenCodeInterpreter-DS-33B",
}

def run(model, tokenizer, inputs):
    outputs = model.generate(
        inputs, 
        max_new_tokens=1024,
        do_sample=True,
        pad_token_id=tokenizer.eos_token_id,
        eos_token_id=tokenizer.eos_token_id,
    ) # other params: https://huggingface.co/docs/transformers/v4.39.3/en/main_classes/text_generation
    
    return tokenizer.decode(outputs[0][len(inputs[0]):], skip_special_tokens=True)

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--codedir", type=str, default="./codes")
    parser.add_argument("--resultdir", type=str, default="./results")
    parser.add_argument("--codelist", nargs='+', default=[])
    parser.add_argument("--modellist", nargs='+', default=[])
    parser.add_argument("--nsamples", type=int, default=5)
    parser.add_argument("--prompt", type=str, required=True)
    parser.add_argument("--write", type=int, default=0)
    args = parser.parse_args()

    for mkey in modelpaths:
        if(len(args.modellist) != 0 and mkey not in args.modellist):
            continue

        mpath = modelpaths[mkey]
        mname = mpath.split("/")[-1]
        params = "-".join([args.prompt]) # add temp, generation method etc here
        dirname = args.resultdir + "/" + mname + "/" + params
        assert mname and params

        tokenizer = AutoTokenizer.from_pretrained(mpath)
        model = AutoModelForCausalLM.from_pretrained(
            mpath,
            torch_dtype=torch.bfloat16,
            device_map="auto",
        )
        model.eval()

        for f in os.listdir(args.codedir):
            if(len(args.codelist) != 0 and f.split('.')[-1] not in args.codelist):
                continue

            fd = open(os.path.join(args.codedir, f), "r")
            code = fd.read()
            fd.close()

            langid = f.split('.')[-2]

            prompt = transform(args.prompt, tokenizer, code, langid)
            inputs = prompt.to(model.device)

            allrspnse, allasrts  = "", ""
            for _ in range(args.nsamples):
                response = run(model, tokenizer, inputs)
                asrt = extract(args.prompt, response, langid)
                allrspnse += response + "-"*20
                allasrts += asrt + "-"*20

            if(args.write):
                os.makedirs(dirname, exist_ok=True)
                fd = open(os.path.join(dirname, f), "w")
                fd.write(allrspnse)
                fd.close()
                fd = open(os.path.join(dirname, f + ".extract"), "w")
                fd.write(allasrts)
                fd.close()
            else:
                print("#"*10, dirname + "/" + f, "#"*10)
                print(allrspnse)
                print("#"*20)
                print("#"*10, dirname + "/" + f + ".extract", "#"*10)
                print(allasrts)
                print("#"*20)
                
        del model
        del tokenizer
