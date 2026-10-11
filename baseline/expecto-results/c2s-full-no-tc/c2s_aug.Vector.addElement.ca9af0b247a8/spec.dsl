predicate spec(param: record[obj: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var len_exit: int = 
        len(exit_self.elements);
    (∃(i: int) ::
        ((0 <= i < len_exit) ∧
            (exit_self.elements[i] == param.obj)))
}