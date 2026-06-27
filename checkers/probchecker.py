import math
import os

from llm import is_api_model, is_claude_code_model, is_vllm_model, load_model
from prompting import transform


configs = {
    "java": {
        "mkey": os.environ.get("PROBCHECKER_MKEY", "gpt-oss"),
        "model": None,
        "onemsg": False,
        "mode": "default",
    }
}


def split_raw_responses(text):
    return [chunk.strip() for chunk in text.split("-" * 20) if chunk.strip()]


def format_prompt_text(tokenizer, prompt):
    return tokenizer.apply_chat_template(
        prompt,
        tokenize=False,
        add_generation_prompt=True,
    )


def is_api_logprob_model(mkey):
    return mkey == "gpt-oss-api"


def format_api_prompt_text(prompt):
    parts = []
    for message in prompt:
        role = message.get("role", "user")
        content = message.get("content", "")
        parts.append(f"{role}: {content}")
    parts.append("assistant:")
    return "\n\n".join(parts)


def token_logprob_value(entry, token_id):
    if entry is None:
        return None
    if isinstance(entry, dict):
        value = entry.get(token_id)
        if value is None:
            value = entry.get(str(token_id))
        if value is None:
            return None
        if hasattr(value, "logprob"):
            return float(value.logprob)
        if isinstance(value, (tuple, list)):
            return float(value[0])
        return float(value)
    if hasattr(entry, "logprob"):
        return float(entry.logprob)
    return float(entry)


def score_vllm_response(model, tokenizer, prompt, response):
    from vllm import SamplingParams

    prompt_text = format_prompt_text(tokenizer, prompt)
    full_text = prompt_text + response
    prompt_len = len(tokenizer.encode(prompt_text, add_special_tokens=False))

    outputs = model.generate(
        prompts=[full_text],
        sampling_params=SamplingParams(
            temperature=0.0,
            max_tokens=1,
            prompt_logprobs=1,
        ),
    )
    output = outputs[0]
    token_ids = output.prompt_token_ids
    prompt_logprobs = output.prompt_logprobs

    logprobs = []
    for idx in range(prompt_len, len(token_ids)):
        lp = token_logprob_value(prompt_logprobs[idx], token_ids[idx])
        if lp is not None:
            logprobs.append(lp)

    return summarize_logprobs(logprobs)


def score_hf_response(model, tokenizer, devices, prompt, response):
    import torch

    prompt_text = format_prompt_text(tokenizer, prompt)
    full_text = prompt_text + response
    prompt_ids = tokenizer(prompt_text, return_tensors="pt", add_special_tokens=False).input_ids
    full_ids = tokenizer(full_text, return_tensors="pt", add_special_tokens=False).input_ids
    prompt_len = prompt_ids.shape[1]

    if full_ids.shape[1] <= prompt_len:
        return summarize_logprobs([])

    full_ids = full_ids.to(model.device)
    with torch.no_grad():
        logits = model(full_ids).logits
        log_probs = torch.log_softmax(logits[:, :-1, :], dim=-1)

    token_logprobs = []
    for token_idx in range(prompt_len, full_ids.shape[1]):
        lp = log_probs[0, token_idx - 1, full_ids[0, token_idx]]
        token_logprobs.append(float(lp.item()))

    return summarize_logprobs(token_logprobs)


def get_completion_logprobs(choice):
    logprobs = getattr(choice, "logprobs", None)
    if logprobs is None and isinstance(choice, dict):
        logprobs = choice.get("logprobs")
    if logprobs is None:
        return [], [], []

    if isinstance(logprobs, dict):
        tokens = logprobs.get("tokens") or []
        token_logprobs = logprobs.get("token_logprobs") or []
        text_offset = logprobs.get("text_offset") or []
    else:
        tokens = getattr(logprobs, "tokens", None) or []
        token_logprobs = getattr(logprobs, "token_logprobs", None) or []
        text_offset = getattr(logprobs, "text_offset", None) or []
    return tokens, token_logprobs, text_offset


def get_prompt_logprob_payload(outputs):
    prompt_payload = getattr(outputs, "prompt", None)
    if prompt_payload is None and isinstance(outputs, dict):
        prompt_payload = outputs.get("prompt")
    if not prompt_payload:
        return None
    if isinstance(prompt_payload, list):
        return prompt_payload[0] if prompt_payload else None
    return prompt_payload


def get_payload_text_and_logprobs(payload):
    if payload is None:
        return "", [], [], []

    if isinstance(payload, dict):
        text = payload.get("text") or ""
        logprobs = payload.get("logprobs") or {}
    else:
        text = getattr(payload, "text", "") or ""
        logprobs = getattr(payload, "logprobs", None) or {}

    if isinstance(logprobs, dict):
        tokens = logprobs.get("tokens") or []
        token_logprobs = logprobs.get("token_logprobs") or []
        text_offset = logprobs.get("text_offset") or []
    else:
        tokens = getattr(logprobs, "tokens", None) or []
        token_logprobs = getattr(logprobs, "token_logprobs", None) or []
        text_offset = getattr(logprobs, "text_offset", None) or []

    return text, tokens, token_logprobs, text_offset


def logprobs_for_text_span(text, tokens, token_logprobs, text_offset, target):
    if not target:
        return []

    start = text.rfind(target) if text else -1
    if start < 0:
        return []
    end = start + len(target)

    if text_offset:
        return [
            float(lp)
            for lp, offset in zip(token_logprobs, text_offset)
            if lp is not None and start <= offset < end
        ]

    logprobs = []
    offset = 0
    for token, lp in zip(tokens, token_logprobs):
        token_text = str(token)
        token_start = offset
        token_end = offset + len(token_text)
        if lp is not None and token_end > start and token_start < end:
            logprobs.append(float(lp))
        offset = token_end
    return logprobs


def score_api_chat_response(model, prompt, response):
    messages = list(prompt) + [{"role": "assistant", "content": response}]
    outputs = model.client.chat.completions.create(
        model=model.model_name,
        messages=messages,
        temperature=0.0,
        max_tokens=1,
        logprobs=1,
        echo=True,
    )
    payload = get_prompt_logprob_payload(outputs)
    text, tokens, token_logprobs, text_offset = get_payload_text_and_logprobs(payload)
    return summarize_logprobs(
        logprobs_for_text_span(text, tokens, token_logprobs, text_offset, response)
    )


def score_api_completion_response(model, prompt, response):
    prompt_text = format_api_prompt_text(prompt)
    full_text = prompt_text + response
    response_start = len(prompt_text)
    response_end = len(full_text)

    outputs = model.client.completions.create(
        model=model.model_name,
        prompt=full_text,
        temperature=0.0,
        max_tokens=1,
        logprobs=1,
        echo=True,
    )
    choice = outputs.choices[0]
    _, token_logprobs, text_offset = get_completion_logprobs(choice)

    logprobs = []
    for lp, offset in zip(token_logprobs, text_offset):
        if lp is not None and response_start <= offset < response_end:
            logprobs.append(float(lp))
    return summarize_logprobs(logprobs)


def score_api_response(mkey, model, prompt, response):
    if not is_api_logprob_model(mkey):
        raise NotImplementedError(f"{mkey} does not expose token logprobs for probchecker")

    try:
        result = score_api_chat_response(model, prompt, response)
        if result.get("num_tokens", 0):
            return result
    except Exception:
        pass
    return score_api_completion_response(model, prompt, response)


def summarize_logprobs(logprobs):
    if not logprobs:
        return {
            "sum_logprob": None,
            "avg_logprob": None,
            "num_tokens": 0,
            "perplexity": None,
        }

    total = sum(logprobs)
    avg = total / len(logprobs)
    return {
        "sum_logprob": total,
        "avg_logprob": avg,
        "num_tokens": len(logprobs),
        "perplexity": math.exp(-avg),
    }


def score_response(mkey, model, tokenizer, devices, prompt, response):
    if is_api_model(mkey):
        return score_api_response(mkey, model, prompt, response)
    if is_claude_code_model(mkey):
        raise NotImplementedError(f"{mkey} does not expose local token logits for probchecker")
    if is_vllm_model(mkey):
        return score_vllm_response(model, tokenizer, prompt, response)
    return score_hf_response(model, tokenizer, devices, prompt, response)


def load_prob_model(langid, mkey=None):
    config = configs[langid]
    if mkey is None:
        mkey = config["mkey"]
    if config["model"] is None or config.get("loaded_mkey") != mkey:
        tokenizer, model, devices = load_model(mkey)
        config["model"] = {
            "tokenizer": tokenizer,
            "model": model,
            "devices": devices,
        }
        config["loaded_mkey"] = mkey
    return config["model"]


def probcheck_file(code, langid, raw_result_path, mkey=None, mode=None, onemsg=None):
    config = configs[langid]
    mkey = mkey or config["mkey"]
    mode = mode or config["mode"]
    onemsg = config["onemsg"] if onemsg is None else onemsg

    raw_result_path = os.fspath(raw_result_path)
    responses = split_raw_responses(open(raw_result_path, "r").read())
    model_dict = load_prob_model(langid, mkey)
    tokenizer = model_dict["tokenizer"]
    model = model_dict["model"]
    devices = model_dict["devices"]
    prompt = transform(mkey, mode, tokenizer, code, langid, onemsg)

    return [
        score_response(mkey, model, tokenizer, devices, prompt, response)
        for response in responses
    ]
