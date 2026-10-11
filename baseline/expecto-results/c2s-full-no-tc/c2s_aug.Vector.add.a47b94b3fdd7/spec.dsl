predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    ((0 <= param.index <= entry_self.size) ==>
        ((((exit_self.elements[param.index] == param.element) ∧
            (exit_self.size == (entry_self.size + 1))) ∧
            (¬ exit_self.empty)) ∧
            (∀(k: int) ::
                ((0 <= k < param.index) ==>
                    ((exit_self.elements[k] == entry_self.elements[k]) ∧
                        (∀(k: int) ::
                            ((param.index < k < exit_self.size) ==>
                                (exit_self.elements[k] == entry_self.elements[(k - 1)]))))))))
}