predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var old_head: option[int] = 
        ret;
    var new_head: option[int] = 
        exit_self.elements[0];
    ((¬ exit_self.empty) ==>
        ((is_some(old_head) ∧
            is_some(new_head)) ∧
            (unwrap(new_head) >= unwrap(old_head))))
}