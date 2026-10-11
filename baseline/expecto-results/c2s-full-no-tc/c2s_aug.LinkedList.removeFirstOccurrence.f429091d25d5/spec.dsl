predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (contains_opt(entry_self.elements, param.o) ==>
        ret)
}

predicate contains_opt(elems: list[option[int]], opt: option[int]) {
    var len_e: int = len(elems);
    (∃(i: int) ::
        ((0 <= i < len_e) ∧
            (elems[i] == opt)))
}