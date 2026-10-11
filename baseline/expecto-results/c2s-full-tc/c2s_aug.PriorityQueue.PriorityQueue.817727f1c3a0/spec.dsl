predicate spec(param: record[initialCapacity: int, comparator: record[is_null: bool]], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    ((param.initialCapacity >= 1) ==>
        (((exit_self.empty == true) ∧
            (exit_self.size == 0)) ∧
            all(lambda (e) = is_none(e), exit_self.elements)))
}