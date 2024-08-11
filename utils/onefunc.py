import argparse
import os

parser = argparse.ArgumentParser()
parser.add_argument("--infile", type=str)
parser.add_argument("--outdir", type=str)
parser.add_argument("--write", type=int, default=0)
args = parser.parse_args()

f = open(args.infile, "r")
code = list(enumerate(f.read().split("\n")))
f.close()

cmnt, first, last = -1, -1, -1
for lno, l in code:
    if("{" in l): first = lno
    elif("@@@" in l): cmnt = lno
    elif("}" in l and cmnt != -1):
        last = lno
        break
content = """
namespace ArrayList.Test
{
    public partial class ArrayListContractTest
    {
"""
content += "\n".join([l for lno,l in code[first-1:last+1]])
content += """
    }
}
"""

start = -1
for f in os.listdir(args.outdir):
    fpath = args.outdir + "/" + f
    if(os.path.isfile(fpath)):
        start = max(start, int(fpath.split(".")[-1]))

instid = start + 1

split = args.infile.split("/")[-1].split(".")[:-1]
fname = ".".join(split[:-1]) + "onefunc" + "." + split[-1] + "." + str(instid)
fpath = args.outdir + "/" + fname

if args.write:
    f = open(fpath, "w")
    f.write(content)
    f.close()
else:
    print("#"*10, fpath, "#"*10)
    print(content)

