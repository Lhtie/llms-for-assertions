"""Batch adapter lowering; trusted expressions are emitted only by adapters.py."""

from dataclasses import dataclass, fields, replace
import re

from baseline.expecto_jml.project import ProjectTranslator
from baseline.expecto_jml.translator import A, Value, TranslationError, _SOURCE
from DSL.ast_builder import ASTBuilder
from DSL.type_checker import TypeChecker
from lark import Lark


@dataclass(frozen=True)
class LiteralList(Value):
    count: int = 0


@dataclass(frozen=True)
class LocalBinding:
    expression: A.Expr
    scope: dict


class BatchTranslator(ProjectTranslator):
    def call(self, decl, args, site):
        if isinstance(decl, A.FunctionDef) and decl.body is None:
            from .contracts import length_case_definition

            body = length_case_definition(decl, self.references)
            if body is not None:
                decl = replace(decl, body=body, ensures=[])
        # A single unconditional equation uniquely defines the return value.
        # Do not guess implementations for general relational contracts.
        if (isinstance(decl, A.FunctionDef) and decl.body is None
                and not decl.requires and not decl.var_decls and len(decl.ensures) == 1):
            equation = decl.ensures[0].expr
            if isinstance(equation, A.Comparisons) and len(equation.comparisons) == 1:
                equation = equation.comparisons[0]
            if isinstance(equation, A.BinaryOp) and equation.op == "==":
                for result, expression in [(equation.left, equation.right),
                                           (equation.right, equation.left)]:
                    if (isinstance(result, A.Identifier)
                            and result.name == decl.return_val.name
                            and not self.references(expression, result.name)):
                        decl = replace(decl, body=expression, ensures=[])
                        break
        if not decl.var_decls:
            return super().call(decl, args, site)
        if decl.body is None or (
            isinstance(decl, A.FunctionDef) and (decl.requires or decl.ensures)
        ):
            self.fail(
                decl, "Local bindings require an explicit body without requires/ensures"
            )
        if decl.name in self.stack or len(self.stack) >= 64:
            self.fail(site, "Recursive or excessively deep helper expansion")
        if len(decl.args) != len(args):
            self.fail(site, f"Wrong argument count for {decl.name}")
        scope = dict(zip((arg.name for arg in decl.args), args))
        if len(scope) != len(args):
            self.fail(decl, "Duplicate helper argument names")
        self.stack.append(decl.name)
        try:
            # Pure DSL let-bindings are substituted at their use sites, where
            # short-circuit guards can establish that an unwrap is defined.
            # Capture lexical scope before adding the binding itself.
            for binding in decl.var_decls:
                if binding.var.name in scope:
                    self.fail(binding, "Shadowed local bindings are unsupported")
                scope[binding.var.name] = LocalBinding(binding.expr, dict(scope))
            return self.expr(decl.body, scope)
        finally:
            self.stack.pop()

    @staticmethod
    def references(node, name):
        if isinstance(node, A.Identifier):
            return node.name == name
        if isinstance(node, A.Expr):
            return any(BatchTranslator.references(getattr(node, f.name), name)
                       for f in fields(node))
        if isinstance(node, (list, tuple)):
            return any(BatchTranslator.references(item, name) for item in node)
        if isinstance(node, dict):
            return any(BatchTranslator.references(item, name) for item in node.values())
        return False

    def length(self, value, node):
        if isinstance(value, LiteralList):
            return Value(str(value.count), A.Integer(), pre=str(value.count))
        return super().length(value, node)

    def index(self, value, idx, node):
        if isinstance(value, LiteralList):
            code = f"({value.code})[{idx.read()}]"
            pre = (
                f"({value.pre})[{idx.pre}]"
                if value.pre is not None and idx.pre is not None
                else None
            )
            return Value(code, value.ty.elem, pre=pre)
        target = self.mapping.get(value.path)
        if value.old and isinstance(target, dict) and "get" in target:
            # Snapshot the complete observer array before quantification. The
            # project's element-by-element old lowering infers array type from
            # its first element and fails when that element is null.
            match = re.fullmatch(r"\(\(Integer\)(.+)\[\{index\}\]\)", target["get"])
            if match:
                if idx.pre is None:
                    self.fail(
                        node,
                        "Cannot use a post-state index to read an entry-state observer",
                    )
                array = match[1]
                code = rf"((Integer)(\old({array}))[{idx.read()}])"
                pre = f"((Integer)({array})[{idx.pre}])"
                return Value(code, value.ty.elem, pre=pre)
        return super().index(value, idx, node)

    def validate_mapping(self):
        # Mapping comes from the checked-in adapter builder, never the LLM.
        for target in self.mapping.values():
            if not isinstance(target, dict) or set(target) not in (
                {"expression"},
                {"length", "get"},
            ):
                raise TranslationError("Invalid generated batch mapping")
            for value in target.values():
                if not isinstance(value, str) or any(
                    x in value for x in [";", "\n", "//", "/*"]
                ):
                    raise TranslationError("Invalid adapter expression")

    def field(self, value, name, node):
        path = f"{value.path}.{name}" if value.path else None
        target = self.mapping.get(path)
        if isinstance(target, dict) and "expression" in target:
            if not isinstance(value.ty, A.RecordType) or name not in value.ty.fields:
                self.fail(node, "Unknown record field")
            self.used_mappings.add(path)
            # Parenthesize identity/nullness projections so ! and comparisons bind correctly.
            code = "(" + target["expression"] + ")"
            return Value(
                code,
                value.ty.fields[name],
                value.old,
                path,
                code if value.old else None,
            )
        return super().field(value, name, node)

    def root(self, node):
        if node.name == "ret" and isinstance(node.get_type(), A.OptionType):
            return Value(r"\result", node.get_type(), path="ret")
        return super().root(node)

    def array(self, value, node):
        if (
            isinstance(value.ty, A.ListType)
            and isinstance(value.ty.elem, A.OptionType)
            and isinstance(value.ty.elem.elem, A.Integer)
        ):
            return
        return super().array(value, node)

    def scalar(self, value, node):
        if isinstance(value.ty, (A.OptionType, A.NoneLiteralType)):
            return value.read()
        return super().scalar(value, node)

    def equal(self, left, right, node):
        if isinstance(left, LiteralList) and left.count == 0:
            return f"({self.length(right, node).read()} == 0)"
        if isinstance(right, LiteralList) and right.count == 0:
            return f"({self.length(left, node).read()} == 0)"
        if isinstance(left.ty, (A.OptionType, A.NoneLiteralType)) or isinstance(
            right.ty, (A.OptionType, A.NoneLiteralType)
        ):
            return f"java.util.Objects.equals({left.read()}, {right.read()})"
        return super().equal(left, right, node)

    def expr(self, node, env):
        if isinstance(node, A.Identifier) and isinstance(env.get(node.name), LocalBinding):
            binding = env[node.name]
            return self.expr(binding.expression, binding.scope)
        if isinstance(node, A.ExplicitRecord) and not node.fields:
            # record[] has exactly one value; structural equality handles it.
            return Value("", node.get_type())
        if isinstance(node, A.BinaryOp) and node.op == "in":
            if self.quantifier_depth:
                self.fail(
                    node,
                    "Membership inside a quantifier requires unsupported nested quantifiers",
                )
            item = self.expr(node.left, env)
            sequence = self.expr(node.right, env)
            self.array(sequence, node)
            name = self.fresh()
            index = Value(name, A.Integer(), pre=name)
            size = self.length(sequence, node).read()
            equal = self.equal(item, self.index(sequence, index, node), node)
            code = (
                rf"(!(\forall int {name}; 0 <= {name} && {name} < {size}; !({equal})))"
            )
            return Value(code, A.Boolean())
        if isinstance(node, A.ExplicitList):
            values = [self.expr(item, env) for item in node.elements]
            ty = node.get_type()
            if not values:
                return LiteralList(
                    "new Integer[]{}", ty, pre="new Integer[]{}", count=0
                )
            if isinstance(ty.elem, A.Integer):
                java_type = "int"
            elif isinstance(ty.elem, A.Boolean):
                java_type = "boolean"
            elif isinstance(ty.elem, A.OptionType) and isinstance(
                ty.elem.elem, A.Integer
            ):
                java_type = "Integer"
            else:
                self.fail(node, "Unsupported list literal element type")
            code = (
                f"new {java_type}[]{{"
                + ", ".join(f"(({java_type})({v.read()}))" for v in values)
                + "}"
            )
            pre = (
                f"new {java_type}[]{{"
                + ", ".join(f"(({java_type})({v.pre}))" for v in values)
                + "}"
                if all(v.pre is not None for v in values)
                else None
            )
            return LiteralList(code, ty, pre=pre, count=len(values))
        if isinstance(node, A.FuncCall) and isinstance(node.func, A.Identifier):
            name = node.func.name
            if name in {"is_some", "is_none", "some"}:
                if len(node.args) != 1:
                    self.fail(node, f"{name} expects one argument")
                value = self.expr(node.args[0], env)
                if name == "some":
                    if not isinstance(value.ty, A.Integer):
                        self.fail(node, "Only some(int) is supported")
                    code = f"Integer.valueOf({self.scalar(value, node)})"
                    pre = (
                        f"Integer.valueOf({value.pre})"
                        if value.pre is not None
                        else None
                    )
                    return Value(code, node.get_type(), pre=pre)
                if not isinstance(value.ty, A.OptionType):
                    self.fail(node, f"{name} expects option[int]")
                op = "!=" if name == "is_some" else "=="
                code = f"({value.read()} {op} null)"
                pre = f"({value.pre} {op} null)" if value.pre is not None else None
                return Value(code, A.Boolean(), pre=pre)
        if isinstance(node, A.NoneLiteral):
            return Value("null", node.get_type(), pre="null")
        if isinstance(node, A.SomeExpr):
            value = self.expr(node.value, env)
            if not isinstance(value.ty, A.Integer):
                self.fail(node, "Only some(int) is supported")
            code = f"Integer.valueOf({self.scalar(value,node)})"
            return Value(
                code,
                A.OptionType(A.Integer()),
                pre=code if value.pre is not None else None,
            )
        return super().expr(node, env)

    def translate(self, entry):
        decl = self.declarations.get(entry)
        if not isinstance(decl, A.PredicateDef):
            raise TranslationError("Expected predicate spec")
        value = self.call(decl, [self.root(arg) for arg in decl.args], decl)
        # Profiles intentionally include all available observers; unused ones are fine.
        return "assert " + self.scalar(value, decl) + ";\n"


def translate_batch(source, mapping, *, notes=None):
    parser = Lark(
        (_SOURCE / "DSL/grammar.lark").read_text(),
        parser="lalr",
        start="specification",
        propagate_positions=True,
    )
    tree = parser.parse(source)
    for p in tree.find_data("predicate_def"):
        if any(str(n.data) in {"require", "ensure"} for n in p.iter_subtrees()):
            raise TranslationError("Statements in predicates are unsupported")
    ast = ASTBuilder().transform(tree)
    from .sequences import SequenceTranslator

    compiler = SequenceTranslator(ast, mapping, source)
    checker = TypeChecker()
    checker.source_code = source
    errors = checker.check(ast)
    if errors:
        raise TranslationError("\n".join(map(str, errors)))
    result = compiler.translate("spec")
    if notes is not None:
        notes.extend(compiler.notes)
    return result
