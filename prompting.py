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
#0
("""public class Array<T> {
    /**
     * Returns true if the array contains the specified element.
     *
     * @param o element who is to be tested
     * @return true if this array contains the specified element
     */
    public boolean contains(Object o) ;
 
    /**
     * Returns the element at the specified position in the array.
     *
     * @param  index index of the element to return
     * @return the element at the specified position in the array
     */
    public E query(int index) ;
 
    /**
     * Returns the index of the first occurrence of the specified element
     * in the array, or -1 if this array does not contain the element.
     */
    public int index_of(Object x) ;
 
    /**
     * Returns the number of elements in this array.
     *
     * @return the number of elements in this array
     */
    public int getCount() ;
    
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
        // @@@ array contains the added value after the operation
    }
}""", 
"<code>assert this.contains(value);</code>"
),
#1
("""public class Array<T> {
    /**
     * Returns true if the array contains the specified element.
     *
     * @param o element who is to be tested
     * @return true if this array contains the specified element
     */
    public boolean contains(Object o) ;
 
    /**
     * Returns the element at the specified position in the array.
     *
     * @param  index index of the element to return
     * @return the element at the specified position in the array
     */
    public E query(int index) ;
 
    /**
     * Returns the index of the first occurrence of the specified element
     * in the array, or -1 if this array does not contain the element.
     */
    public int index_of(Object x) ;
 
    /**
     * Returns the number of elements in this array.
     *
     * @return the number of elements in this array
     */
    public int getCount() ;
    
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
        // @@@ first index of value in the array remains the same if value was already in the list,
            and value should be at the end of the array if it was not contained before.
    }
}""", 
"<code>assert (\\old(this.contains(value)) => this.index_of(value) == \\old(this.index_of(value))) && (!\\old(this.contains(value)) => this.index_of(value) == this.getCount()-1);</code>"
),
#2
("""public class Array<T> {
    /**
     * Returns true if the array contains the specified element.
     *
     * @param o element who is to be tested
     * @return true if this array contains the specified element
     */
    public boolean contains(Object o) ;
 
    /**
     * Returns the element at the specified position in the array.
     *
     * @param  index index of the element to return
     * @return the element at the specified position in the array
     */
    public E query(int index) ;
 
    /**
     * Returns the index of the first occurrence of the specified element
     * in the array, or -1 if this array does not contain the element.
     */
    public int index_of(Object x) ;
 
    /**
     * Returns the number of elements in this array.
     *
     * @return the number of elements in this array
     */
    public int getCount() ;
    
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
        // @@@ All the valid indices (between 0 and old size) in the array before add have the same element after add
    }
}""",
"<code>assert \\forall int i; 0<=i && i<\\old(this.getCount()); this.query(i).equals(\\old(this.query(i)));</code>"
),
#3
("""public class Array<T> {
    /**
     * Returns true if the array contains the specified element.
     *
     * @param o element who is to be tested
     * @return true if this array contains the specified element
     */
    public boolean contains(Object o) ;
 
    /**
     * Returns the element at the specified position in the array.
     *
     * @param  index index of the element to return
     * @return the element at the specified position in the array
     */
    public E query(int index) ;
 
    /**
     * Returns the index of the first occurrence of the specified element
     * in the array, or -1 if this array does not contain the element.
     */
    public int index_of(Object x) ;
 
    /**
     * Returns the number of elements in this array.
     *
     * @return the number of elements in this array
     */
    public int getCount() ;
    
    /**
     * Add the specified element to this array at the specified index out
       of the first 10 positions.
     *
     * @param value element to be appended to this array
     * @param index position at which the element is to be inserted
     * @return sz the number of elements in the result array
     */
    public int add_at_front(Object value, int index) {
        if (_sz == _items.length) ensureCapacity(_sz + 1);
        if (index < 0 || index > 10) throw new IndexOutofBoundsException();
        _items[index] = value;
        _version++;
        return _sz++;
        // @@@ If the insert position is valid (between 0 and 9), all the indices 
            before the insert position in the array before add have the same element 
            after the addition
    }
}""",
"<code>assert index>=0 && index<=9 => \\forall int i; 0<=i && i<index; this.query(i).equals(\\old(this.query(i)));</code>"
)
]

langmap = {
        "py": ("python",    "#",    eg_py, r"assert .*?"),
        "cs": ("csharp",    "//",   eg_cs, r"Debug.Assert\(.*?\);"),
        "java": ("java",    "//",   eg_java, r"Assert .*?;"),
}

default = """Your task is to read {0} code and output exactly one assert statement (specification) corresponding to the comment that starts with "@@@". 
Your statement should accurately reflect the natural language assertion. Make sure to include all relevant details (such as premises, bounds, or branch cases), and avoid leaving out information or adding anything extraneous.
You can think step by step before coming up with the final answer, but please make sure that your final answer(the {0} code of the assert statement) is displayed in a <code></code> block.\n"""

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
            header += f"1. If the assert statement needs to access the value of an expression at the beginning of the function, you can use the `\\old(expression)` syntax.\n"
            header += f"2. To refer to the return value of the method in the assert statement, you can use `\\result` variable.\n"
            header += f"3. To write A implies B or B happens if A holds, you may use the `A => B` syntax. Keep in mind that `=>` is binary with exactly two operands, and `=>` has lower priority than operator `&&` and `||` so use parentheses to ensure correct grouping.\n"
            header += f"4. If the assert statment needs to express that the `spec` should hold for each int variable `i` where `cond` holds, you may use `\\forall int i; cond; spec` syntax.\n"
            header += f"5. Use only publicly accessible observer methods provided in the test function. (Use `\\result` instead of calling the observer method that is being tested) All function calls in the test function should be of the format `this.func_name(args_list)`.\n"

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
