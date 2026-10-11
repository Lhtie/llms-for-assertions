predicate spec(param: record[initialCapacity: int, capacityIncrement: int], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    (((param.initialCapacity >= 0) ∧
        (param.capacityIncrement >= 0)) ==>
        (exit_self.empty ∧
            (exit_self.size == 0)))
}