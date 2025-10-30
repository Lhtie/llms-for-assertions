import torch
from transformers import AutoTokenizer, AutoModelForCausalLM, AutoModelForSequenceClassification
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
from codehelper.javahelper import javahelper

from sentence_transformers import SentenceTransformer, util
sentmodel = None

modelpaths = {
        "ds7":      "deepseek-coder-6.7b-instructD",
        "mc7":      "Magicoder-S-DS-6.7B",
        "oc7":      "OpenCodeInterpreter-DS-6.7B",
        "qw32":     "Qwen2.5-Coder-32B-Instruct",
        "rlm":      "roberta-large-mnli",
        "gpt3":     "gpt-3.5-turbo",
        "gpt4":     "gpt-4-turbo"
}
configs = {
    "java": {
        "mkey_backward": "qw32",
        "num_backward": 8,
        "model_backward": None,
        "threshold": 0.6,
        "use_nli": True,
        "mkey_nli": "qw32",
        "model_nli": None,
        "records": {}
    }
}
nli_instr = """Your task is to determine the relationship between two natural language assertions based on the following categories:
1. Entailment: The second sentence logically follows from the first sentence.
2. Contradiction: The second sentence contradicts with the first sentence.
3. Neutral: The second sentence is neither entailed nor contradicted by the first sentence.

For instances,
The premise is \"size of the array is always greater than or equal to 0.\".
The hypothesis is \"size of the array is less than 0.\".
The answer is: Contradiction.

The premise is \"first index of value in the array remains the same if value was already in the list.\".
The hypothesis is \"first index of value in the array remains the same.\".
The answer is: Neutral.

The premise is \"All the valid indices (between 0 and old size) in the array before add have the same element after add.\".
The hypothesis is \"After the operation, all the elements in valid indices (between 0 and old size) in the array have the same value as before.\".
The answer is: Entailment.

Here is the context information to help understand the sentences:
The sentences are assertions in natural language form describing the expected behavior or properties of a piece of code, such as a function or method.
More specifically, You are given the implementation of a class {0}. Inside this class, there is a method {1}. The following two assertions are both written about the behavior of the method. To help you reason about their relationship, here is some context:
- The method takes in ({2}) as parameters.
- {3}
- The functionality of the method is documented below:
{4}

- Your output should be directly one of the three categories. (without any explanation or auxiliary information)
- Please ignore potential differences in wording or phrasing of technical terms.
- Please be careful about details (numerical bounds, conditions, `\\old` symbol, implications and equivalence)
- Only label as Neutral when the hypothesis clearly introduces new information not guaranteed by the premise, omits essential details required to verify it, or contains information unrelated to the premise.

The premise is: {5}
The hypothesis is: {6}
Please provide the answer:
"""

def load_model(mkey):
    mpath = modelpaths[mkey]
    if mkey.startswith(("gpt3", "gpt4")):
        oai_client = OpenAI(api_key = oai_key)
        tokenizer = None
        model = lambda msgdict, **k : oai_client.chat.completions.create(
                messages = msgdict,
                model = mpath,
                **k
        )
        devices = None
    elif mkey == "rlm":
        tokenizer = AutoTokenizer.from_pretrained(mpath)
        model = AutoModelForSequenceClassification.from_pretrained(
            mpath,
            torch_dtype=torch.bfloat16,
            device_map="auto",
        )
        model.eval()
        devices = {p.device for p in model.parameters()}
    else:
        tokenizer = AutoTokenizer.from_pretrained(mpath)
        model = AutoModelForCausalLM.from_pretrained(
            mpath,
            torch_dtype=torch.bfloat16,
            device_map="auto",
        )
        model.eval()
        devices = {p.device for p in model.parameters()}
    return tokenizer, model, devices

def sim(x, y):
    if sentmodel is None:
        sentmodel = SentenceTransformer('all-MiniLM-L6-V2')
    embx = sentmodel.encode(x, convert_to_tensor=True)
    emby = sentmodel.encode(y, convert_to_tensor=True)
    
    similarity = util.cos_sim(embx, emby)
    return similarity.item()

def equiv(x, y, mkey, model_dict, jh):
    assert model_dict is not None, "No model configurations"
    tokenizer = model_dict["tokenizer"]
    model = model_dict["model"]
    devices = model_dict["devices"]

    rec = []
    for premise, hypothesis in [(x, y), (y, x)]:
        prompt = nli_instr.format(
            jh.classname, jh.funcname, 
            ", ".join([f"{typ} {var}" for var, typ in jh.funcs[-1]["args"].items()]),
            f"The method returns {jh.funcs[-1]['rtyp']} as result."
                if jh.funcs[-1]["rtyp"] != "void" else f"The method does not return any value.",
            jh.funcs[-1]["docs"],
            premise, hypothesis
        )
        msgdict = [
            {'role': 'system', 'content': f"You are a helpful assistant that excels at natural language inference."},
            {'role': 'user', 'content': prompt}
        ]

        if mkey.startswith(("gpt3", "gpt4")):
            inputs = msgdict
        elif mkey == "rlm":
            inputs = tokenizer.encode_plus(premise, hypothesis, return_tensors="pt")
        else:
            inputs = tokenizer.apply_chat_template(
                    msgdict,
                    return_tensors="pt",
                    add_generation_prompt=True)
        if devices is not None and len(devices) <= 1:
            inputs = inputs.to(model.device)

        # print(f"Inputs: {inputs[1]['content']}")
        if mkey == "rlm":
            with torch.no_grad():
                logits = model(**inputs).logits
            response = torch.softmax(logits, dim=1)[0]
            response = torch.argmax(response).item()
            response = ["Contradiction", "Neutral", "Entailment"][response]
        else:
            response = run(mkey, model, tokenizer, inputs, 0.3)     # temp set to be 0.3
        rec.append({
            "premise": premise,
            "hypothesis": hypothesis,
            "response": response
        })

        c = response.find("Contradiction") != -1
        n = response.find("Neutral") != -1
        e = response.find("Entailment") != -1
        # print(f"Response: {response}")
        assert int(e) + int(c) + int(n) == 1, "Answer should be direct and exact"
        if c or n:
            return 0, rec
    
    return 1, rec

def rtc_calc(asrt, pfx, sfx, langid, config, nli=False):
    mkey = config["mkey_backward"]
    
    assert config["model_backward"] is not None, "No model configurations"
    model = config["model_backward"]["model"]
    tokenizer = config["model_backward"]["tokenizer"]
    devices = config["model_backward"]["devices"]

    jh = javahelper(pfx + '\n' + sfx)
    
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
        args = ", ".join([f"{typ} {var}" for var, typ in jh.funcs[-1]["args"].items()])
        rec_title = f"{jh.namespace}:{jh.funcname}({args}):{asrt}"
        config["records"][rec_title] = {
            "samples": [],
            "score": None
        }
        for _ in range(config["num_backward"]):
            response = run(mkey, model, tokenizer, inputs, 0.3)     # temp set to be 0.3
            # print(f"Response: {response}")
            assert "@@@" in response, "Generated NL not well formed"

            if nli:
                f, rec = equiv(
                    response.split("@@@")[-1].strip(), 
                    cmnt_line.split("@@@")[-1].strip(),
                    config["mkey_nli"], config["model_nli"], jh
                )
                tot += f
                config["records"][rec_title]["samples"].append({
                    "nl_asrt": response,
                    "nli": rec
                })

            else:
                tot += sim(
                    response.split("@@@")[-1].strip(), 
                    cmnt_line.split("@@@")[-1].strip()
                )
            
        tot /= config["num_backward"]
        config["records"][rec_title]["score"] = tot
        # print(f"Total: {tot}")
        return tot
        
    if nli:
        return sampling(asrt)

    else:
        rtc = sampling(asrt)
        forward_lift = sampling("NO CONTENT")
    
        return rtc, forward_lift

def java_rdtpcheck(pfx, sfx, asrt):
    if configs["java"]["model_backward"] is None:
        tokenizer, model, devices = load_model(configs["java"]["mkey_backward"])
        configs["java"]["model_backward"] = {
            "tokenizer": tokenizer,
            "model": model,
            "devices": devices,
        }
    if configs["java"]["model_nli"] is None:
        if configs["java"]["mkey_nli"] == configs["java"]["mkey_backward"]:
            configs["java"]["model_nli"] = configs["java"]["model_backward"]
        else:
            tokenizer, model, devices = load_model(configs["java"]["mkey_nli"])
            configs["java"]["model_nli"] = {
                "tokenizer": tokenizer,
                "model": model,
                "devices": devices,
            }
    
    config = configs["java"]
    if config["use_nli"]:
        return rtc_calc(asrt, pfx, sfx, "java", config, nli=True) >= config["threshold"]
    else:
        rtc, fdlft = rtc_calc(asrt, pfx, sfx, "java", config, nli=False)
        gain = (rtc - fdlft) / fdlft
        
        return gain >= config["threshold"]

def rdtpcheck(langid, pfx, sfx, grnd_truth, asrt, cc, check):
    if(langid == "java"):
        result = java_rdtpcheck(pfx, sfx, asrt)
        os.makedirs("./results/logs", exist_ok=True)
        with open(f"./results/logs/rdtpcheck_{langid}-{cc}.json", "w") as f:
            json.dump(configs["java"]["records"], f, indent=4)

    else: 
        assert False, "Incorrect language id: " + langid

    return result

