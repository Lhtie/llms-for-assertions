predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var last_idx: int = 
        (exit_self.size - 1);
    ((exit_self.size > 0) ==>
        (exit_self.elements[last_idx] == param.e))
}