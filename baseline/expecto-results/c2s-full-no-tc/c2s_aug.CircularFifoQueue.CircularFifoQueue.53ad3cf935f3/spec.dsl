predicate spec(param: record[], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    (exit_self.empty ∧
        (exit_self.size == 0))
}