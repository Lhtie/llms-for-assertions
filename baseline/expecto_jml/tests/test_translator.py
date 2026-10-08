import json
from pathlib import Path
import subprocess
import sys
import tempfile
import unittest

from baseline.expecto_jml import TranslationError, translate as _translate
from functools import partial
translate = partial(_translate, dialect="openjml")


def scalar(body, extra=""):
    return f"{extra}\npredicate spec(param: record[x: int], entry_self: record[n: int], exit_self: record[n: int], ret: int) {{ {body} }}"


class TranslatorTests(unittest.TestCase):
    def test_states_and_parameter_values(self):
        text = translate(scalar("ret == param.x + entry_self.n and exit_self.n == entry_self.n"))
        for expected in (r"\result", r"\old(x)", r"\old(this.n)", "this.n ==", r"\bigint_math"):
            self.assertIn(expected, text)
        self.assertNotIn("requires", text)
        self.assertNotIn("assignable", text)
        self.assertNotIn("normal_behavior", text)

    def test_mapping(self):
        text = translate(scalar("ret == entry_self.n"), mapping={"entry_self.n": "this.size"})
        self.assertIn(r"\old(this.size)", text)
        with self.assertRaisesRegex(TranslationError, "Unused mappings"):
            translate(scalar("ret == 1"), mapping={"entry_self.n": "this.size"})
        with self.assertRaisesRegex(TranslationError, "not expressions"):
            translate(scalar("ret == 1"), mapping={"entry_self.n": "this.size()"})

    def test_primitive_parameter_array_is_entry_state(self):
        text = translate("predicate spec(param: record[a: list[int], i: int], ret: int) {ret == param.a[param.i]}")
        self.assertIn(r"\old(a[i])", text)
        self.assertNotIn(r"\old(a)[", text)
        self.assertNotIn(r"\old(\old", text)

    def test_record_equality_is_structural(self):
        text = translate(scalar("entry_self == exit_self"))
        self.assertIn(r"\old(this.n) == this.n", text)
        self.assertNotIn(r"\old(this) == this", text)

    def test_arrays_are_compared_by_contents(self):
        text = translate("predicate spec(entry_self: record[a: list[int]], exit_self: record[a: list[int]]) { entry_self.a == exit_self.a }")
        self.assertIn(r"\forall \bigint", text)
        self.assertIn(r"\old(this.a[", text)
        self.assertIn(".length", text)
        self.assertNotIn(r"\old(this.a) == this.a", text)

    def test_post_state_index_cannot_move_inside_old(self):
        with self.assertRaisesRegex(TranslationError, "post-state index"):
            translate("predicate spec(entry_self: record[a: list[int]], ret: int) { entry_self.a[ret] == 0 }")

    def test_helper_inlining(self):
        text = translate(scalar("same(ret, param.x)", "predicate same(a: int, b: int) { a == b }"))
        self.assertIn(r"\result == \old(x)", text)
        self.assertNotIn("same(", text)

    def test_explicit_function_and_conditionals(self):
        text = translate(scalar("ret == absolute(param.x)", "function absolute(x: int) -> int { if x < 0 then -x else x }"))
        self.assertIn(" ? ", text)
        self.assertNotIn("absolute(", text)

    def test_helpers_do_not_capture_quantifier_arguments(self):
        dsl = "predicate helper(x: int) { ∀(i: int) :: x == i }\npredicate spec(param: record[i: int]) { helper(param.i) }"
        text = translate(dsl)
        self.assertIn(r"\old(i)", text)
        self.assertIn(r"\bigint __expecto_jml_", text)

    def test_quantifiers_and_chained_comparison(self):
        dsl = "predicate spec(param: record[n: int]) { ∀(i: int) :: (0 <= i < param.n) implies (∃(j: int) :: j == i) }"
        text = translate(dsl)
        self.assertIn(r"\forall \bigint", text)
        self.assertIn(r"\exists \bigint", text)
        self.assertIn("&&", text)
        self.assertIn("==>", text)

    def test_huge_integer_is_not_an_invalid_java_literal(self):
        text = translate(scalar("ret < 1000000000000000000000000000000000"))
        self.assertNotIn("1000000000000000000000000000000000", text)
        self.assertIn("* 10", text)

    def test_reject_wrong_types(self):
        with self.assertRaisesRegex(TranslationError, "type error"):
            translate(scalar("ret + true == 0"))

    def test_unsupported_constructs_fail_closed(self):
        cases = [
            (scalar("ret == param.x / 2"), "Operator"),
            (scalar("ret == param.x % 2"), "Operator"),
            (scalar("ret == param.x ^ 2"), "Operator"),
            ("predicate spec(ret: string) { ret == \"hi\" }", "Unsupported"),
            ("predicate spec(ret: real) { ret == 0.1 }", "floating-point"),
            (scalar("ret == f(param.x)", "function f(x: int) -> int { ensures result > x }"), "explicit body"),
            (scalar("ret == f(param.x)", "function f(x: int) -> int { f(x) }"), "Recursive"),
            ("predicate spec(ret: int) { ensure ret == 0; true }", "Statements"),
            ("predicate spec(ret: int) { require ret == 0; true }", "Statements"),
            ("predicate spec(ret: int): \"unfinished\"", "explicit body"),
        ]
        for code, message in cases:
            with self.subTest(code=code), self.assertRaisesRegex(TranslationError, message):
                translate(code)

    def test_reject_builtin_redefinition_and_duplicate_binders(self):
        cases = [
            "predicate len(x: int) { x == 1 } predicate spec(ret: int) {len(ret)}",
            "predicate spec() { ∀(i: int, i: int) :: i == i }",
            "predicate helper(x: int, x: int) {x == 0} predicate spec(ret: int) {helper(ret,ret)}",
        ]
        for code in cases:
            with self.subTest(code=code), self.assertRaises(TranslationError):
                translate(code)

    def test_duplicate_declarations_and_syntax(self):
        with self.assertRaisesRegex(TranslationError, "Duplicate"):
            translate("predicate spec() {true} predicate spec() {false}")
        with self.assertRaisesRegex(TranslationError, "Invalid DSL"):
            translate("predicate spec( {")

    def test_cli_selects_sample_and_preserves_output_on_failure(self):
        with tempfile.TemporaryDirectory() as tmp:
            root = Path(tmp)
            src, out = root / "sample_results.json", root / "out.jml"
            src.write_text(json.dumps([{"id": "a", "specification": scalar("ret == 0")},
                                       {"id": "b", "specification": scalar("ret == 1")}]))
            cmd = [sys.executable, "-m", "baseline.expecto_jml", "--dialect", "openjml", str(src), "-o", str(out)]
            success = subprocess.run(cmd + ["--sample-id", "b"], capture_output=True, text=True)
            self.assertEqual(success.returncode, 0, success.stderr)
            self.assertIn(r"\result == 1", out.read_text())
            saved = out.read_text()
            failure = subprocess.run(cmd, capture_output=True, text=True)
            self.assertEqual(failure.returncode, 2)
            self.assertEqual(out.read_text(), saved)
            self.assertNotIn("Traceback", failure.stderr)


if __name__ == "__main__":
    unittest.main()
