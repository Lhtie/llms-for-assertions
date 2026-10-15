predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (NotContains(entry_self.elements, param.e) ==>
        ((((ret == false) ∧
            (exit_self.size == entry_self.size)) ∧
            (exit_self.empty == entry_self.empty)) ∧
            (exit_self.elements == entry_self.elements)))
}

predicate NotContains(elements: list[option[int]], e: option[int]) {
    (∀(i: int) ::
        ((0 <= i < len(elements)) ==>
            (elements[i] != e)))
}