predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (ret == Contains(entry_self.elements, param.o))
}

predicate Contains(elems: list[option[int]], val: option[int]) {
    var n: int = len(elems);
    (is_some(val) ∧
        (∃(i: int) ::
            (((0 <= i < n) ∧
                is_some(elems[i])) ∧
                (unwrap(elems[i]) == unwrap(val)))))
}