import argparse
import os

parser = argparse.ArgumentParser()
parser.add_argument("--infile", type=str)
parser.add_argument("--outdir", type=str)
parser.add_argument("--write", type=int, default=0)
args = parser.parse_args()

f = open(args.infile, "r")
code = f.read().split("\n")
f.close()

def get_lines(term, lines):
    ret = []
    for i,l in enumerate(lines):
        if term in l:
            ret.append(i)
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

def nilclean(arr, comment, offset):
    comment = comment - f
    res = [arr[0], arr[1]]
    i = 2
    while i < len(arr)-1:
        if "get" == arr[i].strip():
            end = closing_paren(arr, i+1)
            if comment < end-1 and comment > i+1:
                res += [arr[i], arr[i+1], arr[comment], arr[comment+1], arr[end-1]]
            i = end-1
        if "set" == arr[i].strip():
            end = closing_paren(arr, i+1)
            if comment < end-1 and comment > i+1:
                res += [arr[i], arr[i+1], arr[comment], arr[comment+1], arr[end-1]]
            i = end-1
        if i == comment:
            res += [arr[i], arr[i+1]]
        i += 1
    res += [arr[-1]]
    return res

# onefunc
func_starts = get_lines("public virtual", code)
comment = get_lines("@@@", code)[0]
idx, content = 0, []
for f in func_starts:
    content.append("\n".join(code[idx:f]))
    clp = closing_paren(code, f+1)
    idx = clp
    if comment < clp-1 and comment > f+1:
        content.append("\n".join(nilclean(code[f:clp], comment, f)))
    else:
        content.append(code[f] + ("" if ";" in code[f] else ";"))
end_part = "\n".join(code[idx:]) # imp in movedown
content = "\n".join(content)

# movedown
code = content.split("\n")
func_starts = get_lines("public virtual", code)
comment = get_lines("@@@", code)[0]
for f in func_starts:
    clp = closing_paren(code, f+1)
    start = f-1
    if "{" in code[f+1]:
        while "//" in code[start]:
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
fname = ".".join(split[:-1]) + "nildown" + "." + split[-1] + "." + str(instid)
fpath = args.outdir + "/" + fname

if args.write:
    f = open(fpath, "w")
    f.write(content)
    f.close()
else:
    print("#"*10, fpath, "#"*10)
    print(content)

