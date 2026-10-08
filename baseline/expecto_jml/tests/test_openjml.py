"""Optional integration tests: set OPENJML to the compiler executable."""
import os
from pathlib import Path
import subprocess
import tempfile
import unittest

from baseline.expecto_jml import translate as _translate
from functools import partial
translate = partial(_translate, dialect="openjml")


@unittest.skipUnless(os.environ.get("OPENJML"), "Set OPENJML to run real JML integration checks")
class OpenJMLTests(unittest.TestCase):
    def check_java(self, text, mode="--esc"):
        with tempfile.TemporaryDirectory() as tmp:
            source = Path(tmp) / "Contract.java"
            source.write_text(text)
            return subprocess.run([os.environ["OPENJML"], mode, "--timeout=20", str(source)],
                                  capture_output=True, text=True, timeout=60)

    def assert_proves(self, source):
        result = self.check_java(source)
        self.assertEqual(result.returncode, 0, result.stdout + result.stderr)

    def test_scalar_contract_proves_and_rejects_mutant(self):
        spec = translate("predicate spec(entry_self: record[size: int], ret: int) {ret == entry_self.size}")
        correct = "public class Contract { private /*@ spec_public @*/ int size;\n" + spec + "public int size() {return size;} }"
        self.assert_proves(correct)
        mutant = self.check_java(correct.replace("return size;", "return size == 0 ? 1 : 0;"))
        self.assertNotEqual(mutant.returncode, 0)
        self.assertIn("Postcondition", mutant.stdout + mutant.stderr)

    def test_old_array_element_survives_in_place_mutation(self):
        spec = translate("predicate spec(param: record[a: list[int]], ret: int) {ret == param.a[0]}")
        spec = spec.replace("/*@", "/*@ requires a != null && a.length > 0;")
        self.assert_proves("public class Contract {" + spec + "public static int first(int[] a) {int x=a[0]; a[0]=0; return x;} }")

    def test_array_content_equality(self):
        spec = translate("predicate spec(entry_self: record[a: list[int]], exit_self: record[a: list[int]], ret: int) {entry_self.a == exit_self.a and ret == entry_self.a[0]}")
        spec = spec.replace("/*@", "/*@ requires a != null && a.length > 0;")
        java = "public class Contract { private /*@ spec_public @*/ int[] a = new int[1];\n" + spec + "public int first() {return a[0];} }"
        self.assert_proves(java)
        mutant = self.check_java(java.replace("return a[0];", "int x=a[0]; a[0]= x == 0 ? 1 : 0; return x;"))
        self.assertNotEqual(mutant.returncode, 0)
        self.assertIn("Postcondition", mutant.stdout + mutant.stderr)

    def test_helper_and_quantifier_jml_typechecks(self):
        spec = translate("predicate same(x: int, y: int) {x == y}\npredicate spec(param: record[n: int], ret: bool) {ret == (∀(i: int) :: same(i,i))}")
        result = self.check_java("public class Contract {" + spec + "public static boolean run(int n) {return true;} }", "--check")
        self.assertEqual(result.returncode, 0, result.stdout + result.stderr)


if __name__ == "__main__":
    unittest.main()
