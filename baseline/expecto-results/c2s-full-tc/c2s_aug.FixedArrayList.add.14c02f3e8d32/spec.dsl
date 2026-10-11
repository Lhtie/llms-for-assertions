predicate spec(param: record[element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    ((is_some(param.element) ==>
        (ret == true)) ∧
        (is_some(param.element) ==>
            (∃(i: int) ::
                (((0 <= i < len(exit_self.elements)) ∧
                    (exit_self.elements[i] == param.element)) ∧
                    (∀(j: int) ::
                        (((0 <= j < len(entry_self.elements)) ∧
                            (j != i)) ==>
                            (exit_self.elements[j] == entry_self.elements[j])))))))
}