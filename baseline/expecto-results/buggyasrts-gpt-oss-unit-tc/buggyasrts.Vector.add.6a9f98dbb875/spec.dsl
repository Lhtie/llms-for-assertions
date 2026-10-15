predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var i: int = param.index;
    var v: option[int] = 
        param.element;
    ((0 <= i <= entry_self.size) ==>
        (exit_self.elements[(i + 1)] == v))
}