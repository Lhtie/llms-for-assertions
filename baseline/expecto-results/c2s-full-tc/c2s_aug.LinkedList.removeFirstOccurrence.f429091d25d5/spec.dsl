predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (contains_option(entry_self.elements, param.o) ==>
        ret)
}

predicate contains_option(lst: list[option[int]], val: option[int]) {
    var n: int = len(lst);
    (∃(i: int) ::
        ((0 <= i < n) ∧
            (lst[i] == val)))
}