predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    ((exit_self.empty ∧
        (exit_self.size == 0)) ∧
        (∀(i: int) ::
            ((0 <= i < len(exit_self.elements)) ==>
                is_none(exit_self.elements[i]))))
}