predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    ((¬ exit_self.empty) ==>
        ((is_some(ret) ∧
            is_some(exit_self.elements[0])) ∧
            (unwrap(exit_self.elements[0]) >= unwrap(ret))))
}