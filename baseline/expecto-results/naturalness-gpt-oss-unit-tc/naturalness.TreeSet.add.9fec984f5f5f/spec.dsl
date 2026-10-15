predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (is_some(param.e) ∧
        (ret == (¬ element_in_set(entry_self.elements, unwrap(param.e)))))
}

predicate element_in_set(elements: list[option[int]], value: int) {
    (∃(i: int) ::
        (((0 <= i < len(elements)) ∧
            is_some(elements[i])) ∧
            (unwrap(elements[i]) == value)))
}