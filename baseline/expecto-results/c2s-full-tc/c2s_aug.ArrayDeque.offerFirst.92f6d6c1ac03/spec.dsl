predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (is_some(param.e) ==>
        Contains(exit_self.elements, param.e))
}

predicate Contains(lst: list[option[int]], v: option[int]) {
    (∃(i: int) ::
        ((0 <= i < len(lst)) ∧
            (lst[i] == v)))
}