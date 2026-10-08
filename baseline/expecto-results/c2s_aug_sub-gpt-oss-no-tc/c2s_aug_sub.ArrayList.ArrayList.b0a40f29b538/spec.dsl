predicate spec(param: record[c: record[is_null: bool, size: int, empty: bool, elements: list[option[int]]]], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    (param.c.is_null ∨
        (∀(i: int) ::
            (((0 <= i < exit_self.size) ∧
                (i < param.c.size)) ==>
                (exit_self.elements[i] == param.c.elements[i]))))
}