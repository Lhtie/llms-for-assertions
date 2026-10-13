predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    ((∀(i: int) ::
        ((0 <= i < len(entry_self.elements)) ==>
            is_none(entry_self.elements[i]))) ==>
        ((ret == None) ∧
            (∃(v: int) ::
                (MinOf(entry_self.elements, v) ∧
                    (ret == some(v))))))
}

predicate MinOf(elements: list[option[int]], v: int) {
    ((∃(i: int) ::
        (((0 <= i < len(elements)) ∧
            is_some(elements[i])) ∧
            (unwrap(elements[i]) == v))) ∧
        (∀(j: int) ::
            (((0 <= j < len(elements)) ∧
                is_some(elements[j])) ==>
                (v <= unwrap(elements[j])))))
}