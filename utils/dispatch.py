"""Split one source file and generate its onedown variants."""
import argparse
import json
from pathlib import Path

try:
    from . import splitter, onedown
except ImportError:
    import splitter
    import onedown


def dispatch_file(args, source):
    args.infile = str(source)
    args.langid = source.suffix.lstrip('.')
    args.obs = None
    try:
        relative = source.resolve().relative_to(args.datasets.resolve())
    except ValueError:
        relative = None
    args.prefix = ''
    if relative is not None:
        parents = relative.parts[:-1]
        if parents:
            args.prefix = '.'.join(parents) + '.'
    if args.obsonly:
        info = json.loads(Path(args.infofile).read_text())
        for classes in info.values():
            if source.stem in classes:
                args.obs = classes[source.stem]['ObserverMethods']
                break
        if args.obs is None:
            raise ValueError(f'No observer metadata for {source.stem}')
    code = list(enumerate(source.read_text().split('\n')))
    # On reruns, do not silently overwrite split inputs or duplicate onedown inputs.
    if args.write and any(Path(args.outdir).glob(args.prefix + source.stem + '*.java.*')):
        raise FileExistsError(f'Inputs for {source} already exist; use a new output directory')
    outputs = splitter.splitter(args, code)
    for output in outputs:
        args.infile = output
        onedown.onedown(args)
    return sum('@@@' in line for _, line in code)


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--infile', type=Path, required=True)
    parser.add_argument('--datasets', type=Path, default=Path('datasets'))
    parser.add_argument('--outdir', required=True)
    parser.add_argument('--write', action='store_true')
    parser.add_argument('--obsonly', action='store_true')
    parser.add_argument('--infofile', default='codehelper/java_angello_info.json')
    parser.add_argument('--startidx', type=int, default=-1)
    args = parser.parse_args()
    Path(args.outdir).mkdir(parents=True, exist_ok=True)
    count = dispatch_file(args, args.infile)
    print(f'Generated inputs for {count} assertions' if args.write else f'Found {count} assertions')


if __name__ == '__main__':
    main()
