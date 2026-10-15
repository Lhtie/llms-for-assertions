predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    (((((entry_self.empty == (entry_self.size == 0)) ∧
        (exit_self.empty == (exit_self.size == 0))) ∧
        is_none(ret)) ==>
        ((entry_self.empty ∧
            (exit_self == entry_self)) ∧
            is_some(ret))) ==>
        (∃(i: int) ::
            ((((((0 <= i < len(entry_self.elements)) ∧
                (entry_self.elements[i] == ret)) ∧
                (exit_self.size == (entry_self.size - 1))) ∧
                (len(exit_self.elements) == (len(entry_self.elements) -
                    1))) ∧
                (∀(j: int) ::
                    ((0 <= j < i) ==>
                        (exit_self.elements[j] == entry_self.elements[j])))) ∧
                (∀(j: int) ::
                    ((i <= j < len(exit_self.elements)) ==>
                        (exit_self.elements[j] == entry_self.elements[(j + 1)]))))))
}