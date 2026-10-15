predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    (is_none(ret) ∨
        (∃(v: int) ::
            ((is_some(ret) ∧
                (unwrap(ret) == v)) ∧
                IsLast(entry_self, v))))
}

predicate IsLast(entry: record[size: int, empty: bool, elements: list[option[int]]], v: int) {
    ((∃(i: int) ::
        ((0 <= i < len(entry.elements)) ∧
            (is_some(entry.elements[i]) ∧
                (unwrap(entry.elements[i]) == v)))) ∧
        (∀(j: int) ::
            (((0 <= j < len(entry.elements)) ∧
                is_some(entry.elements[j])) ==>
                (unwrap(entry.elements[j]) <= v))))
}