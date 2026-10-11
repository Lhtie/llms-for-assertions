predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (((((ret == true) ∧
        (exit_self.size == (entry_self.size + 1))) ∧
        (exit_self.empty == false)) ∧
        (∀(i: int) ::
            ((0 <= i < entry_self.size) ==>
                (exit_self.elements[i] == entry_self.elements[i])))) ∧
        list_contains(exit_self.elements, param.e))
}

predicate list_contains(lst: list[option[int]], elem: option[int]) {
    (∃(i: int) ::
        ((0 <= i < len(lst)) ∧
            (lst[i] == elem)))
}