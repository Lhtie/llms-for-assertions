predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    (is_some(ret) ==>
        (¬ belongs_to_set(unwrap(ret), exit_self.elements)))
}

predicate belongs_to_set(v: int, elems: list[option[int]]) {
    var n: int = len(elems);
    (∃(i: int) ::
        ((0 <= i < n) ∧
            (elems[i] == some(v))))
}