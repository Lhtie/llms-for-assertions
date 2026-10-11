predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    var e_opt: option[int] = 
        param.e;
    (is_some(e_opt) ==>
        (ret == false))
}