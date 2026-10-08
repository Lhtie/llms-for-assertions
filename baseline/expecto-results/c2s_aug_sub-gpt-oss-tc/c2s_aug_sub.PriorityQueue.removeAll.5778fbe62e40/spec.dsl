predicate spec(param: record[c: record[is_null: bool, size: int, empty: bool, elements: list[option[int]]]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (∀(i: int) ::
        ((0 <= i < len(exit_self.elements)) ==>
            (is_none(exit_self.elements[i]) ∨
                (∀(j: int) ::
                    ((0 <= j < len(param.c.elements)) ==>
                        (is_none(param.c.elements[j]) ∨
                            (unwrap(exit_self.elements[i]) != unwrap(param.c.elements[j]))))))))
}