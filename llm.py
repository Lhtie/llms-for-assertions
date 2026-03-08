import os
import pathlib
os.environ.setdefault("USER", "chtc")
os.environ.setdefault("LOGNAME", os.environ["USER"])
os.environ.setdefault("USERNAME", os.environ["USER"])
os.environ.setdefault("TORCHINDUCTOR_CACHE_DIR", os.path.abspath("./.torchinductor"))
pathlib.Path(os.environ["TORCHINDUCTOR_CACHE_DIR"]).mkdir(parents=True, exist_ok=True)

import torch
from transformers import (
    AutoModelForCausalLM,
    AutoModelForSequenceClassification,
    AutoTokenizer,
)
from openai import OpenAI
from time import sleep

from keysecrets import oai_key

modelpaths = {
    "ds7": "deepseek-coder-6.7b-instructD",
    "mc7": "Magicoder-S-DS-6.7B",
    "oc7": "OpenCodeInterpreter-DS-6.7B",
    "qw32": "Qwen2.5-Coder-32B-Instruct",
    "gpt3": "gpt-3.5-turbo",
    "gpt4": "gpt-4.1",
    "gpt-oss": "gpt-oss-120b",
}


def is_api_model(mkey):
    return mkey.startswith(("gpt3", "gpt4"))


def is_vllm_model(mkey):
    return mkey.startswith(("gpt-oss"))


def load_model(mkey, modelpaths=None, task="causal_lm"):
    paths = modelpaths
    if paths is None:
        paths = globals().get("modelpaths")
    mpath = paths[mkey]

    if is_api_model(mkey):
        oai_client = OpenAI(api_key=oai_key)
        tokenizer = None
        model = lambda msgdict, **k: oai_client.chat.completions.create(
            messages=msgdict,
            model=mpath,
            **k,
        )
        devices = None
    elif is_vllm_model(mkey): 
        try:
            from vllm import LLM
        except ImportError as e:
            raise ImportError("vllm is required") from e

        llm_kwargs = {
            "model": mpath,
            "tensor_parallel_size": 2,
            "dtype": "bfloat16",
            "max_model_len": 65536,
            "hf_overrides": {
                "dtype": "bfloat16",
                "torch_dtype": "bfloat16",
            },
        }
        model = LLM(**llm_kwargs)
        tokenizer = model.get_tokenizer()
        devices = None
    elif task == "sequence_classification":
        tokenizer = AutoTokenizer.from_pretrained(mpath)
        model = AutoModelForSequenceClassification.from_pretrained(
            mpath,
            torch_dtype=torch.bfloat16,
            device_map="auto",
        )
        model.eval()
        devices = {p.device for p in model.parameters()}
    elif task == "causal_lm":
        tokenizer = AutoTokenizer.from_pretrained(mpath)
        model = AutoModelForCausalLM.from_pretrained(
            mpath,
            torch_dtype=torch.bfloat16,
            device_map="auto",
        )
        model.eval()
        devices = {p.device for p in model.parameters()}
    else:
        raise ValueError(f"Unsupported task: {task}")

    return tokenizer, model, devices


def move_inputs_to_model(inputs, model, devices):
    if devices is None:
        return inputs
    return inputs.to(model.device)


def run_model(mkey, model, tokenizer, devices, prompt, temp=0.0, max_tokens=1024):
    if is_api_model(mkey):
        inputs = prompt
    elif is_vllm_model(mkey):
        inputs = tokenizer.apply_chat_template(
            prompt,
            tokenize=False,
            add_generation_prompt=True,
        )
    else:
        inputs = tokenizer.apply_chat_template(
            prompt,
            return_tensors="pt",
            add_generation_prompt=True
        )
    inputs = move_inputs_to_model(inputs, model, devices)
    
    if is_api_model(mkey):
        sleep(1)
        outputs = model(inputs, max_tokens=max_tokens, temperature=temp)
        return outputs.choices[0].message.content
    if is_vllm_model(mkey):
        from vllm import SamplingParams

        outputs = model.generate(
            prompts=[inputs],
            sampling_params=SamplingParams(
                temperature=temp,
                max_tokens=max_tokens,
            ),
        )
        return outputs[0].outputs[0].text

    outputs = model.generate(
        inputs,
        max_new_tokens=max_tokens,
        do_sample=True,
        pad_token_id=tokenizer.eos_token_id,
        eos_token_id=tokenizer.eos_token_id,
        temperature=temp,
    )
    return tokenizer.decode(outputs[0][len(inputs[0]) :], skip_special_tokens=True)
