"""Full-C2S discovery, typed profiles and TC regression tests."""
from collections import Counter
from pathlib import Path
import unittest
from .extract import scan
from .adapters import adapt
from .compare import ROOT, render_harness
from .translate import translate_batch
from .trace_projection import instrumented_harness
from .testcases import JAVA_HELPERS


class FullC2STests(unittest.TestCase):
    @classmethod
    def setUpClass(cls):
        cls.all_rows = [r for f in sorted((ROOT/'datasets/c2s_aug').glob('*.java'))
                        for r in scan(f, ROOT/'datasets')]
        cls.rows = [r for r in cls.all_rows if r.get('description')]

    def test_all_annotated_assertions_have_profiles(self):
        self.assertEqual(len(self.all_rows), 430)
        self.assertEqual(len(self.rows), 416)
        self.assertEqual(len({r['id'] for r in self.rows}), 416)
        self.assertEqual(len({r['class_name'] for r in self.rows}), 19)
        schemas_seen = set()
        for row in self.rows:
            with self.subTest(id=row['id']):
                self.assertNotIn('extraction_error', row)
                a=adapt(row);info=a['method_info'];en=info['entry_schema'];ex=info['exit_schema']
                dsl=f"predicate spec(param: {en['params']}, entry_self: {en['self']}, exit_self: {ex['self']}, ret: {ex['ret']}) {{ true }}"
                if dsl not in schemas_seen:
                    self.assertIn('true',translate_batch(dsl,a['mapping']))
                    schemas_seen.add(dsl)
                self.assertNotIn('@@@',info['code'])
                self.assertNotIn('// assert',info['code'])

    def test_array_parameter_does_not_shadow_label(self):
        row=next(r for r in self.rows if r['class_name']=='ArrayList' and any(p['type']=='T[]' for p in r['parameters']))
        code=instrumented_harness(row,adapt(row),JAVA_HELPERS)
        self.assertIn('Integer[] a',code)
        self.assertNotIn('boolean a=',code)
        self.assertIn('boolean __expecto_tc_label=',code)

    def test_object_relations_preserve_java_types(self):
        row=next(r for r in self.rows if r['class_name']=='RoleList' and r['method_name']=='set' and any(p['type']=='Role' for p in r['parameters']))
        a=adapt(row)
        self.assertEqual(a['java_receiver'],'RoleList')
        self.assertEqual(a['java_parameters'][-1]['type'],'javax.management.relation.Role')
        self.assertIn('elements_equal_role',a['method_info']['exit_schema']['self'])
        self.assertIn('elements_identical_role',a['method_info']['exit_schema']['self'])
        self.assertIn('elements_equal_entry',a['method_info']['exit_schema']['self'])
        self.assertNotIn('hashCode',str(a['mapping']))


if __name__=='__main__':unittest.main()
