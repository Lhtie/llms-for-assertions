import sys,ast,json,csv,math,time,traceback,contextlib,io
from pathlib import Path
from textwrap import dedent
from typing import Any
root=Path.cwd();artifact=root/'baseline/expecto-artifact';sys.path[:0]=[str(artifact/'expecto'),str(artifact)]
from lark import Lark
from src.DSL.ast_builder import ASTBuilder
from src.DSL.compiler import DSLCompiler
from src.DSL.dsl_ast import DSLType
from src.DSL.grammar import grammar
module=ast.parse((artifact/'expecto/src/utils/dsl.py').read_text())
names={'_format_real_value','pyval_to_dsl_with_dsl_ty','pyval_to_dsl_with_schema','add_argument_mapping_to_solver','generate_evaluation_code_with_schema'}
exec(compile(ast.Module(body=[n for n in module.body if isinstance(n,ast.FunctionDef) and n.name in names],type_ignores=[]),'<original DSL utility functions>','exec'),globals())
r=root/'baseline/expecto-results/matrix-chtc-20261020-140827';results=[]
for group in ['buggycodes','buggyasrts']:
 d=r/(group+'-targeted-unit-tc')
 with (d/'results.csv').open() as f:rows=[x for x in csv.DictReader(f) if x['status']=='no_counterexample']
 for row in rows:
  p=d/row['id'];worker=json.loads((p/'worker_input.json').read_text());sample=worker['sample'];traces=sample['corrects'];info=sample['method_info'];rawpath=r/'testcases'/(group+'-targeted-unit-tc')/row['id']/'cases.json';raw=json.loads(rawpath.read_text())
  checks=[]
  for name,t in traces.items():
   rawmatches=[c for c in raw if c['trace']==t];code=generate_evaluation_code_with_schema((p/'spec.dsl').read_text(),t,info['entry_schema'],info['exit_schema'],True,True)
   try:
    with contextlib.redirect_stdout(io.StringIO()),contextlib.redirect_stderr(io.StringIO()):exec(code,{'__file__':str(p/'audit.py')})
    status='accepted'
   except Exception as e:status=type(e).__name__+': '+str(e)
   checks.append(dict(name=name,raw_gt_labels=[c['label'] for c in rawmatches],dsl_check=status))
  result=dict(group=group,id=row['id'],checks=checks,trace_count=len(traces),all_traces_gt_false=bool(traces) and all(c['raw_gt_labels'] and all(v is False for v in c['raw_gt_labels']) for c in checks),all_traces_accepted=bool(traces) and all(c['dsl_check']=='accepted' for c in checks))
  results.append(result);print(group,row['id'],result['all_traces_gt_false'],result['all_traces_accepted'],flush=True)
  Path(__file__).with_name('trace_checks.json').write_text(json.dumps(results,indent=2))
print('FINISHED',len(results),flush=True)
