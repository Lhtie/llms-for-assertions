"""Small, explicit proofs for vacuous existential implications."""

from baseline.expecto_jml.translator import A
from .contracts import single_comparison
from .translate import LocalBinding


def independent_total(node, variable, env):
    """Only scalar constants/record projections and their lexical aliases.

    Do not erase an arbitrary helper call, partial unwrap or list access.
    """
    if isinstance(node, A.Identifier):
        if node.name == variable:
            return False
        value = env.get(node.name)
        if isinstance(value, LocalBinding):
            return independent_total(value.expression, variable, value.scope)
        return True
    if isinstance(node, A.FieldAccess):
        return independent_total(node.record, variable, env)
    return isinstance(node, (A.NumberLiteral, A.NoneLiteral, A.BoolLiteral))


def vacuous_exists_reason(node, env, conjuncts):
    if not isinstance(node, A.ExistsExpr):
        return None
    body = node.satisfies_expr
    if not isinstance(body, A.BinaryOp) or body.op != "==>":
        return None
    for variable in node.vars:
        if not isinstance(variable.get_type(), A.Integer):
            continue
        for term in conjuncts(body.left):
            term = single_comparison(term)
            if not isinstance(term, A.BinaryOp):
                continue
            for bound, other, reversed_order in [
                (term.left, term.right, False), (term.right, term.left, True)
            ]:
                direct = isinstance(bound, A.Identifier) and bound.name == variable.name
                payload = None
                if isinstance(bound, A.SomeExpr):
                    payload = bound.value
                elif (isinstance(bound, A.FuncCall) and isinstance(bound.func, A.Identifier)
                      and bound.func.name == "some" and len(bound.args) == 1):
                    payload = bound.args[0]
                wrapped = isinstance(payload, A.Identifier) and payload.name == variable.name
                if (term.op == "==" and (direct or wrapped)
                        and independent_total(other, variable.name, env)):
                    return (f"exists {variable.name}: guard implies body is true: "
                            "an integer different from the guard's single equality value falsifies the guard")
                if not direct or term.op not in {"<", "<=", ">", ">="}:
                    continue
                # Exhibit a Java-int-representable witness too; no truncation
                # of a genuinely unbounded quantifier is involved.
                if not isinstance(other, A.NumberLiteral) or not isinstance(other.value, int):
                    continue
                op = term.op
                if reversed_order:
                    op = {"<": ">", "<=": ">=", ">": "<", ">=": "<="}[op]
                witness = other.value + {"<": 0, "<=": 1, ">": 0, ">=": -1}[op]
                if -(2**31) <= witness < 2**31:
                    return (f"exists {variable.name}: guard implies body is true: "
                            f"{variable.name} = {witness} falsifies a conjunct of the guard")
    return None
