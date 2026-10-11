predicate spec(param: record[obj: option[int], index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var idx: int = param.index;
    var obj_opt: option[int] = 
        param.obj;
    var oldSize: int = 
        entry_self.size;
    ((0 <= idx <= oldSize) ==>
        (exit_self.elements[idx] == obj_opt))
}