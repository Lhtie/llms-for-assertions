predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (exit_self.empty ∨
        (∃(old: int, new: int) ::
            ((((is_some(entry_self.elements[0]) ∧
                is_some(exit_self.elements[0])) ∧
                (old == unwrap(entry_self.elements[0]))) ∧
                (new == unwrap(exit_self.elements[0]))) ∧
                (new >= old))))
}