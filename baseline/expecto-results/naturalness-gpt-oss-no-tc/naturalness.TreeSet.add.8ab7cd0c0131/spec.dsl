predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (elem_in_elements(param.e, entry_self.elements) ==>
        (ret == false))
}

predicate elem_in_elements(e_opt: option[int], elems: list[option[int]]) {
    (is_some(e_opt) ∧
        (∃(i: int) ::
            (((0 <= i < len(elems)) ∧
                is_some(elems[i])) ∧
                (unwrap(elems[i]) == unwrap(e_opt)))))
}