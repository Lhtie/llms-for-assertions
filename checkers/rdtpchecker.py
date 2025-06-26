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
model = SentenceTransformer('all-MiniLM-L6-V2')

modelpaths = {
        "ds7":      "deepseek-coder-6.7b-instructD",
        "mc7":      "Magicoder-S-DS-6.7B",
        "oc7":      "OpenCodeInterpreter-DS-6.7B",
        "ow32":     "Owen2.5-Coder-32B-Instruct",
        "gpt3":     "gpt-3.5-turbo",
        "gpt4":     "gpt-4-turbo"
}
configs = {
    "java": {
        "mkey_backward": "gpt4",
        "num_backward": 10,
        "model_backward": None,
        "threshold": 0.5,
    }
}

def sim(x, y):
    embx = model.encode(x, convert_to_tensor=True)
    emby = model.encode(y, convert_to_tensor=True)
    
    similarity = util.cos_sim(embx, emby)
    return similarity.item()

def rtc_calc(asrt, pfx, sfx, langid, config):
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
            tot += sim(
                response.split("@@@")[-1].strip(), 
                cmnt_line.split("@@@")[-1].strip()
            )
        tot /= config["num_backward"]
        return tot
        
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
    
    rtc, fdlft = rtc_calc(asrt, pfx, sfx, "java", config)
    gain = (rtc - fdlft) / fdlft
    
    return gain >= config["threshold"]

def rdtpcheck(langid, pfx, sfx, grnd_truth, asrt, check):
    if(langid == "java"):
        result = java_rdtpcheck(pfx, sfx, grnd_truth, asrt, check)

    else: 
        assert False, "Incorrect language id: " + langid

    return result

