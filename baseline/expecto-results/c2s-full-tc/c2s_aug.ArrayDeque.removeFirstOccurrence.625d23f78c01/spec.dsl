predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    ((is_some(param.o) ∧
        contains_val(entry_self.elements, unwrap(param.o))) ==>
        ret)
}

predicate contains_val(elements: list[option[int]], v: int) {
    (∃(i: int) ::
        (((0 <= i < len(elements)) ∧
            is_some(elements[i])) ∧
            (unwrap(elements[i]) == v)))
}