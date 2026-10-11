predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (present(param.o, entry_self.elements, entry_self.size) ==>
        (ret == true))
}

predicate present(o: option[int], elems: list[option[int]], size: int) {
    (is_some(o) ∧
        (∃(i: int) ::
            ((0 <= i < size) ∧
                (elems[i] == o))))
}