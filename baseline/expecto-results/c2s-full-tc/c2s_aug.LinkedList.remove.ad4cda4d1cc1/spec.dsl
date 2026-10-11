predicate spec(param: record[index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    (((0 <= param.index) ∧
        (param.index < len(entry_self.elements))) ==>
        (((ret == entry_self.elements[param.index]) ∧
            (len(exit_self.elements) == (len(entry_self.elements) -
                1))) ∧
            (∀(i: int) ::
                ((0 <= i < len(exit_self.elements)) ==>
                    (exit_self.elements[i] == entry_self.elements[(if (i < param.index) then i else (i + 1))])))))
}