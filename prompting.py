import torch

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
    
    else:   
        assert False, "Incorrect transform id: " + tid
