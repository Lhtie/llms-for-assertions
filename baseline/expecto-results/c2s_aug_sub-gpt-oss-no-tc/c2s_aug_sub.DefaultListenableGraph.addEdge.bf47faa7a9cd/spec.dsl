predicate spec(param: record[sourceVertex: option[int], targetVertex: option[int], e: option[int]], entry_self: record[vertices: list[option[int]], edges: list[option[int]]], exit_self: record[vertices: list[option[int]], edges: list[option[int]]], ret: bool) {
    (is_some(param.targetVertex) ==>
        (∃(i: int) ::
            ((0 <= i < len(exit_self.vertices)) ∧
                (exit_self.vertices[i] == param.targetVertex))))
}