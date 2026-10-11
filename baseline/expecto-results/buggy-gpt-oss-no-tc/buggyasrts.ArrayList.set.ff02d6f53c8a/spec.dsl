predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var idx: int = param.index;
    var el: option[int] = 
        param.element;
    var sz: int = 
        entry_self.size;
    ((0 <= idx < sz) ==>
        (ret == el))
}