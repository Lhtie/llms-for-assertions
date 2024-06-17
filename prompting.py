import torch
import re
import os
from transformers import AutoTokenizer
import argparse

eg_py_inp, eg_py_out = """def sum(x, y):
    sum = x + y
    # @@@ sum is greater than or equal to x and y 
    return sum""", """assert sum >= x and sum >= y"""
eg_cs_inp, eg_cs_out = """public static int Sum(int x, int y)
{
    sum = x + y;
    // @@@ sum is greater than or equal to x and y 
    return sum;
}""", """Debug.Assert(sum >= x && sum >= y);"""

langmap = {
        "py": ("python",    "#",    eg_py_inp,  eg_py_out, r"assert .*?"),
        "cs": ("csharp",    "//",   eg_cs_inp,  eg_cs_out, r"Debug.Assert\(.*?\);"),
}

# C# one doesnt find Contract.Assert, Assert.Equals etc. but we already bias it towards Debug.Assert in most prompts

tvl = """Read the following {0} code and output assert statements corresponding to the comments that start with "@@@". Your output should just be {0} code that uses "{3}".
```{1}
{2}
```"""

enf_fmt = """Read the following {0} code and output assert statements corresponding to the comments that start with "@@@". Output the {0} code that is related to the assert statement in a <code></code> block.
```{1}
{2}
```"""

one_sht = """Your task is to read {0} code and output assert statements corresponding to the comments that start with "@@@". Output the {0} code that is related to the assert statement in a <code></code> block. For example if the code is: 
```{1}
{2}
```
The output should be:
<code>
{3}
</code>
Now, read the following {0} code and output assert statements corresponding to the comments that start with "@@@".
```{1}
{4}
```"""

oldret_kwds = """Your task is to read {0} code and output an assert statement corresponding to the comment that start with "@@@". Output the {0} code that is related to the assert statement in a <code></code> block. If the assert statement needs to access the value of a variable at the beginning of the function, you can use the `OLD(variable_name)` syntax. To refer to the return value of the function in the assert statement, you can use `RET` variable. For example, if the code is: 
```{1}
{2}public static int Sum(int x, int y)
{{
    for (int i = 0; i < y; i++){{
        x.Inc(1);
    }}
    // @@@ Value of x increases by y in the function
    return x;
}}
```
The output should be:
<code>
{3}Debug.Assert(OLD(x) + y = x);
</code>

Now, read the following {0} code and output an assert statement corresponding to the comment that start with "@@@".
```{1}
{4}
```"""

test = """Your task is to read {0} code and output an assert statement corresponding to the comment that start with "@@@". Output the {0} code that is related to the assert statement in a <code></code> block. If the assert statement needs to access the value of a variable at the beginning of the function, you can use the `OLD(variable_name)` syntax. To refer to the return value of the function in the assert statement, you can use `RET` variable. For example, if the code is: 
```{1}
{2}public static void Insert(Stack s, int x)
{{
    for (int i = 0; i < x; i++){{
        int inp = Input();
        s.push(inp);
    }}
    // @@@ Size of stack increases by x in the function
}}
```
The output should be:
<code>
{3}Debug.Assert(OLD(s.size) + x = s.size);
</code>
Another example:
```{1}
public static int Padd(int x, int y)
{{
    sum = x + y;
    // @@@ return value is greater than or equal to x and y 
    return sum;
}}
```
The output should be:
<code>
{3}Debug.Assert(RET >= x && RET >= y);
</code>
Another example:
```{1}
public static int Search(Collection c, int val)
{{
    int index = c.SearchFrom(c, val, 2);
    // @@@ index is either -1 or greater than or equal to 2
    return index;
}}
```
The output should be:
<code>
{3}Debug.Assert(index == -1 || index >= 2);
</code>
Now, read the following {0} code and output an assert statement corresponding to the comment that start with "@@@".
```{1}
{4}
```"""


def apply_chat_template(tokenizer, inst):
    return tokenizer.apply_chat_template(
            [{ 'role': 'user', 'content': inst }],
            return_tensors="pt",
            add_generation_prompt=True)


def transform(tid, tokenizer, code, langid):
    lang, cmnt_tkn, eg_inp, eg_out, srch_term = langmap[langid]

    lines = code.split("\n")
    cmnt_idx = [i if "@@@" in l and l.strip().startswith(cmnt_tkn) else -1 for (i,l) in enumerate(lines)]
    cmntlno = max(cmnt_idx)
    asrtlno = cmntlno + 1

    code = "\n".join(lines[:asrtlno] + lines[asrtlno+1:])

    assert sum([i != -1 for i in cmnt_idx]) == 1, "too few or many assertions to work on"

    if(tid == "trivial"):
        inst = tvl.format(lang, langid, code, srch_term)
        prompt = apply_chat_template(tokenizer, inst)
        return prompt
    
    elif(tid == "enforce-fmt"):
        inst = enf_fmt.format(lang, langid, code)
        prompt = apply_chat_template(tokenizer, inst)
        return prompt
    
    elif(tid == "one-shot"):
        inst = one_sht.format(lang, langid, eg_inp, eg_out, code)
        prompt = apply_chat_template(tokenizer, inst)
        return prompt

    elif(tid == "one-shot-enf"):
        inst = one_sht.format(lang, langid, eg_inp, eg_out, code)
        prompt = apply_chat_template(tokenizer, inst)
        suprt = tokenizer.encode("<code>",
                add_special_tokens=False, return_tensors="pt")
        return torch.cat((prompt, suprt), 1)

    elif(tid == "continue"):
        splitted = lines[cmntlno].split(cmnt_tkn)
        rplce =  f"{splitted[0]}{cmnt_tkn} an assertion using \"{srch_term}\" that {splitted[1]}"  # @@@ still in the comment
        pfx = "\n".join(lines[:cmntlno] + [rplce, ""])
        prompt = tokenizer.encode(pfx, return_tensors="pt")
        return prompt

    elif(tid == "os-oldret"):
        assert langid == "cs"
        inst = oldret_kwds.format(lang, langid, "", "", code)
        prompt = apply_chat_template(tokenizer, inst)
        return prompt

    elif(tid == "os-oldret-enf"):
        assert langid == "cs"
        inst = oldret_kwds.format(lang, langid, "", "", code)
        prompt = apply_chat_template(tokenizer, inst)
        suprt = tokenizer.encode("<code>",
                add_special_tokens=False, return_tensors="pt")
        return torch.cat((prompt, suprt), 1)

    elif(tid == "test"):
        assert langid == "cs"
        inst = test.format(lang, langid, "", "", code)
        prompt = apply_chat_template(tokenizer, inst)
        #return prompt
        suprt = tokenizer.encode("<code>",
                add_special_tokens=False, return_tensors="pt")
        return torch.cat((prompt, suprt), 1)
    
    else:   
        assert False, "Incorrect transform id: " + tid



def extract(tid, rspnse, langid):
    _, _, _, _, srch_term = langmap[langid]

    if(tid == "trivial"):
        for l in rspnse.split("\n"):
            if re.match(r"^\s*" + srch_term + r".*$", l):
                return l
        return ""
    
    elif(tid == "enforce-fmt"):
        match = re.search(r"<code>(.*?)</code>", rspnse, re.DOTALL)
        return match.group(1) if match else ""
    
    elif(tid == "one-shot" or tid == "os-oldret"):
        match = re.search(r"<code>(.*?)</code>", rspnse, re.DOTALL)
        return match.group(1) if match else ""

    elif(tid == "one-shot-enf" or tid == "os-oldret-enf"):
        match = re.search(r"(.*?)</code>", rspnse, re.DOTALL)
        return match.group(1) if match else ""

    elif(tid == "continue"):
        match = re.search(r".*?" + srch_term + r".*?\n", rspnse, re.DOTALL)
        return match.group(0) if match else ""

    elif(tid == "test"):
        match = re.search(r"(.*?)</code>", rspnse, re.DOTALL)
        return match.group(1) if match else ""
    
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
#            "oc33":     "/home/aman14/models/OpenCodeInterpreter-DS-33B",
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

            langid = f.split('.')[-2]

            prompt = transform(args.prompt, tokenizer, code, langid)
        
            print("#"*10, dirname + "/" + f, "#"*10)
            print(tokenizer.decode(prompt[0]))
            print("#"*20)

