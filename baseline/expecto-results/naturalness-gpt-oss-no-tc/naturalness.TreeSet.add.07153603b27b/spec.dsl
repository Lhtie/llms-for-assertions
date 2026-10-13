predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (is_some(param.e) ==>
        contains_option(exit_self.elements, param.e))
}

predicate contains_option(elements: list[option[int]], val: option[int]) {
    (∃(i: int) ::
        ((0 <= i < len(elements)) ∧
            (elements[i] == val)))
}