import torch
import re
import os
from transformers import AutoTokenizer
import argparse

tvl = """Read the following code and output assert statements corresponding to the comments that start with "@@@". Your output should just be python code.
```py
"""

enf_fmt = """Read the following code and output assert statements corresponding to the comments that start with "@@@". Output the code that is related to the assert statement in a <code></code> block.
```py
"""

one_sht = """Your task is to read code and output assert statements corresponding to the comments that start with "@@@". Output the code that is related to the assert statement in a <code></code> block. For example if the code is: 
```py
def sum(x, y):
    # @@@ x and y are positive 
    return x+y
```
The output should be:
<code>
assert x > 0 and y > 0
</code>
Now, read the following code and output assert statements corresponding to the comments that start with "@@@".
```py
"""

def apply_chat_template(tokenizer, inst):
    return tokenizer.apply_chat_template(
            [{ 'role': 'user', 'content': inst }],
            return_tensors="pt",
            add_generation_prompt=True)


def transform(tid, tokenizer, code):
    lines = code.split("\n")

    cmnt_idx = [i if "@@@" in l and l.strip()[0] == "#" else -1 for (i,l) in enumerate(lines)]
    assert sum([i != -1 for i in cmnt_idx]) == 1, "too few or many assertions to work on"
    cmntlno = max(cmnt_idx)
    asrtlno = cmntlno + 1

    code = "\n".join(lines[:asrtlno] + lines[asrtlno+1:])

    if(tid == "trivial"):
        inst = tvl + code + "```"
        prompt = apply_chat_template(tokenizer, inst)
        return prompt
    
    elif(tid == "enforce-fmt"):
        inst = enf_fmt + code + "```"
        prompt = apply_chat_template(tokenizer, inst)
        return prompt
    
    elif(tid == "one-shot"):
        inst = one_sht + code + "```"
        prompt = apply_chat_template(tokenizer, inst)
        return prompt

    elif(tid == "one-shot-enf"):
        inst = one_sht + code + "```"
        prompt = apply_chat_template(tokenizer, inst)
        suprt = tokenizer.encode("<code>",
                add_special_tokens=False, return_tensors="pt")
        return torch.cat((prompt, suprt), 1)

    elif(tid == "continue"):
        rplce = lines[cmntlno].split("#")[0] + "# an assertion that " + lines[cmntlno].split("#")[1] 
        pfx = "\n".join(lines[:cmntlno] + [rplce, ""])
        prompt = tokenizer.encode(pfx, return_tensors="pt")
        return prompt
    
    else:   
        assert False, "Incorrect transform id: " + tid



def extract(tid, rspnse):
    if(tid == "trivial"):
        for l in rspnse.split("\n"): 
            if re.match(r"^\s*assert\s+.*", l):
                return l
        return ""
    
    elif(tid == "enforce-fmt"):
        match = re.search(r"<code>(.*?)</code>", rspnse, re.DOTALL)
        return match.group(1) if match else ""
    
    elif(tid == "one-shot"):
        match = re.search(r"<code>(.*?)</code>", rspnse, re.DOTALL)
        return match.group(1) if match else ""

    elif(tid == "one-shot-enf"):
        match = re.search(r"(.*?)</code>", rspnse, re.DOTALL)
        return match.group(1) if match else ""

    elif(tid == "continue"):
        match = re.search(r".*?assert\s+.*?\n", rspnse, re.DOTALL)
        return match.group(0) if match else ""
    
    else:   
        assert False, "Incorrect transform id: " + tid


if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--codedir", type=str, default="./codes")
    parser.add_argument("--codelist", nargs='+', default=[])
    parser.add_argument("--modellist", nargs='+', default=[])
    parser.add_argument("--prompt", type=str, required=True)
    args = parser.parse_args()

    modelpaths = {
            "ds7":      "deepseek-ai/deepseek-coder-6.7b-instruct",
            "mc7":      "/home/aman14/models/Magicoder-S-DS-6.7B",
            "oc7":      "/home/aman14/models/OpenCodeInterpreter-DS-6.7B",
            "oc33":     "/home/aman14/models/OpenCodeInterpreter-DS-33B",
    }
    
    for mkey in modelpaths:
        if(len(args.modellist) != 0 and mkey not in args.modellist):
            continue

        mpath = modelpaths[mkey]
        tokenizer = AutoTokenizer.from_pretrained(mpath)

        dirname = mpath.split("/")[-1] + "/" + args.prompt

        for f in os.listdir(args.codedir):
            if(len(args.codelist) != 0 and f.split('.')[-1] not in args.codelist):
                continue

            fd = open(os.path.join(args.codedir, f), "r")
            code = fd.read()
            fd.close()

            prompt = transform(args.prompt, tokenizer, code)
        
            print("#"*10, dirname + "/" + f, "#"*10)
            print(tokenizer.decode(prompt[0]))
            print("#"*20)

