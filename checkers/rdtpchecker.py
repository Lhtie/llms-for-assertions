import os
import argparse
import shutil
import sys
import re
import json
import glob
import subprocess
import numpy as np

from codehelper.javahelper import *
from nlasrtgen import prompt_transform
from codehelper.javahelper import javahelper
from llm import modelpaths, load_model, run_model

from sentence_transformers import SentenceTransformer, util
sentmodel = None

configs = {
    "java": {
        "mkey_backward": "gpt-oss",
        "num_backward": 8,
        "model_backward": None,
        "threshold": 0.6,
        "use_nli": True,
        "check_mode": "roundtrip",  # "roundtrip" or "direct_formal"
        "mode_nli": "score",    # "label" or "score"
        "prompt_nli": "component_context",  
            # component_context, simple_equiv, bidirectional_nli, component_no_context
        "mkey_nli": "gpt-oss",
        "model_nli": None,
        "records": {}
    }
}

component_context_instr = """You are performing a **roundtrip conformance check** between:
(1) a natural-language post-condition (the "premise"), and
(2) a second natural-language statement (the "hypothesis") that is a natural-language translation of a generated post-condition formula.

Your job is to judge how well the hypothesis conforms to the premise under the following responsibility:

Conformance responsibility
1) Completeness: The hypothesis must not omit any component that the premise intends.
   - Every component mentioned or implied as an intended constraint in the premise should be present in, or entailed by, the hypothesis.
2) Soundness: The hypothesis should not introduce unrelated or unjustified components.
   - Ideally, every component in the hypothesis should be traceable to the premise's intention.
   - In practice, *minor reasonable supplementation* is allowed (e.g., explicit bounds/ranges, type conversions, edge-case handling) as long as it does not change the intended structure or meaning.

What counts as a "component" (treat these as the primary comparison units)
- Entities / terms: the return value or result, method parameters, object fields, collection elements, indices, sizes, old/pre-state values, and new/post-state values
- Quantification / scope: statements about all items, any item, no item, a particular item, or a restricted subset of items
- Bounds / ranges: valid index ranges, quantified ranges, numeric limits, and whether endpoints are included or excluded
- Predicate relations: equality, inequality, ordering/comparison, containment/membership, nullness, type/compatibility requirements, and method-call properties
- Logical structure: conditions ("if/when/only if"), conjunctions ("and"), alternatives ("or/either"), negation ("not/no"), implications, case splits, and grouping/precedence implied by the sentence

Evaluation principle
- This is a *structure- and alignment-focused* check: prioritize whether the hypothesis preserves the overall logical skeleton and aligns each segment/component to the premise.
- Ignore superficial wording differences and synonyms of technical terms.
- Ignore fine-grained details; focus on whether the same structural components are present and aligned, and whether their logical relationships (quantifiers, bounds, predicates, connectives) match.
- The hypothesis may be imperfectly phrased or not fully "compilable" as a formula; still score based on whether the intended components/structure match.
- Do not purely evaluate on literal text similarity; Instead, reason about semantic and structure in the context of target code behavior. (the context information is given below)

Scoring (real value in [-1.0, 1.0])
Interpret the score as a combined measure of:
- Completeness (missing components/segments → lower score)
- Soundness (unjustified extra components/segments → lower score)
- Logical compatibility (contradictions/incompatible constraints → negative score)

Use these anchor points (you may output intermediate values like 0.8, 0.2, -0.3):
+1.0 Perfect Conformance:
  - Hypothesis preserves all components and the logical structure of the premise (may rephrase wording).
  - Hypothesis may add minor, clearly reasonable supplementation (e.g., explicit bounds/ranges, type conversions, edge-case handling) as long as it does not change the intended structure or meaning.
+0.5 Mostly Conformant / Minor Loss:
  - Hypothesis is consistent with the premise but omits some non-trivial components, weakens constraints, or only covers a subset of cases.
  - Or adds some unrelated or unjustified content while the core structure still mostly aligns with the premise.
0.0 Neutral / Not Established:
  - The hypothesis is largely unrelated to the premise's components/structure, OR
  - The hypothesis introduces new requirements not supported by the premise, OR
  - The hypothesis omits essential segments such that conformance cannot be verified from it.
-0.5 Partially Conflicting:
  - Some aligned components exist, but at least one important segment contradicts the premise (e.g., flipped inequality, negation, wrong old/pre-state reference, implication reversed, incompatible bound).
-1.0 Completely Conflicting:
  - The core structure/meaning contradicts the premise and cannot hold simultaneously.

For instances,
The premise is \"the result of the cloned array is not null.\".
The hypothesis is \"the result of cloning the array can never be null.\".
The final answer should be 1.0.

The premise is \"the element is contained in the array after the add operation.\".
The hypothesis is \"the element should be included in the array.\".
The final answer should be 1.0.

The premise is \"All the valid indices (between 0 and old size) in the array before add have the same element after add.\".
The hypothesis is \"After the operation, all the elements in valid indices in the array have the same value as before.\".
The final answer should be 0.8.

The premise is \"first index of value in the array remains the same if value was already in the list.\".
The hypothesis is \"first index of value in the array remains the same.\".
The final answer should be 0.1.

Here is the context information to help understand the sentences:
The sentences are assertions in natural language form describing the expected behavior or properties of a piece of {0} code, such as a function or method.
More specifically, You are given the implementation of a class {1}. Inside this class, there is a method {2}. The following two assertions are both written about the behavior of the method. To help you reason about their relationship, here is some context:
- The method takes in ({3}) as parameters.
- {4}
- The functionality of the method is documented below:
{5}

Output format:
- First, breifly explain your reasoning process in 1-3 concise sentences.
- Then, output only your decision as real-valued score wrapped in <ans> </ans> tags.
- Place exactly one score inside the tags. Do not include anything else inside the tags.

Here are the two assertions to evaluate:
The premise is: {6}
The hypothesis is: {7}
"""

simple_equiv_instr = """Your task is to compare two natural-language assertions and decide whether they are semantically equivalent.

Output format:
- Briefly explain your reasoning in 1-2 concise sentences.
- Then output exactly one score in <ans> </ans>.
- Use 1.0 if the two assertions are equivalent, 0.0 if they are partially related or uncertain, and -1.0 if they are not equivalent or conflict.

Assertion A: {0}
Assertion B: {1}
"""

bidirectional_nli_instr = """Your task is natural-language inference.

Decide whether the premise entails the hypothesis. The hypothesis is entailed only if every behavior allowed by the premise also satisfies the hypothesis.

Output format:
- Briefly explain your reasoning in 1-2 concise sentences.
- Then output exactly one score in <ans> </ans>.
- Use 1.0 if the premise entails the hypothesis, 0.0 if entailment is uncertain or only partial, and -1.0 if the premise does not entail or conflicts with the hypothesis.

Premise: {0}
Hypothesis: {1}
"""

component_no_context_instr = """You are performing a **roundtrip conformance check** between:
(1) a natural-language post-condition (the "premise"), and
(2) a second natural-language statement (the "hypothesis") that is a natural-language translation of a generated post-condition formula.

Your job is to judge how well the hypothesis conforms to the premise under the following responsibility:

Conformance responsibility
1) Completeness: The hypothesis must not omit any component that the premise intends.
   - Every component mentioned or implied as an intended constraint in the premise should be present in, or entailed by, the hypothesis.
2) Soundness: The hypothesis should not introduce unrelated or unjustified components.
   - Ideally, every component in the hypothesis should be traceable to the premise's intention.
   - In practice, *minor reasonable supplementation* is allowed (e.g., explicit bounds/ranges, type conversions, edge-case handling) as long as it does not change the intended structure or meaning.

What counts as a "component" (treat these as the primary comparison units)
- Entities / terms: the return value or result, method parameters, object fields, collection elements, indices, sizes, old/pre-state values, and new/post-state values
- Quantification / scope: statements about all items, any item, no item, a particular item, or a restricted subset of items
- Bounds / ranges: valid index ranges, quantified ranges, numeric limits, and whether endpoints are included or excluded
- Predicate relations: equality, inequality, ordering/comparison, containment/membership, nullness, type/compatibility requirements, and method-call properties
- Logical structure: conditions ("if/when/only if"), conjunctions ("and"), alternatives ("or/either"), negation ("not/no"), implications, case splits, and grouping/precedence implied by the sentence

Evaluation principle
- This is a *structure- and alignment-focused* check: prioritize whether the hypothesis preserves the overall logical skeleton and aligns each segment/component to the premise.
- Ignore superficial wording differences and synonyms of technical terms.
- Ignore fine-grained details; focus on whether the same structural components are present and aligned, and whether their logical relationships (quantifiers, bounds, predicates, connectives) match.
- The hypothesis may be imperfectly phrased or not fully "compilable" as a formula; still score based on whether the intended components/structure match.
- Do not purely evaluate on literal text similarity; Instead, reason about semantic and structure in the context of target code behavior. (the context information is given below)

Scoring (real value in [-1.0, 1.0])
Interpret the score as a combined measure of:
- Completeness (missing components/segments → lower score)
- Soundness (unjustified extra components/segments → lower score)
- Logical compatibility (contradictions/incompatible constraints → negative score)

Use these anchor points (you may output intermediate values like 0.8, 0.2, -0.3):
+1.0 Perfect Conformance:
  - Hypothesis preserves all components and the logical structure of the premise (may rephrase wording).
  - Hypothesis may add minor, clearly reasonable supplementation (e.g., explicit bounds/ranges, type conversions, edge-case handling) as long as it does not change the intended structure or meaning.
+0.5 Mostly Conformant / Minor Loss:
  - Hypothesis is consistent with the premise but omits some non-trivial components, weakens constraints, or only covers a subset of cases.
  - Or adds some unrelated or unjustified content while the core structure still mostly aligns with the premise.
0.0 Neutral / Not Established:
  - The hypothesis is largely unrelated to the premise's components/structure, OR
  - The hypothesis introduces new requirements not supported by the premise, OR
  - The hypothesis omits essential segments such that conformance cannot be verified from it.
-0.5 Partially Conflicting:
  - Some aligned components exist, but at least one important segment contradicts the premise (e.g., flipped inequality, negation, wrong old/pre-state reference, implication reversed, incompatible bound).
-1.0 Completely Conflicting:
  - The core structure/meaning contradicts the premise and cannot hold simultaneously.

Output format:
- Briefly explain your reasoning in 1-2 concise sentences.
- Then output exactly one score in <ans> </ans>.

The premise is: {0}
The hypothesis is: {1}
"""

direct_formal_instr = """You are checking whether a formal post-condition formula is semantically equivalent to an original natural-language assertion.

The natural-language assertion describes the intended behavior of a method. The formal specification is written in a Java/JML-like assertion syntax and may use:
- \\result for the return value
- \\old(expr) for pre-state values
- \\forall for universal quantification
- => for implication
- Java expressions such as this.size(), this.get(i), contains(...), equals(...), ==, !=, &&, ||, and null

Your job is to decide whether the formal specification expresses the same intended condition as the natural-language assertion.

Scoring (real value in [-1.0, 1.0]):
+1.0: The formal specification is equivalent to the natural-language assertion.
+0.5: Mostly equivalent but with a minor omission, weakening, or harmless extra condition.
0.0: Related but equivalence cannot be established, or important parts are missing.
-0.5: Partially conflicting, with at least one important semantic error.
-1.0: The formal specification clearly conflicts with the natural-language assertion.

Context:
The assertions describe behavior of {0} class {1}, method {2}.
- The method takes in ({3}) as parameters.
- {4}
- The method documentation is:
{5}

Output format:
- Briefly explain your reasoning in 1-2 concise sentences.
- Then output exactly one score wrapped in <ans> </ans>.

Natural-language assertion:
{6}

Formal specification:
{7}
"""

def extract_ans(res):
    match = re.search(r"(?:.*)<ans>\s*(.*?)\s*</ans>", res, re.DOTALL)
    if match:
        ans_str = match.group(1)
        try:
            return float(ans_str)
        except ValueError:
            return None
    else:
        return None

def score_to_label(score, pos_th=0.3, neg_th=-0.3):
    if score >= pos_th:
        return "Entailment"
    elif score <= neg_th:
        return "Contradiction"
    else:
        return "Neutral"

def sim(x, y):
    if sentmodel is None:
        sentmodel = SentenceTransformer('all-MiniLM-L6-V2')
    embx = sentmodel.encode(x, convert_to_tensor=True)
    emby = sentmodel.encode(y, convert_to_tensor=True)
    
    similarity = util.cos_sim(embx, emby)
    return similarity.item()

def equiv(x, y, config, helper):
    mkey = config["mkey_nli"]
    model_dict = config["model_nli"]
    mode = config["mode_nli"]
    threshold = config["threshold"]
    prompt_mode = config["prompt_nli"]
    
    assert model_dict is not None, "No model configurations"
    tokenizer = model_dict["tokenizer"]
    model = model_dict["model"]
    devices = model_dict["devices"]

    def prompt_for(premise, hypothesis):
        if prompt_mode == "component_context":
            return component_context_instr.format(
                helper.langid,
                helper.classname,
                helper.funcname,
                ", ".join([f"{typ} {var}" for var, typ in helper.funcs[-1]["args"].items()]),
                f"The method returns {helper.funcs[-1]['rtyp']} as result."
                    if helper.funcs[-1]["rtyp"] != "void" else f"The method does not return any value.",
                helper.funcs[-1]["docs"],
                premise,
                hypothesis,
            )
        if prompt_mode == "simple_equiv":
            return simple_equiv_instr.format(premise, hypothesis)
        if prompt_mode == "bidirectional_nli":
            return bidirectional_nli_instr.format(premise, hypothesis)
        if prompt_mode == "component_no_context":
            return component_no_context_instr.format(premise, hypothesis)
        raise AssertionError(f"Unknown prompt_nli: {prompt_mode}")

    pairs = [(x, y)]
    if prompt_mode == "bidirectional_nli":
        pairs = [(x, y), (y, x)]

    rec = []
    scores = []
    for premise, hypothesis in pairs:
        prompt = prompt_for(premise, hypothesis)
        msgdict = [
            {'role': 'system', 'content': f"You are a helpful assistant that excels at natural language inference."},
            {'role': 'user', 'content': prompt}
        ]

        # print(f"Inputs: {inputs[1]['content']}")
        response = run_model(mkey, model, tokenizer, devices, msgdict, 0.6)     # temp set to be 0.6
        ans = extract_ans(response)
        if mode == "label":
            ans = score_to_label(ans, threshold, -threshold)
        rec.append({
            "prompt_mode": prompt_mode,
            "premise": premise,
            "hypothesis": hypothesis,
            "response": response,
            "answer": ans
        })

        if mode == "label":
            c = ans.find("Contradiction") != -1
            n = ans.find("Neutral") != -1
            e = ans.find("Entailment") != -1
            assert int(e) + int(c) + int(n) == 1, "Answer should be direct and exact"
            if c or n:
                scores.append(int(e))
        else:
            scores.append(ans)
    
    return min(scores), rec

def direct_formal_equiv(nl_asrt, formal_asrt, config, helper):
    mkey = config["mkey_nli"]
    model_dict = config["model_nli"]
    mode = config["mode_nli"]
    threshold = config["threshold"]

    assert model_dict is not None, "No model configurations"
    tokenizer = model_dict["tokenizer"]
    model = model_dict["model"]
    devices = model_dict["devices"]

    prompt = direct_formal_instr.format(
        helper.langid,
        helper.classname,
        helper.funcname,
        ", ".join([f"{typ} {var}" for var, typ in helper.funcs[-1]["args"].items()]),
        f"The method returns {helper.funcs[-1]['rtyp']} as result."
            if helper.funcs[-1]["rtyp"] != "void" else f"The method does not return any value.",
        helper.funcs[-1]["docs"],
        nl_asrt,
        formal_asrt,
    )
    msgdict = [
        {'role': 'system', 'content': f"You are a helpful assistant that excels at formal specification analysis."},
        {'role': 'user', 'content': prompt}
    ]
    response = run_model(mkey, model, tokenizer, devices, msgdict, 0.6)
    ans = extract_ans(response)
    if mode == "label":
        ans = score_to_label(ans, threshold, -threshold)
        c = ans.find("Contradiction") != -1
        n = ans.find("Neutral") != -1
        e = ans.find("Entailment") != -1
        assert int(e) + int(c) + int(n) == 1, "Answer should be direct and exact"
        score = int(e)
    else:
        score = ans

    rec = [{
        "check_mode": "direct_formal",
        "natural_language_assertion": nl_asrt,
        "formal_spec": formal_asrt,
        "response": response,
        "answer": ans,
    }]
    return score, rec

def direct_formal_calc(asrt, pfx, sfx, langid, config):
    if langid == "java":
        helper = javahelper(pfx + '\n' + sfx)
    else:
        raise NotImplementedError("Unsupported language id: " + langid)

    cmnt_line = pfx.split("\n")[-1]
    nl_asrt = cmnt_line.split("@@@")[-1].strip()
    args = ", ".join([f"{typ} {var}" for var, typ in helper.funcs[-1]["args"].items()])
    rec_title = f"{helper.namespace}:{helper.funcname}({args}):{asrt}"
    score, rec = direct_formal_equiv(nl_asrt, asrt, config, helper)
    config["records"][rec_title] = {
        "samples": [{
            "formal_asrt": asrt,
            "nli": rec
        }],
        "score": score
    }
    return score

def rtc_calc(asrt, pfx, sfx, langid, config, nli=False):

    mkey = config["mkey_backward"]
    
    assert config["model_backward"] is not None, "No model configurations"
    model = config["model_backward"]["model"]
    tokenizer = config["model_backward"]["tokenizer"]
    devices = config["model_backward"]["devices"]

    if langid == "java":
        helper = javahelper(pfx + '\n' + sfx)
    else:
        raise NotImplementedError("Unsupported language id: " + langid)
    
    def sampling(x):
        cmnt_line = pfx.split("\n")[-1]
        cmnt_prefix = cmnt_line.split("@@@")[0] + "@@@"
        new_pfx = "\n".join(
            pfx.split("\n")[:-1] + [cmnt_prefix + " natural language assertion here"])
        
        code = new_pfx + "\n" + cmnt_prefix[:-3] + x + "\n" + sfx
        prompt = prompt_transform(code, langid, mode="precise")
            
        tot = 0
        args = ", ".join([f"{typ} {var}" for var, typ in helper.funcs[-1]["args"].items()])
        rec_title = f"{helper.namespace}:{helper.funcname}({args}):{asrt}"
        config["records"][rec_title] = {
            "samples": [],
            "score": None
        }
        for _ in range(config["num_backward"]):
            response = run_model(mkey, model, tokenizer, devices, prompt, 0.6)     # temp set to be 0.6
            # print(f"Response: {response}")
            assert "@@@" in response, "Generated NL not well formed"

            if nli:
                f, rec = equiv(
                    cmnt_line.split("@@@")[-1].strip(),
                    response.split("@@@")[-1].strip(),
                    config, helper
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
    config = configs["java"]
    needs_backward = config["check_mode"] == "roundtrip"
    if needs_backward and config["model_backward"] is None:
        tokenizer, model, devices = load_model(configs["java"]["mkey_backward"])
        configs["java"]["model_backward"] = {
            "tokenizer": tokenizer,
            "model": model,
            "devices": devices,
        }
    if config["model_nli"] is None:
        if needs_backward and config["mkey_nli"] == config["mkey_backward"]:
            configs["java"]["model_nli"] = configs["java"]["model_backward"]
        else:
            tokenizer, model, devices = load_model(config["mkey_nli"])
            configs["java"]["model_nli"] = {
                "tokenizer": tokenizer,
                "model": model,
                "devices": devices,
            }
    
    if config["check_mode"] == "direct_formal":
        return direct_formal_calc(asrt, pfx, sfx, "java", config)
    assert config["check_mode"] == "roundtrip", f"Unknown rdtp check_mode: {config['check_mode']}"
    if config["use_nli"]:
        return rtc_calc(asrt, pfx, sfx, "java", config, nli=True)
    else:
        rtc, fdlft = rtc_calc(asrt, pfx, sfx, "java", config, nli=False)
        gain = (rtc - fdlft) / fdlft
        
        return gain

def rdtpcheck(langid, pfx, sfx, grnd_truth, asrt, cc, check, **config_overrides):
    if langid in configs and config_overrides:
        for key, value in config_overrides.items():
            assert key in configs[langid], f"Unknown rdtp config key: {key}"
            configs[langid][key] = value

    if(langid == "java"):
        result = java_rdtpcheck(pfx, sfx, asrt)
        os.makedirs("./results/logs", exist_ok=True)
        with open(f"./results/logs/rdtpcheck_{langid}_{configs[langid]['check_mode']}_{configs[langid]['mkey_backward']}_{configs[langid]['mkey_nli']}_{configs[langid]['mode_nli']}_{configs[langid]['prompt_nli']}-{cc.split('/')[-1]}.json", "w") as f:
            json.dump(configs["java"]["records"], f, indent=4)

    else: 
        assert False, "Incorrect language id: " + langid

    return result
