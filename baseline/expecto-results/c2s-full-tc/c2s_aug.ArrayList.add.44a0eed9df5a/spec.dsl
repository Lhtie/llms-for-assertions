predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    ((exit_self.size >= entry_self.size) ∧
        (∃(i: int) ::
            ((0 <= i < exit_self.size) ∧
                (exit_self.elements[i] == param.e))))
}