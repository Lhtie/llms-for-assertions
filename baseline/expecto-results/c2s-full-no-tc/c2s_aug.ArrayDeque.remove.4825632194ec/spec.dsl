predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    ((is_some(param.o) ∧
        (∃(i: int) ::
            (((0 <= i < len(entry_self.elements)) ∧
                is_some(entry_self.elements[i])) ∧
                (unwrap(param.o) == unwrap(entry_self.elements[i]))))) ==>
        (ret == true))
}