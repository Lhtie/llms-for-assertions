predicate spec(param: record[initialCapacity: int], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements_null: list[bool]], ret: nonetype) {
    (valid_capacity(param.initialCapacity) ==>
        (exit_self.empty ∧
            (exit_self.size == 0)))
}

predicate valid_capacity(cap: int) {
    (cap >= 0)
}