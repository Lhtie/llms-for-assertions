predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    (((0 <= param.index) ∧
        (param.index < entry_self.size)) ==>
        (∀(i: int) ::
            ((0 <= i < param.index) ==>
                (exit_self.elements[i] == entry_self.elements[i]))))
}