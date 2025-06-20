import os
import sys
import argparse

import splitter as splitter
import onedown as onedown

if __name__ == "__main__":
    import argparse
    parser = argparse.ArgumentParser(description="Prepare test datasets.")
    parser.add_argument('--infile', type=str, required=True, help='Input file path')
    parser.add_argument('--outdir', type=str, required=True, help='Output directory path')
    parser.add_argument("--write", default=False, action="store_true", help='Write output to files')
    parser.add_argument("--startidx", type=int, default=-1)
    args = parser.parse_args()

    args.langid = args.infile.split("/")[-1].split(".")[-1]
    os.makedirs(args.outdir, exist_ok=True)

    # splitter
    outfiles = splitter.splitter(args)

    # onedown
    if not args.write:
        print("No written files, skip onedown.")
    for outfile in outfiles:
        args.infile = outfile
        onedown.onedown(args)

