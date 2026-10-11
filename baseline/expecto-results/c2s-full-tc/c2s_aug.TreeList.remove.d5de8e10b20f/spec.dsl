predicate spec(param: record[index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var idx: int = param.index;
    (((0 <= idx) ∧
        (idx <= (entry_self.size - 1))) ==>
        (((ret == entry_self.elements[idx]) ∧
            (exit_self.size == (entry_self.size - 1))) ∧
            (∀(i: int) ::
                (((0 <= i) ∧ (i < idx)) ==>
                    ((exit_self.elements[i] == entry_self.elements[i]) ∧
                        (∀(i: int) ::
                            (((idx < i) ∧
                                (i < entry_self.size)) ==>
                                (exit_self.elements[(i - 1)] == entry_self.elements[i]))))))))
}