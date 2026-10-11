predicate spec(param: record[c: record[is_null: bool, size: int, empty: bool, elements: list[option[int]]]], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    ((¬ param.c.is_null) ==>
        (¬ same_collection(param.c, exit_self)))
}

predicate same_collection(src: record[is_null: bool, size: int, empty: bool, elements: list[option[int]]], dst: record[size: int, empty: bool, elements: list[option[int]]]) {
    var n: int = src.size;
    ((((n == dst.size) ∧
        (src.empty == dst.empty)) ∧
        (len(src.elements) == len(dst.elements))) ∧
        (∀(i: int) ::
            ((0 <= i < n) ==>
                option_eq(src.elements[i], dst.elements[i]))))
}

predicate option_eq(a: option[int], b: option[int]) {
    (((is_some(a) ∧ is_some(b)) ∧
        (unwrap(a) == unwrap(b))) ∨
        (is_none(a) ∧ is_none(b)))
}