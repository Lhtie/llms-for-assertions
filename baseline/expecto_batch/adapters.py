"""Explicit Integer-collection representation, independent of ground-truth text.

This is a restricted input domain, not a claim to cover arbitrary generic E.
"""

SUPPORTED = {"ArrayList", "ArrayDeque", "Vector", "Stack", "HashSet", "PriorityQueue", "TreeSet"}


def adapt(row):
    from .extended_adapters import EXTENDED, adapt_extended

    if row["class_name"] in EXTENDED:
        return adapt_extended(row)
    if row["class_name"] not in SUPPORTED:
        raise ValueError("No collection adapter for this class")
    mapping = {}

    def expression(path, code):
        mapping[path] = {"expression": code}

    def sequence(path, owner, array=False):
        mapping[path] = {
            "length": f"{owner}.length" if array else f"{owner}.size()",
            "get": (
                f"((Integer){owner}[{{index}}])"
                if array
                else f"((Integer){owner}.toArray()[{{index}}])"
            ),
        }
        return "list[option[int]]"

    def collection(path, owner, nullable=False):
        expression(path + ".size", f"{owner}.size()")
        expression(path + ".empty", f"{owner}.isEmpty()")
        sequence(path + ".elements", owner)
        fields = "size: int, empty: bool, elements: list[option[int]]"
        if nullable:
            expression(path + ".is_null", f"{owner} == null")
            fields = "is_null: bool, " + fields
        return "record[" + fields + "]"

    args = []
    java_args = []
    for arg in row["parameters"]:
        name, typ = arg["name"], arg["type"]
        path = "param." + name
        if typ == "int":
            dtype = "int"
            jtype = "int"
        elif typ == "boolean":
            dtype = "bool"
            jtype = "boolean"
        elif typ in {"E", "Object"}:
            dtype = "option[int]"
            jtype = "Integer"
            expression(path, name)
        elif typ.startswith("Collection"):
            dtype = collection(path, name, nullable=True)
            jtype = "java.util.Collection<Integer>"
        else:
            raise ValueError(f"Unsupported parameter type {typ}")
        args.append(f"{name}: {dtype}")
        java_args.append(dict(name=name, type=jtype))
    receiver = "nonetype" if row["constructor"] else collection("entry_self", "this")
    post = collection("exit_self", "this")
    ret = row["return_type"]
    java_ret = ret
    if row["constructor"] or ret == "void":
        result = "nonetype"
        java_ret = None
    elif row["method_name"] == "clone":
        owner = f'(({row["class_name"]}<Integer>)\\result)'
        result = collection("ret", owner, nullable=True)
        # Reference identity is an explicit Boolean projection, distinct from contents.
        expression("ret.same_receiver", r"((boolean)(\result == this))")
        result = result[:-1] + ", same_receiver: bool]"
        java_ret = f'{row["class_name"]}<Integer>'
    elif ret in {"E", "Object"}:
        result = "option[int]"
        java_ret = "Integer"
        expression("ret", r"\result")
    elif ret == "boolean":
        result = "bool"
    elif ret == "int":
        result = "int"
    elif ret in {"Object[]", "E[]"}:
        result = "record[is_null: bool, elements: list[option[int]]]"
        java_ret = "Integer[]"
        expression("ret.is_null", r"\result == null")
        sequence("ret.elements", r"\result", array=True)
    else:
        raise ValueError(f"Unsupported return type {ret}")
    info = dict(
        code=row["method_code"],
        file=row["source"],
        signature=row["method_signature"],
        javadoc=dict(description=row["description"], params={}, returns="", throws={}),
        entry_schema=dict(params="record[" + ", ".join(args) + "]", self=receiver),
        exit_schema=dict(self=post, ret=result),
    )
    return dict(
        method_info=info,
        mapping=mapping,
        java_receiver=f'{row["class_name"]}<Integer>',
        java_parameters=java_args,
        java_return=java_ret,
        representation="Integer collection domain; option[int] is nullable Integer; elements is toArray() order; record is_null guards nullable objects; same_receiver is reference identity",
    )
