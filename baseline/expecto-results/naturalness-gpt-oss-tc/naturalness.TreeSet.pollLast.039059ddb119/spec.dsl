predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    (¬ (∃(i: int) ::
        ((0 <= i < len(exit_self.elements)) ∧
            (exit_self.elements[i] == ret))))
}