predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    var present: bool = 
        contains_element(param.o, entry_self.elements);
    (present ==>
        ((exit_self.size == (entry_self.size - 2)) ∧
            (ret == true)))
}

predicate contains_element(o: option[int], elems: list[option[int]]) {
    (is_some(o) ∧
        (∃(i: int) ::
            (((0 <= i < len(elems)) ∧
                is_some(elems[i])) ∧
                (unwrap(o) == unwrap(elems[i])))))
}