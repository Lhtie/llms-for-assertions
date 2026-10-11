predicate spec(param: record[initialSize: int], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    ((param.initialSize >= 0) ==>
        ((exit_self.empty == true) ∧
            (exit_self.size == 0)))
}