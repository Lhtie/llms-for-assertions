predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    ((ret == true) ∧
        (is_some(param.e) ==>
            any(lambda (v) = (v == param.e), exit_self.elements)))
}