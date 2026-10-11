predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var old_head: option[int] = 
        entry_self.elements[0];
    var new_head: option[int] = 
        exit_self.elements[0];
    (entry_self.empty ∨
        ((¬ entry_self.empty) ∧
            ((¬ exit_self.empty) ==>
                (unwrap(new_head) <= unwrap(old_head)))))
}