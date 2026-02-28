import os
import argparse
from prompting import *
from llm import modelpaths, load_model, move_inputs_to_model, run_model

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--codedir", type=str, default="./codes")
    parser.add_argument("--resultdir", type=str, default="./results")
    parser.add_argument("--codelist", nargs='+', default=[])
    parser.add_argument("--modellist", nargs='+', default=[])
    parser.add_argument("--nsamples", type=int, default=3)
    parser.add_argument("--prompt", type=str, default="default")
    parser.add_argument("--temp", type=float, default=0.0)
    parser.add_argument("--onemsg", type=bool, default=True)
    parser.add_argument("--write", default=False, action="store_true")
    args = parser.parse_args()

    for mkey in modelpaths:
        if(len(args.modellist) != 0 and mkey not in args.modellist):
            continue

        mpath = modelpaths[mkey]
        mname = mpath.split("/")[-1]
        params = "-".join([args.prompt, str(args.temp), str(args.onemsg)]) # add temp, generation method etc here
        dirname = args.resultdir + "/" + mname + "/" + params
        assert mname and params

        tokenizer, model, devices = load_model(mkey)

        for f in os.listdir(args.codedir):
            if(len(args.codelist) != 0 and f.split('.')[-1] not in args.codelist):
                continue

            fd = open(os.path.join(args.codedir, f), "r")
            code = fd.read()
            fd.close()

            langid = f.split('.')[-2]

            prompt = transform(mkey, args.prompt, tokenizer, code, langid, args.onemsg)

            allrspnse, allasrts  = "", ""
            for _ in range(args.nsamples):
                response = run_model(mkey, model, tokenizer, devices, prompt, args.temp)
                asrt = extract(args.prompt, response, langid)
                allrspnse += response + '\n' + "-"*20 + '\n'
                allasrts += asrt + '\n' + "-"*20 + '\n'

            if(args.write):
                os.makedirs(dirname, exist_ok=True)
                fd = open(os.path.join(dirname, f), "w")
                fd.write(allrspnse)
                fd.close()
                fd = open(os.path.join(dirname, f + ".extract"), "w")
                fd.write(allasrts)
                fd.close()
            else:
                print("#"*10, dirname + "/" + f, "#"*10)
                print(allrspnse)
                print("#"*20)
                print("#"*10, dirname + "/" + f + ".extract", "#"*10)
                print(allasrts)
                print("#"*20)
                
        del model
        del tokenizer
