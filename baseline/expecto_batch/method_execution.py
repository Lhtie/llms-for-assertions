"""Collect actual Java method executions for all batch datasets."""
import json
import copy
from .tc_harness import factory, generated_value, expression
from .trace_projection import projection, record_fields, JAVA_PROJECTION


def harness(row, adapter, helpers, datasets, label_mode='groundtruth'):
    from codehelper.javahelper import javahelper
    info, mapping = adapter['method_info'], copy.deepcopy(adapter['mapping'])
    receiver = adapter['java_receiver']
    static = 'static' in row['method_signature'].split()
    constructor = row['constructor']
    declarations, names = [], []
    for i, parameter in enumerate(adapter['java_parameters']):
        name, typ = parameter['name'], parameter['type']
        # Select useful boundary values without referring to the target assertion.
        value = generated_value(typ, f'(__tc_c+{i})', receiver)
        if typ == 'int':
            size = 'oldState.length()' if row['class_name'] == 'BitSet' else 'oldState.size()'
            value = f'tcNumber(__tc_c+{i},{size})'
        declarations.append(f'{typ} {name}={value};')
        names.append(name)
    arguments = ','.join(names)
    if constructor:
        invocation = f'final {receiver} fuzzobj_new=new {receiver}({arguments});'
    else:
        target = row['class_name'] if static else 'fuzzobj_new'
        call = f"{target}.{row['method_name']}({arguments})"
        return_type = adapter['java_return']
        # Preserve actual return types: Object[] is not necessarily Integer[],
        # and clone() commonly returns Object even when its projection is typed.
        if row['return_type'] == 'Object[]' and return_type:
            return_type = 'Object[]'
        elif row['return_type'] == 'Object' and return_type:
            call = f'({return_type})({call})'
        invocation = f"{return_type} New_Ret={call};" if return_type else call + ';'
    # Capture each \old expression before invocation, including quantified old
    # element accesses. Do not manufacture a second receiver as a pre-state.
    helper = javahelper((datasets / row['source']).read_text())
    helper.fuzz_objname = 'fuzzobj_new'
    if label_mode == 'implementation':
        # Every successful method return is a positive behavior example, even
        # when the implementation violates the original intended assertion.
        formula, quantified, old_quantified, old_scalar = 'true', [], [], []
    else:
        formula = helper.extract_formula(row['ground_truth'])
        formula = formula.replace('this', 'fuzzobj_new').replace(r'\result', 'New_Ret')
        quantified, old_quantified, formula = helper.handle_forall(formula)
        old_scalar, formula = helper.handle_old(formula)
        formula = expression('assert ' + formula + ';')
    projection_old = []
    for target in mapping.values():
        for field in ('expression', 'length', 'get'):
            if field in target and r'\old' in target[field]:
                original = target[field].replace('this', 'fuzzobj_new')
                statements, target[field] = helper.handle_old(original)
                projection_old.extend(statements)
    entry = projection(info['entry_schema']['self'], 'entry_self', mapping).replace('fuzzobj_old', 'fuzzobj_new')
    post = projection(info['exit_schema']['self'], 'exit_self', mapping)
    ret = projection(info['exit_schema']['ret'], 'ret', mapping)
    params = []
    for name, typ in record_fields(info['entry_schema']['params']):
        params.extend([json.dumps(name), projection(typ, 'param.' + name, mapping)])
    receiver_decl = '' if constructor else f'final {receiver} fuzzobj_new=oldState;'
    return f'''package fuzztests;
import java.util.*;
import java.util.function.Supplier;
import java.lang.reflect.Array;
import {row['package']}.{row['class_name']};
public class FuzzTest {{
{factory(row,adapter)}
{helpers}
{JAVA_PROJECTION}
 static long valid=0,errors=0,mismatches=0;
 static {{Runtime.getRuntime().addShutdownHook(new Thread(() -> {{try {{
  java.nio.file.Files.writeString(java.nio.file.Path.of(System.getProperty("expecto.counts")),
  "{{\\"valid\\":"+valid+",\\"errors\\":"+errors+",\\"mismatches\\":"+mismatches+"}}");
 }}catch(Exception e){{}}}}));}}
 static <T> T exec(Supplier<T> supplier) {{return supplier.get();}}
 @SuppressWarnings("unchecked")
 static <T> T get_from_array(Object array,int index,T sample) {{return (T)Array.get(array,index);}}
 public static void probe(int __tc_a,int __tc_b,int __tc_c,int __tc_d) {{
  try {{
   final {receiver} oldState=make(__tc_a),newState=make(__tc_b);
   {receiver_decl}
   {''.join(declarations)}
   Object entrySnapshot={entry};
   Object[] parameterSnapshot=new Object[]{{{','.join(params)}}};
   {chr(10).join(old_quantified + old_scalar + projection_old)}
   {invocation}
   {chr(10).join(quantified)}
   boolean label={formula};
   emit(label,entrySnapshot,{post},{ret},parameterSnapshot);
   valid++;if(!label)mismatches++;
  }}catch(Exception problem){{failure(problem);errors++;}}
 }}
 public static void main(String[] args) {{
  for(int c=0;c<16;c++)for(int a=0;a<{64 if row['class_name'] == 'PairMap' else 16};a++)probe(a,a+1,c,0);
 }}
}}
'''
