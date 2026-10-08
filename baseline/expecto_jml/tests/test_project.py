import json
from pathlib import Path
import re
import shutil
import subprocess
import sys
import tempfile
import unittest

from baseline.expecto_jml import TranslationError, translate
from codehelper.javahelper import javahelper, find_bounds

ROOT = Path(__file__).resolve().parents[3]
EXAMPLES = ROOT / 'baseline/expecto_jml/examples'
DATASET = ROOT / 'datasets/c2s_aug/ArrayList.java'
LIST_MAP = {
    'entry_self.elements': {'length': 'this.size()', 'get': 'this.get({index})'},
    'exit_self.elements': {'length': 'this.size()', 'get': 'this.get({index})'},
}


def lower_pair(candidate, ground_truth):
    helper = javahelper(DATASET.read_text())
    helper.fuzz_objname = 'fuzzobj_new'
    one = helper.trans_formula(helper.extract_formula(candidate))
    two = helper.trans_formula(helper.extract_formula(ground_truth))
    old = '\n'.join(one[1] + two[1]).replace('fuzzobj_new', 'fuzzobj_old')
    quant = '\n'.join(one[2] + two[2])
    split = '\n'.join(one[3] + two[3])
    return f'''
    static <E> boolean[] compare(c2s_aug.ArrayList<E> fuzzobj_old,
                             c2s_aug.ArrayList<E> fuzzobj_new,
                             int index, E New_Ret) {{
        {old}
        {quant}
        {split}
        return new boolean[] {{Boolean.TRUE.equals(exec(() -> {one[0]})),
                               Boolean.TRUE.equals(exec(() -> {two[0]}))}};
    }}
'''


class ProjectTests(unittest.TestCase):
    def test_default_assert_and_expression_only(self):
        source = 'predicate spec(param: record[x: int], ret: int) { ret == param.x }'
        output = translate(source)
        self.assertTrue(output.startswith('assert '))
        self.assertTrue(output.endswith(';\n'))
        self.assertIn(r'(int) (\result)', output)
        self.assertIn('(int) (x)', output)
        self.assertEqual(translate(source, expression_only=True), output[7:-2]+'\n')
        for forbidden in ['ensures', r'\bigint', '<==>', '==>']:
            self.assertNotIn(forbidden, output)

    def test_observers_replace_private_fields(self):
        source = (EXAMPLES/'arraylist_size.dsl').read_text()
        with self.assertRaisesRegex(TranslationError, 'Missing public-observer'):
            translate(source)
        mapping = json.loads((EXAMPLES/'project_size_mapping.json').read_text())
        output = translate(source, mapping=mapping)
        self.assertIn(r'\old(this.size())', output)
        self.assertNotIn('this.size ==', output)
        for invalid in ['this.size', 'this.size++;', 'System.exit(0)']:
            with self.assertRaises(TranslationError):
                translate(source, mapping={'entry_self.size': invalid})

    def test_param_array_reads_old_elements(self):
        output = translate('predicate spec(param: record[a: list[int], i: int], ret: int) {ret == param.a[param.i]}')
        self.assertIn(r'\old(a[i])', output)

    def test_primitive_implication_and_equivalence(self):
        output = translate('predicate spec(param: record[p: bool, q: bool], ret: bool) { ret == (param.p iff param.q) and not (param.p implies param.q) }')
        self.assertNotIn('=>', output)
        self.assertNotIn('<==>', output)
        helper = javahelper(DATASET.read_text())
        expr = helper.extract_formula(output)
        expr, old, quant, split = helper.trans_formula(expr)
        self.assertNotIn('=>', '\n'.join(split))

    def test_bounds_are_recognized_by_real_helper(self):
        source = 'predicate spec(param: record[n: int]) { ∀(i: int) :: (0 <= i and i < param.n) implies i >= 0 }'
        output = translate(source)
        match = re.search(r'\\forall int (\w+); (.*?);', output)
        self.assertIsNotNone(match)
        name, cond = match.groups()
        self.assertEqual(find_bounds(cond, name), ('0', 'n - 1'))
        self.assertNotIn(r'\bigint', output)
        helper = javahelper(DATASET.read_text())
        _, _, loops, _ = helper.trans_formula(helper.extract_formula(output))
        self.assertNotIn('65536', '\n'.join(loops))

    def test_exists_uses_bounded_forall_dual(self):
        source = 'predicate spec(param: record[n: int]) { ∃(i: int) :: (0 <= i and i < param.n) and i == 2 }'
        output = translate(source)
        self.assertNotIn(r'\exists', output)
        self.assertIn(r'\forall int', output)
        helper = javahelper(DATASET.read_text())
        helper.trans_formula(helper.extract_formula(output))

    def test_unbounded_nested_and_bool_quantifiers_rejected(self):
        cases = [
            'predicate spec() { ∀(i: int) :: i == i }',
            'predicate spec() { ∀(i: int) :: (i >= 0) implies i >= 0 }',
            'predicate spec() { ∀(i: int) :: (0<=i and i<5) implies (∀(j: int) :: (0<=j and j<5) implies i==j) }',
            'predicate spec() { ∀(p: bool) :: p or not p }',
        ]
        for source in cases:
            with self.subTest(source=source), self.assertRaises(TranslationError):
                translate(source)

    def test_large_integer_rejected_in_project_mode(self):
        with self.assertRaisesRegex(TranslationError, 'int range'):
            translate('predicate spec(ret: int) {ret < 2147483648}')

    def test_cli_default_and_expression(self):
        with tempfile.TemporaryDirectory() as tmp:
            src = Path(tmp)/'sample_results.json'
            src.write_text(json.dumps([{'id': 'x', 'specification': 'predicate spec(ret: int) {ret==1}'}]))
            cmd = [sys.executable, '-m', 'baseline.expecto_jml', str(src), '--sample-id', 'x']
            full = subprocess.run(cmd, capture_output=True, text=True, cwd=ROOT)
            expr = subprocess.run(cmd+['--expression'], capture_output=True, text=True, cwd=ROOT)
            self.assertEqual(full.returncode, 0, full.stderr)
            self.assertEqual(expr.returncode, 0, expr.stderr)
            self.assertEqual(full.stdout, 'assert '+expr.stdout.rstrip()+';\n')


@unittest.skipUnless(shutil.which('javac') and shutil.which('java'), 'JDK required')
class ProjectJavaTests(unittest.TestCase):
    def execute_pair(self, candidate, ground_truth, checks):
        code = '''
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.function.Supplier;
public class Comparison {
    static <T> T exec(Supplier<T> s) { try {return s.get();} catch(Exception e) {return null;} }
    @SuppressWarnings("unchecked")
    static <T> T get_from_array(Object arr, int index, T example) {
        try {return (T)Array.get(arr,index);} catch(Exception e) {return null;}
    }
    static c2s_aug.ArrayList<Integer> list(Integer... values) {
        return new c2s_aug.ArrayList<Integer>(java.util.Arrays.asList(values));
    }
    static void check(boolean[] values, boolean expectedOne, boolean expectedTwo) {
        if(values[0]!=expectedOne || values[1]!=expectedTwo)
            throw new AssertionError(java.util.Arrays.toString(values));
    }
''' + lower_pair(candidate, ground_truth) + '\npublic static void main(String[] args) {\n'+ checks +'\n}\n}'
        with tempfile.TemporaryDirectory() as tmp:
            source = Path(tmp)/'Comparison.java'
            source.write_text(code)
            compiled = subprocess.run(['javac','-d',tmp,str(DATASET),str(source)], capture_output=True, text=True, timeout=30)
            self.assertEqual(compiled.returncode, 0, compiled.stderr + '\n' + code)
            run = subprocess.run(['java','-cp',tmp,'Comparison'], capture_output=True, text=True, timeout=15)
            self.assertEqual(run.returncode, 0, run.stdout + run.stderr + '\n' + code)

    def test_real_arraylist_dataset_return_assertion(self):
        source = (EXAMPLES/'arraylist_remove_return.dsl').read_text()
        candidate = translate(source, mapping={'entry_self.elements': LIST_MAP['entry_self.elements']})
        ground_truth = next(line.strip().removeprefix('// ').strip() for line in DATASET.read_text().splitlines()
                            if r'assert index>=0 && index<\old(this.size()) => \result==\old(this.get(index));' in line)
        self.execute_pair(candidate, ground_truth, '''
            check(compare(list(11,22),list(22),0,11),true,true);
            check(compare(list(11,22),list(22),0,99),false,false);
            check(compare(list(11,22),list(11),1,22),true,true);
            check(compare(list(),list(),-1,99),true,true);
            check(compare(list(11),list(),8,99),true,true);
        ''')
        mutant = translate(source.replace('ret == entry_self.elements[param.index]', 'ret == entry_self.elements[param.index] + 1'),
                           mapping={'entry_self.elements': LIST_MAP['entry_self.elements']})
        self.execute_pair(mutant, ground_truth, 'check(compare(list(11,22),list(22),0,11),false,true);')

    def test_bounded_observer_quantifier_and_old_snapshots(self):
        source = '''predicate spec(param: record[index: int], entry_self: record[elements: list[int]],
                    exit_self: record[elements: list[int]]) {
                    (param.index>=0 and param.index<len(entry_self.elements)) implies
                    (∀(i: int) :: (0<=i and i<param.index) implies
                    exit_self.elements[i] == entry_self.elements[i]) }'''
        candidate = translate(source, mapping=LIST_MAP)
        ground_truth = next(line.strip().removeprefix('// ').strip() for line in DATASET.read_text().splitlines()
                            if r'assert index>=0 && index<\old(this.size()) => \forall int i; 0<=i && i<index;' in line)
        self.execute_pair(candidate, ground_truth, '''
            check(compare(list(11,22,33),list(11,33),1,22),true,true);
            check(compare(list(11,22,33),list(99,33),1,22),false,false);
            check(compare(list(11,22),list(22),0,11),true,true);
        ''')

    def test_observer_array_equality(self):
        source = 'predicate spec(entry_self: record[elements: list[int]], exit_self: record[elements: list[int]]) {entry_self.elements == exit_self.elements}'
        candidate = translate(source, mapping=LIST_MAP)
        ground_truth = r'assert this.size()==\old(this.size()) && (\forall int i; 0<=i && i<this.size(); this.get(i)==\old(this.get(i)));'
        self.execute_pair(candidate, ground_truth, '''
            check(compare(list(11,22),list(11,22),0,0),true,true);
            check(compare(list(11,22),list(11,99),0,0),false,false);
            check(compare(list(11,22),list(11),0,0),false,false);
            check(compare(list(),list(),0,0),true,true);
        ''')

    def test_boxed_integer_equality_inside_negation(self):
        source = 'predicate spec(entry_self: record[elements: list[int]], exit_self: record[elements: list[int]]) {not (entry_self.elements[0] != exit_self.elements[0])}'
        self.execute_pair(translate(source, mapping=LIST_MAP),
                          r'assert this.get(0).equals(\old(this.get(0)));', '''
            check(compare(list(1000),list(1000),0,0),true,true);
            check(compare(list(1000),list(2000),0,0),false,false);
        ''')

    def test_exists_runtime_dual(self):
        source = 'predicate spec(param: record[index: int]) { ∃(i: int) :: (0<=i and i<param.index) and i==2 }'
        self.execute_pair(translate(source), 'assert index>2;', '''
            check(compare(list(),list(),0,0),false,false);
            check(compare(list(),list(),2,0),false,false);
            check(compare(list(),list(),3,0),true,true);
        ''')


if __name__ == '__main__':
    unittest.main()
