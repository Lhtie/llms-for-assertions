import os
import re
import argparse

import sys
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), "..")))

from utils.onedown import get_funcs, closing_paren

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Sort methods in each class.")
    parser.add_argument("--indir", type=str, default="combinedcodes")
    parser.add_argument("--langid", type=str, default="java")
    args = parser.parse_args()

    for file in os.listdir(args.indir):
        if file.endswith(args.langid):
            with open(os.path.join(args.indir, file), "r") as f:
                code = f.read().split("\n")
            
            func_starts = get_funcs(code, args.langid)
            funcs = []
            idx, content = 0, []
            for f in func_starts:
                fname = re.search(r"\b(\w+)\s*\(", code[f].strip()).group(1)
                s = f
                while s < len(code) and "{" not in code[s] and ";" not in code[s]:
                    s += 1
                clp = closing_paren(code, s)
                start = f-1
                while code[start].strip().startswith(tuple(["//", "/*", "*", "*/", "@"])):
                    start -= 1
                while code[start].strip() == "":
                    start -= 1
                funcs.append((fname, code[start+1:clp]))
                
                content.append("\n".join(code[idx:start+1]))
                idx = clp
            
            end_part = "\n".join(code[idx:])
            funcs = sorted(funcs, key=lambda t: t[0])
            for fname, func in funcs:
                content.append("\n".join(func))
            content = "\n".join(content) + "\n" + end_part
            
            with open(os.path.join(args.indir, file), "w") as f:
                f.write(content)