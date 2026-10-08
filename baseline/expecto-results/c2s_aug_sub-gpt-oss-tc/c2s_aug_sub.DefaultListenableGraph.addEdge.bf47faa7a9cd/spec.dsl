predicate spec(param: record[sourceVertex: option[int], targetVertex: option[int], e: option[int]], entry_self: record[vertices: list[option[int]], edges: list[option[int]]], exit_self: record[vertices: list[option[int]], edges: list[option[int]]], ret: bool) {
    (is_none(param.targetVertex) ∨
        any(lambda (v) = 
            (is_some(v) ∧
                (unwrap(v) == unwrap(param.targetVertex))), exit_self.vertices))
}