predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    ((is_none(param.o) ==> true) ∧
        (is_some(param.o) ==>
            (¬ contains_element(exit_self, unwrap(param.o)))))
}

predicate contains_element(s: record[size: int, empty: bool, elements: list[option[int]]], v: int) {
    (∃(i: int) ::
        ((0 <= i < len(s.elements)) ∧
            (is_some(s.elements[i]) ∧
                (unwrap(s.elements[i]) == v))))
}