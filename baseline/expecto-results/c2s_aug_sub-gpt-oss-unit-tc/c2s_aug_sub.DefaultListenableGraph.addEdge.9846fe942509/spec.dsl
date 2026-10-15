predicate spec(param: record[sourceVertex: option[int], targetVertex: option[int], e: option[int]], entry_self: record[vertices: list[option[int]], edges: list[option[int]]], exit_self: record[vertices: list[option[int]], edges: list[option[int]]], ret: bool) {
    (is_some(param.sourceVertex) ==>
        (∃(i: int) ::
            ((0 <= i < len(exit_self.vertices)) ∧
                (unwrap(param.sourceVertex) == unwrap(exit_self.vertices[i])))))
}