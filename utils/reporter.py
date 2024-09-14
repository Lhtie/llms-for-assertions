import argparse
import os

parser = argparse.ArgumentParser()
parser.add_argument("--codedir", type=str, default="./codes")
parser.add_argument("--chkfile", type=str)
parser.add_argument("--codelist", nargs='+', default=[])
args = parser.parse_args()

fd = open(args.chkfile, "r")
lines = fd.readlines()
fd.close()

cmnt_lnos = []
for i,l in enumerate(lines):
    if l[:10] == "#"*10:
        cmnt_lnos.append(i)

assert len(cmnt_lnos) % 2 == 0

print("""
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
<style type="text/css">
.ansi2html-content { display: inline; white-space: pre-wrap; word-wrap: break-word; }
.body_foreground { color: #AAAAAA; }
.body_background { background-color: #000000; }
.inv_foreground { color: #000000; }
.inv_background { background-color: #AAAAAA; }
.ansi42 { color: #aaaaaa; }
.ansi43 { color: #aa5500; }
.ansi44 { color: #00aa00; }
</style>
</head>
<body class="body_foreground body_background" style="font-size: normal;" >
<pre class="ansi2html-content">
<table>
""")

rowdict = {}

for i in range(0, len(cmnt_lnos), 2):
    bname = ".".join(lines[cmnt_lnos[i]][11:-11].split(".")[:-1])
        
    if(len(args.codelist) != 0 and bname.split('.')[-1] not in args.codelist):
        continue
    
    extrct_fname = bname + ".extract"
    extrct_fd = open(extrct_fname, "r")
    gen_asrts = extrct_fd.read().split("-"*20)[:-1]
    extrct_fd.close()

    chk_correct = " ".join(lines[cmnt_lnos[i+1]-1].split(" ")[:-1]) \
            .strip()[1:-1] \
            .split(",")
    chk_sound = " ".join(lines[cmnt_lnos[i+1]-2].split(" ")[:-1]) \
            .strip()[1:-1] \
            .split(",")

    #print("#"*10, bname + ".report", "#"*10)
    assert len(gen_asrts) == len(chk_correct)
    assert len(gen_asrts) == len(chk_sound)
    
    row = "<tr>"
    for j in range(len(gen_asrts)):
        asrt, res_c, res_s = gen_asrts[j], chk_correct[j], chk_sound[j]
        cell = "<td>"
        if res_c.strip() == "True": cell += "<span class=\"ansi44\">"
        elif res_s.strip() == "True": cell += "<span class=\"ansi43\">"
        else: cell += "<span class=\"ansi42\">"
        cell += asrt.strip()[13:-2]
        cell += "</span> </td>"
        row += cell
    row += "<td>" + lines[cmnt_lnos[i+1]-4].split("]")[1].strip().split("/")[0] + "</td>"
    row += "<td>" + lines[cmnt_lnos[i+1]-3].split("]")[1].strip().split("/")[0] + "</td>"
    row += "<td>" + lines[cmnt_lnos[i+1]-2].split("]")[1].strip().split("/")[0] + "</td>"
    row += "<td>" + lines[cmnt_lnos[i+1]-1].split("]")[1].strip().split("/")[0] + "</td>"
    row += "</tr>"

    rowdict[int(bname.split('.')[-1])] = row

    #print("#"*20)
rowkeys = list(rowdict.keys())
rowkeys.sort()
for key in rowkeys:
    print(rowdict[key])

print("""
</table>
</pre>
</body>
</html>
""")
