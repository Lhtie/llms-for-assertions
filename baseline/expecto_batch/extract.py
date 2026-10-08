"""Java AST extraction. The comparison target never enters generation input."""

import hashlib
import re
from pathlib import Path


def digest(value):
    return hashlib.sha256(value.encode()).hexdigest()


def source_digest(path):
    """Match scan's byte-preserving hash, including CRLF line endings."""
    return hashlib.sha256(path.read_bytes()).hexdigest()


def scan(path, datasets):
    from tree_sitter_languages import get_parser

    raw = path.read_bytes()
    text = raw.decode("utf-8")
    tree = get_parser("java").parse(raw)
    if tree.root_node.has_error:
        raise ValueError(f"Java parse error in {path}")

    def content(node):
        return raw[node.start_byte : node.end_byte].decode()

    def walk(node):
        yield node
        for child in node.children:
            yield from walk(child)

    nodes = list(walk(tree.root_node))
    methods = [
        n for n in nodes if n.type in ("method_declaration", "constructor_declaration")
    ]
    comments = [n for n in nodes if n.type in ("line_comment", "block_comment")]
    klass = next(n for n in nodes if n.type == "class_declaration")
    name = content(klass.child_by_field_name("name"))
    package = next(
        content(n).removeprefix("package").rstrip(";").strip()
        for n in nodes
        if n.type == "package_declaration"
    )
    imports = [content(n) for n in nodes if n.type == "import_declaration"]
    occurrences = {}
    rows = []
    for comment in comments:
        match = re.match(r"//\s*(assert\b.*)", content(comment), re.S)
        if not match:
            continue
        assertion = match[1].strip()
        containing = [
            m for m in methods if m.start_byte <= comment.start_byte < m.end_byte
        ]
        method = (
            min(containing, key=lambda m: m.end_byte - m.start_byte)
            if containing
            else None
        )
        row = dict(
            source=str(path.relative_to(datasets)),
            source_sha256=digest(text),
            group=path.relative_to(datasets).parts[0],
            class_name=name,
            package=package,
            assertion_line=comment.start_point[0] + 1,
            ground_truth=assertion,
            ground_truth_policy="literal_source_assert_including_intentionally_corrupted_assertions",
            imports=imports,
        )
        if method is None:
            row.update(
                extraction_error="assert outside a method/constructor",
                method_signature="",
                description="",
            )
        else:
            previous = [
                c
                for c in comments
                if method.start_byte <= c.start_byte < comment.start_byte
            ]
            prev = max(previous, key=lambda c: c.start_byte) if previous else None
            nl = re.match(r"//\s*@@@\s*(.*)", content(prev), re.S) if prev else None
            if nl is None or raw[prev.end_byte : comment.start_byte].strip():
                row["extraction_error"] = (
                    "assert has no immediately preceding @@@ description"
                )
            row["description"] = nl[1].strip() if nl else ""
            body = method.child_by_field_name("body")
            header = raw[method.start_byte : body.start_byte].decode().strip()
            row["method_signature"] = re.sub(r"\s+", " ", header)
            row["method_name"] = content(method.child_by_field_name("name"))
            row["constructor"] = method.type == "constructor_declaration"
            typ = method.child_by_field_name("type")
            row["return_type"] = content(typ) if typ else "void"
            args = []
            for arg in method.child_by_field_name("parameters").named_children:
                if arg.type != "formal_parameter":
                    row["extraction_error"] = "unsupported varargs/receiver parameter"
                    continue
                args.append(
                    dict(
                        name=content(arg.child_by_field_name("name")),
                        type=content(arg.child_by_field_name("type")),
                    )
                )
            row["parameters"] = args
            # Blank every comment in the target method, not just this assertion.
            chunks = []
            offset = method.start_byte
            for c in comments:
                if method.start_byte <= c.start_byte < c.end_byte <= method.end_byte:
                    chunks.extend(
                        [
                            raw[offset : c.start_byte].decode(),
                            "\n" * content(c).count("\n"),
                        ]
                    )
                    offset = c.end_byte
            chunks.append(raw[offset : method.end_byte].decode())
            row["method_code"] = "".join(chunks)
        key = row["method_signature"]
        occurrences[key] = occurrences.get(key, 0) + 1
        row["assertion_in_method"] = occurrences[key]
        identity = f"{row['source']}:{key}:{occurrences[key]}"
        row["id"] = (
            f"{row['group']}.{name}.{row.get('method_name','unknown')}.{digest(identity)[:12]}"
        )
        rows.append(row)
    return rows
