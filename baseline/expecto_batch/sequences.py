"""Finite sequence lowering to Java 8 expressions accepted by javahelper.

Stream predicates avoid javahelper's single-level \\forall parser. Bounds are
always explicit; unrestricted integer/option quantification is rejected.
"""

from dataclasses import dataclass
import re
from typing import Callable

from .translate import BatchTranslator, LocalBinding
from baseline.expecto_jml.translator import A, Value


@dataclass(frozen=True)
class SequenceView(Value):
    size: Value | None = None
    element: Callable[[Value], Value] | None = None


@dataclass(frozen=True)
class MultisetView(Value):
    sequence: Value | None = None


class SequenceTranslator(BatchTranslator):
    def __init__(self, *args):
        super().__init__(*args)
        self.nonnull = set()
        self.notes = []

    def bound_atom(self, expr, env, variable, node):
        # Unlike the legacy \\forall backend, streams accept arbitrary Java
        # expressions as bounds (including casts and conditional helpers).
        code = self.expr(expr, env).read()
        if re.search(rf"\b{re.escape(variable)}\b", code):
            self.fail(node, "Quantifier bound depends on its bound variable")
        return code

    def length(self, value, node):
        if isinstance(value, SequenceView):
            return value.size
        return super().length(value, node)

    def index(self, value, index, node):
        if isinstance(value, SequenceView):
            return value.element(index)
        return super().index(value, index, node)

    @staticmethod
    def operation(ty, values, build):
        code = build(*(v.read() for v in values))
        pre = (
            build(*(v.pre for v in values))
            if all(v.pre is not None for v in values)
            else None
        )
        return Value(code, ty, pre=pre)

    def stream(self, sequence, build, terminal, node):
        self.array(sequence, node)
        name = self.fresh()
        index = Value(name, A.Integer(), pre=name)
        expression = build(self.index(sequence, index, node), index)
        size = self.length(sequence, node).read()
        return f"java.util.stream.IntStream.range(0, {size}).{terminal}({name} -> ({expression}))"

    def member(self, item, sequence, node):
        if isinstance(sequence, MultisetView):
            sequence = sequence.sequence
        code = self.stream(
            sequence,
            lambda element, _: self.equal(item, element, node),
            "anyMatch",
            node,
        )
        return Value(code, A.Boolean())

    def equal(self, left, right, node):
        if isinstance(left, MultisetView) and isinstance(right, MultisetView):
            one, two = left.sequence, right.sequence

            def counts_match(item, _):
                def count(sequence):
                    return (
                        self.stream(
                            sequence,
                            lambda other, __: self.equal(item, other, node),
                            "filter",
                            node,
                        )
                        + ".count()"
                    )

                return f"({count(one)} == {count(two)})"

            length = (
                f"({self.length(one, node).read()} == {self.length(two, node).read()})"
            )
            return f"({length} && {self.stream(one, counts_match, 'allMatch', node)})"
        if isinstance(left.ty, A.ListType) and isinstance(right.ty, A.ListType):
            self.array(left, node)
            self.array(right, node)
            length = f"({self.length(left, node).read()} == {self.length(right, node).read()})"
            same = self.stream(
                left,
                lambda element, i: self.equal(
                    element, self.index(right, i, node), node
                ),
                "allMatch",
                node,
            )
            return f"({length} && {same})"
        return super().equal(left, right, node)

    def concat(self, left, right, node):
        self.array(left, node)
        self.array(right, node)
        first_size = self.length(left, node)
        size = self.operation(
            A.Integer(),
            [first_size, self.length(right, node)],
            lambda a, b: f"({a} + {b})",
        )

        def element(i):
            relative = self.operation(
                A.Integer(), [i, first_size], lambda a, b: f"({a} - {b})"
            )
            lvalue, rvalue = self.index(left, i, node), self.index(
                right, relative, node
            )
            return self.operation(
                left.ty.elem,
                [i, first_size, lvalue, rvalue],
                lambda j, n, a, b: f"({j} < {n} ? {a} : {b})",
            )

        return SequenceView("", left.ty, size=size, element=element)

    def substr(self, sequence, offset, count, node):
        self.array(sequence, node)
        # Z3 SeqExtract returns [] for negative/out-of-range offset or length;
        # otherwise it clips at the end. Third argument is a length, not end.
        size = self.operation(
            A.Integer(),
            [self.length(sequence, node), offset, count],
            lambda n, start, length: f"(({start} < 0 || {start} >= {n} || {length} <= 0) ? 0 : Math.min({length}, ({n} - {start})))",
        )

        def element(i):
            original = self.operation(
                A.Integer(), [offset, i], lambda start, j: f"({start} + {j})"
            )
            return self.index(sequence, original, node)

        return SequenceView("", sequence.ty, size=size, element=element)

    def facts(self, node, env, truth=True):
        """Only derive non-null facts justified by the Boolean branch taken."""
        if isinstance(node, A.Identifier) and isinstance(env.get(node.name), LocalBinding):
            binding = env[node.name]
            return self.facts(binding.expression, binding.scope, truth)
        if isinstance(node, A.Comparisons):
            if truth:
                return set().union(*(self.facts(c, env) for c in node.comparisons))
            if len(node.comparisons) == 1:
                return self.facts(node.comparisons[0], env, False)
            return set()
        if isinstance(node, A.UnaryOp) and node.op == "¬":
            return self.facts(node.operand, env, not truth)
        if isinstance(node, A.BinaryOp):
            if (node.op == "∧" and truth) or (node.op == "∨" and not truth):
                return self.facts(node.left, env, truth) | self.facts(
                    node.right, env, truth
                )
            if (node.op == "!=" and truth) or (node.op == "==" and not truth):
                value = (
                    node.right
                    if isinstance(node.left, A.NoneLiteral)
                    else node.left if isinstance(node.right, A.NoneLiteral) else None
                )
                if value is not None:
                    return {self.expr(value, env).read()}
        if (
            isinstance(node, A.FuncCall)
            and isinstance(node.func, A.Identifier)
            and len(node.args) == 1
        ):
            if (node.func.name == "is_some" and truth) or (
                node.func.name == "is_none" and not truth
            ):
                return {self.expr(node.args[0], env).read()}
        return set()

    def guarded(self, node, env, facts):
        previous = self.nonnull
        self.nonnull = previous | facts
        try:
            return self.expr(node, env)
        finally:
            self.nonnull = previous

    def finite_equalities(self, guard, variable):
        """Find a finite superset of values allowed by a positive guard.

        Conjunction needs one bounding term; disjunction needs both branches.
        The original body is always retained after substitution.
        """
        if isinstance(guard, A.Comparisons):
            for comparison in guard.comparisons:
                result = self.finite_equalities(comparison, variable)
                if result is not None:
                    return result
        if isinstance(guard, A.BinaryOp):
            if guard.op in {"∧", "∨"}:
                left = self.finite_equalities(guard.left, variable)
                right = self.finite_equalities(guard.right, variable)
                if guard.op == "∧":
                    return left if left is not None else right
                if left is not None and right is not None:
                    return left + right
            if guard.op == "==":
                for bound, value in [(guard.left, guard.right), (guard.right, guard.left)]:
                    if self.references(value, variable):
                        continue
                    if isinstance(bound, A.Identifier) and bound.name == variable:
                        return [(value, False)]
                    argument = None
                    if isinstance(bound, A.SomeExpr):
                        argument = bound.value
                    elif (isinstance(bound, A.FuncCall)
                          and isinstance(bound.func, A.Identifier)
                          and bound.func.name == "some" and len(bound.args) == 1):
                        argument = bound.args[0]
                    if isinstance(argument, A.Identifier) and argument.name == variable:
                        return [(value, True)]
        return None

    def equality_quantifier(self, node, env, guard, candidates):
        var = node.vars[0]
        universal = isinstance(node, A.ForallExpr)
        # A conjunctive non-null guard may protect the candidate expression,
        # e.g. exists old: is_some(head) and old == unwrap(head) and ... .
        # Only hoist the independent *prefix*, retaining evaluation order.
        # An is_some(xs[0]) later in the guard must not bypass len(xs) > 0.
        facts, gates = set(), []
        for term in self.conjuncts(guard):
            if self.references(term, var.name):
                break
            gates.append(self.guarded(term, env, facts).read())
            facts |= self.facts(term, env)
        gate = " && ".join(gates) or "true"
        results = []
        for expression, unwrap in candidates:
            value = self.guarded(expression, env, facts)
            extra_gate = "true"
            if unwrap:
                extra_gate = f"({value.read()} != null)"
                value = self.operation(A.Integer(), [value], lambda x: f"((Integer)({x})).intValue()")
            scope = dict(env, **{var.name: value})
            body = self.guarded(node.satisfies_expr, scope, facts).read()
            condition = f"({gate} && {extra_gate})"
            results.append(f"(!{condition} || ({body}))" if universal
                           else f"({condition} && ({body}))")
        return Value("(" + (" && " if universal else " || ").join(results) + ")", A.Boolean())

    @staticmethod
    def contains_literal_variable(sequence, variable):
        """Concatenation preserves every member of a literal operand."""
        if isinstance(sequence, A.ExplicitList):
            return any(isinstance(e, A.Identifier) and e.name == variable
                       for e in sequence.elements)
        if isinstance(sequence, A.BinaryOp) and sequence.op == "+":
            parts = [sequence.left, sequence.right]
        elif (isinstance(sequence, A.FuncCall) and isinstance(sequence.func, A.Identifier)
              and sequence.func.name == "concat"):
            parts = sequence.args
        else:
            return False
        return any(SequenceTranslator.contains_literal_variable(p, variable) for p in parts)

    def quantifier(self, node, env):
        from .quantifier_proofs import vacuous_exists_reason

        if len({v.name for v in node.vars}) != len(node.vars):
            self.fail(node, "Duplicate quantified variable names")
        reason = vacuous_exists_reason(node, env, self.conjuncts)
        if reason is not None:
            self.notes.append(reason)
            return Value("true", A.Boolean(), pre="true")
        if len(node.vars) != 1:
            self.fail(
                node,
                "Quantification requires one explicitly bounded variable per quantifier",
            )
        var = node.vars[0]
        body = node.satisfies_expr
        universal = isinstance(node, A.ForallExpr)
        if not isinstance(body, A.BinaryOp) or body.op != ("==>" if universal else "∧"):
            self.fail(
                node, "Quantifier needs an explicit finite range or membership guard"
            )
        terminal = "allMatch" if universal else "anyMatch"
        guard = body.left if universal else body
        candidates = self.finite_equalities(guard, var.name)
        if candidates is not None:
            return self.equality_quantifier(node, env, guard, candidates)
        if isinstance(var.get_type(), A.Integer):
            name = self.fresh()
            scope = dict(env, **{var.name: Value(name, A.Integer(), pre=name)})
            lower = upper = None
            # Iterate the inclusive superset of the bounds, then retain the
            # original guard. No +/-1 adjustment can overflow at int extrema.
            for term in self.conjuncts(body.left):
                if not isinstance(term, A.BinaryOp) or term.op not in {
                    "<",
                    "<=",
                    ">",
                    ">=",
                }:
                    continue
                if isinstance(term.left, A.Identifier) and term.left.name == var.name:
                    atom = self.bound_atom(term.right, scope, name, node)
                    side = "upper" if term.op in {"<", "<="} else "lower"
                elif (
                    isinstance(term.right, A.Identifier) and term.right.name == var.name
                ):
                    atom = self.bound_atom(term.left, scope, name, node)
                    side = "lower" if term.op in {"<", "<="} else "upper"
                else:
                    continue
                if side == "lower" and lower is None:
                    lower = atom
                if side == "upper" and upper is None:
                    upper = atom
            if lower is None or upper is None:
                self.fail(
                    node, "Integer quantifier needs finite lower and upper bounds"
                )
            expression = self.scalar(self.expr(body, scope), node)
            return Value(
                f"java.util.stream.IntStream.rangeClosed({lower}, {upper}).{terminal}({name} -> ({expression}))",
                A.Boolean(),
            )
        # Quantify option values only if membership restricts their domain.
        domain = None
        terms = self.conjuncts(body.left if universal else body)
        for term in terms:
            if (
                isinstance(term, A.BinaryOp)
                and term.op == "in"
                and isinstance(term.left, A.Identifier)
                and term.left.name == var.name
            ):
                domain = self.expr(term.right, env)
                break
            if isinstance(term, A.BinaryOp) and term.op == "==":
                for sequence, containing in [(term.left, term.right), (term.right, term.left)]:
                    if (isinstance(sequence.get_type(), A.ListType)
                            and not self.references(sequence, var.name)
                            and self.contains_literal_variable(containing, var.name)):
                        # seq == prefix ++ [x] implies x is a member of seq.
                        # Enumerate that superset and retain the full equality.
                        domain = self.expr(sequence, env)
                        break
                if domain is not None:
                    break
        if domain is None:
            self.fail(node, "Non-integer quantifier needs a finite membership guard")
        if isinstance(domain, MultisetView):
            domain = domain.sequence
        if domain.ty.elem != var.get_type():
            self.fail(node, "Quantifier domain type mismatch")

        def predicate(element, _):
            return self.scalar(self.expr(body, dict(env, **{var.name: element})), node)

        return Value(self.stream(domain, predicate, terminal, node), A.Boolean())

    def expr(self, node, env):
        if isinstance(node, A.BinaryOp):
            if node.op in {"∧", "∨", "==>"}:
                left = self.expr(node.left, env)
                right = self.guarded(
                    node.right, env, self.facts(node.left, env, node.op != "∨")
                )
                build = {
                    "∧": lambda a, b: f"({a} && {b})",
                    "∨": lambda a, b: f"({a} || {b})",
                    "==>": lambda a, b: f"(!({a}) || ({b}))",
                }[node.op]
                return self.operation(A.Boolean(), [left, right], build)
            if node.op == "in":
                return self.member(
                    self.expr(node.left, env), self.expr(node.right, env), node
                )
            if node.op == "+" and isinstance(node.get_type(), A.ListType):
                return self.concat(
                    self.expr(node.left, env), self.expr(node.right, env), node
                )
        if isinstance(node, A.IfExpr) and not isinstance(node.get_type(), A.ListType):
            cond = self.expr(node.condition, env)
            yes = self.guarded(node.then_branch, env, self.facts(node.condition, env))
            no = self.guarded(
                node.else_branch, env, self.facts(node.condition, env, False)
            )
            return self.operation(
                node.get_type(), [cond, yes, no], lambda c, a, b: f"({c} ? {a} : {b})"
            )
        if isinstance(node, A.FuncCall) and isinstance(node.func, A.Identifier):
            name = node.func.name
            if name == "unwrap":
                value = self.expr(node.args[0], env)
                if value.read() not in self.nonnull:
                    self.fail(
                        node,
                        "unwrap requires a proven is_some/non-null guard; unwrap(None) has no Java value",
                    )
                return self.operation(
                    A.Integer(), [value], lambda x: f"((Integer)({x})).intValue()"
                )
            if name in {"concat", "substr", "list2multiset"}:
                values = [self.expr(arg, env) for arg in node.args]
                if name == "concat":
                    return self.concat(*values, node)
                if name == "substr":
                    return self.substr(*values, node)
                self.array(values[0], node)
                return MultisetView("", node.get_type(), sequence=values[0])
            if name in {"map", "map_i", "any", "all"}:
                function, input_node = node.args
                if not isinstance(function, A.LambdaExpr):
                    self.fail(node, f"{name} currently requires an explicit lambda")
                sequence = self.expr(input_node, env)
                self.array(sequence, node)
                expected_args = 2 if name == "map_i" else 1
                if len(function.args) != expected_args:
                    self.fail(node, "Lambda arity mismatch")

                def evaluate(element, index):
                    values = [index, element] if name == "map_i" else [element]
                    scope = dict(env)
                    scope.update(zip((arg.name for arg in function.args), values))
                    return self.expr(function.body, scope)

                if name in {"any", "all"}:
                    return Value(
                        self.stream(
                            sequence,
                            lambda e, i: self.scalar(evaluate(e, i), node),
                            "anyMatch" if name == "any" else "allMatch",
                            node,
                        ),
                        A.Boolean(),
                    )
                return SequenceView(
                    "",
                    node.get_type(),
                    size=self.length(sequence, node),
                    element=lambda i: evaluate(self.index(sequence, i, node), i),
                )
            if name == "sum":
                sequence = self.expr(node.args[0], env)
                if not isinstance(sequence.ty, A.ListType) or not isinstance(
                    sequence.ty.elem, A.Integer
                ):
                    self.fail(node, "Only sum(list[int]) is supported")
                code = (
                    self.stream(
                        sequence, lambda e, _: self.scalar(e, node), "map", node
                    )
                    + ".sum()"
                )
                return Value(code, A.Integer())
        return super().expr(node, env)
