predicate spec(param: record[sourceVertex: option[int], targetVertex: option[int], e: option[int]], entry_self: record[vertices: list[option[int]], edges: list[option[int]]], exit_self: record[vertices: list[option[int]], edges: list[option[int]]], ret: bool) {
    (ret ==>
        contains_edge(exit_self.edges, param.e))
}

predicate contains_edge(edges: list[option[int]], e: option[int]) {
    (∃(i: int) ::
        ((0 <= i < len(edges)) ∧
            (edges[i] == e)))
}