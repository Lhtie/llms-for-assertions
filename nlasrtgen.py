import os
import argparse
import re
import json

from llm import modelpaths, load_model, move_inputs_to_model, run_model

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
eg_java = [
#0
("""public class Array<T> {
    ...
    
    /**
     * Returns the number of elements in this array.
     *
     * @return the number of elements in this array
     */
    public int getCount() {
        return _sz;
        // @@@ natural language assertion here
        // assert \\result >= 0;
    }
}""",
"// assert \\result >= 0;",
"// @@@ Result is always non-negative."
),
#1
("""public class Array<T> {
    ...
    
    /**
     * Appends the specified element to the end of this array.
     *
     * @param value element to be appended to this array
     * @return sz the number of elements in the result array
     */
    public int add(Object value) {
        if (_sz == _items.length) ensureCapacity(_sz + 1);
        _items[_sz] = value;
        _version++;
        return _sz++;
        // @@@ natural language assertion here
        // assert this.contains(value);
    }
}""", 
"// assert this.contains(value);",
"// @@@ The array contains the added value after add."
),
#2
("""public class Array<T> {
    ...
    
    /**
     * Appends the specified element to the end of this array.
     *
     * @param value element to be appended to this array
     * @return sz the number of elements in the result array
     */
    public int add(Object value) {
        if (_sz == _items.length) ensureCapacity(_sz + 1);
        _items[_sz] = value;
        _version++;
        return _sz++;
        // @@@ natural language assertion here
        // assert \\old(this.contains(value)) => this.indexOf(value) == \\old(this.indexOf(value));
    }
}""", 
"// assert \\old(this.contains(value)) => this.indexOf(value) == \\old(this.indexOf(value));",
"// @@@ First index of value in the array remains the same if value was already in the list."
),
#3
("""public class Array<T> {
    ...
    
    /**
     * Appends the specified element to the end of this array.
     *
     * @param value element to be appended to this array
     * @return sz the number of elements in the result array
     */
    public int add(Object value) {
        if (_sz == _items.length) ensureCapacity(_sz + 1);
        _items[_sz] = value;
        _version++;
        return _sz++;
        // @@@ natural language assertion here
        // assert \\forall int i; 0<=i && i<\\old(this.size()-1); this.get(i)==\\old(this.get(i));
    }
}""",
"// assert \\forall int i; 0<=i && i<\\old(this.size()-1); this.get(i)==\\old(this.get(i));",
"// @@@ Every element that was in the array before add remains unchanged after add."
)
]

langmap = {
        "py": ("python",    "#",    eg_py, r"assert .*?"),
        "cs": ("csharp",    "//",   eg_cs, r"Debug.Assert\(.*?\);"),
        "java": ("java",    "//",   eg_java, r"assert .*?;"),
}

def prompt_transform(code, langid, mode="natural"):
    lang, cmnt_tkn, eg_lang, srch_term = langmap[langid]
    if mode not in {"natural", "precise"}:
        raise ValueError(f"Unsupported prompt mode: {mode}")

    lines = code.split("\n")
    cmnt_idx = [i if "@@@" in l and l.strip().startswith(cmnt_tkn) else -1 for (i,l) in enumerate(lines)]
    cmntlno = max(cmnt_idx)
    asrtlno = cmntlno + 1

    assert sum([i != -1 for i in cmnt_idx]) == 1, "too few or many assertions to work on"

    msg = f"Your task is to read {lang} code and write a natural language assertion that describes a specific logical specification in the code.\n"
    if lang == "java":
        msg += f"Here are descriptions for some syntactic symbols in JML logic:\n"
        msg += f"1. If the assertion uses \"=>\" or \"==>\", such as \"A => B\", that means \"A\" implies \"B\".\n"
        msg += f"2. \\old(expression) means the value of expression before the method is executed.\n"
        msg += f"3. \\result means the return value of the method.\n"
        msg += f"4. \"\\forall var i; cond; spec\" means that the \"spec\" should hold for all the \"i\" such that \"cond\" holds.\n"
    else:
        raise NotImplementedError
    
    msg += f"Please try to make your translation as consistent as possible. Your translation should be equivalent to the original assertion. Do not include anything extra, and also do not leave anything out, especially premises.\n"
    msg += f"Also write the translation as if you were a careful human engineer writing contract specifications for this code in plain English: follow the logic of the code naturally, make the statement fluent, clear, and easy to read, and prefer ordinary human phrasing over formal logical wording.\n"
    if mode == "natural":
        msg += f"Do not translate the formal assertion too literally; prioritize natural, smooth wording, and feel free to adjust word order or phrasing when that helps the specification read more like something a human would write.\n"
        msg += f"In general, prioritize the main contract logic over low-level implementation details when the meaning is the same. Do not include detailed implementation aspects, but summarize them in high-level logic.\n"
        msg += f"For example, if an assertion says something like \"index>=0 && index<=size\", prefer to summarize that as \"index is valid\" instead of translating the numeric bounds literally. Likewise, if an assertion uses a null-safe equality pattern like \"a==null && b==null || a.equals(b)\", prefer to say simply that \"a and b are equal\".\n"
    else:
        msg += f"Translate the formal assertion as accurately and completely as possible: preserve every premise, bound, quantified condition, old-state reference, return-value reference, null case, equality condition, and logical connective in the natural language assertion.\n"
        msg += f"Do not summarize away implementation-level details when they affect the exact meaning. Include all details from the formal formula in natural language, even if the resulting sentence is longer.\n"
        msg += f"For example, if an assertion says something like \"index>=0 && index<=size\", explicitly state that the index is greater than or equal to 0 and less than or equal to size. Likewise, if an assertion uses a null-safe equality pattern like \"a==null && b==null || a.equals(b)\", explicitly mention both the case where both values are null and the case where one value equals the other.\n"
    msg += f"Your output should be one single line starting with \"{cmnt_tkn} @@@ \"\n"
    msg += f"Here are several examples for your reference:\n"
    for i, (eg, asrt, nl_asrt) in enumerate(eg_lang):
        msg += f"Example {i+1}:\n"
        msg += f"Read the following code snippet:\n\n{eg}\n\n"
        msg += f"Write a natural language assertion that describes the assertion: {asrt}\n"
        msg += f"Your natural language assertion should be similar to: {nl_asrt}\n"
    msg += f"Now, read the following {lang} code:\n\n{code}\n\nWrite a natural language assertion that describes the assertion code: {lines[asrtlno].strip()}.\nPlease directly output your answer without any other information.\n"

    msgdict = [
        {'role': 'system', 'content': f"You are a helpful assistant that explains {lang} assertions in natural language."},
        {'role': 'user', 'content': msg}
    ]
    return msgdict
    
def extract(text, langid):
    lang, cmnt_tkn, eg_lang, srch_term  = langmap[langid]
    lines = text.split("\n")
    result = []
    
    for line in lines:
        match = re.search(rf"(?:.*){cmnt_tkn}\s*@@@(.*)", line)
        if match:
            result.append(match.group(1).strip())
            
    return result

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--codedir", type=str, default="./codes")
    parser.add_argument("--resultdir", type=str, default="./results_nl")
    parser.add_argument("--codelist", nargs='+', default=[])
    parser.add_argument("--modellist", nargs='+', default=[])
    parser.add_argument("--nsamples", type=int, default=3)
    parser.add_argument("--temp", type=float, default=0.0)
    parser.add_argument("--write", default=False, action="store_true")
    parser.add_argument("--mode", choices=["natural", "precise"], default="natural")
    args = parser.parse_args()

    for mkey in modelpaths:
        if(len(args.modellist) != 0 and mkey not in args.modellist):
            continue

        mpath = modelpaths[mkey]
        mname = mpath.split("/")[-1]
        dirname = args.resultdir + "/" + mname
        assert mname

        tokenizer, model, devices = load_model(mkey)

        for f in os.listdir(args.codedir):
            if(len(args.codelist) != 0 and f.split('.')[-1] not in args.codelist):
                continue

            print("Generating assertion for file: " + f)
            fd = open(os.path.join(args.codedir, f), "r")
            code = fd.read()
            fd.close()

            langid = f.split('.')[-2]

            prompt = prompt_transform(code, langid, args.mode)

            allrspnse  = "-"*20 + '\n'
            for _ in range(args.nsamples):
                response = run_model(mkey, model, tokenizer, devices, prompt, args.temp)
                # print(f"Response: {response}")
                allrspnse += response + '\n' + "-"*20 + '\n'

            if(args.write):
                os.makedirs(dirname, exist_ok=True)
                fd = open(os.path.join(dirname, f), "w")
                fd.write(allrspnse)
                fd.close()
            else:
                print("#"*10, dirname + "/" + f, "#"*10)
                print(allrspnse)
                print("#"*20)
                
        del model
        del tokenizer
