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
                pattern = r"""^(public|protected|private\s+)?
                              (static\s+)?
                              (final\s+)?
                              (?!if|else|for|while|switch|catch|throw|return)\b
                              (\w+[\w\<\>\[\],\s\?]*)\s+
                              (\w+)\s*
                              \(([\w\<\>\[\],\s\?]*)\)\s*
                              ({|;)?.*
                            """
                if re.match(pattern, line.strip(), re.VERBOSE):
                    ret.append(buff[0][0])
                buff = []
        return ret

def closing_paren(lines, start):
    end = start + 1
    balance = lines[start].count("{") - lines[start].count("}")
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
    # print("#"*10, "func_starts", func_starts, "#"*10)
    for f in func_starts:
        content.append("\n".join(code[idx:f]))
        start = f
        while start < len(code) and "{" not in code[start] and ";" not in code[start]:
            start += 1
        clp = closing_paren(code, start)
        idx = clp
        if comment < clp and comment >= f:
            content.append("\n".join(code[f:clp]))
        else:
            # start, balance = f, 0
            # while start < len(code):
            #     balance += code[start].count("(") - code[start].count(")")
            #     start += 1
            #     if balance == 0:
            #         break
            content.append("\n".join(code[f:start+1]).split("{", 1)[0] + ";")
    end_part = "\n".join(code[idx:]) # imp in movedown
    content = "\n".join(content)

    # movedown
    code = content.split("\n")
    func_starts = get_funcs(code, args.langid)
    comment = get_lines("@@@", code)[0]
    for f in func_starts:
        s = f
        while s < len(code) and "{" not in code[s] and ";" not in code[s]:
            s += 1
        clp = closing_paren(code, s)
        start = f-1
        if "{" in code[s]:
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

