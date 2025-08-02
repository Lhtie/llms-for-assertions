import torch
from transformers import AutoTokenizer, AutoModelForCausalLM
from openai import OpenAI
import os
import argparse
import shutil
import sys
import re
import json
import glob
import subprocess

from keysecrets import *
from codehelper.javahelper import *
from nlasrtgen import prompt_transform, run

from sentence_transformers import SentenceTransformer, util
sentmodel = None

modelpaths = {
        "ds7":      "deepseek-coder-6.7b-instructD",
        "mc7":      "Magicoder-S-DS-6.7B",
        "oc7":      "OpenCodeInterpreter-DS-6.7B",
        "qw32":     "Qwen2.5-Coder-32B-Instruct",
        "gpt3":     "gpt-3.5-turbo",
        "gpt4":     "gpt-4-turbo"
}
configs = {
    "java": {
        "mkey_backward": "qw32",
        "num_backward": 8,
        "model_backward": None,
        "threshold": 0.8,
        "use_nli": True
    }
}
nli_instr = """Your task is to determine the relationship between two given natural language sentences based on the following categories:
1. Entailment: The second sentence logically follows from the first sentence.
2. Contradiction: The second sentence contradicts with the first sentence.
3. Neutral: The second sentence is neither entailed nor contradicted by the first sentence.

For instances,
The first sentence is \"A man inspects the uniform of a figure in some East Asian country.\".
The second sentence is \"The man is sleeping\".
The answer is: Contradiction.

The first sentence is \"An older and younger man smiling.\".
The second sentence is \"Two men are smiling and laughing at the cats playing on the floor.\".
The answer is: Neutral.

The first sentence is \"A soccer game with multiple males playing.\".
The second sentence is \"Some men are playing a sport.\".
The answer is: Entailment.

Your output should be directly one of the three categories. (without any explanation or auxiliary information)
The first sentence is: {0}
The second sentence is: {1}
Please provide the answer:
"""

def sim(x, y):
    if sentmodel is None:
        sentmodel = SentenceTransformer('all-MiniLM-L6-V2')
    embx = sentmodel.encode(x, convert_to_tensor=True)
    emby = sentmodel.encode(y, convert_to_tensor=True)
    
    similarity = util.cos_sim(embx, emby)
    return similarity.item()

def equiv(x, y, mkey, model, tokenizer, devices):
    x2y = nli_instr.format(x, y)
    y2x = nli_instr.format(y, x)

    for prompt in [x2y, y2x]:
        if devices is not None and len(devices) <= 1:
            inputs = prompt.to(model.device)
        else:
            inputs = prompt

        response = run(mkey, model, tokenizer, inputs, 0.3)     # temp set to be 0.3
        e = response.find("Entailment") != -1
        c = response.find("Contradiction") != -1
        n = response.find("Neutral") != -1
        assert int(e) + int(c) + int(n) == 1, "Answer should be direct and exact"
        if c or n:
            return 0
    
    return 1

def rtc_calc(asrt, pfx, sfx, langid, config, nli=False):
    mkey = config["mkey_backward"]
    
    assert config["model_backward"] is not None, "No model configurations"
    model = config["model_backward"]["model"]
    tokenizer = config["model_backward"]["tokenizer"]
    devices = config["model_backward"]["devices"]
    
    def sampling(x):
        cmnt_line = pfx.split("\n")[-1]
        cmnt_prefix = cmnt_line.split("@@@")[0] + "@@@"
        new_pfx = "\n".join(
            pfx.split("\n")[:-1] + [cmnt_prefix + " natural language assertion here"])
        
        code = new_pfx + "\n" + cmnt_prefix[:-3] + x + "\n" + sfx
        prompt = prompt_transform(mkey, tokenizer, code, langid)
        if devices is not None and len(devices) <= 1:
            inputs = prompt.to(model.device)
        else:
            inputs = prompt
            
        tot = 0
        for _ in range(config["num_backward"]):
            response = run(mkey, model, tokenizer, inputs, 0.3)     # temp set to be 0.3
            # print(f"Response: {response}")
            assert "@@@" in response, "Generated NL not well formed"
            if nli:
                tot += equiv(
                    response.split("@@@")[-1].strip(), 
                    cmnt_line.split("@@@")[-1].strip(),
                    mkey, model, tokenizer, devices
                )
            else:
                tot += sim(
                    response.split("@@@")[-1].strip(), 
                    cmnt_line.split("@@@")[-1].strip()
                )
        tot /= config["num_backward"]
        return tot
        
    if nli:
        return sampling(asrt)

    else:
        rtc = sampling(asrt)
        forward_lift = sampling("NO CONTENT")
    
        return rtc, forward_lift

def java_rdtpcheck(pfx, sfx, grnd_truth, asrt, check):
    config = configs["java"]
    oai_client = OpenAI(api_key = oai_key)
    
    mkey = config["mkey_backward"]
    mpath = modelpaths[mkey]
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
    config["model_backward"] = {
        "tokenizer": tokenizer,
        "model": model,
        "devices": devices,
    }
    
    if config["use_nli"]:
        return rtc_calc(asrt, pfx, sfx, "java", config, nli=True) >= config["threshold"]
    else:
        rtc, fdlft = rtc_calc(asrt, pfx, sfx, "java", config, nli=False)
        gain = (rtc - fdlft) / fdlft
        
        return gain >= config["threshold"]

def rdtpcheck(langid, pfx, sfx, grnd_truth, asrt, check):
    if(langid == "java"):
        result = java_rdtpcheck(pfx, sfx, grnd_truth, asrt, check)

    else: 
        assert False, "Incorrect language id: " + langid

    return result

