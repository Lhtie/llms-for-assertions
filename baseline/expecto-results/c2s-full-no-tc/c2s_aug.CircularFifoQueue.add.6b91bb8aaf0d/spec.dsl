predicate spec(param: record[element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    ((ret == true) ∧
        (∃(idx: int) ::
            ((((0 <= idx < len(exit_self.elements)) ∧
                (exit_self.elements[idx] == param.element)) ∧
                (∀(i: int) ::
                    ((idx < i < len(exit_self.elements)) ==>
                        (exit_self.elements[i] == None)))) ∧
                (∀(j: int) ::
                    ((0 <= j < idx) ==>
                        (exit_self.elements[j] == entry_self.elements[j]))))))
}