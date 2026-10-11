predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var e_opt: option[int] = 
        param.e;
    var exit_elems: list[option[int]] = 
        exit_self.elements;
    ((len(exit_elems) > 0) ∧
        (exit_elems[0] == e_opt))
}