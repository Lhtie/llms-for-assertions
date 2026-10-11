predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    (((0 <= param.index) ∧
        (param.index <= entry_self.size)) ==>
        (∀(k: int) ::
            (((0 <= k < entry_self.size) ∧
                (k >= param.index)) ==>
                (exit_self.elements[(k + 1)] == entry_self.elements[k]))))
}