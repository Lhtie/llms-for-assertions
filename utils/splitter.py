import argparse
import os

def instance(code, lnos, inst):
    f = lambda x : (x[0] not in lnos and x[0]-1 not in lnos) or (x[0] == inst) or (x[0]-1 == inst)
    l = list(filter(f, code))
    return "\n".join([x[1] for x in l])

parser = argparse.ArgumentParser()
parser.add_argument("--infile", type=str)
parser.add_argument("--outdir", type=str)
parser.add_argument("--write", type=int, default=0)
parser.add_argument("--startidx", type=int, default=-1)
args = parser.parse_args()

f = open(args.infile, "r")
code = list(enumerate(f.read().split("\n")))
f.close()

lnos = []
for lno, l in code:
    if("@@@" in l):
        lnos.append(lno)

start = -1
for f in os.listdir(args.outdir):
    fpath = args.outdir + "/" + f
    if(os.path.isfile(fpath)):
        start = max(start, int(fpath.split(".")[-1]))

if args.startidx != -1:
    start = args.startidx

instid = start + 1

for inst in lnos:
    content = instance(code, lnos, inst)
    split = args.infile.split("/")[-1].split(".")
    fname = ".".join(split[:-1]) + str(instid-start) + "." + split[-1] + "." + str(instid)
    fpath = args.outdir + "/" + fname

    if args.write:
        f = open(fpath, "w")
        f.write(content)
        f.close()
    else:
        print(code[inst+1][1].strip()[13:-2], "\t", code[inst][1].strip()[7:])
        #print(content)

    instid += 1
