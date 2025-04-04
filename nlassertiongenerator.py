import torch
from transformers import AutoTokenizer, AutoModelForCausalLM
import os
import argparse
import re
from keysecrets import *
from openai import OpenAI
from time import sleep

modelpaths = {
        "ds7":      "deepseek-ai/deepseek-coder-6.7b-instruct",
        # "mc7":      "TheBloke/Magicoder-S-DS-6.7B-GGUF",
        "oc7":      "m-a-p/OpenCodeInterpreter-DS-6.7B",
        # "oc33":     "/home/aman14/models/OpenCodeInterpreter-DS-33B",
        "gpt3":      "gpt-3.5-turbo",
        "gpt4":      "gpt-4",
}

eg_py = []
eg_cs = [
#0
("""public virtual int Count
{
    get
    {
        // @@@ natural language assertion here
Debug.Assert(New_Ret >= 0);
        return _size;
    }
}""",
"Debug.Assert(New_Ret >= 0);",
"// @@@ size of array is always greater than or equal to 0"
),
#1
("""public virtual int Add(Object value)
{
    if (_size == _items.Length) EnsureCapacity(_size + 1);
    _items[_size] = value;
    _version++;

// @@@ natural language assertion here
Debug.Assert(New_objContainsarg0 );
// @@@ natural language assertion here
Debug.Assert( New_objCount == 1 + Old_objCount );
// @@@ natural language assertion here
Debug.Assert( Old_objLastIndexOfarg0 < New_objLastIndexOfarg0 );
// @@@ natural language assertion here
Debug.Assert( !Old_objContainsarg0 || Old_objIndexOfarg0 == New_objIndexOfarg0 );

    return _size++;
}""", 
"Debug.Assert(New_objContainsarg0 );",
"// @@@ array contains the added value after the operation"
),
#2
("""public virtual int Add(Object value)
{
    if (_size == _items.Length) EnsureCapacity(_size + 1);
    _items[_size] = value;
    _version++;

// @@@ natural language assertion here
Debug.Assert(New_objContainsarg0 );
// @@@ natural language assertion here
Debug.Assert( New_objCount == 1 + Old_objCount );
// @@@ natural language assertion here
Debug.Assert( Old_objLastIndexOfarg0 < New_objLastIndexOfarg0 );
// @@@ natural language assertion here
Debug.Assert( !Old_objContainsarg0 || Old_objIndexOfarg0 == New_objIndexOfarg0 );

    return _size++;
}""", 
"Debug.Assert( !Old_objContainsarg0 || Old_objIndexOfarg0 == New_objIndexOfarg0 );",
"// @@@ first index of value in the list remains same if value was already in the list"
),
#3
(""""public virtual bool Contains(Object item)
{
    // @@@ natural language assertion here
Debug.Assert(New_objCount == Old_objCount );

// @@@ natural language assertion here
Debug.Assert(!(New_Ret) ||  New_objLastIndexOfarg0 < New_objCount );
// @@@ natural language assertion here
Debug.Assert(!(New_Ret) ||  New_objIndexOfarg0 >= 0);

// @@@ natural language assertion here
Debug.Assert(New_Ret  ||  (New_objIndexOfarg0 == -1 && New_objLastIndexOfarg0 == -1) );

    if (item == null)
    {
        for (int i = 0; i < _size; i++)
            if (_items[i] == null)
                return true;
        return false;
    }
    else
    {
        for (int i = 0; i < _size; i++)
            if ((_items[i] != null) && (_items[i].Equals(item)))
                return true;
        return false;
    }
}
""",
"Debug.Assert(New_Ret  ||  (New_objIndexOfarg0 == -1 && New_objLastIndexOfarg0 == -1) );",
"// @@@ If the return value is true, first index of item in the array is more than or same as 0"
)
]
eg_java = []

langmap = {
        "py": ("python",    "#",    eg_py, r"assert .*?"),
        "cs": ("csharp",    "//",   eg_cs, r"Debug.Assert\(.*?\);"),
        "java": ("java",    "//",   eg_java, r"assert .*?;"),
}

def run(mkey, model, tokenizer, inputs, temp):
    if mkey in ["gpt3", "gpt4"]:
        sleep(1)
        outputs = model(inputs, max_tokens=1024, temperature=temp)
        return outputs.choices[0].message.content
    else:
        outputs = model.generate(
            inputs, 
            max_new_tokens=1024,
            do_sample=True,
            pad_token_id=tokenizer.eos_token_id,
            eos_token_id=tokenizer.eos_token_id,
            temperature=temp
        ) # other params: https://huggingface.co/docs/transformers/v4.39.3/en/main_classes/text_generation
        
        return tokenizer.decode(outputs[0][len(inputs[0]):], skip_special_tokens=True)
    
def prompt_transform(mkey, tokenizer, code, langid):
    lang, cmnt_tkn, eg_lang, srch_term = langmap[langid]

    lines = code.split("\n")
    cmnt_idx = [i if "@@@" in l and l.strip().startswith(cmnt_tkn) else -1 for (i,l) in enumerate(lines)]
    cmntlno = max(cmnt_idx)
    asrtlno = cmntlno + 1

    assert sum([i != -1 for i in cmnt_idx]) == 1, "too few or many assertions to work on"

    msg = f" Your task is to read {lang} code, and write a natural language assertion that describes a specific assertion in the code.\n"
    msg += f"Here are several examples for your reference:\n"
    for i, (eg, asrt, nl_asrt) in enumerate(eg_lang):
        msg += f"Example {i+1}:\n"
        msg += f"Read the following code snippet:\n\n{eg}\n\n"
        msg += f"Write a natural language assertion that describes the assertion: {asrt}.\n"
        msg += f"Your natural language assertion should be similar to: {nl_asrt}\n"
    msg += f"Now, read the following {lang} code:\n\n{code}\n\nWrite a natural language assertion that describes the assertion code: {lines[asrtlno].strip()}.\nPlease directly output your answer without any other information.\n"

    msgdict = [
        {'role': 'system', 'content': f"You are a helpful assistant that writes {lang} assertions."},
        {'role': 'user', 'content': msg}
    ]

    if mkey in ["gpt3", "gpt4"]:
        return msgdict
    else:
        return tokenizer.apply_chat_template(
                msgdict,
                return_tensors="pt",
                add_generation_prompt=True)
    
def extract(text, langid):
    lang, cmnt_tkn, eg_lang, srch_term  = langmap[langid]
    lines = text.split("\n")
    result = []
    
    for line in lines:
        match = re.search(cmnt_tkn + r" @@@(.*)", line)
        if match:
            result.append(match.group(1).strip())
            
    return result

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--codedir", type=str, default="./codes")
    parser.add_argument("--resultdir", type=str, default="./results_nl")
    parser.add_argument("--codelist", nargs='+', default=[])
    parser.add_argument("--modellist", nargs='+', default=[])
    parser.add_argument("--nsamples", type=int, default=5)
    parser.add_argument("--temp", type=float, default=0.0)
    parser.add_argument("--write", action="store_true", default=False)
    args = parser.parse_args()

    oai_client = OpenAI(api_key = oai_key)

    for mkey in modelpaths:
        if(len(args.modellist) != 0 and mkey not in args.modellist):
            continue

        mpath = modelpaths[mkey]
        mname = mpath.split("/")[-1]
        dirname = args.resultdir + "/" + mname
        assert mname

        if mkey in ["gpt3", "gpt4"]:
            tokenizer = None
            model = lambda msgdict, **k : oai_client.chat.completions.create(
                    messages = msgdict,
                    model = mpath,
                    **k
            )
        else:
            tokenizer = AutoTokenizer.from_pretrained(mpath)
            model = AutoModelForCausalLM.from_pretrained(
                mpath,
                torch_dtype=torch.bfloat16,
                device_map="auto",
            )
            model.eval()

        for f in os.listdir(args.codedir):
            if(len(args.codelist) != 0 and f.split('.')[-1] not in args.codelist):
                continue

            fd = open(os.path.join(args.codedir, f), "r")
            code = fd.read()
            fd.close()

            langid = f.split('.')[-2]

            prompt = prompt_transform(mkey, tokenizer, code, langid)
            if mkey in ["gpt3", "gpt4"]:
                inputs = prompt
            else:
                inputs = prompt.to(model.device)

            allrspnse  = "-"*20 + '\n'
            for _ in range(args.nsamples):
                response = run(mkey, model, tokenizer, inputs, args.temp)
                # print(f"Response: {response}")
                allrspnse += response + '\n' + "-"*20 + '\n'

            if(args.write):
                os.makedirs(dirname, exist_ok=True)
                fd = open(os.path.join(dirname, f), "w")
                fd.write(allrspnse)
                fd.close()
                # fd = open(os.path.join(dirname, f + ".extract"), "w")
                # fd.write(allasrts)
                # fd.close()
            else:
                print("#"*10, dirname + "/" + f, "#"*10)
                print(allrspnse)
                print("#"*20)
                # print("#"*10, dirname + "/" + f + ".extract", "#"*10)
                # print(allasrts)
                # print("#"*20)
                
        del model
        del tokenizer
