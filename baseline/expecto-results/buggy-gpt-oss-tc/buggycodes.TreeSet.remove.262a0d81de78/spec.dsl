predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    ((is_some(param.o) ∧
        element_present(entry_self.elements, unwrap(param.o))) ==>
        ((exit_self.size == (entry_self.size - 1)) ∧
            (ret == true)))
}

predicate element_present(elements: list[option[int]], val: int) {
    any(lambda (e) = 
        (is_some(e) ∧
            (unwrap(e) == val)), elements)
}