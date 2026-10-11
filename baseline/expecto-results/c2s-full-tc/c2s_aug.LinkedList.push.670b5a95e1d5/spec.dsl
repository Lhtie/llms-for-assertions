predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var pushed: option[int] = 
        param.e;
    var first_after: option[int] = 
        exit_self.elements[0];
    ((len(exit_self.elements) > 0) ==>
        (first_after == pushed))
}