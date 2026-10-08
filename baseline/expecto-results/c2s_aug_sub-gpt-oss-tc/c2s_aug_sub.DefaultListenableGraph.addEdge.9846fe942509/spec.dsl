predicate spec(param: record[sourceVertex: option[int], targetVertex: option[int], e: option[int]], entry_self: record[vertices: list[option[int]], edges: list[option[int]]], exit_self: record[vertices: list[option[int]], edges: list[option[int]]], ret: bool) {
    contains_vertex(param.sourceVertex, exit_self.vertices)
}

predicate contains_vertex(v: option[int], verts: list[option[int]]) {
    (is_none(v) ∨
        (∃(i: int) ::
            ((((0 <= i < len(verts)) ∧
                is_some(v)) ∧
                is_some(verts[i])) ∧
                (unwrap(v) == unwrap(verts[i])))))
}