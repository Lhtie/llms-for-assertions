"""Equality/identity observer profiles for heterogeneous lists and graph paths.

Object values are not coerced to integers or hash codes. The schema exposes
public query relations, including indexed cross-state relations, independently
of the target assertion. This is a projection, not arbitrary object serialization.
"""
from .extended_adapters import Profile

OBJECT_CLASSES = {'AttributeList', 'RoleList', 'RoleUnresolvedList', 'Path'}
OBJECT_TYPES = {'Attribute': 'javax.naming.directory.Attribute',
                'Role': 'javax.management.relation.Role',
                'RoleUnresolved': 'javax.management.relation.RoleUnresolved',
                'Edge': 'org.graphstream.graph.Edge', 'Object': 'Object'}


def adapt_objects(row):
    p = Profile(row)
    cls = row['class_name']
    array = 'this.getEdgePath().toArray()' if cls == 'Path' else 'this.toArray()'
    params, java_params = {}, []
    collections, objects = [], []
    for arg in row['parameters']:
        name, ty = arg['name'], arg['type']
        path = 'param.' + name
        if ty == 'int':
            params[name] = p.scalar(path, 'int', name)
            java_type = 'int'
        elif ty in OBJECT_TYPES:
            java_type = OBJECT_TYPES[ty]
            params[name] = p.record({'is_null': p.scalar(path+'.is_null', 'bool', name+'==null')})
            objects.append(name)
        elif ty == 'AttributeList' or ty.startswith('List<'):
            java_type = ty if ty == 'AttributeList' else 'java.util.'+ty.replace('RoleUnresolved', 'javax.management.relation.RoleUnresolved').replace('<Role>', '<javax.management.relation.Role>')
            params[name] = p.record({
                'is_null': p.scalar(path+'.is_null', 'bool', name+'==null'),
                'size': p.scalar(path+'.size', 'int', name+'.size()'),
                'empty': p.scalar(path+'.empty', 'bool', name+'.isEmpty()'),
            })
            collections.append(name)
        else:
            raise ValueError('Unsupported object-profile parameter '+ty)
        java_params.append(dict(name=name,type=java_type))

    def state(path):
        fields = {
            'size': p.scalar(path+'.size', 'int', 'this.size()'),
            'empty': p.scalar(path+'.empty', 'bool', 'this.empty()' if cls=='Path' else 'this.isEmpty()'),
            'elements_null': p.sequence(path+'.elements_null', 'bool', array+'.length', array+'[{index}]==null'),
        }
        for name in objects:
            fields['elements_equal_'+name] = p.sequence(path+'.elements_equal_'+name, 'bool', array+'.length',
                    'java.util.Objects.equals('+array+'[{index}],'+name+')')
            fields['elements_identical_'+name] = p.sequence(path+'.elements_identical_'+name, 'bool', array+'.length',
                    array+'[{index}]=='+name)
        for name in collections:
            fields['equals_'+name] = p.scalar(path+'.equals_'+name, 'bool', 'this.equals('+name+')')
            length = f'({name}==null?0:{array}.length*{name}.size())'
            for relation, expr in [('equal', 'java.util.Objects.equals(A,B)'), ('identical', '(A==B)')]:
                code = expr.replace('A',f'{array}[{{index}}/{name}.size()]').replace('B',f'{name}.get({{index}}%{name}.size())')
                fields['elements_'+relation+'_'+name] = p.sequence(path+'.elements_'+relation+'_'+name,'bool',length,code)
        if path == 'exit_self' and not row['constructor']:
            old = r'\old('+array+')'
            for relation, expr in [('equal', 'java.util.Objects.equals(A,B)'), ('identical', '(A==B)')]:
                # Snapshot the old array outside the quantified index expression.
                code = expr.replace('A', f'{array}[{{index}}/{old}.length]').replace('B', f'{old}[{{index}}%{old}.length]')
                fields['elements_'+relation+'_entry'] = p.sequence(path+'.elements_'+relation+'_entry', 'bool',
                        f'{array}.length*{old}.length', code)
        return p.record(fields)

    entry = 'nonetype' if row['constructor'] else state('entry_self')
    post = state('exit_self')
    ret = row['return_type']
    if row['constructor'] or ret == 'void':
        result, java_ret = 'nonetype', None
    elif ret == 'boolean':
        result, java_ret = 'bool', 'boolean'
    elif ret == 'Object':
        fields = {'is_null': p.scalar('ret.is_null','bool',r'\result==null')}
        for state_name, arr in [('entry', r'\old('+array+')'), ('exit', array)]:
            for relation, expr in [('equal', r'java.util.Objects.equals(\result,A)'), ('identical', r'(\result==A)')]:
                field = state_name+'_elements_'+relation
                fields[field] = p.sequence('ret.'+field,'bool',arr+'.length',expr.replace('A',arr+'[{index}]'))
        result = p.record(fields)
        java_ret = 'Object'
    else:
        raise ValueError('Unsupported object-profile result '+ret)
    info = dict(code=row['method_code'], file=row['source'], signature=row['method_signature'],
                javadoc=dict(description=row['description'], params={}, returns='', throws={},
                    state_representation='\n'.join(p.observers)+'\nCross-array relations are flattened row-major: i * other_length + j. Object equality and reference identity are separate fields.'),
                entry_schema=dict(params=p.record(params),self=entry),exit_schema=dict(self=post,ret=result))
    return dict(method_info=info,mapping=p.mapping,java_parameters=java_params,
                java_return=java_ret,java_receiver=cls,extended=True,
                representation='Public equality and identity relations; typed object parameters; no object hash encoding.')
