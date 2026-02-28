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
        "mode_nli": "score",    # "label" or "score"
        "mkey_nli": "gpt-oss",
        "model_nli": None,
        "records": {}
    }
}
nli_instr = """You are performing a **roundtrip conformance check** between:
(1) a natural-language post-condition (the “premise”), and
(2) a second natural-language statement (the “hypothesis”) that is intended to reflect the semantics/structure of a generated post-condition formula.

Your job is to judge how well the hypothesis conforms to the premise under the following responsibility:

Conformance responsibility
1) Completeness: The hypothesis must not omit any component that the premise intends.
   - Every component mentioned or implied as an intended constraint in the premise should be present in, or entailed by, the hypothesis.
2) Soundness: The hypothesis should not introduce unrelated or unjustified components.
   - Ideally, every component in the hypothesis should be traceable to the premise’s intention.
   - In practice, *minor reasonable supplementation* is allowed (e.g., explicit bounds/ranges, type conversions, edge-case handling) as long as it does not change the intended structure or meaning.

What counts as a “component” (treat these as the primary comparison units)
- Variables / terms: \\result, method parameters, fields, local/loop variables, \old(…)
- Quantifiers: \\forall, \exists, and their quantified variables
- Bounds / ranges: index ranges, quantified ranges, numeric bounds, inclusive/exclusive endpoints
- Predicate relations: ==, !=, <, <=, >, >=, membership/containment, function calls used as predicates
- Logical connectives / structure: &&, ||, !, => (implication), grouping/precedence

Evaluation principle
- This is a *structure- and alignment-focused* check: prioritize whether the hypothesis preserves the overall logical skeleton and aligns each segment/component to the premise.
- Ignore superficial wording differences and synonyms of technical terms.
- Ignore fine-grained details; focus on whether the same structural components are present and aligned, and whether their logical relationships (quantifiers, bounds, predicates, connectives) match.
- The hypothesis may be imperfectly phrased or not fully “compilable” as a formula; still score based on whether the intended components/structure match.
- Do not purely evaluate on literal text similarity; Instead, reason about semantic and structure in the context of target code behavior. (the context information is given below)

Scoring (real value in [-1.0, 1.0])
Interpret the score as a combined measure of:
- Completeness (missing components/segments → lower score)
- Soundness (unjustified extra components/segments → lower score)
- Logical compatibility (contradictions/incompatible constraints → negative score)

Use these anchor points (you may output intermediate values like 0.8, 0.2, -0.3):
+1.0 Perfect Conformance:
  - Hypothesis preserves all components and the logical structure of the premise (may rephrase wording).
+0.5 Mostly Conformant / Minor Loss:
  - Hypothesis is consistent with the premise but omits some non-trivial components, weakens constraints, or only covers a subset of cases.
  - Or adds only minor, clearly reasonable supplementation that does not change intent.
  - (Typical: one missing bound, a weakened quantifier range, or missing a secondary conjunct.)
0.0 Neutral / Not Established:
  - The hypothesis is largely unrelated to the premise’s components/structure, OR
  - The hypothesis introduces new requirements not supported by the premise, OR
  - The hypothesis omits essential segments such that conformance cannot be verified from it.
-0.5 Partially Conflicting:
  - Some aligned components exist, but at least one important segment contradicts the premise (e.g., flipped inequality, negation, wrong \old usage, implication reversed, incompatible bound).
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

def extract_ans(res):
    match = re.findall(r"<ans>\s*(.*?)\s*</ans>", res, re.DOTALL)
    if match:
        ans_str = match[-1]
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
    
    assert model_dict is not None, "No model configurations"
    tokenizer = model_dict["tokenizer"]
    model = model_dict["model"]
    devices = model_dict["devices"]

    rec = []
    scores = []
    for premise, hypothesis in [(x, y)]:
        prompt = nli_instr.format(
            helper.langid, helper.classname, helper.funcname, 
            ", ".join([f"{typ} {var}" for var, typ in helper.funcs[-1]["args"].items()]),
            f"The method returns {helper.funcs[-1]['rtyp']} as result."
                if helper.funcs[-1]["rtyp"] != "void" else f"The method does not return any value.",
            helper.funcs[-1]["docs"],
            premise, hypothesis
        )
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
        prompt = prompt_transform(code, langid)
            
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
        with open(f"./results/logs/rdtpcheck_{langid}_{configs[langid]['mkey_backward']}_{configs[langid]['mkey_nli']}_{configs[langid]['mode_nli']}-{cc.split('/')[-1]}.json", "w") as f:
            json.dump(configs["java"]["records"], f, indent=4)

    else: 
        assert False, "Incorrect language id: " + langid

    return result
