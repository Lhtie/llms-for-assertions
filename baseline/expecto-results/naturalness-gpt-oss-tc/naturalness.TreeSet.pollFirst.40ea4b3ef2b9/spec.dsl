predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    (((exit_self.empty == (exit_self.size == 0)) ∧
        ((exit_self.size == 0) ==>
            (exit_self.elements == []))) ∧
        (is_some(ret) ==>
            (∃(i: int) ::
                ((((0 <= i < len(entry_self.elements)) ∧
                    is_some(entry_self.elements[i])) ∧
                    (unwrap(ret) == unwrap(entry_self.elements[i]))) ∧
                    (∀(j: int) ::
                        (((0 <= j < len(entry_self.elements)) ∧
                            is_some(entry_self.elements[j])) ==>
                            (unwrap(ret) <= unwrap(entry_self.elements[j]))))))))
}