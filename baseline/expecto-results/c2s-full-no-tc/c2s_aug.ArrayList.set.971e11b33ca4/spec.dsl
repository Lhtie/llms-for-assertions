predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var sz: int = 
        entry_self.size;
    ((0 <= param.index < sz) ==>
        (ret == entry_self.elements[param.index]))
}