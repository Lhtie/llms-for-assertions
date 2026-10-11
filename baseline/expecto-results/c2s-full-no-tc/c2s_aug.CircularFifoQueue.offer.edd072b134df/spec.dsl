predicate spec(param: record[element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    var new_len: int = 
        len(exit_self.elements);
    (is_some(param.element) ==>
        ((new_len > 0) ∧
            (exit_self.elements[(new_len - 1)] == param.element)))
}