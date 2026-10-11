predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    ((ret == false) <==>
        (¬ present_in(entry_self.elements, param.e)))
}

predicate present_in(elems: list[option[int]], v: option[int]) {
    var n: int = len(elems);
    (∃(i: int) ::
        ((0 <= i < n) ∧
            (elems[i] == v)))
}