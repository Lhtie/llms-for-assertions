"""Public-observer projections for maps, bits, graphs, tries and union-find.

The representation depends on API/parameter names, never the target assertion.
Observers involving a query parameter describe that query in the corresponding
old/new state. Strings use UTF-16 code units; long words use signed high/low ints.
"""

EXTENDED = {'BitSet', 'HashMap', 'DefaultListenableGraph', 'Trie', 'UnionFind'}


class Profile:
    def __init__(self, row):
        self.row = row
        self.mapping = {}
        self.observers = []

    def scalar(self, path, ty, code):
        self.mapping[path] = {'expression': code}
        self.observers.append(f'{path}: {ty} = {code}')
        return ty

    def sequence(self, path, ty, length, get):
        self.mapping[path] = {'length': length, 'get': get}
        self.observers.append(f'{path}: list[{ty}], length = {length}, element[i] = {get.replace("{index}", "i")}')
        return f'list[{ty}]'

    def record(self, fields):
        return 'record[' + ', '.join(f'{k}: {v}' for k, v in fields.items()) + ']'

    def state(self, path, owner, nullable=False):
        cls = self.row['class_name']
        params = {p['name'] for p in self.row['parameters']}
        fields = {}
        def scalar(name, ty, expression):
            fields[name] = self.scalar(path + '.' + name, ty, expression)
        def sequence(name, ty, length, get):
            fields[name] = self.sequence(path + '.' + name, ty, length, get)
        if nullable:
            scalar('is_null', 'bool', f'{owner} == null')
        if cls == 'BitSet':
            scalar('length', 'int', f'{owner}.length()')
            scalar('cardinality', 'int', f'{owner}.cardinality()')
            scalar('empty', 'bool', f'{owner}.isEmpty()')
            sequence('bits', 'bool', f'{owner}.length()', f'{owner}.get({{index}})')
            sequence('words_low', 'int', f'{owner}.toLongArray().length', f'((int){owner}.toLongArray()[{{index}}])')
            sequence('words_high', 'int', f'{owner}.toLongArray().length', f'((int)({owner}.toLongArray()[{{index}}] >> 32))')
            sequence('bytes', 'int', f'{owner}.toByteArray().length', f'((int){owner}.toByteArray()[{{index}}])')
            for name in ['bitIndex', 'fromIndex', 'toIndex']:
                if name in params:
                    scalar('bit_at_' + name, 'bool', f'({name} >= 0 && {owner}.get({name}))')
            if self.row['return_type'] == 'int':
                scalar('bit_at_result', 'bool', rf'(\result >= 0 && {owner}.get(\result))')
        elif cls == 'DefaultListenableGraph':
            sequence('vertices', 'option[int]', f'{owner}.vertexSet().size()', f'((Integer){owner}.vertexSet().toArray()[{{index}}])')
            sequence('edges', 'option[int]', f'{owner}.edgeSet().size()', f'((Integer){owner}.edgeSet().toArray()[{{index}}])')
        else:
            scalar('size', 'int', f'{owner}.size()')
            if cls != 'UnionFind':
                scalar('empty', 'bool', f'{owner}.isEmpty()')
            if cls == 'HashMap':
                if 'key' in params:
                    scalar('contains_key', 'bool', f'{owner}.containsKey(key)')
                    scalar('value_at_key', 'option[int]', f'((Integer){owner}.get(key))')
                if 'value' in params:
                    scalar('contains_value', 'bool', f'{owner}.containsValue(value)')
                if self.row['return_type'] == 'V':
                    scalar('contains_return_value', 'bool', rf'{owner}.containsValue(\result)')
            elif cls == 'UnionFind':
                scalar('number_of_sets', 'int', f'{owner}.numberOfSets()')
                for name in sorted(params):
                    scalar('contains_' + name, 'bool', f'{owner}.contains({name})')
                    scalar('representative_' + name, 'option[int]', f'({owner}.contains({name}) ? {owner}.find({name}) : null)')
                if {'element1', 'element2'} <= params:
                    scalar('same_set', 'bool', f'({owner}.contains(element1) && {owner}.contains(element2) && {owner}.inSameSet(element1, element2))')
            elif cls == 'Trie':
                for name in sorted(params):
                    scalar('contains_' + name, 'bool', f'({name} != null && {owner}.contains({name}))')
                    scalar('prefix_count_' + name, 'int', f'({name} == null ? 0 : {owner}.countPrefix({name}))')
                    scalar('starts_with_' + name, 'bool', f'({name} != null && {owner}.startsWith({name}))')
                    length = f'({name} == null ? 0 : {name}.length() + 1)'
                    prefix = f'{name}.substring(0, {{index}})'
                    sequence('prefix_counts_' + name, 'int', length, f'{owner}.countPrefix({prefix})')
                    sequence('prefix_present_' + name, 'bool', length, f'{owner}.startsWith({prefix})')
                    sequence('prefix_results_contain_' + name, 'bool', length, f'{owner}.keysWithPrefix({prefix}).contains({name})')
        return self.record(fields)

    def parameter(self, name, ty):
        path = 'param.' + name
        if ty in {'int', 'boolean'}:
            return self.scalar(path, 'int' if ty == 'int' else 'bool', name), ty
        if ty in {'E', 'V', 'K', 'T', 'Object'}:
            return self.scalar(path, 'option[int]', name), 'Integer'
        if ty == 'String':
            return self.record({
                'is_null': self.scalar(path + '.is_null', 'bool', f'{name} == null'),
                'length': self.scalar(path + '.length', 'int', f'({name} == null ? 0 : {name}.length())'),
                'char_codes': self.sequence(path + '.char_codes', 'int', f'({name} == null ? 0 : {name}.length())', f'((int){name}.charAt({{index}}))'),
            }), 'String'
        if ty == 'BitSet':
            return self.state(path, name, True), 'BitSet'
        if ty.startswith('Map<'):
            return self.record({
                'is_null': self.scalar(path + '.is_null', 'bool', f'{name} == null'),
                'size': self.scalar(path + '.size', 'int', f'{name}.size()'),
                'empty': self.scalar(path + '.empty', 'bool', f'{name}.isEmpty()'),
            }), 'java.util.Map<Integer,Integer>'
        if ty in {'long[]', 'byte[]'}:
            fields = {'is_null': self.scalar(path + '.is_null', 'bool', f'{name} == null')}
            if ty == 'long[]':
                fields['low'] = self.sequence(path + '.low', 'int', f'{name}.length', f'((int){name}[{{index}}])')
                fields['high'] = self.sequence(path + '.high', 'int', f'{name}.length', f'((int)({name}[{{index}}] >> 32))')
            else:
                fields['elements'] = self.sequence(path + '.elements', 'int', f'{name}.length', f'((int){name}[{{index}}])')
            return self.record(fields), ty
        raise ValueError(f'Unsupported extended parameter: {ty}')


def adapt_extended(row):
    p = Profile(row)
    cls = row['class_name']
    receiver = {'HashMap': 'HashMap<Integer,Integer>', 'DefaultListenableGraph': 'DefaultListenableGraph<Integer,Integer>',
                'UnionFind': 'UnionFind<Integer>'}.get(cls, cls)
    parameters, java_parameters = {}, []
    for arg in row['parameters']:
        dtype, jtype = p.parameter(arg['name'], arg['type'])
        parameters[arg['name']] = dtype
        java_parameters.append({'name': arg['name'], 'type': jtype})
    static = 'static' in row['method_signature'].split()
    entry = 'nonetype' if row['constructor'] or static else p.state('entry_self', 'this')
    post = 'nonetype' if static else p.state('exit_self', 'this')
    ret = row['return_type']
    java_return = ret
    if row['constructor'] or ret == 'void':
        result, java_return = 'nonetype', None
    elif row['method_name'] == 'clone' or ret == 'BitSet':
        result = p.state('ret', r'\result', True)
        java_return = receiver
        if row['method_name'] == 'clone':
            result = result[:-1] + ', same_receiver: ' + p.scalar('ret.same_receiver', 'bool', r'(\result == this)') + ']'
    elif ret in {'boolean', 'int', 'V'}:
        result = {'boolean': 'bool', 'int': 'int', 'V': 'option[int]'}[ret]
        java_return = 'Integer' if ret == 'V' else ret
    elif ret == 'List<String>':
        result = p.record({
            'is_null': p.scalar('ret.is_null', 'bool', r'\result == null'),
            'size': p.scalar('ret.size', 'int', r'\result.size()'),
            'contained_in_receiver': p.sequence('ret.contained_in_receiver', 'bool', r'\result.size()', r'this.contains(\result.get({index}))'),
            'starts_with_prefix': p.sequence('ret.starts_with_prefix', 'bool', r'\result.size()', r'\result.get({index}).startsWith(prefix)'),
        })
        java_return = 'java.util.List<String>'
    else:
        raise ValueError(f'Unsupported extended return type: {ret}')
    info = dict(code=row['method_code'], file=row['source'], signature=row['method_signature'],
                javadoc=dict(description=row['description'], params={}, returns='', throws={},
                             state_representation='\n'.join(p.observers)),
                entry_schema=dict(params=p.record(parameters), self=entry),
                exit_schema=dict(self=post, ret=result))
    return dict(method_info=info, mapping=p.mapping, java_parameters=java_parameters,
                java_return=java_return, java_receiver=receiver, extended=True,
                representation='Public observer projections; Integer generic objects; UTF-16 strings; long words split into signed high/low 32-bit halves. Query fields use method parameters; absent UnionFind representatives are null.')
