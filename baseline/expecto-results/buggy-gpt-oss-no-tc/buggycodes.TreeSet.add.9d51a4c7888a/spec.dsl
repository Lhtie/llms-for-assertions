predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    var e_opt: option[int] = 
        param.e;
    var before: list[option[int]] = 
        entry_self.elements;
    var after: list[option[int]] = 
        exit_self.elements;
    var r: bool = ret;
    ((r == (¬ contains_elem(e_opt, before))) ∧
        (r ==>
            contains_elem(e_opt, after)))
}

predicate contains_elem(x: option[int], lst: list[option[int]]) {
    var n: int = len(lst);
    (∃(i: int) ::
        ((0 <= i < n) ∧
            (lst[i] == x)))
}