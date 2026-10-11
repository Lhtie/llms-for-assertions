predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    var len_exit: int = 
        len(exit_self.elements);
    ((((ret == true) ∧
        (exit_self.size == (entry_self.size + 1))) ∧
        (len_exit > 0)) ∧
        (exit_self.elements[(len_exit - 1)] == param.e))
}