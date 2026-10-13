predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    ((is_some(param.e) ∧
        elem_in_elements(param.e, entry_self.elements)) ==>
        (ret == false))
}

predicate elem_in_elements(val: option[int], lst: list[option[int]]) {
    (∃(i: int) ::
        ((0 <= i < len(lst)) ∧
            (lst[i] == val)))
}