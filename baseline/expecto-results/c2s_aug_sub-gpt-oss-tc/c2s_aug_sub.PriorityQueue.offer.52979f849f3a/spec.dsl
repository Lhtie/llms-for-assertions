predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (is_some(param.e) ==>
        (∃(i: int) ::
            ((0 <= i < len(exit_self.elements)) ∧
                (exit_self.elements[i] == param.e))))
}