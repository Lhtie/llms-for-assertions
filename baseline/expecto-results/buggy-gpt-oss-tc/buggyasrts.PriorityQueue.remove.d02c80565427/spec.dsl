predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    ((is_some(param.o) ∧
        contains_opt(param.o, entry_self.elements)) ==>
        ((ret == true) ∧
            (exit_self.size == (entry_self.size - 2))))
}

predicate contains_opt(val: option[int], lst: list[option[int]]) {
    (∃(i: int) ::
        ((0 <= i < len(lst)) ∧
            (lst[i] == val)))
}