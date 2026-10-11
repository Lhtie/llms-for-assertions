predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    ((entry_self.size <= exit_self.size) ∧
        (exit_self.size <= (entry_self.size + 1)))
}