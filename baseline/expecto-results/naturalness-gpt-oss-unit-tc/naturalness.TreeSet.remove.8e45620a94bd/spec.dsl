predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (ret == (is_some(param.o) ∧
        Contains(entry_self.elements, unwrap(param.o))))
}

predicate Contains(elements: list[option[int]], v: int) {
    (∃(i: int) ::
        ((0 <= i < len(elements)) ∧
            (is_some(elements[i]) ∧
                (unwrap(elements[i]) == v))))
}