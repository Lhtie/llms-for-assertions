predicate contains(lst: list[option[int]], val: option[int]) {
    (∃(i: int) ::
        ((0 <= i < len(lst)) ∧
            (lst[i] == val)))
}

predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (contains(entry_self.elements, param.o) ==>
        (ret == true))
}