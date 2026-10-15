predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    (is_some(ret) ==>
        (((¬ entry_self.empty) ∧
            is_some(entry_self.elements[0])) ∧
            (unwrap(ret) == unwrap(entry_self.elements[0]))))
}