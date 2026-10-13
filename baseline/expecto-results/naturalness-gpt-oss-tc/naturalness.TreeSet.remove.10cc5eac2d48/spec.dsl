predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    ((is_some(param.o) ∧
        (¬ elem_in(entry_self.elements, unwrap(param.o)))) ==>
        (ret == false))
}

predicate elem_in(elements: list[option[int]], v: int) {
    (∃(i: int) ::
        ((0 <= i < len(elements)) ∧
            (elements[i] == some(v))))
}