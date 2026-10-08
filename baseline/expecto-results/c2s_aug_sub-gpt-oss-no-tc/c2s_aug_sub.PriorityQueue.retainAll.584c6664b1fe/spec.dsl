predicate spec(param: record[c: record[is_null: bool, size: int, empty: bool, elements: list[option[int]]]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (∀(i: int) ::
        ((0 <= i < len(exit_self.elements)) ==>
            (is_some(exit_self.elements[i]) ==>
                contains_element(param.c, unwrap(exit_self.elements[i])))))
}

predicate contains_element(coll: record[is_null: bool, size: int, empty: bool, elements: list[option[int]]], v: int) {
    var len_e: int = 
        len(coll.elements);
    (∃(i: int) ::
        (((0 <= i < len_e) ∧
            is_some(coll.elements[i])) ∧
            (unwrap(coll.elements[i]) == v)))
}