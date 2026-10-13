import tempfile
import unittest
from pathlib import Path

from utils.sourcepaths import source_directory


class SourceDirectoryTests(unittest.TestCase):
    def test_routes_any_matching_nested_variant_directories(self):
        with tempfile.TemporaryDirectory() as tmp:
            datasets = Path(tmp)
            expected = datasets / 'custom' / 'variantA' / 'implementation'
            expected.mkdir(parents=True)

            actual = source_directory(
                'custom.variantA.implementation.Widget.run.java.7',
                datasets,
                'fallback',
            )

            self.assertEqual(Path(actual), expected.resolve())

    def test_routes_examples_mutation_directory(self):
        datasets = Path(__file__).resolve().parents[1] / 'datasets'

        actual = source_directory(
            'examples.mut001.IntList1onedown.java.1', datasets, 'fallback'
        )

        self.assertEqual(actual, str((datasets / 'examples' / 'mut001').resolve()))

    def test_keeps_flat_dataset_at_group_directory(self):
        with tempfile.TemporaryDirectory() as tmp:
            datasets = Path(tmp)
            (datasets / 'flat').mkdir()

            actual = source_directory(
                'flat.Widget.run.java.7', datasets, 'fallback'
            )

            self.assertEqual(actual, str((datasets / 'flat').resolve()))


if __name__ == '__main__':
    unittest.main()
