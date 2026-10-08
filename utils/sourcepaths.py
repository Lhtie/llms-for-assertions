"""Dataset filename routing and Java source package discovery."""
from pathlib import Path
import re


def source_directory(filename, datasets, fallback):
    parts = Path(filename).name.split('.')
    root = Path(datasets).resolve()
    if len(parts) < 4:
        return str(fallback)
    group = parts[0]
    if not re.fullmatch(r'[A-Za-z_][\w]*', group):
        raise ValueError(f'Invalid dataset prefix: {group}')
    directory = root / group
    if group in {'buggycodes', 'buggyasrts'}:
        if len(parts) < 5 or not re.fullmatch(r'mut_\d+', parts[1]):
            raise ValueError(f'Missing mutation prefix: {filename}')
        directory /= parts[1]
    if not directory.is_dir():
        raise FileNotFoundError(f'Source directory for {filename}: {directory}')
    return str(directory)


def java_source_info(directory, class_name):
    source = Path(directory).resolve() / (class_name + '.java')
    text = source.read_text()
    # Package declarations precede classes; ignore comments that mention packages.
    text = re.sub(r'/\*.*?\*/|//[^\n]*', '', text, flags=re.S)
    match = re.search(r'^\s*package\s+([\w.]+)\s*;', text, re.M)
    if not match:
        raise ValueError(f'Missing Java package declaration: {source}')
    package = match[1]
    root = source.parent
    for part in reversed(package.split('.')):
        if root.name != part:
            raise ValueError(f'Package {package} does not match source directory {source.parent}')
        root = root.parent
    return package, str(root), str(source)
