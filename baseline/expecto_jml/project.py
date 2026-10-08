"""Backend for prompting.py/codehelper.javahelper's executable assert dialect.

Deliberately emits only the constructs supported by the project's checker.
Receiver schemas must be mapped to public observers. List observer mappings
are explicit representation contracts; they do not infer Java generic types.
"""
from __future__ import annotations

import re

from .translator import A, Translator, TranslationError, Value, _java_path


_IDENT = r"[A-Za-z_$][A-Za-z0-9_$]*"
_ARG = rf"(?:{_IDENT}|-?\d+|true|false|null)"
_OBSERVER = re.compile(rf"this\.{_IDENT}\(\s*(?:{_ARG}(?:\s*,\s*{_ARG})*)?\s*\)\Z")
_GETTER = re.compile(rf"this\.{_IDENT}\(\{{index\}}\)\Z")


class ProjectTranslator(Translator):
    def __init__(self, ast, mapping, source):
        super().__init__(ast, mapping, source)
        self.quantifier_depth = 0

    def validate_mapping(self):
        for path, target in self.mapping.items():
            if not isinstance(path, str) or not re.fullmatch(r"(?:param|entry_self|exit_self|ret)(?:\.[A-Za-z_]\w*)+", path):
                raise TranslationError(f"Unsupported mapping key: {path!r}")
            if isinstance(target, str):
                observer = bool(_OBSERVER.fullmatch(target))
                result = target == r"\result" and path.startswith("exit_self.")
                parameter = path.startswith("param.") and _java_path(target) and not target.startswith("this.")
                if not (observer or result or parameter):
                    raise TranslationError(f"{path}: use a public this.observer(...) call, an argument path, or exit-state \\result")
            elif isinstance(target, dict):
                if set(target) != {"length", "get"} or not all(isinstance(x, str) for x in target.values()):
                    raise TranslationError(f"{path}: list mapping must contain exactly string length/get templates")
                if not _OBSERVER.fullmatch(target["length"]) or not _GETTER.fullmatch(target["get"]):
                    raise TranslationError(f"{path}: expected length=this.size(), get=this.get({{index}}) style observers")
            else:
                raise TranslationError(f"{path}: unsupported mapping value")

    def field(self, value, name, node):
        if not isinstance(value.ty, A.RecordType) or name not in value.ty.fields:
            self.fail(node, f"Unknown record field: {name}")
        path = f"{value.path}.{name}" if value.path else None
        ty = value.ty.fields[name]
        if path in self.mapping:
            self.used_mappings.add(path)
            target = self.mapping[path]
            if isinstance(target, dict):
                if not isinstance(ty, A.ListType):
                    self.fail(node, f"Observer-list mapping requires list type: {path}")
                return Value("", ty, value.old, path)
            if isinstance(ty, (A.ListType, A.RecordType)):
                self.fail(node, "Project mappings of lists require length/get templates; records require mappings for their leaf fields")
            return Value(target, ty, value.old, path, target if value.old else None)
        if isinstance(ty, A.RecordType):
            # Symbolic record: only mapped leaf fields can be read.
            return Value("", ty, value.old, path)
        if value.path == "param":
            if not _java_path(name):
                self.fail(node, f"Parameter needs a valid Java name: {name}")
            # Formal parameters in the project comparison harness already denote
            # method-entry arguments (there is no re-assigned local parameter).
            return Value(name, ty, old=isinstance(ty, A.ListType), pre=name, path=path)
        self.fail(node, f"Missing public-observer mapping for {path}; private receiver fields cannot be used by the project checker")

    def scalar(self, value, node):
        if isinstance(value.ty, A.Integer):
            # Generic observers/return values can have Java type E. DSL int
            # requires Integer-compatible values in the project representation.
            return f"((int) ({value.read()}))"
        return super().scalar(value, node)

    def length(self, value, node):
        target = self.mapping.get(value.path)
        if isinstance(target, dict):
            self.array(value, node)
            code = target["length"]
            return Value(code, A.Integer(), value.old, pre=code if value.old else None)
        return super().length(value, node)

    def index(self, value, idx, node):
        target = self.mapping.get(value.path)
        if isinstance(target, dict):
            self.array(value, node)
            if not isinstance(idx.ty, A.Integer):
                self.fail(node, "Array index must be an integer")
            if value.old and idx.pre is None:
                self.fail(node, "Cannot use a post-state index to read an entry-state observer")
            code = target["get"].replace("{index}", idx.pre if value.old else idx.read())
            return Value(code, value.ty.elem, value.old, pre=code if value.old else None)
        return super().index(value, idx, node)

    def equal(self, left, right, node):
        if left.ty == right.ty and isinstance(left.ty, (A.Integer, A.Boolean)):
            # javahelper boxes old values via exec(). A == B hidden inside ! or
            # ?: is not rewritten by its splitter, so force value comparison.
            primitive = "int" if isinstance(left.ty, A.Integer) else "boolean"
            return f"((({primitive}) ({left.read()})) == (({primitive}) ({right.read()})))"
        if isinstance(left.ty, A.ListType) and left.ty == right.ty:
            if self.quantifier_depth:
                self.fail(node, "Nested quantifiers (including list equality) are unsupported by javahelper")
            self.array(left, node)
            self.array(right, node)
            name = self.fresh()
            idx = Value(name, A.Integer(), pre=name)
            lsize, rsize = self.length(left, node).read(), self.length(right, node).read()
            same = self.equal(self.index(left, idx, node), self.index(right, idx, node), node)
            return rf"(({lsize} == {rsize}) && (\forall int {name}; 0 <= {name} && {name} < {lsize}; {same}))"
        return super().equal(left, right, node)

    @staticmethod
    def conjuncts(node):
        if isinstance(node, A.BinaryOp) and node.op == "∧":
            return ProjectTranslator.conjuncts(node.left) + ProjectTranslator.conjuncts(node.right)
        if isinstance(node, A.Comparisons):
            return list(node.comparisons)
        return [node]

    def bound_atom(self, expr, env, variable, node):
        value = self.expr(expr, env)
        code = value.read()
        # javahelper.find_bounds splits on && and comparison signs without a parser.
        if any(op in code for op in ("<", ">", "&&", "||", "?", ";")) or re.search(rf"\b{re.escape(variable)}\b", code):
            self.fail(node, "Quantifier bounds must be simple expressions independent of the bound variable")
        return code

    def bounds(self, condition, var, env, node):
        name = env[var.name].code
        lower = upper = None
        for term in self.conjuncts(condition):
            if not isinstance(term, A.BinaryOp) or term.op not in {"<", "<=", ">", ">="}:
                continue
            if isinstance(term.left, A.Identifier) and term.left.name == var.name:
                atom = self.bound_atom(term.right, env, name, node)
                text = f"{name} {term.op} {atom}"
                side = "upper" if term.op in {"<", "<="} else "lower"
            elif isinstance(term.right, A.Identifier) and term.right.name == var.name:
                atom = self.bound_atom(term.left, env, name, node)
                text = f"{atom} {term.op} {name}"
                side = "lower" if term.op in {"<", "<="} else "upper"
            else:
                continue
            if side == "lower" and lower is None:
                lower = text
            if side == "upper" and upper is None:
                upper = text
        if lower is None or upper is None:
            self.fail(node, "Project quantifiers need explicit finite lower and upper bounds; javahelper's default -65536..65536 truncation is not used")
        # NO parentheses around each comparison: find_bounds needs bare lhs/rhs.
        return f"{lower} && {upper}"

    def quantifier(self, node, env):
        if self.quantifier_depth or len(node.vars) != 1:
            self.fail(node, "Project checker supports one non-nested quantified variable at a time")
        var = node.vars[0]
        if not isinstance(var.get_type(), A.Integer):
            self.fail(node, "Project quantifiers only support int variables")
        body = node.satisfies_expr
        universal = isinstance(node, A.ForallExpr)
        if not isinstance(body, A.BinaryOp) or body.op != ("==>" if universal else "∧"):
            self.fail(node, "Use forall: bounds implies predicate; exists: bounds and predicate")
        scope = dict(env)
        name = self.fresh()
        scope[var.name] = Value(name, A.Integer(), pre=name)
        self.quantifier_depth += 1
        try:
            bounds = self.bounds(body.left, var, scope, node)
            cond = self.scalar(self.expr(body.left, scope), node)
            spec = self.scalar(self.expr(body.right, scope), node)
        finally:
            self.quantifier_depth -= 1
        if universal:
            code = rf"(\forall int {name}; {bounds}; (!({cond}) || ({spec})))"
        else:
            # javahelper has no exists operator; use its supported forall dual.
            code = rf"(!(\forall int {name}; {bounds}; !(({cond}) && ({spec}))))"
        return Value(code, A.Boolean())

    def expr(self, node, env):
        if isinstance(node, A.NumberLiteral) and isinstance(node.value, int):
            if not -(2**31) <= node.value < 2**31:
                self.fail(node, "Project integer literal is outside Java int range")
            code = str(node.value)
            return Value(code, A.Integer(), pre=code)
        if isinstance(node, (A.ForallExpr, A.ExistsExpr)):
            return self.quantifier(node, env)
        if isinstance(node, A.BinaryOp) and node.op in {"==>", "<==>"}:
            left, right = self.expr(node.left, env), self.expr(node.right, env)
            lcode, rcode = self.scalar(left, node), self.scalar(right, node)
            # Plain Java logic also works under negation/ternaries, where the
            # project's string splitter cannot lower nested => operators.
            if node.op == "==>":
                code = f"(!({lcode}) || ({rcode}))"
                pre = f"(!({left.pre}) || ({right.pre}))" if left.pre is not None and right.pre is not None else None
            else:
                code = self.equal(left, right, node)
                pre = f"(({left.pre}) == ({right.pre}))" if left.pre is not None and right.pre is not None else None
            return Value(code, A.Boolean(), pre=pre)
        return super().expr(node, env)

    def translate(self, entry):
        decl = self.declarations.get(entry)
        if not isinstance(decl, A.PredicateDef):
            raise TranslationError(f"Entry {entry!r} must be a predicate")
        result = self.call(decl, [self.root(arg) for arg in decl.args], decl)
        expression = self.scalar(result, decl)
        unused = self.mapping.keys() - self.used_mappings
        if unused:
            raise TranslationError("Unused mappings (check field paths): " + ", ".join(sorted(unused)))
        return f"assert {expression};\n"
