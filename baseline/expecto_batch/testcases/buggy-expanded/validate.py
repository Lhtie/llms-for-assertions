import json,re,hashlib,sys
from pathlib import Path
from collections import Counter
from baseline.expecto_batch.extract import scan
root=Path.cwd();data=root/'datasets';out=root/'baseline/expecto_batch/testcases/buggy-expanded'
def load(p):return json.loads(p.read_text())
def typeparse(s):
 t=re.findall(r'\w+|\[|\]|:|,',s);i=0
 def parse():
  nonlocal i
  name=t[i];i+=1
  if name in {'list','option'}:
   assert t[i]=='[';i+=1;sub=parse();assert t[i]==']';i+=1;return (name,sub)
  if name=='record':
   assert t[i]=='[';i+=1;fields={}
   while t[i]!=']':
    key=t[i];assert t[i+1]==':';i+=2;fields[key]=parse()
    if t[i]==',':i+=1
   i+=1;return (name,fields)
  assert name in {'int','bool','nonetype'},name
  return (name,None)
 result=parse();assert i==len(t);return result
def check(v,t):
 kind,sub=t
 if kind=='record':return isinstance(v,dict) and v.keys()==sub.keys() and all(check(v[k],x) for k,x in sub.items())
 if kind=='list':return isinstance(v,list) and all(check(x,sub) for x in v)
 if kind=='option':return v is None or check(v,sub)
 if kind=='nonetype':return v is None
 if kind=='int':return type(v) is int
 if kind=='bool':return type(v) is bool
summary=load(out/'summary.json');traces=load(out/'generation-traces.json')
rows=[r for g in ['buggycodes','buggyasrts'] for f in (data/g).rglob('*.java') for r in scan(f,data)]
if '--partial' in sys.argv:
 rows=[r for r in rows if r['id'] in summary and r['id'] in traces]
else:
 assert {r['id'] for r in rows}==summary.keys()==traces.keys()
counts=Counter();groups={g:Counter() for g in ['buggycodes','buggyasrts']};few=[]
for row in rows:
 ident=row['id'];d=out/ident;s=summary[ident];sample=load(d/'sample.json');adapter=load(d/'adapter.json')['method_info'];examples=load(d/'examples.json');held=load(d/'heldout.json');cases=load(d/'cases.json')
 assert sample==row,ident
 assert hashlib.sha256((data/row['source']).read_bytes()).hexdigest()==row['source_sha256']
 assert s['status']=='generated' and not s['incomplete_runs'],ident
 assert examples==traces[ident]
 schemas={side:{k:typeparse(v) for k,v in adapter[side+'_schema'].items()} for side in ['entry','exit']}
 labels={}
 def key(t):return json.dumps(t,sort_keys=True)
 for c in cases:
  tr=c['trace'];assert type(c['label']) is bool
  assert tr.keys()==schemas.keys()
  for side,fields in schemas.items():
   assert tr[side].keys()==fields.keys()
   for field,typ in fields.items():assert check(tr[side][field],typ),(ident,side,field)
  assert key(tr) not in labels;labels[key(tr)]=c['label']
 selected=set();remaining=set()
 for name,label in [('corrects',True),('incorrects',False)]:
  assert len(examples[name])==min(3,sum(v==label for v in labels.values()))
  for tr in examples[name].values():assert labels[key(tr)]==label;selected.add(key(tr))
  vals=held[name].values() if isinstance(held[name],dict) else held[name]
  for tr in vals:assert labels[key(tr)]==label;remaining.add(key(tr))
 assert not selected&remaining and selected|remaining==labels.keys()
 pos=sum(labels.values());neg=len(labels)-pos
 assert (pos,neg)==(s['positive'],s['negative'])
 for target in [counts,groups[row['group']]]:target.update(samples=1,positive=pos,negative=neg,selected_positive=len(examples['corrects']),selected_negative=len(examples['incorrects']))
 if len(examples['corrects'])<3 or len(examples['incorrects'])<3:few.append(dict(id=ident,positive=pos,negative=neg))
report=dict(total=dict(counts),by_group={g:dict(v) for g,v in groups.items()},schema_checked_unique_cases=counts['positive']+counts['negative'],all_ids_and_source_hashes_current=True,all_seed_runs_completed=True,examples_heldout_disjoint=True,fewer_than_three=few,llm_calls=0)
if '--partial' not in sys.argv:(out/'validation.json').write_text(json.dumps(report,indent=2)+'\n')
print(json.dumps(report,indent=2))
