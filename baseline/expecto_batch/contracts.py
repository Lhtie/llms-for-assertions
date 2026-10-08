"""Recognize total return definitions, never infer a function from its name."""

from baseline.expecto_jml.translator import A


def single_comparison(node):
    if isinstance(node, A.Comparisons) and len(node.comparisons) == 1:
        return node.comparisons[0]
    return node


def length_case_definition(decl, references):
    """Recognize exhaustive empty/nonempty list branches in an implicit function.

    List length is nonnegative, so n == 0 and n > 0 partition the domain.
    Both branches must uniquely define the result and no other contract is
    discarded. This also works with local aliases for len(list).
    """
    if decl.requires or decl.body is not None:
        return None

    def conjuncts(node):
        if isinstance(node, A.BinaryOp) and node.op == "∧":
            return conjuncts(node.left) + conjuncts(node.right)
        return [node]

    terms = [part for ensure in decl.ensures for part in conjuncts(ensure.expr)]
    if len(terms) != 2:
        return None
    bindings = {binding.var.name: binding.expr for binding in decl.var_decls}

    def resolve(node):
        seen = set()
        while isinstance(node, A.Identifier) and node.name in bindings:
            if node.name in seen:
                return None
            seen.add(node.name)
            node = bindings[node.name]
        return node

    cases = {}
    for term in terms:
        if not isinstance(term, A.BinaryOp) or term.op != "==>":
            return None
        condition = single_comparison(term.left)
        if (not isinstance(condition, A.BinaryOp) or condition.op not in {"==", ">"}
                or not isinstance(condition.right, A.NumberLiteral) or condition.right.value != 0):
            return None
        length = resolve(condition.left)
        if (not isinstance(length, A.FuncCall) or not isinstance(length.func, A.Identifier)
                or length.func.name != "len" or len(length.args) != 1
                or not isinstance(length.args[0].get_type(), A.ListType)):
            return None
        result = single_comparison(term.right)
        value = None
        if isinstance(result, A.BinaryOp) and result.op == "==":
            for lhs, rhs in [(result.left, result.right), (result.right, result.left)]:
                if isinstance(lhs, A.Identifier) and lhs.name == decl.return_val.name:
                    value = rhs
        elif (isinstance(result, A.FuncCall) and isinstance(result.func, A.Identifier)
              and result.func.name == "is_none" and len(result.args) == 1
              and isinstance(result.args[0], A.Identifier)
              and result.args[0].name == decl.return_val.name):
            value = A.NoneLiteral()
        if value is None or references(value, decl.return_val.name):
            return None
        if condition.op in cases:
            return None
        cases[condition.op] = (term.left, length, value)
    if set(cases) != {"==", ">"}:
        return None
    from DSL.ast_unparse import unparse

    if unparse(cases["=="][1]) != unparse(cases[">"][1]):
        return None
    return A.IfExpr(condition=cases["=="][0], then_branch=cases["=="][2],
                    else_branch=cases[">"][2], ty=decl.return_val.ty)
