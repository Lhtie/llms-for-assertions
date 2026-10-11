predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var len_exit: int = 
        len(exit_self.elements);
    ((len_exit > 0) ==>
        (exit_self.elements[(len_exit - 1)] != param.e))
}