predicate spec(param: record[element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (ret ∧
        (is_some(param.element) ==>
            (∃(i: int) ::
                ((((0 <= i < len(exit_self.elements)) ∧
                    (exit_self.elements[i] == param.element)) ∧
                    ((i == entry_self.size) ∨
                        (entry_self.elements[i] == None))) ∧
                    unchanged_except(entry_self, exit_self, i)))))
}

predicate unchanged_except(entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], idx: int) {
    (((len(exit_self.elements) == len(entry_self.elements)) ∨
        ((len(exit_self.elements) == (len(entry_self.elements) +
            1)) ∧
            (idx == len(entry_self.elements)))) ∧
        (∀(j: int) ::
            (((0 <= j < len(entry_self.elements)) ∧
                (j != idx)) ==>
                (exit_self.elements[j] == entry_self.elements[j]))))
}