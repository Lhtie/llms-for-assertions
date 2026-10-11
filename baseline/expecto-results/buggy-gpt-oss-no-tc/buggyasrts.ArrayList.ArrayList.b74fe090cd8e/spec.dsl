predicate spec(param: record[c: record[is_null: bool, size: int, empty: bool, elements: list[option[int]]]], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    ((¬ param.c.is_null) ==>
        (¬ equal_collections(param.c, exit_self)))
}

predicate equal_collections(src: record[is_null: bool, size: int, empty: bool, elements: list[option[int]]], dst: record[size: int, empty: bool, elements: list[option[int]]]) {
    var n: int = src.size;
    (((src.size == dst.size) ∧
        (src.empty == dst.empty)) ∧
        (∀(i: int) ::
            ((0 <= i < n) ==>
                option_eq(src.elements[i], dst.elements[i]))))
}

predicate option_eq(o1: option[int], o2: option[int]) {
    ((is_none(o1) ∧
        is_none(o2)) ∨
        ((is_some(o1) ∧
            is_some(o2)) ∧
            (unwrap(o1) == unwrap(o2))))
}