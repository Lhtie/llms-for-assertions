predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var first_elem: option[int] = 
        entry_self.elements[0];
    ((¬ entry_self.empty) ==>
        ((is_some(ret) ∧
            is_some(first_elem)) ∧
            (unwrap(ret) == unwrap(first_elem))))
}