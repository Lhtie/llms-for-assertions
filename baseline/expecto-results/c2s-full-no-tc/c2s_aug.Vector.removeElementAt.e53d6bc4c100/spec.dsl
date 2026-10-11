predicate spec(param: record[index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    ((0 <= param.index < entry_self.size) ==>
        (((((exit_self.size == (entry_self.size - 1)) ∧
            (exit_self.empty == (exit_self.size == 0))) ∧
            (∀(i: int) ::
                ((0 <= i < param.index) ==>
                    (exit_self.elements[i] == entry_self.elements[i])))) ∧
            (∀(i: int) ::
                ((param.index <= i < exit_self.size) ==>
                    (exit_self.elements[i] == entry_self.elements[(i + 1)])))) ∧
            is_none(exit_self.elements[(entry_self.size - 1)])))
}