predicate IsEmpty(coll: record[size: int, empty: bool, elements: list[option[int]]]) {
    (coll.empty ∧
        (coll.size == 0))
}

predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    IsEmpty(exit_self)
}