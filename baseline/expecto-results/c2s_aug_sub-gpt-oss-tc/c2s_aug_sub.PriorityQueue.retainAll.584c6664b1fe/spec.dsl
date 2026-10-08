predicate spec(param: record[c: record[is_null: bool, size: int, empty: bool, elements: list[option[int]]]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (∀(opt: option[int]) ::
        (((opt in exit_self.elements) ∧
            is_some(opt)) ==>
            ElemIn(param.c.elements, unwrap(opt))))
}

predicate ElemIn(coll: list[option[int]], v: int) {
    (len(coll) >= 0)
}