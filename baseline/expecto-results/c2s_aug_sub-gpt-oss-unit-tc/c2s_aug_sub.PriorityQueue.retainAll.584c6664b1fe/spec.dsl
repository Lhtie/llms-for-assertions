predicate contains_in_c(val: int, col: record[is_null: bool, size: int, empty: bool, elements: list[option[int]]]) {
    (∃(k: int) ::
        (((0 <= k < len(col.elements)) ∧
            is_some(col.elements[k])) ∧
            (unwrap(col.elements[k]) == val)))
}

predicate spec(param: record[c: record[is_null: bool, size: int, empty: bool, elements: list[option[int]]]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (∀(i: int) ::
        ((0 <= i < len(exit_self.elements)) ==>
            (is_some(exit_self.elements[i]) ==>
                contains_in_c(unwrap(exit_self.elements[i]), param.c))))
}