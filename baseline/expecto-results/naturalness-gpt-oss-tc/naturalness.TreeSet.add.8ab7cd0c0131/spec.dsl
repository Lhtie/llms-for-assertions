predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    ((is_some(param.e) ∧
        contains_option(param.e, entry_self.elements)) ==>
        (ret == false))
}

predicate contains_option(e: option[int], lst: list[option[int]]) {
    (∃(i: int) ::
        ((0 <= i < len(lst)) ∧
            (lst[i] == e)))
}