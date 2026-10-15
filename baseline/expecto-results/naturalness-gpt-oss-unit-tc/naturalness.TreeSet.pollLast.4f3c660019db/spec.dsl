predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    (is_some(ret) ==>
        (¬ any(lambda (x) = 
            (is_some(x) ∧
                (unwrap(x) == unwrap(ret))), exit_self.elements)))
}