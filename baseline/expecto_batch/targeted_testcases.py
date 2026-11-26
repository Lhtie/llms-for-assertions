"""Deterministic GT-failing real executions for Buggy Code and Buggy Asrt.

No LLM or random sampling. Every supplied constraint is an actual mutant
execution on which GT evaluates to false. Reference-confirmed regressions
are preferred. No reference outputs or GT-passing fallback traces are exported.
"""
import argparse
import copy
from concurrent.futures import ThreadPoolExecutor, as_completed
import hashlib
import json
import os
from pathlib import Path
import re
import tempfile
from types import SimpleNamespace

from .adapters import adapt
from .compare import ROOT, command
from .method_execution import harness
from .tc_harness import factory, generated_value
from .testcases import JAVA_HELPERS, diverse

DEFAULT_OUTPUT = ROOT / 'baseline/expecto-results/targeted-mutant-traces/testcases/buggycodes-targeted-unit-tc'
TRACE_POLICY = 'mutant_gt_failing_v3'

TARGET_VALUES = r'''
 static String currentCase="";
 static String currentPhase="fixture";
 static int failures=0;
 static java.util.ArrayList<Integer> targetValues(int s) {
  Integer[][] values={ {}, {17}, {-7,17}, {-7,0,17}, {17,17,17},
   {-7,17,42,17,99}, {null,17,null}, {Integer.MIN_VALUE,0,Integer.MAX_VALUE},
   {1000,1000,17}, {99,42,17,0,-7}, {-7,0,17,42,99},
   {-7,0,17,42,99,-7,0,17,42,99,17,42,99,0,-7,17,42} };
  return new java.util.ArrayList<>(java.util.Arrays.asList(values[Math.floorMod(s,values.length)]));
 }
 static Integer targetAtom(int c) {
  Integer[] values={17,-7,0,42,99,1000,null,Integer.MIN_VALUE,Integer.MAX_VALUE,18};
  return values[Math.floorMod(c,values.length)];
 }
 static int targetIndex(int c,int size) {
  int[] values={0,size-1,size,1,size/2,-1,size+1,2};
  return values[Math.floorMod(c,values.length)];
 }
 static int targetBit(int c) {
  int[] values={0,1,2,31,32,62,63,64,65,126,127,128,129,255,-1};
  return values[Math.floorMod(c,values.length)];
 }
 static int rangeStart(int c) {
  return new int[]{0,0,1,31,32,63,63,64,64,127,128,0,1,-1,2,65}[Math.floorMod(c,16)];
 }
 static int rangeEnd(int c) {
  return new int[]{0,1,2,32,33,64,65,65,128,129,129,257,1,1,1,130}[Math.floorMod(c,16)];
 }
 static java.util.ArrayList<String> targetWords(int s) {
  String[][] values={{},{""},{"a"},{"a","ab","abc"},{"ab","ac","b"},
   {"é","éa","😀","😀a"},{"a","aa","aaa","aaaa"},{"prefix","pre","prevent","z"},
   {"😀a","😀b","😀"},{"a","ab","abc","b","é","😀"}, {"b"},{"ab"}};
  return new java.util.ArrayList<>(java.util.Arrays.asList(values[Math.floorMod(s,values.length)]));
 }
 static String targetWord(int c) {
  String[] values={"","a","ab","abc","b","ac","é","éa","😀","😀a","😀b","pre","prefix","missing",null,"aaaa"};
  return values[Math.floorMod(c,values.length)];
 }
 static Integer unionArg(int c,int position) {
  Integer[][] pairs={{-7,0},{0,17},{-7,17},{-7,-7},{42,99},{99,1000},{17,0},{0,-7},{1000,1000},{null,0}};
  return pairs[Math.floorMod(c,pairs.length)][position];
 }
 static void recordFailure(Exception problem) {
  failures++;
  try {
   String line="{\"case_id\":"+json(currentCase)+",\"phase\":"+json(currentPhase)+",\"exception\":"+json(problem.getClass().getName())+",\"message\":"+json(String.valueOf(problem.getMessage()))+"}\n";
   java.nio.file.Files.writeString(java.nio.file.Path.of(System.getProperty("expecto.exceptions")),line,
    java.nio.file.StandardOpenOption.CREATE,java.nio.file.StandardOpenOption.APPEND);
  } catch(Exception ignored){}
 }
 static Object[] targetElements(Object receiver) {
  try {
   String cls=receiver.getClass().getSimpleName();
   if(cls.equals("ArrayList") || cls.equals("Vector") || cls.equals("Stack")){
    Object[] data=(Object[])stateGet(receiver,"elementData");
    int size=(Integer)stateGet(receiver,cls.equals("ArrayList")?"size":"elementCount");
    return java.util.Arrays.copyOf(data,size);
   }
   if(cls.equals("ArrayDeque")){
    Object[] data=(Object[])stateGet(receiver,"elements");
    int head=(Integer)stateGet(receiver,"head"),tail=(Integer)stateGet(receiver,"tail");
    int size=Math.floorMod(tail-head,data.length);Object[] result=new Object[size];
    for(int i=0;i<size;i++)result[i]=data[(head+i)%data.length];return result;
   }
   if(cls.equals("PriorityQueue")){
    return java.util.Arrays.copyOf((Object[])stateGet(receiver,"queue"),(Integer)stateGet(receiver,"size"));
   }
   if(cls.equals("HashSet") && !receiver.getClass().getName().startsWith("java.")){
    Object map=stateGet(receiver,"map");Object[] table=(Object[])stateGet(map,"table");
    java.util.List<Object> values=new java.util.ArrayList<>();
    for(Object node:table)for(;node!=null;node=stateGet(node,"next"))values.add(stateGet(node,"key"));
    return values.toArray();
   }
   return ((java.util.Collection<?>)receiver).toArray();
  }catch(Exception e){throw new IllegalStateException("Targeted snapshot failed",e);}
 }
'''


def state_factory(row, adapter):
    cls, typ = row['class_name'], adapter['java_receiver']
    init = 'java.util.ArrayList<Integer> v=targetValues(s);'
    if cls in {'ArrayList', 'Vector', 'Stack'}:
        field = 'size' if cls == 'ArrayList' else 'elementCount'
        body = f'''{init}{typ} x=new {cls}<>();
 Object[] backing=new Object[Math.max(32,v.size()+8)];
 for(int i=0;i<v.size();i++)backing[i]=v.get(i);
 statePut(x,"elementData",backing);statePut(x,"{field}",v.size());return x;'''
    elif cls == 'ArrayDeque':
        body = f'''{init}v.removeIf(java.util.Objects::isNull);{typ} x=new {cls}<>();
 Object[] backing=new Object[Math.max(32,v.size()+8)];
 int head=(s%3==0?backing.length-2:0);
 for(int i=0;i<v.size();i++)backing[(head+i)%backing.length]=v.get(i);
 statePut(x,"elements",backing);statePut(x,"head",head);
 statePut(x,"tail",(head+v.size())%backing.length);return x;'''
    elif cls == 'PriorityQueue':
        body = f'''{init}v.removeIf(java.util.Objects::isNull);{typ} x=new {cls}<>();
 java.util.PriorityQueue<Integer> healthy=new java.util.PriorityQueue<>(v);
 Object[] heap=new Object[Math.max(32,v.size()+8)];Object[] actual=healthy.toArray();
 System.arraycopy(actual,0,heap,0,actual.length);
 statePut(x,"queue",heap);statePut(x,"size",v.size());return x;'''
    elif cls == 'TreeSet':
        body = f'''{init}v.removeIf(java.util.Objects::isNull);{typ} x=new {cls}<>();
 java.util.TreeMap<Integer,Object> m=new java.util.TreeMap<>();
 java.lang.reflect.Field marker=stateField(x,"PRESENT");Object present=marker.get(null);
 for(Integer value:v)m.put(value,present);statePut(x,"m",m);return x;'''
    elif cls == 'UnionFind':
        body = f'''{init}v.removeIf(java.util.Objects::isNull);
 java.util.Set<Integer> elements=new java.util.LinkedHashSet<>(v);
 {typ} x=new {cls}<>(elements);Integer[] a=elements.toArray(new Integer[0]);
 if(a.length>1 && s%3!=1){{
 java.util.Map<Integer,Integer> parents=(java.util.Map<Integer,Integer>)stateGet(x,"parentMap");
 for(int i=1;i<a.length;i++)if(s%3==0 || i==1)parents.put(a[i],a[0]);
 ((java.util.Map<Integer,Integer>)stateGet(x,"rankMap")).put(a[0],1);
 statePut(x,"count",s%3==0?1:a.length-1);
 }}return x;'''
    elif cls == 'Trie':
        body = '''Trie x=new Trie();Object root=stateGet(x,"root");
 java.lang.reflect.Constructor<?> ctor=root.getClass().getDeclaredConstructor();ctor.setAccessible(true);
 java.util.Set<String> unique=new java.util.LinkedHashSet<>(targetWords(s));
 for(String word:unique){Object node=root;statePut(node,"pass",(Integer)stateGet(node,"pass")+1);
  for(int offset=0;offset<word.length();){int cp=word.codePointAt(offset);
   java.util.Map<Integer,Object> children=(java.util.Map<Integer,Object>)stateGet(node,"children");
   Object child=children.get(cp);if(child==null){child=ctor.newInstance();children.put(cp,child);}
   node=child;statePut(node,"pass",(Integer)stateGet(node,"pass")+1);offset+=Character.charCount(cp);
  }statePut(node,"isWord",true);
 }statePut(x,"size",unique.size());return x;'''
    elif cls == 'BitSet':
        body = '''BitSet x=new BitSet();long[][] patterns={ {},{0L},{1L},{-1L},
 {Long.MIN_VALUE},{0L,1L},{0L,Long.MIN_VALUE},{-1L,-1L},
 {0x5555555555555555L,0xaaaaaaaaaaaaaaaaL},{1L,0L,1L},
 {-1L,0L,-1L},{0L,0L,0L,Long.MIN_VALUE}};
 long[] bits=patterns[Math.floorMod(s,patterns.length)].clone();int used=bits.length;
 while(used>0 && bits[used-1]==0)used--;
 statePut(x,"words",bits.length==0?new long[1]:bits);statePut(x,"wordsInUse",used);return x;'''
    elif cls == 'HashSet':
        # Do not override clone()/equals()/iterator() to hide dataset stub errors.
        body = f'''{init}{typ} x=new {cls}<>();
 java.util.Map<Integer,Object> m=(java.util.Map<Integer,Object>)stateGet(x,"map");
 Object present=stateField(x,"PRESENT").get(null);
 for(Integer value:v)m.put(value,present);statePut(x,"map",m);return x;'''
        if row['package']=='java.util':
            body = f'{init}return new HashSet<Integer>(v);'
    else:
        raise ValueError(f'No targeted state plan for {cls}')
    reflection = r'''
 static java.lang.reflect.Field stateField(Object x,String name)throws Exception{
  for(Class<?> c=x.getClass();c!=null;c=c.getSuperclass()){
   try{java.lang.reflect.Field f=c.getDeclaredField(name);f.setAccessible(true);return f;}
   catch(NoSuchFieldException e){}
  }throw new NoSuchFieldException(name);
 }
 static Object stateGet(Object x,String name)throws Exception{return stateField(x,name).get(x);}
 static void statePut(Object x,String name,Object value)throws Exception{stateField(x,name).set(x,value);}
'''
    return reflection + f'''\n static {typ} make(int s){{try{{{body}}}
 catch(Exception e){{throw new IllegalStateException("Targeted fixture initialization failed",e);}}}}\n'''


def build_harness(row, adapter, datasets):
    helpers = JAVA_HELPERS.replace('>=2000', '>=1024')
    # Preserve the exact selector tuple for replay, outside the DSL trace schema.
    helpers = helpers.replace('String line="{\\"label\\":"+label+',
                              'String line="{\\"case_id\\":"+json(currentCase)+",\\"label\\":"+label+')
    projection_adapter = copy.deepcopy(adapter)
    for target in projection_adapter['mapping'].values():
        for key in ('expression','length','get'):
            if key in target:
                target[key] = target[key].replace('this.toArray()', 'targetElements(this)')
                target[key] = re.sub(r'(\(\([A-Za-z]+<Integer>\)\\result\))\.toArray\(\)',
                                     r'targetElements(\1)',target[key])
    # Evaluate GT on actual mutant behavior. Oracle exceptions are diagnostics,
    # not evidence of GT=false; only successfully evaluated false traces qualify.
    code = harness(row, projection_adapter, helpers, datasets, label_mode='groundtruth')
    code = code.replace(factory(row, adapter), state_factory(row, adapter))
    code = code.replace('static void failure(Exception e) { if(failureReports++<3) e.printStackTrace(); }',
                        'static void failure(Exception e) { recordFailure(e); if(failureReports++<3)e.printStackTrace(); }')
    receiver = adapter['java_receiver']
    for i, param in enumerate(adapter['java_parameters']):
        name, typ = param['name'], param['type']
        original = generated_value(typ, f'(__tc_c+{i})', receiver)
        if typ == 'int':
            size = 'oldState.length()' if row['class_name'] == 'BitSet' else 'oldState.size()'
            original = f'tcNumber(__tc_c+{i},{size})'
            if row['class_name'] == 'BitSet':
                value = (f'rangeStart(__tc_c)' if name == 'fromIndex' else
                         'rangeEnd(__tc_c)' if name == 'toIndex' else 'targetBit(__tc_c)')
            else:
                value = 'targetIndex(__tc_c,oldState.size())'
        elif typ == 'Integer':
            value = f'unionArg(__tc_c,{i})' if row['method_name'] == 'union' else 'targetAtom(__tc_c)'
        elif typ == 'boolean':
            value = '(__tc_d!=0)'
        elif typ == 'String':
            value = 'targetWord(__tc_c)'
        elif typ == 'java.util.Collection<Integer>':
            # Constructor inputs: empty, singleton, duplicate, null-containing
            # and integer-boundary collections, using the curated state values.
            value = 'new java.util.ArrayList<Integer>(targetValues(__tc_c))'
        elif typ == receiver:
            value = 'make(__tc_c)'
        else:
            raise ValueError(f'No targeted argument plan for {typ}')
        old = f'{typ} {name}={original};'
        assert old in code, old
        code = code.replace(old, f'{typ} {name}={value};')
    # Avoid even constructing an unused second state; oldState is the actual receiver.
    code = code.replace(f'oldState=make(__tc_a),newState=make(__tc_b);',
                        'oldState=make(__tc_a),newState=oldState;')
    code = code.replace('   final '+receiver+' oldState=', '   currentPhase="fixture";\n   final '+receiver+' oldState=')
    code = code.replace('   Object entrySnapshot=', '   currentPhase="entry_snapshot";\n   Object entrySnapshot=')
    lines = code.splitlines()
    for i,line in enumerate(lines):
        if line.startswith('   ') and f"fuzzobj_new.{row['method_name']}(" in line and 'boolean label=' not in line:
            lines[i] = '   currentPhase="invocation";\n'+line+'\n   currentPhase="oracle";'
    code='\n'.join(lines).replace('   emit(label,','   currentPhase="exit_snapshot";\n   emit(label,')
    start = code.index(' public static void main(')
    code = code[:start] + TARGET_VALUES + r'''
 public static void main(String[] args) {
  if(args.length==4){
   currentCase=String.join(",",args);
   probe(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]),Integer.parseInt(args[3]));
   return;
  }
  for(int state=0;state<12;state++)for(int input=0;input<16;input++)for(int flag=0;flag<2;flag++){
   currentCase=state+","+state+","+input+","+flag;
   probe(state,state,input,flag);
  }
 }
}
'''
    return code


def write(path, value):
    path.write_text(json.dumps(value, ensure_ascii=False, indent=2) + '\n')


def generate_execution(row, args):
    folder = args.output / row['id']
    folder.mkdir(parents=True, exist_ok=True)
    write(folder / 'sample.json', row)
    try:
        adapter = adapt(row)
        write(folder / 'adapter.json', adapter)
        code = build_harness(row, adapter, args.datasets)
        (folder / 'FuzzTest.java').write_text(code)
        fingerprint = hashlib.sha256((code + row['source_sha256'] + 'java11-source-compat-v1').encode()).hexdigest()
        previous = folder / 'result.json'
        if not args.force and previous.exists():
            cached = json.loads(previous.read_text())
            if cached.get('fingerprint') == fingerprint and cached.get('status') == 'generated':
                return row, cached
        jar_dir = os.environ.get('EXPECTO_TC_JAR_DIR')
        jars = (list(Path(jar_dir).glob('*.jar')) if jar_dir else
                list((ROOT/'java-testgen').rglob('*.jar')) + list((ROOT/'java-thirdparty').glob('*.jar')))
        # Do not accidentally export stale cases if recompilation fails.
        for name in ('cases.json', 'differential-witnesses.json', 'exception-witnesses.json'):
            (folder/name).unlink(missing_ok=True)
        with tempfile.TemporaryDirectory(prefix='expecto-targeted-') as temp:
            classes = Path(temp)
            cp = os.pathsep.join(map(str, [classes, *jars]))
            source = compatible_source(args.datasets, row, folder)
            rc = command(['javac', '-cp', cp, '-sourcepath', args.datasets,
                          '-d', classes, source, folder/'FuzzTest.java'],
                         folder, 'compile_cases', 120)
            if rc != 0:
                raise RuntimeError('Targeted harness compilation failed; see compile_cases.log')
            raw, exceptions, counts = folder/'raw-cases.jsonl', folder/'exceptions.jsonl', folder/'counts.json'
            for path in (raw, exceptions, counts):
                path.unlink(missing_ok=True)
            rc = command(['java', '-Xmx512m', f'-Dexpecto.cases={raw}',
                          f'-Dexpecto.exceptions={exceptions}', f'-Dexpecto.counts={counts}',
                          '-cp', cp, 'fuzztests.FuzzTest'], folder, 'targeted_execution', 45)
            if rc != 0:
                raise RuntimeError('Targeted execution failed or timed out; see targeted_execution.log')
        cases = [json.loads(line) for line in raw.read_text().splitlines()] if raw.exists() else []
        positive = [c for c in cases if c['label']]
        negative = [c for c in cases if not c['label']]
        # Raw execution caches retain GT labels only for diagnostics. Export
        # behavior constraints after reference comparison in generate_one().
        selected = {'corrects': {}, 'incorrects': {}}
        selected_ids = {'corrects': {}, 'incorrects': {}}
        write(folder/'examples.json', selected)
        write(folder/'selected-case-ids.json', selected_ids)
        write(folder/'cases.json', cases)
        result = dict(status='generated' if cases else 'no_cases', fingerprint=fingerprint,
                      trace_kind='targeted_method_execution', label_mode='groundtruth',
                      positive=len(positive), negative=len(negative),
                      generation_positive=len(selected['corrects']), generation_negative=len(selected['incorrects']),
                      property_violation_detected=bool(negative),
                      exceptions=len(exceptions.read_text().splitlines()) if exceptions.exists() else 0,
                      counts=json.loads(counts.read_text()) if counts.exists() else {},
                      scenarios_attempted=384)
    except Exception as exc:
        result = dict(status='error', error=f'{type(exc).__name__}: {exc}')
    write(folder/'result.json', result)
    return row, result


def compatible_source(datasets, row, folder):
    """Strip only Java's source-only Serial annotation in a local compile copy."""
    source = datasets / row['source']
    text = source.read_text()
    compatible = re.sub(r'(?m)^[ \t]*@java\.io\.Serial[ \t]*(?=\r?$)', '', text)
    if compatible != text:
        source = folder/'java_sources'/row['source']
        source.parent.mkdir(parents=True, exist_ok=True)
        source.write_text(compatible)
    return source


def generate_one(row, args):
    row, result = generate_execution(row, args)
    result['mutant_status'] = result.get('mutant_status',result['status'])
    reference = args.datasets / 'c2s_aug' / (row['class_name']+'.java')
    if not reference.exists():
        reference = args.datasets/'naturalness/mut_000'/(row['class_name']+'.java')
    folder = args.output / row['id']
    if reference.exists():
        package=re.search(r'\bpackage\s+([\w.]+)\s*;',reference.read_text()).group(1)
        reference_row = dict(row, source=str(reference.relative_to(args.datasets)),
                             package='java.util' if row['class_name']=='HashSet' else package,
                             source_sha256=hashlib.sha256(reference.read_bytes()).hexdigest())
        reference_args = SimpleNamespace(**vars(args))
        reference_args.output = folder/'reference'
        _, ref_result = generate_execution(reference_row, reference_args)
        result['reference_status'] = ref_result['status']
        result['reference_source'] = ('java.util.HashSet (JDK)' if row['class_name']=='HashSet' else reference_row['source'])
        ref_folder = reference_args.output / row['id']
        ref_cases = ref_folder/'cases.json'
        if ref_cases.exists() and ref_result['status']=='generated':
            mutant_cases = folder/'cases.json'
            if mutant_cases.exists():
                ref_by_id = {c['case_id']:c for c in json.loads(ref_cases.read_text())}
                witnesses = []
                for actual in json.loads(mutant_cases.read_text()):
                    expected = ref_by_id.get(actual['case_id'])
                    if expected and expected['trace']['entry']==actual['trace']['entry'] and expected['trace']!=actual['trace']:
                        witnesses.append({'case_id':actual['case_id'],'expected':expected['trace'],
                                          'actual':actual['trace'],'reference_satisfies_property':expected['label'],
                                          'mutant_satisfies_property':actual['label']})
                write(folder/'differential-witnesses.json', witnesses)
                result['differential_witnesses'] = len(witnesses)
                result['confirmed_property_regressions'] = sum(
                    w['reference_satisfies_property'] is True and w['mutant_satisfies_property'] is False for w in witnesses)
                failures = folder/'exceptions.jsonl'
                exception_witnesses=[]
                for line in failures.read_text().splitlines() if failures.exists() else []:
                    failure=json.loads(line)
                    expected=ref_by_id.get(failure['case_id'])
                    if failure.get('phase')=='invocation' and expected and expected['label']:
                        exception_witnesses.append(dict(failure,expected=expected['trace']))
                write(folder/'exception-witnesses.json',exception_witnesses)
                result['unexpected_exception_witnesses']=len(exception_witnesses)
    # Reference traces rank inputs; generation receives GT-failing mutant traces.
    actual_path = folder/'cases.json'
    actual_cases = json.loads(actual_path.read_text()) if actual_path.exists() else []
    witness_path = folder/'differential-witnesses.json'
    witnesses = json.loads(witness_path.read_text()) if witness_path.exists() else []
    examples, case_ids = select_mutant_traces(actual_cases, witnesses)
    write(folder/'examples.json', examples)
    write(folder/'selected-case-ids.json', case_ids)
    result.update(trace_policy=TRACE_POLICY, positive_origin='mutant_execution',
                  positive_selection='gt_false_reference_regression_first',
                  generation_positive=len(examples['corrects']), generation_negative=0,
                  status='generated' if examples['corrects'] else
                         ('error' if result['mutant_status']=='error' else 'no_gt_failing_cases'))
    write(folder/'result.json', result)
    write_replay(folder)
    return row, result


def select_mutant_traces(cases, witnesses, limit=3):
    """Select only actual executions on which GT is false.

    corrects is an upstream API slot for must-accept behavior constraints. It is
    not a claim that these traces satisfy the natural-language requirement.
    """
    failing = [c for c in cases if c.get('label') is False]
    changed = {w['case_id'] for w in witnesses
               if w.get('reference_satisfies_property') is True
               and w.get('mutant_satisfies_property') is False}
    preferred = [c for c in failing if c['case_id'] in changed]
    selected = diverse([c['trace'] for c in preferred], limit)
    remaining = [c['trace'] for c in failing if c['trace'] not in selected]
    selected += diverse(remaining, max(0, limit-len(selected))) if len(selected)<limit else []
    examples = {'corrects': {f'p{i}': t for i,t in enumerate(selected)}, 'incorrects': {}}
    ids = {'corrects': {f'p{i}': next(c['case_id'] for c in cases if c['trace']==t)
                        for i,t in enumerate(selected)}, 'incorrects': {}}
    return examples, ids


def write_replay(folder):
    selected=folder/'selected-case-ids.json'
    if not selected.exists():
        return
    cases=json.loads(selected.read_text())
    names=[]
    seeds=[]
    for group in ('incorrects','corrects'):
        for name,case_id in cases[group].items():
            names.append(json.dumps(name))
            seeds.append('{'+case_id+'}')
    java='''package fuzztests;
public class TargetedUnitTest {
 public static void main(String[] args) {
  String[] names={NAMES};int[][] seeds={SEEDS};int failed=0,executed=0;
  for(int i=0;i<seeds.length;i++){
   if(args.length>0 && !names[i].equals(args[0]))continue;
   executed++;FuzzTest.seen.clear();FuzzTest.positives=0;FuzzTest.negatives=0;FuzzTest.failures=0;
   FuzzTest.currentCase=seeds[i][0]+","+seeds[i][1]+","+seeds[i][2]+","+seeds[i][3];
   FuzzTest.probe(seeds[i][0],seeds[i][1],seeds[i][2],seeds[i][3]);
   if(FuzzTest.negatives>0 || FuzzTest.failures>0 || FuzzTest.positives==0){
    failed++;System.out.println("FAIL "+names[i]+" ["+FuzzTest.currentCase+"] phase="+FuzzTest.currentPhase);
   }else System.out.println("PASS "+names[i]+" ["+FuzzTest.currentCase+"]");
  }
  if(executed==0)throw new IllegalArgumentException("No matching selected test");
  if(failed>0)throw new AssertionError(failed+" targeted property tests failed on this implementation");
 }
}
'''.replace('NAMES',','.join(names)).replace('SEEDS',','.join(seeds))
    (folder/'TargetedUnitTest.java').write_text(java)
    (folder/'replay.sh').write_text('''#!/usr/bin/env bash
set -euo pipefail
EXPECTO_TEST_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
EXPECTO_REPLAY_ROOT="${EXPECTO_PROJECT_ROOT:-$EXPECTO_TEST_DIR}"
while [[ ! -d "$EXPECTO_REPLAY_ROOT/datasets" ]]; do
  [[ "$EXPECTO_REPLAY_ROOT" != / ]] || { echo 'Set EXPECTO_PROJECT_ROOT to the project root.' >&2; exit 2; }
  EXPECTO_REPLAY_ROOT="$(dirname "$EXPECTO_REPLAY_ROOT")"
done
EXPECTO_REPLAY_CLASSES="$(mktemp -d)"
trap 'rm -rf -- "$EXPECTO_REPLAY_CLASSES"' EXIT
EXPECTO_REPLAY_CP="$EXPECTO_REPLAY_CLASSES"
while IFS= read -r -d '' EXPECTO_JAR; do EXPECTO_REPLAY_CP+=":$EXPECTO_JAR"; done < <(find "$EXPECTO_REPLAY_ROOT/java-testgen" "$EXPECTO_REPLAY_ROOT/java-thirdparty" -name '*.jar' -print0)
EXPECTO_SOURCE="$(python3 -c 'import json,sys;print(json.load(open(sys.argv[1]))["source"])' "$EXPECTO_TEST_DIR/sample.json")"
if [[ -f "$EXPECTO_TEST_DIR/java_sources/$EXPECTO_SOURCE" ]]; then
  EXPECTO_SOURCE_PATH="$EXPECTO_TEST_DIR/java_sources/$EXPECTO_SOURCE"
else
  EXPECTO_SOURCE_PATH="$EXPECTO_REPLAY_ROOT/datasets/$EXPECTO_SOURCE"
fi
javac -cp "$EXPECTO_REPLAY_CP" -sourcepath "$EXPECTO_REPLAY_ROOT/datasets" -d "$EXPECTO_REPLAY_CLASSES" "$EXPECTO_SOURCE_PATH" "$EXPECTO_TEST_DIR/FuzzTest.java" "$EXPECTO_TEST_DIR/TargetedUnitTest.java"
java -Dexpecto.cases="$EXPECTO_REPLAY_CLASSES/cases.jsonl" -Dexpecto.exceptions="$EXPECTO_REPLAY_CLASSES/exceptions.jsonl" -Dexpecto.counts="$EXPECTO_REPLAY_CLASSES/counts.json" -cp "$EXPECTO_REPLAY_CP" fuzztests.TargetedUnitTest "$@"
''')


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--group', choices=['buggycodes', 'buggyasrts'], default='buggycodes')
    parser.add_argument('--datasets', type=Path, default=ROOT/'datasets')
    parser.add_argument('--manifest', type=Path)
    parser.add_argument('--output', type=Path)
    parser.add_argument('--sample-id')
    parser.add_argument('--jobs', type=int, default=4)
    parser.add_argument('--force', action='store_true')
    args = parser.parse_args()
    args.manifest = args.manifest or ROOT/f'baseline/expecto-results/matrix-chtc-20261020-140827/{args.group}-unit-tc/manifest.jsonl'
    args.output = args.output or DEFAULT_OUTPUT.parent/f'{args.group}-targeted-unit-tc'
    if args.jobs < 1:
        parser.error('--jobs must be positive')
    args.datasets, args.output = args.datasets.resolve(), args.output.resolve()
    args.output.mkdir(parents=True, exist_ok=True)
    rows = [json.loads(line) for line in args.manifest.read_text().splitlines()]
    rows = [r for r in rows if r['group']==args.group and (not args.sample_id or r['id']==args.sample_id)]
    if not rows:
        parser.error('No matching testpoints')
    for row in rows:
        # Check the saved manifest still describes the actual code under test.
        actual = hashlib.sha256((args.datasets/row['source']).read_bytes()).hexdigest()
        if actual != row['source_sha256']:
            parser.error(f"Source changed: {row['source']}; prepare a fresh manifest first")
    with ThreadPoolExecutor(max_workers=args.jobs) as pool:
        for future in as_completed([pool.submit(generate_one, row, args) for row in rows]):
            row, result = future.result()
            print(row['id'], result['status'], result.get('positive',0), result.get('negative',0), flush=True)
    summary, traces = {}, {}
    for folder in sorted(args.output.iterdir()):
        if not folder.is_dir() or not (folder/'result.json').exists():
            continue
        summary[folder.name] = json.loads((folder/'result.json').read_text())
        if (folder/'examples.json').exists() and summary[folder.name].get('trace_policy') == TRACE_POLICY:
            traces[folder.name] = json.loads((folder/'examples.json').read_text())
    write(args.output/'summary.json', summary)
    write(args.output/'generation-traces.json', traces)
    report_rows=[json.loads((folder/'sample.json').read_text()) for folder in sorted(args.output.iterdir())
                 if folder.is_dir() and (folder/'result.json').exists() and (folder/'sample.json').exists()]
    write_report(args.output, report_rows)


def write_report(output, rows):
    import csv
    from collections import Counter
    output=Path(output)
    details=[]
    selected_trace_count=0
    for row in rows:
        folder=output/row['id']
        result=json.loads((folder/'result.json').read_text())
        witnesses=folder/'differential-witnesses.json'
        regressions=sum(w['reference_satisfies_property'] is True and w['mutant_satisfies_property'] is False
                        for w in json.loads(witnesses.read_text())) if witnesses.exists() else 0
        result['confirmed_property_regressions']=regressions
        write(folder/'result.json',result)
        examples_path=folder/'examples.json'
        if examples_path.exists():
            examples=json.loads(examples_path.read_text())
            schema=json.loads((folder/'adapter.json').read_text())['method_info']
            for group in ('corrects','incorrects'):
                for trace in examples[group].values():
                    for key,ty in schema['entry_schema'].items():
                        validate_projection(trace['entry'][key],ty)
                    for key,ty in schema['exit_schema'].items():
                        validate_projection(trace['exit'][key],ty)
                    selected_trace_count+=1
            cases=json.loads((folder/'cases.json').read_text()) if (folder/'cases.json').exists() else []
            assert result.get('trace_policy') == TRACE_POLICY, row['id']
            for trace in examples['corrects'].values():
                assert any(c['label'] is False and c['trace']==trace for c in cases), row['id']
            assert not examples['incorrects'], row['id']
            assert len(examples['corrects'])<=3
        details.append(dict(id=row['id'],source=row['source'],class_name=row['class_name'],
                            method=row['method_name'],status=result['status'],
                            positive=result.get('positive',0),negative=result.get('negative',0),
                            generation_positive=result.get('generation_positive',0),
                            generation_negative=result.get('generation_negative',0),
                            positive_origin=result.get('positive_origin',''),
                            confirmed_property_regressions=regressions,
                            differential_witnesses=result.get('differential_witnesses',0),
                            unexpected_exception_witnesses=result.get('unexpected_exception_witnesses',0),
                            exceptions=result.get('exceptions',0)))
    sources={d['source'] for d in details}
    detected={d['source'] for d in details if d['confirmed_property_regressions'] or d['unexpected_exception_witnesses']}
    validation=dict(trace_policy=TRACE_POLICY, testpoints=len(details),sources=len(sources),statuses=dict(Counter(d['status'] for d in details)),
                    testpoints_with_positives=sum(d['generation_positive']>0 for d in details),
                    testpoints_with_three_positives=sum(d['generation_positive']==3 for d in details),
                    gt_evaluated=True,
                    testpoints_with_property_violations=sum(d['negative']>0 for d in details),
                    testpoints_with_reference_confirmed_property_regression=sum(d['confirmed_property_regressions']>0 for d in details),
                    testpoints_with_observational_difference=sum(d['differential_witnesses']>0 for d in details),
                    testpoints_with_unexpected_method_exception=sum(d['unexpected_exception_witnesses']>0 for d in details),
                    sources_with_reference_confirmed_failure=len(detected),
                    selected_examples_validated_against_actual_executions=True,
                    selected_trace_count=selected_trace_count,
                    selected_traces_match_target_adapter_schema=True,
                    random_sampling=False,scenarios_per_execution=384,
                    note='Source-level failures are not a formal mutation score: there is no independent proof all remaining mutants are killable by these assertions.')
    write(output/'validation.json',validation)
    with (output/'coverage.csv').open('w',encoding='utf-8-sig',newline='') as f:
        writer=csv.DictWriter(f,fieldnames=list(details[0]));writer.writeheader();writer.writerows(details)
    summary={d['id']:json.loads((output/d['id']/'result.json').read_text()) for d in details}
    write(output/'summary.json',summary)
    report='''# Targeted GT-failing unit tests

Deterministic real method executions, not independent old/new sampling. The
original dataset methods are not modified. Each harness attempts 12 curated
receiver states × 16 argument selectors × 2 boolean flags (384 probes); duplicates
and invalid calls are recorded separately. Reflection initializes valid storage
without accidentally invoking the mutated setup operation. Snapshots read actual
collection storage instead of calling a potentially mutated `toArray()`.

Corner cases cover empty/singleton collections, first/last/end insertion positions,
duplicate and unique values, nulls where allowed, present/absent values, large
Integers, wrapped deques, BitSet bit/range boundaries 31/32/63/64/65/127/128/129/255,
empty and cross-word ranges, empty/shared/Unicode Trie prefixes, and UnionFind
singleton/already-merged/different components. No random inputs or LLM calls.

## Label and reference provenance

Up to three actual mutant execution traces with GT=false are selected.
Same-entry reference=true/mutant=false witnesses are preferred, followed by
other GT-failing corner-case executions. No GT-passing fallback and no reference
outputs are fed to generation. GT-evaluation exceptions are not labelled false.

All selected mutant traces go into upstream `corrects`, meaning the candidate
must accept this implementation behavior, even though GT rejects it. `incorrects`
is empty. A task without eligible traces is reported individually as a trace
collection error; other tasks continue. Missing witnesses are not proofs that
a mutant is correct. Java 11 uses a compile-only source copy without @java.io.Serial.

`differential-witnesses.json` pairs normal reference/mutant runs with the same
selector AND identical projected entry state. An observational difference alone
is not necessarily a violation of the target assertion; confirmed property
GT regressions require reference=true and mutant=false. `exception-witnesses.json`
only counts target-method exceptions when the reference returned normally; invalid calls that also fail on the reference do not count.

## Files and usage

- `generation-traces.json`: Expecto-compatible examples for every testpoint.
- `coverage.csv`, `validation.json`, `summary.json`: measured coverage/provenance.
- Per testpoint: `test-plan` is represented by `FuzzTest.java` and selector IDs;
  `cases.json`, `examples.json`, `selected-case-ids.json`, reference outputs,
  differential/exception witnesses and compile/execution logs are retained.
- `TargetedUnitTest.java` and `replay.sh` replay selected assertion tests against
  the mutant. An AssertionError/nonzero exit is expected when a mutant is exposed.
  Run `bash <testpoint>/replay.sh p0` for one selected mutant execution, or omit p0 for all. GT is not checked during replay.

The upstream Expecto tree-search generator consumes at most three `corrects`
entries. Every selected mutant trace is placed in that slot; no negative examples
are exported. The historical field name does not label GT correctness. To use these
behavior constraints, pass `--traces <this-directory>/generation-traces.json --require-traces`
to the existing pipeline run command with `--group buggycodes`.

## Measured validation

'''
    report+='```json\n'+json.dumps(validation,indent=2)+'\n```\n'
    uncovered=[d['id'] for d in details if not d['confirmed_property_regressions'] and not d['unexpected_exception_witnesses']]
    report+='\nTestpoints without a reference-confirmed failure (not claimed equivalent or correct):\n\n'
    report+='\n'.join('- '+sid for sid in uncovered)+'\n'
    (output/'RUN_REPORT.md').write_text(report)
    print(json.dumps(validation,indent=2),flush=True)


def validate_projection(value, schema):
    from .trace_projection import record_fields
    if schema=='nonetype':
        assert value is None
    elif schema in ('int','bool'):
        assert type(value) is (int if schema=='int' else bool)
    elif schema.startswith('option['):
        if value is not None:
            validate_projection(value,schema[7:-1])
    elif schema.startswith('list['):
        assert isinstance(value,list)
        for item in value:
            validate_projection(item,schema[5:-1])
    elif schema.startswith('record['):
        fields=record_fields(schema)
        assert isinstance(value,dict) and set(value)=={name for name,ty in fields}
        for name,ty in fields:
            validate_projection(value[name],ty)
    else:
        raise ValueError(f'Unsupported validation schema: {schema}')


if __name__ == '__main__':
    main()
