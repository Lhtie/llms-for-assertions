predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    ((0 <= param.index < entry_self.size) ==>
        ((((ret == param.element) ∧
            (exit_self.size == entry_self.size)) ∧
            (exit_self.empty == entry_self.empty)) ∧
            (∀(k: int) ::
                ((0 <= k < entry_self.size) ==>
                    (((k == param.index) ==>
                        ((exit_self.elements[k] == param.element) ∧
                            (k != param.index))) ==>
                        (exit_self.elements[k] == entry_self.elements[k]))))))
}