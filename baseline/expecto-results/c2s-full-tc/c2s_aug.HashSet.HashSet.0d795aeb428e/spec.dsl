predicate spec(param: record[initialCapacity: int], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    ((param.initialCapacity >= 0) ==>
        (((exit_self.size == 0) ∧
            (exit_self.empty == true)) ∧
            (len(exit_self.elements) == 0)))
}