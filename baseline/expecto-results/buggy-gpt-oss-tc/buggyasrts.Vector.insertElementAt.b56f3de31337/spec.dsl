predicate spec(param: record[obj: option[int], index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var obj: option[int] = 
        param.obj;
    var idx: int = param.index;
    var valid: bool = 
        ((0 <= idx) ∧
            (idx <= entry_self.size));
    (valid ==>
        (exit_self.elements[(idx + 1)] == obj))
}