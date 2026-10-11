predicate spec(param: record[sourceVertex: option[int], targetVertex: option[int], e: option[int]], entry_self: record[vertices: list[option[int]], edges: list[option[int]]], exit_self: record[vertices: list[option[int]], edges: list[option[int]]], ret: bool) {
    any(lambda (ed) = (ed == param.e), exit_self.edges)
}