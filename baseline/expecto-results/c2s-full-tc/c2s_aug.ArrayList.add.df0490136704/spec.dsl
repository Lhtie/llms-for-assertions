predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    (((0 <= param.index) ∧
        (param.index <= entry_self.size)) ==>
        (∀(i: int) ::
            (((param.index <= i) ∧
                (i < entry_self.size)) ==>
                ((is_none(exit_self.elements[(i + 1)]) ∧
                    is_none(entry_self.elements[i])) ∨
                    (exit_self.elements[(i + 1)] == entry_self.elements[i])))))
}