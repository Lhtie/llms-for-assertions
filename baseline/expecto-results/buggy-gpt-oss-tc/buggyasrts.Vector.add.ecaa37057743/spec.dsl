predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    ((is_some(param.e) ∧
        is_some(exit_self.elements[0])) ∧
        (unwrap(param.e) == unwrap(exit_self.elements[0])))
}