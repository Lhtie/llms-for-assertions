predicate spec(param: record[sourceVertex: option[int], targetVertex: option[int], e: option[int]], entry_self: record[vertices: list[option[int]], edges: list[option[int]]], exit_self: record[vertices: list[option[int]], edges: list[option[int]]], ret: bool) {
    ((is_none(param.sourceVertex) ==>
        true) ∧
        (is_some(param.sourceVertex) ==>
            (∃(i: int) ::
                (((0 <= i < len(exit_self.vertices)) ∧
                    is_some(exit_self.vertices[i])) ∧
                    (unwrap(exit_self.vertices[i]) == unwrap(param.sourceVertex))))))
}