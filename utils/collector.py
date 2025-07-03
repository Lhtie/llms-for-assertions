import os
import argparse
import json
import pandas as pd
from openpyxl import load_workbook

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Collect generated natural language assertions.")
    parser.add_argument('--indir', type=str, required=True, help='Directory of the input')
    parser.add_argument('--info', type=str, default="codehelper/java_angello_info.json")
    parser.add_argument('--start', type=str, default="ArrayList")
    parser.add_argument('--sheet', type=str, default="JDK")
    args = parser.parse_args()
    
    with open(args.info, "r") as f:
        info = json.load(f)
    keys = list(info.keys())
    keys = keys[keys.index(args.start):]
        
    wb = load_workbook("Assertions from C2S.xlsx")
    sheet = wb[args.sheet]
    post_conds = sheet["C"][1:]
    
    for model_name in os.listdir(args.indir):
        print(f"Model name: {model_name}" + "#" * 20)
        
        lines = []
        for case in keys:
            files = [file for file in os.listdir(os.path.join(args.indir, model_name)) if file.startswith(case)]
            files = sorted(files, key=lambda x: int(x.split('.')[-1]))
            # print(files)
            for file in files:
                file = os.path.join(args.indir, model_name, file)
                with open(file, "r") as f:
                    res = f.read().split("-" * 20 + '\n')[1:-1]
                
                lines.append("\t".join([r.strip()[7:] for r in res]))
                empty_line = "\t".join(["" for _ in res])
        
        index = 0
        for post_cond in post_conds:
            if post_cond.value is not None and post_cond.font.color.rgb != "FFFF0000":
                print(lines[index])
                index += 1
            else:
                print(empty_line)