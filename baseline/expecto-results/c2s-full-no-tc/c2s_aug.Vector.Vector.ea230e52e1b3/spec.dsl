predicate spec(param: record[c: record[is_null: bool, size: int, empty: bool, elements: list[option[int]]]], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]], equals_c: bool], ret: nonetype) {
    ((¬ param.c.is_null) ==>
        ((exit_self.size == param.c.size) ∧
            (∀(i: int) ::
                ((0 <= i < param.c.size) ==>
                    (exit_self.elements[i] == param.c.elements[i])))))
}