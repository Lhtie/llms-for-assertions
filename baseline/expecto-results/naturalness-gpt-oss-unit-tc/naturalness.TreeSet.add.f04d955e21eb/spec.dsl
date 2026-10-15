predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (ret == (is_some(param.e) ∧
        (¬ (∃(i: int) ::
            (((0 <= i < len(entry_self.elements)) ∧
                is_some(entry_self.elements[i])) ∧
                (unwrap(entry_self.elements[i]) == unwrap(param.e)))))))
}