predicate spec(param: record[index: int, object: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var idx: int = param.index;
    var obj: option[int] = 
        param.object;
    (((0 <= idx) ∧
        (idx <= entry_self.size)) ==>
        (is_some(obj) ==>
            (exit_self.elements[idx] == obj)))
}