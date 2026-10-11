predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var idx: int = param.index;
    var elem: option[int] = 
        param.element;
    var oldSize: int = 
        entry_self.size;
    ((0 <= idx <= oldSize) ==>
        (exit_self.elements[idx] == elem))
}