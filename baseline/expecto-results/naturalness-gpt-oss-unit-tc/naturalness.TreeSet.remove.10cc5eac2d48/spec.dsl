predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    ((is_some(param.o) ∧
        (¬ any(lambda (x) = 
            (is_some(x) ∧
                (unwrap(x) == unwrap(param.o))), entry_self.elements))) ==>
        (ret == false))
}