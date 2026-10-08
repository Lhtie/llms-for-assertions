"""AST-based, fail-closed translation of Expecto predicates to JML.

The Java representation of a DSL list must be a non-null primitive array.
The mapping is a representation contract, not an inferred Java type conversion.
"""
from __future__ import annotations

from dataclasses import dataclass
from pathlib import Path
import re
import sys

# Load only the standalone upstream DSL modules, not its LLM task package.
_SOURCE = Path(__file__).resolve().parents[1] / "expecto-artifact" / "expecto" / "src"
if not (_SOURCE / "DSL" / "grammar.lark").is_file():
    raise ImportError(f"Expecto DSL source not found at {_SOURCE}")
sys.path.insert(0, str(_SOURCE))
from lark import Lark, UnexpectedInput  # noqa: E402
from lark.exceptions import VisitError  # noqa: E402
from DSL import dsl_ast as A  # noqa: E402
from DSL.ast_builder import ASTBuilder  # noqa: E402
from DSL.type_checker import BuiltinFunctionRegistry, TypeChecker  # noqa: E402


class TranslationError(ValueError):
    """Invalid DSL or an unsupported semantic construct; no JML is emitted."""


@dataclass(frozen=True)
class Value:
    # For storage paths, code is the Java path before applying old().
    code: str
    ty: A.DSLType
    old: bool = False
    path: str | None = None
    # An equivalent entry-state expression, or None if it uses post-state data.
    pre: str | None = None

    def read(self) -> str:
        return rf"\old({self.code})" if self.old else self.code


_JAVA_PATH = re.compile(r"(?:this\.)?[A-Za-z_$][\w$]*(?:\.[A-Za-z_$][\w$]*)*\Z", re.ASCII)
_RESERVED = set("abstract assert boolean break byte case catch char class const continue default do double else enum extends final finally float for goto if implements import instanceof int interface long native new package private protected public return short static strictfp super switch synchronized this throw throws transient try void volatile while true false null record var yield".split())


def _java_path(code: str) -> bool:
    return bool(_JAVA_PATH.fullmatch(code)) and all(
        part not in _RESERVED for part in code.removeprefix("this.").split(".")
    )


class Translator:
    def __init__(self, ast: A.Specification, mapping: dict[str, str], source: str):
        self.declarations = {}
        for decl in ast.declarations:
            if decl.name in BuiltinFunctionRegistry().functions:
                self.fail(decl, f"Redefining builtin {decl.name} is unsupported")
            if decl.name in self.declarations:
                self.fail(decl, f"Duplicate declaration: {decl.name}")
            self.declarations[decl.name] = decl
        self.mapping = mapping
        self.used_mappings: set[str] = set()
        self.validate_mapping()
        self.stack: list[str] = []
        self.serial = 0
        self.reserved = set(re.findall(r"[A-Za-z_$][\w$]*", source + " " + repr(mapping)))

    def validate_mapping(self):
        for path, target in self.mapping.items():
            if not isinstance(path, str) or not isinstance(target, str) or not _java_path(target):
                raise TranslationError("Mappings must map DSL field paths to Java field/parameter paths, not expressions")
            if not re.fullmatch(r"(?:param|entry_self|exit_self|ret)(?:\.[A-Za-z_]\w*)+", path):
                raise TranslationError(f"Unsupported mapping key: {path!r}")

    @staticmethod
    def fail(node: A.ASTNode, message: str):
        line, col, _, _ = node.pos
        raise TranslationError(f"{message} (line {line}, column {col})")

    def fresh(self) -> str:
        while True:
            self.serial += 1
            name = f"__expecto_jml_{self.serial}"
            if name not in self.reserved:
                self.reserved.add(name)
                return name

    def mapped(self, path: str | None, default: str) -> str:
        if path in self.mapping:
            self.used_mappings.add(path)
            return self.mapping[path]
        if not _java_path(default):
            raise TranslationError(f"Java identifier needs an explicit field mapping: {path}")
        return default

    def root(self, node: A.Identifier) -> Value:
        ty = node.get_type()
        if node.name == "param" and isinstance(ty, A.RecordType):
            return Value("", ty, old=True, path="param", pre="")
        if node.name in {"entry_self", "exit_self"}:
            if isinstance(ty, A.DSLNoneType):
                return Value("null", ty, pre="null")
            if not isinstance(ty, A.RecordType):
                self.fail(node, "Receiver schema must be record[...] or nonetype")
            old = node.name == "entry_self"
            return Value("this", ty, old, node.name, "this" if old else None)
        if node.name == "ret":
            if isinstance(ty, A.DSLNoneType):
                return Value("null", ty, pre="null")
            return Value(r"\result", ty, path="ret")
        self.fail(node, "Entry arguments must use Expecto's param/entry_self/exit_self/ret convention")

    def field(self, value: Value, name: str, node: A.ASTNode) -> Value:
        if not isinstance(value.ty, A.RecordType) or name not in value.ty.fields:
            self.fail(node, f"Unknown record field: {name}")
        path = f"{value.path}.{name}" if value.path else None
        default = f"{value.code}.{name}" if value.code else name
        # Return-value paths are JML expressions, not Java parameter paths.
        if value.code.startswith(r"\result") and path not in self.mapping:
            code = default
        else:
            code = self.mapped(path, default)
        return Value(code, value.ty.fields[name], value.old, path, code if value.old else None)

    def scalar(self, value: Value, node: A.ASTNode) -> str:
        if not isinstance(value.ty, (A.Integer, A.Boolean, A.DSLNoneType)):
            self.fail(node, f"Unsupported scalar type {value.ty}; only int/bool/nonetype are supported")
        return value.read()

    def array(self, value: Value, node: A.ASTNode):
        if not isinstance(value.ty, A.ListType) or not isinstance(value.ty.elem, (A.Integer, A.Boolean)):
            self.fail(node, "Only list[int]/list[bool] mapped to non-null primitive Java arrays are supported")

    def length(self, value: Value, node: A.ASTNode) -> Value:
        self.array(value, node)
        code = f"{value.code}.length"
        return Value(code, A.Integer(), value.old, pre=code if value.old else None)

    def index(self, value: Value, idx: Value, node: A.ASTNode) -> Value:
        self.array(value, node)
        if not isinstance(idx.ty, A.Integer):
            self.fail(node, "Array index must be an integer")
        if value.old and idx.pre is None:
            self.fail(node, "Cannot index an entry-state array using a post-state index; an explicit snapshot is needed")
        index = idx.pre if value.old else idx.read()
        # JML checks index well-definedness. Do not truncate bigint indices to int.
        code = f"{value.code}[{index}]"
        return Value(code, value.ty.elem, value.old, pre=code if value.old else None)

    def equal(self, left: Value, right: Value, node: A.ASTNode) -> str:
        if left.ty != right.ty:
            self.fail(node, "Equality operands must have the same supported type")
        if isinstance(left.ty, A.RecordType):
            parts = [self.equal(self.field(left, k, node), self.field(right, k, node), node)
                     for k in left.ty.fields]
            return "(" + " && ".join(parts) + ")" if parts else "true"
        if isinstance(left.ty, A.ListType):
            self.array(left, node)
            self.array(right, node)
            name = self.fresh()
            idx = Value(name, A.Integer(), pre=name)
            lsize, rsize = self.length(left, node).read(), self.length(right, node).read()
            le, re_ = self.index(left, idx, node).read(), self.index(right, idx, node).read()
            return rf"(({lsize} == {rsize}) && (\forall \bigint {name}; 0 <= {name} && {name} < {lsize}; {le} == {re_}))"
        return f"({self.scalar(left, node)} == {self.scalar(right, node)})"

    def expr(self, node: A.Expr, env: dict[str, Value]) -> Value:
        ty = node.get_type()
        if isinstance(node, A.Identifier):
            if node.name not in env:
                self.fail(node, f"Unbound identifier: {node.name}")
            return env[node.name]
        if isinstance(node, A.NumberLiteral):
            if not isinstance(node.value, int) or not isinstance(ty, A.Integer):
                self.fail(node, "Real/floating-point values need an explicit encoding and are unsupported")
            # Construct arbitrary integers from small literals, avoiding Java literal overflow.
            digits = str(abs(node.value))
            code = digits[0]
            for digit in digits[1:]:
                code = f"({code} * 10 + {digit})"
            if node.value < 0:
                code = f"(-{code})"
            return Value(code, A.Integer(), pre=code)
        if isinstance(node, A.BoolLiteral):
            code = str(node.value).lower()
            return Value(code, A.Boolean(), pre=code)
        if isinstance(node, A.FieldAccess):
            return self.field(self.expr(node.record, env), node.field_name, node)
        if isinstance(node, A.ListAccess):
            return self.index(self.expr(node.seq, env), self.expr(node.index, env), node)
        if isinstance(node, A.UnaryOp):
            arg = self.expr(node.operand, env)
            op = {"¬": "!", "-": "-", "+": "+"}[node.op]
            code = f"({op}{self.scalar(arg, node)})"
            pre = f"({op}{arg.pre})" if arg.pre is not None else None
            return Value(code, ty, pre=pre)
        if isinstance(node, A.Comparisons):
            values = [self.expr(comp, env) for comp in node.comparisons]
            return self.combine(values, "&&", A.Boolean(), node)
        if isinstance(node, A.BinaryOp):
            if node.op in {"/", "%", "^", "in"}:
                self.fail(node, f"Operator {node.op!r} is unsupported (division/modulo and membership require semantic lowering)")
            left, right = self.expr(node.left, env), self.expr(node.right, env)
            if node.op in {"==", "!="}:
                eq = self.equal(left, right, node)
                code = eq if node.op == "==" else f"(!{eq})"
            else:
                op = {"∧": "&&", "∨": "||", "==>": "==>", "<==>": "<==>"}.get(node.op, node.op)
                code = f"({self.scalar(left, node)} {op} {self.scalar(right, node)})"
            pre = None
            if left.pre is not None and right.pre is not None and isinstance(left.ty, (A.Integer, A.Boolean)):
                op = {"∧": "&&", "∨": "||"}.get(node.op, node.op)
                pre = f"({left.pre} {op} {right.pre})"
            return Value(code, ty, pre=pre)
        if isinstance(node, A.IfExpr):
            cond = self.expr(node.condition, env)
            yes, no = self.expr(node.then_branch, env), self.expr(node.else_branch, env)
            code = f"({self.scalar(cond, node)} ? {self.scalar(yes, node)} : {self.scalar(no, node)})"
            pre = f"({cond.pre} ? {yes.pre} : {no.pre})" if all(v.pre is not None for v in (cond, yes, no)) else None
            return Value(code, ty, pre=pre)
        if isinstance(node, (A.ForallExpr, A.ExistsExpr)):
            scope = dict(env)
            bindings = []
            if len({var.name for var in node.vars}) != len(node.vars):
                self.fail(node, "Duplicate quantified variable names")
            for var in node.vars:
                vty = var.get_type()
                if not isinstance(vty, (A.Integer, A.Boolean)):
                    self.fail(var, "Quantification is supported only over int and bool")
                name = self.fresh()
                scope[var.name] = Value(name, vty, pre=name)
                bindings.append((r"\bigint" if isinstance(vty, A.Integer) else "boolean", name))
            body = self.expr(node.satisfies_expr, scope)
            code = self.scalar(body, node)
            quant = r"\forall" if isinstance(node, A.ForallExpr) else r"\exists"
            for jtype, name in reversed(bindings):
                code = f"({quant} {jtype} {name}; true; {code})"
            return Value(code, A.Boolean())
        if isinstance(node, A.FuncCall):
            if not isinstance(node.func, A.Identifier):
                self.fail(node, "Higher-order/lambda calls are unsupported")
            name = node.func.name
            args = [self.expr(arg, env) for arg in node.args]
            if name == "len" and len(args) == 1:
                return self.length(args[0], node)
            if name not in self.declarations:
                self.fail(node, f"Unsupported builtin/function: {name}")
            return self.call(self.declarations[name], args, node)
        self.fail(node, f"Unsupported DSL construct: {type(node).__name__}")

    def combine(self, values: list[Value], op: str, ty: A.DSLType, node: A.ASTNode) -> Value:
        code = "(" + f" {op} ".join(self.scalar(v, node) for v in values) + ")"
        pre = "(" + f" {op} ".join(v.pre for v in values) + ")" if all(v.pre is not None for v in values) else None
        return Value(code, ty, pre=pre)

    def call(self, decl: A.Def, args: list[Value], site: A.ASTNode) -> Value:
        if len({arg.name for arg in decl.args}) != len(decl.args):
            self.fail(decl, "Duplicate helper argument names")
        if decl.name in self.stack:
            self.fail(site, "Recursive helpers are unsupported: " + " -> ".join(self.stack + [decl.name]))
        if len(self.stack) >= 64:
            self.fail(site, "Helper expansion exceeds 64 levels")
        if decl.body is None:
            self.fail(decl, f"Declaration {decl.name} has no explicit body")
        if decl.var_decls or (isinstance(decl, A.FunctionDef) and (decl.requires or decl.ensures)):
            self.fail(decl, "Local declarations and implicit requires/ensures functions are unsupported")
        if len(decl.args) != len(args):
            self.fail(site, f"Wrong argument count for {decl.name}")
        self.stack.append(decl.name)
        try:
            # Lexical substitution: caller locals never leak into the helper.
            return self.expr(decl.body, dict(zip((a.name for a in decl.args), args)))
        finally:
            self.stack.pop()

    def translate(self, entry: str) -> str:
        decl = self.declarations.get(entry)
        if not isinstance(decl, A.PredicateDef):
            raise TranslationError(f"Entry {entry!r} must be a predicate")
        names = [a.name for a in decl.args]
        if len(names) != len(set(names)):
            self.fail(decl, "Duplicate entry arguments")
        result = self.call(decl, [self.root(arg) for arg in decl.args], decl)
        expression = self.scalar(result, decl)
        unused = self.mapping.keys() - self.used_mappings
        if unused:
            raise TranslationError("Unused mappings (check field paths): " + ", ".join(sorted(unused)))
        # Plain ensures applies on normal termination; no invented frame or exception contract.
        return "/*@\n  @ ensures \\bigint_math(" + expression + ");\n  @*/\n"


def translate(source: str, *, mapping: dict | None = None, entry: str = "spec",
              dialect: str = "project", expression_only: bool = False) -> str:
    """Return a project assert statement (default), or an OpenJML annotation.

    Project arithmetic follows the existing Java checker, not mathematical integers.
    """
    if dialect not in {"project", "openjml"}:
        raise TranslationError(f"Unknown dialect: {dialect}")
    if expression_only and dialect != "project":
        raise TranslationError("expression_only is only available for the project dialect")
    try:
        parser = Lark((_SOURCE / "DSL" / "grammar.lark").read_text(), parser="lalr",
                      start="specification", propagate_positions=True)
        tree = parser.parse(source)
        # Upstream ASTBuilder silently discards require/ensure in predicates.
        # Reject before transforming so no source clause can disappear.
        for predicate in tree.find_data("predicate_def"):
            if any(str(t.data) in {"ensure", "require", "var_decl"} for t in predicate.iter_subtrees()):
                raise TranslationError("Statements inside predicates are unsupported; use a Boolean expression")
        ast = ASTBuilder().transform(tree)
        if dialect == "project":
            from .project import ProjectTranslator
            translator = ProjectTranslator(ast, mapping or {}, source)
        else:
            translator = Translator(ast, mapping or {}, source)
        checker = TypeChecker()
        checker.source_code = source
        errors = checker.check(ast)
        if errors:
            raise TranslationError("DSL type error: " + "\n".join(map(str, errors)))
        result = translator.translate(entry)
        if expression_only:
            return result.removeprefix("assert ").removesuffix(";\n") + "\n"
        return result
    except (UnexpectedInput, VisitError) as exc:
        raise TranslationError(f"Invalid DSL: {exc}") from exc
    except RecursionError as exc:
        raise TranslationError("DSL nesting exceeds the supported recursion depth") from exc
