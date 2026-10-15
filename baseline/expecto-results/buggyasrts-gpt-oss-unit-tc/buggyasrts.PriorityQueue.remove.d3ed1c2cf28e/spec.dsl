predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (((¬ entry_self.empty) ∧
        (ret == true)) ==>
        (exit_self.empty ∨
            ((is_some(entry_self.elements[0]) ∧
                is_some(exit_self.elements[0])) ∧
                (unwrap(exit_self.elements[0]) <= unwrap(entry_self.elements[0])))))
}