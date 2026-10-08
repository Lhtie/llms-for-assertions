predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    var old_head: option[int] = 
        entry_self.elements[0];
    var new_head: option[int] = 
        exit_self.elements[0];
    ((¬ exit_self.empty) ==>
        ((is_some(old_head) ∧
            is_some(new_head)) ∧
            (unwrap(new_head) >= unwrap(old_head))))
}