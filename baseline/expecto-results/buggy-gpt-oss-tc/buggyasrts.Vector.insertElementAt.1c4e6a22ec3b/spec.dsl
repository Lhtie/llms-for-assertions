predicate spec(param: record[obj: option[int], index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var i: int = param.index;
    var sz: int = 
        entry_self.size;
    ((0 <= i <= sz) ==>
        (exit_self.elements[(i + 1)] == param.obj))
}