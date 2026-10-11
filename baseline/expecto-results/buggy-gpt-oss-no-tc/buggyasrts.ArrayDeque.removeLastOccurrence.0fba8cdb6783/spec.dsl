predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (element_present(entry_self.elements, param.o) ==>
        (ret == false))
}

predicate element_present(elements: list[option[int]], opt: option[int]) {
    (∃(i: int) ::
        ((0 <= i < len(elements)) ∧
            (elements[i] == opt)))
}