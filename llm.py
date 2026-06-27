import os
import pathlib
os.environ.setdefault("USER", "chtc")
os.environ.setdefault("LOGNAME", os.environ["USER"])
os.environ.setdefault("USERNAME", os.environ["USER"])
os.environ.setdefault("TORCHINDUCTOR_CACHE_DIR", os.path.abspath("./.torchinductor"))
pathlib.Path(os.environ["TORCHINDUCTOR_CACHE_DIR"]).mkdir(parents=True, exist_ok=True)

from time import sleep

modelpaths = {
    "ds7": "deepseek-coder-6.7b-instructD",
    "mc7": "Magicoder-S-DS-6.7B",
    "oc7": "OpenCodeInterpreter-DS-6.7B",
    "qw32": "Qwen2.5-Coder-32B-Instruct",
    "gpt3": "gpt-3.5-turbo",
    "gpt4": "gpt-4.1",
    "gpt5": "gpt-5.5",
    "gpt-oss": "gpt-oss-120b",
    "claude-sonnet": "claude-sonnet-4-6",
    "claude-opus": "claude-opus-4-8",
}


def is_api_model(mkey):
    return mkey.startswith(("gpt3", "gpt4", "gpt5"))


def is_reasoning_api_model(mkey):
    return mkey.startswith("gpt5")


def is_vllm_model(mkey):
    return mkey.startswith(("gpt-oss"))


def is_claude_code_model(mkey):
    return mkey.startswith("claude")


def _load_transformers():
    import torch
    from transformers import (
        AutoModelForCausalLM,
        AutoModelForSequenceClassification,
        AutoTokenizer,
    )

    return torch, AutoModelForCausalLM, AutoModelForSequenceClassification, AutoTokenizer


def load_model(mkey, modelpaths=None, task="causal_lm"):
    paths = modelpaths
    if paths is None:
        paths = globals().get("modelpaths")
    mpath = paths[mkey]

    if is_api_model(mkey):
        from openai import OpenAI
        from keysecrets import oai_key

        oai_client = OpenAI(api_key=oai_key)
        tokenizer = None
        def model(msgdict, **k):
            if is_reasoning_api_model(mkey):
                k.setdefault("reasoning_effort", "medium")
            return oai_client.chat.completions.create(
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
    elif is_claude_code_model(mkey):
        from utils.claude_code_client import ClaudeCodeClient

        tokenizer = None
        model = ClaudeCodeClient(model_name=mpath)
        devices = None
    elif task == "sequence_classification":
        torch, _, AutoModelForSequenceClassification, AutoTokenizer = _load_transformers()
        tokenizer = AutoTokenizer.from_pretrained(mpath)
        model = AutoModelForSequenceClassification.from_pretrained(
            mpath,
            torch_dtype=torch.bfloat16,
            device_map="auto",
        )
        model.eval()
        devices = {p.device for p in model.parameters()}
    elif task == "causal_lm":
        torch, AutoModelForCausalLM, _, AutoTokenizer = _load_transformers()
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
    elif is_claude_code_model(mkey):
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
    if is_claude_code_model(mkey):
        return model.generate(inputs, temp=temp, max_tokens=max_tokens)

    outputs = model.generate(
        inputs,
        max_new_tokens=max_tokens,
        do_sample=True,
        pad_token_id=tokenizer.eos_token_id,
        eos_token_id=tokenizer.eos_token_id,
        temperature=temp,
    )
    return tokenizer.decode(outputs[0][len(inputs[0]) :], skip_special_tokens=True)
