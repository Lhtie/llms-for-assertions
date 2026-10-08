predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (ret == (¬ contains_element(param.e, entry_self.elements)))
}

predicate contains_element(e: option[int], elems: list[option[int]]) {
    var n: int = len(elems);
    (is_some(e) ∧
        (∃(i: int) ::
            ((0 <= i < n) ∧
                (is_some(elems[i]) ∧
                    (unwrap(e) == unwrap(elems[i]))))))
}