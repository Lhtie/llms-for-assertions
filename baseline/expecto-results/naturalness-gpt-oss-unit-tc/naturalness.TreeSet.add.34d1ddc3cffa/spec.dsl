predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (is_some(param.e) ==>
        (ret == (any(lambda (opt) = 
            (is_some(opt) ∧
                (unwrap(opt) == unwrap(param.e))), entry_self.elements) ==>
            false)))
}