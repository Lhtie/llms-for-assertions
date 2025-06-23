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
}""", ["<code>\nDebug.Assert(RET >= x && RET >= y);\n</code>",
       """<code>
void TestFunction(int x, int y)
{
    int ret = Padd(x, y);
    Debug.Assert(ret >= x && ret >= y);
}
</code>"""]),
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
}""", ["<code>\nDebug.Assert(!(x > 0) || RET > OLD(val));\n</code>", 
       "<code>\nDebug.Assert((x > 0) => (RET > OLD(val)));\n</code>",
       "<code>\nDebug.Assert(IMPLIES(x > 0, RET > OLD(val)));\n</code>",
       """<code>
void TestFunction(int val, int x)
{
    int old_val = val;
    int ret = Padd(val, x);
    Debug.Assert(!(x > 0) || ret > old_val );
}
</code>"""]), 
#7
("""public static void Insert(int x)
{
    for (int i = 0; i < x; i++){
        int inp = Input();
        Push(inp);
    }
    // @@@ Size of stack increases by x in the function
}""", ["<code>\nDebug.Assert(OLD(this.Size) + x == this.Size);\n</code>",
       """<code>
void TestFunction(int x)
{
    int old_size = this.Size;
    Insert(x);
    Debug.Assert(old_size + x == this.Size);
}
</code>"""]),
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
}""", ["<code>\nDebug.Assert(!this.Contains(obj) || RET < this.Len());\n</code>",
       """<code>
void TestFunction(Object obj)
{
    int ret = this.Search(obj);
    Debug.Assert(!this.Contains(obj) || ret < this.Len());
}
</code>"""]),
]

eg_java = [
    
]

langmap = {
        "py": ("python",    "#",    eg_py, r"assert .*?"),
        "cs": ("csharp",    "//",   eg_cs, r"Debug.Assert\(.*?\);"),
        "java": ("java",    "//",   eg_java, r"Assert .*?;"),
}

default = """Your task is to read {0} code and output an assert statement (specification) corresponding to the comment that starts with "@@@". Please output the {0} code of the assert statement in a <code></code> block."""

def apply_chat_template(mkey, tokenizer, inst, langid, onemsg):
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

    if mkey.startswith(("gpt3", "gpt4")):
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

    if (tid == "default"):
        header = default.format(lang)

        if langid == "java":
            header += f"Here are some rules and tips:\n"
            header += f"1. If the assert statement needs to access the value of a variable at the beginning of the function, you can use the `\\old(variable_name)` syntax.\n"
            header += f"2. To refer to the return value of the function in the assert statement, you can use `\\result` variable.\n"
            header += f"3. To write A implies B, you may use the `A => B` syntax."
            header += f"4. If the assert statment needs to express that for all the variable `i` that `cond` holds, the `spec` should jointly hold, you may use `\\forall var i; cond; spec` syntax.\n"
            header += f"5. Use only publicly accessible methods in the test function. All function calls in the test function should be of the format `this.func_name(args_list)`."
        else: raise NotImplementedError
        
        inst = [header] + eg_java + [code]
        prompt = apply_chat_template(mkey, tokenizer, inst, langid, onemsg)
    
    else:   
        assert False, "Incorrect transform id: " + tid
        
    return prompt


def extract(tid, rspnse, langid):
    _, _, _, srch_term = langmap[langid]

    if(tid == "default"):
        match = re.search(r"<code>(.*?)</code>", rspnse, re.DOTALL)
        return match.group(1) if match else ""
    
    else:   
        assert False, "Incorrect transform id: " + tid
