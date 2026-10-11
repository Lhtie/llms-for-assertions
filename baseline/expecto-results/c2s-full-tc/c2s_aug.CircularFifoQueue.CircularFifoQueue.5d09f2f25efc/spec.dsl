predicate spec(param: record[size: int], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    ((param.size >= 1) ==>
        exit_self.empty)
}