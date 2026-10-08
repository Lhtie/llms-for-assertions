predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (is_some(param.e) ==>
        set_is_subset(list2set(map(lambda (x) = unwrap(x), filter(lambda (x) = is_some(x), entry_self.elements))), list2set(map(lambda (x) = unwrap(x), filter(lambda (x) = is_some(x), exit_self.elements)))))
}