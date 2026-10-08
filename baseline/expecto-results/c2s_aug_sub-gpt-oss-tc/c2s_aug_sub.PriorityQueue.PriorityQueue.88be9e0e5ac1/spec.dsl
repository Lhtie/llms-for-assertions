predicate spec(param: record[c: record[is_null: bool, size: int, empty: bool, elements: list[option[int]]]], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    ((¬ param.c.is_null) ==>
        (∀(i: int) ::
            ((0 <= i < len(param.c.elements)) ==>
                (is_some(param.c.elements[i]) ==>
                    (∃(j: int) ::
                        (((0 <= j < len(exit_self.elements)) ∧
                            is_some(exit_self.elements[j])) ∧
                            (unwrap(param.c.elements[i]) == unwrap(exit_self.elements[j]))))))))
}