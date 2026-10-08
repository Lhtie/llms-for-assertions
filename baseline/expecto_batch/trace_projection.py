"""Serialize the same public-observer schema used by extended batch generation."""
import json

from .tc_harness import expression, harness, generated_value

JAVA_PROJECTION = r'''
 static int tcNumber(int selector,int size) {
  int[] values={-2,-1,0,1,size-1,size,size+1,16};
  return values[Math.floorMod(selector,values.length)];
 }

 static Object record(Object... fields) {
  java.util.Map<String,Object> result=new java.util.LinkedHashMap<>();
  for(int i=0;i<fields.length;i+=2)result.put((String)fields[i],fields[i+1]);
  return result;
 }
 static Object[] sequence(int length, java.util.function.IntFunction<Object> getter) {
  Object[] result=new Object[length];
  for(int i=0;i<length;i++)result[i]=getter.apply(i);
  return result;
 }
'''


def record_fields(schema):
    body = schema[len('record['):-1]
    parts, depth, start = [], 0, 0
    for i, char in enumerate(body):
        depth += (char == '[') - (char == ']')
        if char == ',' and depth == 0:
            parts.append(body[start:i])
            start = i + 1
    parts.append(body[start:])
    return [tuple(s.strip() for s in part.split(':', 1)) for part in parts if part.strip()]


def projection(schema, path, mapping, nullable=None):
    def java(code):
        result = expression('assert ' + code + ';')
        if path.startswith('entry_self.'):
            result = result.replace('fuzzobj_new', 'fuzzobj_old')
        return result

    target = mapping.get(path)
    if schema == 'nonetype':
        return 'null'
    if schema.startswith('record['):
        fields = record_fields(schema)
        null_path = path + '.is_null'
        guard = nullable
        if null_path in mapping:
            guard = java(mapping[null_path]['expression'])
        args = []
        for name, ty in fields:
            args.extend([json.dumps(name), projection(ty, path + '.' + name, mapping,
                                                     None if name == 'is_null' else guard)])
        return 'record(' + ','.join(args) + ')'
    if schema.startswith('list['):
        index = '__trace_index'
        length = java(target['length'])
        getter = java(target['get'].replace('{index}', index))
        code = f'sequence({length},{index} -> ({getter}))'
        default = 'new Object[0]'
    else:
        raw = target['expression'] if target else ('New_Ret' if path == 'ret' else path.removeprefix('param.'))
        code = java(raw)
        default = 'false' if schema == 'bool' else '0' if schema == 'int' else 'null'
    return f'(({nullable}) ? {default} : ({code}))' if nullable else code


def instrumented_harness(row, adapter, helpers, collection_probe=None):
    code = harness(row, adapter, row['ground_truth'])
    if collection_probe is not None:
        # Keep the original buggy benchmark's collection input factories exactly.
        start = code.index(' static Integer atom(')
        end = code.index(' static long valid=', start)
        code = code[:start] + collection_probe + code[end:]
        start = code.index(' public static void probe(', code.index(' static Boolean eval('))
        end = code.index(' public static void main(', start)
        code = code[:start] + code[end:]
    elif row['class_name'] == 'BitSet':
        # Include valid index boundaries instead of mostly vacuous negative indices.
        receiver = adapter['java_receiver']
        for i, param in enumerate(adapter['java_parameters']):
            if param['type'] == 'int':
                original = generated_value('int', f'(c+{i})', receiver)
                code = code.replace(original, f'tcNumber(c+{i},oldState.length())')
        if adapter['java_return'] == 'int':
            code = code.replace(generated_value('int', 'd', receiver),
                                'tcNumber(d,newState.length())')
    info = adapter['method_info']
    mapping = adapter['mapping']
    old = projection(info['entry_schema']['self'], 'entry_self', mapping)
    new = projection(info['exit_schema']['self'], 'exit_self', mapping)
    ret = projection(info['exit_schema']['ret'], 'ret', mapping)
    params = []
    for name, ty in record_fields(info['entry_schema']['params']):
        params.extend([json.dumps(name), projection(ty, 'param.' + name, mapping)])
    start = code.index(' public void check(')
    body = code.index(') {', start) + len(') {')
    end = code.index(' static Boolean eval(', body)
    check = f'''
  try {{
   boolean a={expression(row['ground_truth'])};
   emit(a,{old},{new},{ret},new Object[]{{{','.join(params)}}});
   valid++;
  }} catch(Exception problem) {{ failure(problem); errors++; }}
 }}
'''
    return code[:body] + check + helpers + JAVA_PROJECTION + code[end:]
