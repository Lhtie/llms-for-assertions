import torch
from transformers import AutoTokenizer, AutoModelForCausalLM
import os
import argparse
from prompting import *
from keysecrets import *
from openai import OpenAI
from time import sleep

modelpaths = {
        "ds7":      "deepseek-coder-6.7b-instructD",
        "mc7":      "Magicoder-S-DS-6.7B",
        "oc7":      "OpenCodeInterpreter-DS-6.7B",
        "ow32":     "Owen2.5-Coder-32B-Instruct",
#        "oc33":     "/home/aman14/models/OpenCodeInterpreter-DS-33B",
        "gpt3":      "gpt-3.5-turbo",
        "gpt4":      "gpt-4-turbo"
}

def run(mkey, model, tokenizer, inputs, temp):
    if mkey.startswith(("gpt3", "gpt4")):
        sleep(1)
        outputs = model(inputs, max_tokens=1024, temperature=temp)
        return outputs.choices[0].message.content
    else:
        outputs = model.generate(
            inputs, 
            max_new_tokens=1024,
            do_sample=True,
            pad_token_id=tokenizer.eos_token_id,
            eos_token_id=tokenizer.eos_token_id,
            temperature=temp
        ) # other params: https://huggingface.co/docs/transformers/v4.39.3/en/main_classes/text_generation
        
        return tokenizer.decode(outputs[0][len(inputs[0]):], skip_special_tokens=True)

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--codedir", type=str, default="./codes")
    parser.add_argument("--resultdir", type=str, default="./results")
    parser.add_argument("--codelist", nargs='+', default=[])
    parser.add_argument("--modellist", nargs='+', default=[])
    parser.add_argument("--nsamples", type=int, default=3)
    parser.add_argument("--prompt", type=str, default="default")
    parser.add_argument("--temp", type=float, default=0.0)
    parser.add_argument("--onemsg", type=bool, default=True)
    parser.add_argument("--write", default=False, action="store_true")
    args = parser.parse_args()

    oai_client = OpenAI(api_key = oai_key)

    for mkey in modelpaths:
        if(len(args.modellist) != 0 and mkey not in args.modellist):
            continue

        mpath = modelpaths[mkey]
        mname = mpath.split("/")[-1]
        params = "-".join([args.prompt, str(args.temp), str(args.onemsg)]) # add temp, generation method etc here
        dirname = args.resultdir + "/" + mname + "/" + params
        assert mname and params

        if mkey.startswith(("gpt3", "gpt4")):
            tokenizer = None
            model = lambda msgdict, **k : oai_client.chat.completions.create(
                    messages = msgdict,
                    model = mpath,
                    **k
            )
            devices = None
        else:
            tokenizer = AutoTokenizer.from_pretrained(mpath)
            model = AutoModelForCausalLM.from_pretrained(
                mpath,
                torch_dtype=torch.bfloat16,
                device_map="auto",
            )
            model.eval()
            devices = {p.device for p in model.parameters()}

        for f in os.listdir(args.codedir):
            if(len(args.codelist) != 0 and f.split('.')[-1] not in args.codelist):
                continue

            fd = open(os.path.join(args.codedir, f), "r")
            code = fd.read()
            fd.close()

            langid = f.split('.')[-2]

            prompt = transform(mkey, args.prompt, tokenizer, code, langid, args.onemsg)
            if devices is not None and len(devices) <= 1:
                inputs = prompt.to(model.device)

            allrspnse, allasrts  = "", ""
            for _ in range(args.nsamples):
                response = run(mkey, model, tokenizer, inputs, args.temp)
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
