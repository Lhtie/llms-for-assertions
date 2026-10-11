predicate spec(param: record[element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (is_some(param.element) ==>
        (ret == true))
}