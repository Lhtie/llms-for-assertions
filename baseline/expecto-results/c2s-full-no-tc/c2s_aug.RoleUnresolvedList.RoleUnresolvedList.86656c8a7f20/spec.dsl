predicate spec(param: record[initialCapacity: int], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements_null: list[bool]], ret: nonetype) {
    ((param.initialCapacity >= 0) ==>
        ((exit_self.size == 0) ∧
            exit_self.empty))
}