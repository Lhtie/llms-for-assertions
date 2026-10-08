predicate spec(param: record[c: record[is_null: bool, size: int, empty: bool, elements: list[option[int]]]], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    ((¬ param.c.is_null) ==>
        ((exit_self.size == param.c.size) ∧
            (len(exit_self.elements) == param.c.size)))
}