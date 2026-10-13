predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var n: int = 
        len(exit_self.elements);
    ((¬ is_some(ret)) ∨
        (¬ (∃(i: int) ::
            (((0 <= i < n) ∧
                is_some(exit_self.elements[i])) ∧
                (unwrap(exit_self.elements[i]) == unwrap(ret))))))
}