"""Public-observer projections for the small hand-written datasets/examples classes.

As in extended_adapters, the representation depends on the class API and the
parameter names, never on the target assertion.
"""

from .extended_adapters import Profile

INT_LISTS = {'IntList', 'IntSeq'}
EXAMPLES = INT_LISTS | {'PairMap'}


def adapt_examples(row):
    p = Profile(row)
    cls = row['class_name']
    names = {arg['name'] for arg in row['parameters']}
    ret = row['return_type']

    def state(path):
        fields = {'size': p.scalar(path + '.size', 'int', 'this.size()')}
        if cls in INT_LISTS:
            fields['empty'] = p.scalar(path + '.empty', 'bool', 'this.isEmpty()')
            fields['elements'] = p.sequence(path + '.elements', 'int', 'this.size()', 'this.get({index})')
            return p.record(fields)
        # PairMap holds strings, which the DSL cannot name directly: expose the
        # key query and equality relations against the stored values instead.
        for name in sorted(names):
            if name != 'key':
                continue
            fields['contains_key'] = p.scalar(path + '.contains_key', 'bool', 'this.containsKey(key)')
            fields['contains_value'] = p.scalar(path + '.contains_value', 'bool', 'this.containsValue(key)')
            fields['index_of_key'] = p.scalar(path + '.index_of_key', 'int', 'this.indexOf(key)')
            fields['values_equal_key'] = p.sequence(path + '.values_equal_key', 'bool', 'this.size()',
                                                    'java.util.Objects.equals(this.valueAt({index}), key)')
            fields['values_identical_key'] = p.sequence(path + '.values_identical_key', 'bool', 'this.size()',
                                                       'this.valueAt({index}) == key')
        # \result does not exist in the entry state.
        if ret == 'String' and path == 'exit_self':
            fields['values_equal_result'] = p.sequence(path + '.values_equal_result', 'bool', 'this.size()',
                                                       r'java.util.Objects.equals(this.valueAt({index}), \result)')
            fields['values_identical_result'] = p.sequence(path + '.values_identical_result', 'bool', 'this.size()',
                                                           r'this.valueAt({index}) == \result')
        return p.record(fields)

    parameters, java_parameters = {}, []
    for arg in row['parameters']:
        if arg['type'] not in {'int', 'boolean', 'String'}:
            raise ValueError(f"Unsupported example parameter type {arg['type']}")
        dtype, jtype = p.parameter(arg['name'], arg['type'])
        parameters[arg['name']] = dtype
        java_parameters.append({'name': arg['name'], 'type': jtype})
    entry = 'nonetype' if row['constructor'] else state('entry_self')
    post = state('exit_self')
    java_return = ret
    if row['constructor'] or ret == 'void':
        result, java_return = 'nonetype', None
    elif ret in {'int', 'boolean'}:
        result = 'int' if ret == 'int' else 'bool'
    elif ret == 'String':
        fields = {'is_null': p.scalar('ret.is_null', 'bool', r'\result == null')}
        for name in sorted(names):
            if any(a['name'] == name and a['type'] == 'String' for a in row['parameters']):
                fields['equals_' + name] = p.scalar('ret.equals_' + name, 'bool',
                                                    rf'java.util.Objects.equals(\result, {name})')
                fields['identical_' + name] = p.scalar('ret.identical_' + name, 'bool',
                                                       rf'\result == {name}')
        result = p.record(fields)
    else:
        raise ValueError(f'Unsupported example return type: {ret}')
    info = dict(code=row['method_code'], file=row['source'], signature=row['method_signature'],
                javadoc=dict(description=row['description'], params={}, returns='', throws={},
                             state_representation='\n'.join(p.observers)),
                entry_schema=dict(params=p.record(parameters), self=entry),
                exit_schema=dict(self=post, ret=result))
    return dict(method_info=info, mapping=p.mapping, java_parameters=java_parameters,
                java_return=java_return, java_receiver=cls, extended=True,
                representation='Public observer projections; int list elements in index order; strings are exposed through nullness, UTF-16 code units, content equality, and reference identity.')
