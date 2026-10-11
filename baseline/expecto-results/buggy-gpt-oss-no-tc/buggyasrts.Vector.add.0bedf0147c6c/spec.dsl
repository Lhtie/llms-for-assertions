predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var idx: int = param.index;
    var before: list[option[int]] = 
        entry_self.elements;
    var after: list[option[int]] = 
        exit_self.elements;
    same_elements_from(idx, before, after)
}

predicate same_elements_from(start: int, lst_before: list[option[int]], lst_after: list[option[int]]) {
    (∀(i: int) ::
        (((0 <= i < len(lst_before)) ∧
            (start <= i)) ==>
            (lst_before[i] == lst_after[i])))
}