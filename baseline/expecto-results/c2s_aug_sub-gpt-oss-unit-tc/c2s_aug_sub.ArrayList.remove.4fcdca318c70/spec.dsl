predicate spec(param: record[index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    (((0 <= param.index) ∧
        (param.index < entry_self.size)) ==>
        ((((∀(i: int) ::
            ((0 <= i < param.index) ==>
                (exit_self.elements[i] == entry_self.elements[i]))) ∧
            (∀(i: int) ::
                ((param.index <= i < exit_self.size) ==>
                    (exit_self.elements[i] == entry_self.elements[(i + 1)])))) ∧
            (ret == entry_self.elements[param.index])) ∧
            (exit_self.size == (entry_self.size - 1))))
}