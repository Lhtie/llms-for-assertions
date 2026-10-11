predicate spec(param: record[c: record[is_null: bool, size: int, empty: bool, elements: list[option[int]]]], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]], equals_c: bool], ret: nonetype) {
    ((¬ param.c.is_null) ==>
        (∀(i: int) ::
            (((0 <= i < len(param.c.elements)) ∧
                is_some(param.c.elements[i])) ==>
                contains_elem(exit_self.elements, unwrap(param.c.elements[i])))))
}

predicate contains_elem(elems: list[option[int]], v: int) {
    (∃(i: int) ::
        (((0 <= i < len(elems)) ∧
            is_some(elems[i])) ∧
            (unwrap(elems[i]) == v)))
}