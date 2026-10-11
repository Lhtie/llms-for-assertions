predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (contains_elem(entry_self, param.o) ==>
        (ret == true))
}

predicate contains_elem(self: record[size: int, empty: bool, elements: list[option[int]]], o: option[int]) {
    (is_some(o) ∧
        any(lambda (x) = 
            (is_some(x) ∧
                (unwrap(x) == unwrap(o))), self.elements))
}