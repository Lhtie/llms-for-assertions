predicate spec(param: record[i: int], entry_self: record[size: int, empty: bool, elements: list[int]], exit_self: record[size: int, empty: bool, elements: list[int]], ret: nonetype) {
    ((∃(k: int) ::
        ((((0 <= k < entry_self.size) ∧
            (entry_self.elements[k] == param.i)) ∧
            (exit_self.size == (entry_self.size - 1))) ∧
            (exit_self.elements == concat(substr(entry_self.elements, 0, k), substr(entry_self.elements, (k + 1), ((entry_self.size - k) -
                1)))))) ∨
        ((((∀(k: int) ::
            ((0 <= k < entry_self.size) ==>
                (entry_self.elements[k] != param.i))) ∧
            (exit_self.size == entry_self.size)) ∧
            (exit_self.elements == entry_self.elements)) ∧
            (exit_self.empty == (exit_self.size == 0))))
}