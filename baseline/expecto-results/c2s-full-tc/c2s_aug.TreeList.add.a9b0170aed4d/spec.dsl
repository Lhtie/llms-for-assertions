predicate spec(param: record[index: int, obj: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var idx: int = param.index;
    var added: option[int] = 
        param.obj;
    ((0 <= idx <= entry_self.size) ==>
        (exit_self.elements[idx] == added))
}