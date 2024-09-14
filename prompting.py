import torch
import re
import os
from transformers import AutoTokenizer
import argparse

eg_py = [
("""def sum(x, y):
    sum = x + y
    # @@@ sum is greater than or equal to x and y 
    return sum""", """assert sum >= x and sum >= y""")
]

eg_cs = [
#0
("""public static int Sum(int x, int y)
{
    sum = x + y;
    // @@@ sum is greater than or equal to x and y 
    return sum;
}""", """Debug.Assert(sum >= x && sum >= y);"""),
#1
("""public static int Sum(int x, int y)
{
    for (int i = 0; i < y; i++){
        x.Inc(1);
    }
    // @@@ Value of x increases by y in the function
    return x;
}""", "<code>\nDebug.Assert(OLD(x) + y == x);\n</code>"),
#2
("""public static void Insert(Stack s, int x)
{
    for (int i = 0; i < x; i++){
        int inp = Input();
        s.push(inp);
    }
    // @@@ Size of stack increases by x in the function
}""", "<code>\nDebug.Assert(OLD(s.size) + x == s.size);\n</code>"),
#3
("""public static int Padd(int x, int y)
{
    sum = x + y;
    // @@@ return value is greater than or equal to x and y 
    return sum;
}""", "<code>\nDebug.Assert(RET >= x && RET >= y);\n</code>"),
#4
("""public static int Search(Collection c, int val)
{
    int index = c.SearchFrom(c, val, 2);
    // @@@ index is either -1 or greater than or equal to 2
    return index;
}""", "<code>\nDebug.Assert(index == -1 || index >= 2);\n</code>"),
#5
("""public static bool IsEqual(Object a, Object b);
public static Object Next(Collection c, Object a);
public static bool Contains(Collection c, Object a);
public static int Len(Collection c);
public static int Search(Collection c, Object obj)
{
    int index = 0;
    Object elem = c.first;
    while(elem){
        if(IsEqual(obj, elem)){
            break;
        }
        elem = Next(c, elem);
        index += 1;
    }

    // @@@ if c contains obj then return value is smaller than collection's length
    return index;
}""", ["<code>\nDebug.Assert(!Contains(c, obj) || RET < Len(c));\n</code>",
       "<code>\nDebug.Assert((Contains(c, obj)) => (RET < Len(c)));\n</code>",
       "<code>\nDebug.Assert(IMPLIES(Contains(c, obj), RET < Len(c)));\n</code>"]),
#6
("""public static int Padd(int val, int x)
{
    val = val + x;
    // @@@ return value is greater than old value of val if x is positive
    return val;
}""", ["<code>\nDebug.Assert(!(x > 0) | RET > OLD(val));\n</code>", 
       "<code>\nDebug.Assert((x > 0) => (RET > OLD(val)));\n</code>",
       "<code>\nDebug.Assert(IMPLIES(x > 0, RET > OLD(val)));\n</code>"""]), 
#7
("""public static void Insert(int x)
{
    for (int i = 0; i < x; i++){
        int inp = Input();
        Push(inp);
    }
    // @@@ Size of stack increases by x in the function
}""", "<code>\nDebug.Assert(OLD(this.Size) + x == this.Size);\n</code>"),
#8
("""private Collection c;
public static bool IsEqual(Object a, Object b);
public static Object Next(Object a);
public static bool Contains(Object a);
public static int Len();
public static int Search(Object obj)
{
    int index = 0;
    Object elem = c.first;
    while(elem){
        if(IsEqual(obj, elem)){
            break;
        }
        elem = Next(c, elem);
        index += 1;
    }

    // @@@ if collection contains obj then return value is smaller than its length
    return index;
}""", "<code>\nDebug.Assert(!this.Contains(obj) || RET < this.Len());\n</code>"),
]

langmap = {
        "py": ("python",    "#",    eg_py, r"assert .*?"),
        "cs": ("csharp",    "//",   eg_cs, r"Debug.Assert\(.*?\);"),
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

oldret_kwds = """Your task is to read {0} code and output an assert statement corresponding to the comment that start with "@@@". Output the {0} code that is related to the assert statement in a <code></code> block. If the assert statement needs to access the value of a variable at the beginning of the function, you can use the `OLD(variable_name)` syntax. To refer to the return value of the function in the assert statement, you can use `RET` variable."""

threes_oldret_kwds = """Your task is to read {0} code and output an assert statement corresponding to the comment that start with "@@@". Output the {0} code that is related to the assert statement in a <code></code> block. Use only publicly accessible methods in the assertion. If the assert statement needs to access the value of a variable at the beginning of the function, you can use the `OLD(variable_name)` syntax. To refer to the return value of the function in the assert statement, you can use `RET` variable."""

fours_implies_v1 = """Your task is to read {0} code and output an assert statement corresponding to the comment that start with "@@@". Output the {0} code that is related to the assert statement in a <code></code> block. Use only publicly accessible methods in the assertion. If the assert statement needs to access the value of a variable at the beginning of the function, you can use the `OLD(variable_name)` syntax. To refer to the return value of the function in the assert statement, you can use `RET` variable. To write A implies B, you may use the `A => B` syntax."""

fours_implies_v2 = """Your task is to read {0} code and output an assert statement corresponding to the comment that start with "@@@". Output the {0} code that is related to the assert statement in a <code></code> block. Use only publicly accessible methods in the assertion. If the assert statement needs to access the value of a variable at the beginning of the function, you can use the `OLD(variable_name)` syntax. To refer to the return value of the function in the assert statement, you can use `RET` variable. To write A implies B, you may use the `IMPLIES(A, B)` syntax."""

this_force = """Your task is to read {0} code and output an assert statement corresponding to the comment that start with "@@@". Output the {0} code that is related to the assert statement in a <code></code> block. Use only publicly accessible methods in the assertion. All function calls in the assertion should be of the format `this.func_name(args_list)`. If the assert statement needs to access the value of a variable at the beginning of the function, you can use the `OLD(variable_name)` syntax. To refer to the return value of the function in the assert statement, you can use `RET` variable."""

def apply_chat_template(mkey, tokenizer, inst, langid, onemsg):
    assert len(inst) >= 3 and type(inst[0]) == str and type(inst[-1]) == str
    for egid in range(1, len(inst)-1):
        assert type(inst[egid][0]) == str and type(inst[egid][1]) == str
    
    if onemsg:
        msg = inst[0] + \
                f""" For example, if the code is:\n```{langid}\n{inst[1][0]}\n```\nThe output should be:\n{inst[1][1]}\n"""
        for egid in range(2, len(inst)-1):
            msg += f"Another example:\n```{langid}\n{inst[egid][0]}\n```\nThe output should be:\n{inst[egid][1]}\n"
        msg += f"Now, read the following {langmap[langid][0]} code and output an assert statement corresponding to the comment that start with \"@@@\".\n"
        msg += f"```{langid}\n{inst[-1]}\n```"
        msgdict = [{ 'role': 'user', 'content': msg }]
    else:
        msgdict = [{ 'role': 'system', 'content': inst[0] }]
        for egid in range(1, len(inst)-1):
            msgdict += [{ 'role': 'user', 'content': f"```{langid}\n{inst[egid][0]}\n```" }]
            msgdict += [{ 'role': 'assistant', 'content': inst[egid][1] }]
        msgdict += [{ 'role': 'user', 'content':  f"```{langid}\n{inst[-1]}\n```" }]

    if mkey in ["gpt3", "gpt4"]:
        return msgdict
    else:
        return tokenizer.apply_chat_template(
                msgdict,
                return_tensors="pt",
                add_generation_prompt=True)


def transform(mkey, tid, tokenizer, code, langid, onemsg):
    lang, cmnt_tkn, eg_lang, srch_term = langmap[langid]

    lines = code.split("\n")
    cmnt_idx = [i if "@@@" in l and l.strip().startswith(cmnt_tkn) else -1 for (i,l) in enumerate(lines)]
    cmntlno = max(cmnt_idx)
    asrtlno = cmntlno + 1

    code = "\n".join(lines[:asrtlno] + lines[asrtlno+1:])

    assert sum([i != -1 for i in cmnt_idx]) == 1, "too few or many assertions to work on"

    oldtid = tid
    if tid[-4:] == "-enf": tid = tid[:-4]

    if(tid == "trivial"):
        inst = tvl.format(lang, langid, code, srch_term)
        prompt = apply_chat_template(mkey, tokenizer, inst, langid, onemsg)
    
    elif(tid == "enforce-fmt"):
        inst = enf_fmt.format(lang, langid, code)
        prompt = apply_chat_template(mkey, tokenizer, inst, langid, onemsg)
    
    elif(tid == "one-shot"):
        inst = one_sht.format(lang, langid, eg_lang[0][0], eg_lang[0][1], code)
        prompt = apply_chat_template(mkey, tokenizer, inst, langid, onemsg)

    elif(tid == "continue"):
        splitted = lines[cmntlno].split(cmnt_tkn)
        rplce =  f"{splitted[0]}{cmnt_tkn} an assertion using \"{srch_term}\" that {splitted[1]}"  # @@@ still in the comment
        pfx = "\n".join(lines[:cmntlno] + [rplce, ""])
        prompt = tokenizer.encode(pfx, return_tensors="pt")

    elif(tid == "os-oldret"):
        inst = [oldret_kwds.format(lang), eg_lang[1], code]
        prompt = apply_chat_template(mkey, tokenizer, inst, langid, onemsg)

    elif(tid == "3s-oldret"):
        inst = [threes_oldret_kwds.format(lang), *eg_lang[2:5], code]
        prompt = apply_chat_template(mkey, tokenizer, inst, langid, onemsg)

    elif(tid == "3s-oldret-better-eg"):
        inst = [threes_oldret_kwds.format(lang), *eg_lang[2:4], 
                (eg_lang[5][0], eg_lang[5][1][0]), code]
        prompt = apply_chat_template(mkey, tokenizer, inst, langid, onemsg)

    elif(tid == "4s-implies-v1"):
        inst = [fours_implies_v1.format(lang), *eg_lang[2:4],
                (eg_lang[6][0], eg_lang[6][1][1]),
                (eg_lang[5][0], eg_lang[5][1][1]), code]
        prompt = apply_chat_template(mkey, tokenizer, inst, langid, onemsg)

    elif(tid == "4s-implies-v2"):
        inst = [fours_implies_v1.format(lang), *eg_lang[2:4],
                (eg_lang[6][0], eg_lang[6][1][2]),
                (eg_lang[5][0], eg_lang[5][1][2]), code]
        prompt = apply_chat_template(mkey, tokenizer, inst, langid, onemsg)

    elif(tid == "this-fmt"):
        inst = [this_force.format(lang), eg_lang[7], eg_lang[3],
                (eg_lang[6][0], eg_lang[6][1][0]),
                eg_lang[8], code]
        prompt = apply_chat_template(mkey, tokenizer, inst, langid, onemsg)

    else:   
        assert False, "Incorrect transform id: " + tid

    if oldtid[-4:] == "-enf":
        suprt = tokenizer.encode("<code>",
                add_special_tokens=False, return_tensors="pt")
        return torch.cat((prompt, suprt), 1)
    else:
        return prompt


def extract(tid, rspnse, langid):
    _, _, _, srch_term = langmap[langid]

    if(tid == "trivial"):
        for l in rspnse.split("\n"):
            if re.match(r"^\s*" + srch_term + r".*$", l):
                return l
        return ""
    
    elif(tid == "enforce-fmt"):
        match = re.search(r"<code>(.*?)</code>", rspnse, re.DOTALL)
        return match.group(1) if match else ""
    
    elif(tid in ["one-shot", "os-oldret", "3s-oldret", "3s-oldret-better-eg", "4s-implies-v1", "4s-implies-v2", "this-fmt"]):
        match = re.search(r"<code>(.*?)</code>", rspnse, re.DOTALL)
        return match.group(1) if match else ""

    elif(tid in [t+"-enf" for t in ["one-shot", "os-oldret", "3s-oldret", "3s-oldret-better-eg", "4s-implies-v1", "4s-implies-v2", "this-fmt"]]):
        match = re.search(r"(.*?)</code>", rspnse, re.DOTALL)
        return match.group(1) if match else ""

    elif(tid == "continue"):
        match = re.search(r".*?" + srch_term + r".*?\n", rspnse, re.DOTALL)
        return match.group(0) if match else ""

    elif(tid == "test"):
        match = re.search(r"<code>(.*?)</code>", rspnse, re.DOTALL)
        return match.group(1) if match else ""

    elif(tid == "test-enf"):
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
    parser.add_argument("--onemsg", type=int, default=1)
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

            prompt = transform(mkey, args.prompt, tokenizer, code, langid, args.onemsg)
        
            print("#"*10, dirname + "/" + f, "#"*10)
            print(tokenizer.decode(prompt[0]))
            print("#"*20)

