predicate spec(param: record[obj: option[int], index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var idx: int = param.index;
    var objv: option[int] = 
        param.obj;
    (((0 <= idx) ∧
        (idx <= entry_self.size)) ==>
        (exit_self.elements[idx] == objv))
}