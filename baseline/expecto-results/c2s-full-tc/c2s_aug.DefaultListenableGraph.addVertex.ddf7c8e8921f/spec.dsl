predicate spec(param: record[v: option[int]], entry_self: record[vertices: list[option[int]], edges: list[option[int]]], exit_self: record[vertices: list[option[int]], edges: list[option[int]]], ret: bool) {
    (is_some(param.v) ==>
        (param.v in exit_self.vertices))
}