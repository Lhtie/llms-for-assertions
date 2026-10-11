predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    var new_len: int = 
        len(exit_self.elements);
    ((ret == true) ==>
        ((new_len > 0) ∧
            (exit_self.elements[(new_len - 1)] == param.e)))
}