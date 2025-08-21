import os
import argparse
import json
from openpyxl import load_workbook

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Collect generated natural language assertions.")
    parser.add_argument('--mode', type=str, default="file2sheet", choices=["file2sheet", "sheet2file", "findmissing", "check2sheet", "combinechecks"])
    parser.add_argument('--indir', type=str, help='Directory of the input')
    parser.add_argument('--info', type=str, default="codehelper/java_angello_info.json")
    parser.add_argument('--sheet', type=str, default="All")
    parser.add_argument('--range', nargs='+', default=[])
    parser.add_argument('--outdir', type=str, default="")
    args = parser.parse_args()
    
    with open(args.info, "r") as f:
        info = json.load(f)
    if args.sheet == "All":
        keys = [x for sheet in info.values() for x in sheet.keys()]
    else:
        keys = list(info[args.sheet].keys())
        
    wb = load_workbook("Assertions from C2S.xlsx")
    sheet = wb[args.sheet]

    if args.mode == "file2sheet":
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

    elif args.mode == "sheet2file":
        choices = sheet["M"][1:]
        idx = 1
        cur_key_idx, cur_cnt, cur_tot = 0, 0, 0
        file, code, lnos = None, None, []

        def write_code(file, code):
            if file is not None:
                with open(file, "w") as f:
                    f.write("\n".join(code))
                print(f"Written to {file} with {cur_cnt} natural language assertions.")

        for choice in choices:
            if choice.value is None:
                print(f"Spotted empty choice at index {idx}, breaking.")
                break
            nl_asrt = sheet[choice.value][idx]
            post_cond = sheet["C"][idx]

            if post_cond.value is not None and post_cond.font.color.rgb != "FFFF0000":
                if cur_cnt >= cur_tot:
                    write_code(file, code)
                    if cur_key_idx < len(keys):
                        cur_key = keys[cur_key_idx]
                        file = os.path.join(args.indir, cur_key + ".java")
                        with open(file, "r") as f:
                            code = f.read().split("\n")
                        lnos = []
                        for lno, l in enumerate(code):
                            if "@@@" in l:
                                lnos.append(lno)
                        cur_cnt = 0
                        cur_tot = len(lnos)
                        cur_key_idx += 1
                assert nl_asrt.value is not None, "Natural language assertion value should not be None"
                code[lnos[cur_cnt]] = code[lnos[cur_cnt]].split("@@@")[0] + "@@@ " + nl_asrt.value.strip()
                cur_cnt += 1

            idx += 1
        write_code(file, code)
    
    elif args.mode == "findmissing":
        for model_name in os.listdir(args.indir):
            print(f"Model name: {model_name}" + "#" * 20)
            
            files = os.listdir(os.path.join(args.indir, model_name))
            files = sorted(files, key=lambda x: int(x.split('.')[-1]))

            for file in files:
                if file.split('.')[-1] in args.range:
                    args.range.remove(file.split('.')[-1])

            print(f"Missing files: {' '.join(args.range)}")

    elif args.mode == "check2sheet":
        with open(args.indir, "r") as f:
            rows = f.readlines()
        
        infos, res = {}, []
        cur_checks = {}
        for row in rows:
            if row.startswith("#" * 20):
                infos[filepath] = {
                    "post_cond": res,
                    "checks": cur_checks
                }
                res = []
                cur_checks = {}
            elif row.startswith("#" * 10):
                filepath = row.split("#"*10)[1].strip().replace(".check", ".extract")
                with open(filepath, "r") as f:
                    res = f.read().split("-" * 20 + '\n')[:-1]
            elif ':' in row:
                check_name, check_res = row.split(':')
                check_res = check_res.strip()[1:-5].split(", ")
                cur_checks[check_name] = check_res
    
        post_conds = sheet["C"][1:]
        lines = []
        for case in keys:
            files = [file for file in infos.keys() if file.split('/')[-1].startswith(case)]
            files = sorted(files, key=lambda x: int(x.split('.')[-2]))
            for file in files:
                info = infos[file]
                post_cond = info["post_cond"]
                checks = info["checks"]
                line = []

                for id, post in enumerate(post_cond):
                    line.append(post.strip())
                    for n, c in checks.items():
                        line.append(c[id])
                    line += [""] * 5
                
                lines.append("\t".join(line))
                empty_line = "\t".join(["" for _ in line])
        
        index = 0
        for post_cond in post_conds:
            if post_cond.value is not None and post_cond.font.color.rgb != "FFFF0000":
                print(lines[index])
                index += 1
            else:
                print(empty_line)

    elif args.mode == "combinechecks":
        with open(args.indir, "r") as f:
            ins = f.readlines()
        with open(args.outdir, "r") as f:
            outs = f.readlines()
        
        infos_list = []
        for rows in [ins, outs]:
            infos, res = {}, []
            cur_checks = {}
            for row in rows:
                if row.startswith("#" * 20):
                    infos[filepath] = {
                        "post_cond": res,
                        "checks": cur_checks
                    }
                    res = []
                    cur_checks = {}
                elif row.startswith("#" * 10):
                    filepath = row.split("#"*10)[1].strip().replace(".check", ".extract")
                    with open(filepath, "r") as f:
                        res = f.read().split("-" * 20 + '\n')[:-1]
                elif ':' in row:
                    check_name, check_res = row.split(':')
                    check_res = check_res.strip()[1:-5].split(", ")
                    cur_checks[check_name] = check_res
            infos_list.append(infos)

        for file in infos_list[1].keys():
            infos_list[1][file]["checks"].update(infos_list[0][file]["checks"])

        out_lines = []
        for file, info in infos_list[1].items():
            print(file)
            out_lines.append("#" * 10 + " " + file + " " + "#" * 10)
            for check_name in ["null_check", "compile_check", "fuzz_check", "rdtp_check", "equiv_check"]:
                if check_name not in info["checks"]:
                    continue
                res = info['checks'][check_name]
                trues = [res[i] for i in range(len(res)) if res[i] == "True"]
                out_lines.append(f"{check_name}: [{', '.join(res)}] {len(trues)}/{len(res)}")
            out_lines.append("#" * 20)

        with open(args.outdir, "w") as f:
            f.write("\n".join(out_lines))