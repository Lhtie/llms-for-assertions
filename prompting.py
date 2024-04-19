import torch
import re

tvl = """Read the following code and output assert statements corresponding to the comments. Your output should just be python code.\n"""

enf_fmt = """Read the following code and output assert statements corresponding to the comments. Output the code that is related to the assert statement in a <code></code> block.\n"""

one_sht = """Your task is to read output assert statements corresponding to the comments in the code. Output the code that is related to the assert statement in a <code></code> block. For example if the code is: 
```py
def sum(x, y):
    # x and y are positive 
    return x+y
```
The output should be:
<code>
assert x > 0 and y > 0
</code>
Now, read the following code and output assert statements corresponding to the comments.\n"""

def apply_chat_template(tokenizer, inst):
    return tokenizer.apply_chat_template(
            [{ 'role': 'user', 'content': inst }],
            return_tensors="pt",
            add_generation_prompt=True)


def transform(tid, tokenizer, code):
    if(tid == "trivial"):
        inst = tvl + code
        prompt = apply_chat_template(tokenizer, inst)
        return prompt
    
    elif(tid == "enforce-fmt"):
        inst = enf_fmt + code
        prompt = apply_chat_template(tokenizer, inst)
        return prompt
    
    elif(tid == "one-shot"):
        inst = one_sht + code
        prompt = apply_chat_template(tokenizer, inst)
        return prompt

    elif(tid == "one-shot-enf"):
        inst = one_sht + code
        prompt = apply_chat_template(tokenizer, inst)
        suprt = tokenizer.encode("<code>",
                add_special_tokens=False, return_tensors="pt")
        return torch.cat((prompt, suprt), 1)

    elif(tid == "continue"):
        lines = code.split("\n")
        lno = max([i if l.strip() and l.strip()[0] == "#" else -1 for (i,l) in enumerate(lines)])
        assert lno != -1, "Code doesn't have comments to work upon"

        rplce = lines[lno].split("#")[0] + "# an assertion that " + lines[lno].split("#")[1] 
        pfx = "\n".join(lines[:lno] + [rplce, ""])
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

