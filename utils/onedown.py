import argparse
import os
import re

def get_lines(term, lines):
    ret = []
    for i,l in enumerate(lines):
        if term in l:
            ret.append(i)
    return ret

def get_funcs(lines, langid="cs"):
    if langid == "cs":
        return get_lines("public virtual", lines)
    elif langid == "java":
        ret, buff = [], []
        balance = 0
        for i, l in enumerate(lines):
            balance += l.count("(") - l.count(")")
            buff.append((i, l))
            if balance == 0:
                line = "\n".join([x for _, x in buff])
                pattern = r"""(public|protected|private\s+)?
                              (static\s+)?
                              (final\s+)?
                              (?!if|else|for|while|switch|catch|throw|return)\b
                              (\w+[\w\<\>\[\],\s\?]*)\s+
                              ()(\w+)\s*
                              \(([\w\<\>\[\],\s\?]*)\)\s*
                              ({|;).*
                            """
                if re.match(pattern, line.strip(), re.VERBOSE):
                    ret.append(buff[0][0])
                buff = []
        return ret

def closing_paren(lines, start):
    if "{" not in lines[start]:
        return start
    end, balance = start + 1, 1
    while end < len(lines):
        if balance == 0: return end
        balance += lines[end].count("{") - lines[end].count("}")
        end += 1
    return end

def onedown(args):
    f = open(args.infile, "r")
    code = f.read().split("\n")
    f.close()

    # onefunc
    func_starts = get_funcs(code, args.langid)
    comment = get_lines("@@@", code)[0]
    idx, content = 0, []
    for f in func_starts:
        content.append("\n".join(code[idx:f]))
        clp = closing_paren(code, f if "{" in code[f] else f+1)
        idx = clp
        if comment < clp and comment >= f:
            content.append("\n".join(code[f:clp]))
        else:
            start, balance = f, 0
            while start < len(code):
                balance += code[start].count("(") - code[start].count(")")
                start += 1
                if balance == 0:
                    break
            content.append("\n".join(code[f:start]).split("{", 1)[0] + ";")
    end_part = "\n".join(code[idx:]) # imp in movedown
    content = "\n".join(content)

    # movedown
    code = content.split("\n")
    func_starts = get_funcs(code, args.langid)
    comment = get_lines("@@@", code)[0]
    for f in func_starts:
        clp = closing_paren(code, f if "{" in code[f] else f+1)
        start = f-1
        if "{" in code[f] or "{" in code[f+1]:
            while code[start].strip().startswith(tuple(["//", "/*", "*", "*/"])):
                start -= 1
            content = code[:start+1] + code[clp:] + ["\n"] + code[start+1:clp]
            break
    content = "\n".join(content) + "\n" + end_part

    start = -1
    for f in os.listdir(args.outdir):
        fpath = args.outdir + "/" + f
        if(os.path.isfile(fpath)):
            start = max(start, int(fpath.split(".")[-1]))

    instid = start + 1

    split = args.infile.split("/")[-1].split(".")[:-1]
    fname = ".".join(split[:-1]) + "onedown" + "." + split[-1] + "." + str(instid)
    fpath = args.outdir + "/" + fname

    if args.write:
        f = open(fpath, "w")
        f.write(content)
        f.close()
    else:
        print("#"*10, fpath, "#"*10)
        print(content)

