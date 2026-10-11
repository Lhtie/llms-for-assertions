predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    var last_idx: int = 
        (len(exit_self.elements) -
            1);
    (exit_self.elements[last_idx] == param.e)
}