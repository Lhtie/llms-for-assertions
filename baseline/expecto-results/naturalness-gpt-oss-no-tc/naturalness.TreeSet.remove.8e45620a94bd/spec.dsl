predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    ((is_some(param.o) ∧
        Contains(entry_self.elements, unwrap(param.o))) ==>
        (ret == true))
}

predicate Contains(elements: list[option[int]], v: int) {
    any(lambda (x) = 
        (is_some(x) ∧
            (unwrap(x) == v)), elements)
}