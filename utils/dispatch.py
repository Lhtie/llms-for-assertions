import os
import sys
import argparse
import json
import re

import splitter
import onedown

if __name__ == "__main__":
    import argparse
    parser = argparse.ArgumentParser(description="Prepare test datasets.")
    parser.add_argument("--infile", type=str, required=True, help="Input file path")
    parser.add_argument("--outdir", type=str, required=True, help="Output directory path")
    parser.add_argument("--write", default=False, action="store_true", help="Write output to files")
    parser.add_argument("--obsonly", default=False, action="store_true", help="Only collect observer methods")
    parser.add_argument("--infofile", type=str, default="codehelper/java_angello_info.json", help="Information file path")
    parser.add_argument("--startidx", type=int, default=-1)
    args = parser.parse_args()

    args.langid = args.infile.split("/")[-1].split(".")[-1]
    args.obs = None
    os.makedirs(args.outdir, exist_ok=True)
    with open(args.infile, "r") as f:
        code = list(enumerate(f.read().split("\n")))

    if args.obsonly:
        with open(args.infofile, "r") as f:
            info = json.load(f)
        test = args.infile.split("/")[-1].split(".")[0]
        for _, u in info.items():
            if test in u:
                obs = u[test]["ObserverMethods"]
                args.obs = obs
                break

    # splitter
    outfiles = splitter.splitter(args, code)

    # onedown
    if not args.write:
        print("No written files, skip onedown.")
    for outfile in outfiles:
        args.infile = outfile
        onedown.onedown(args)
