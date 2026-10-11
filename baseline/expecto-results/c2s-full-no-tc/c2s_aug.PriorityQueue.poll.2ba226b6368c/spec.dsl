predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var old_head_opt: option[int] = 
        entry_self.elements[0];
    var new_head_opt: option[int] = 
        exit_self.elements[0];
    ((¬ exit_self.empty) ==>
        ((is_some(old_head_opt) ∧
            is_some(new_head_opt)) ∧
            (unwrap(new_head_opt) >= unwrap(old_head_opt))))
}