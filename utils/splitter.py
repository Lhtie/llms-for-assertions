import argparse
import os

def instance(code, lnos, inst):
    f = lambda x : (x[0] not in lnos and x[0]-1 not in lnos) or (x[0] == inst) or (x[0]-1 == inst)
    l = list(filter(f, code))
    return "\n".join([x[1] for x in l])

def splitter(args, code):
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

    outfiles = []
    for inst in lnos:
        content = instance(code, lnos, inst)
        split = args.infile.split("/")[-1].split(".")
        fname = ".".join(split[:-1]) + str(instid-start) + "." + split[-1] + ".0"
        fpath = args.outdir + "/" + fname

        if args.write:
            outfiles.append(fpath)
            f = open(fpath, "w")
            f.write(content)
            f.close()
        else:
            print(code[inst+1][1].strip(), "\t", code[inst][1].strip()[7:])
            #print(content)

        instid += 1
    
    return outfiles
