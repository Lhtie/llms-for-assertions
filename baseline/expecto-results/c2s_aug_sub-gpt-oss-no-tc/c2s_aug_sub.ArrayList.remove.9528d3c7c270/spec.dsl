predicate spec(param: record[index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var idx: int = param.index;
    var sz: int = 
        entry_self.size;
    var before: option[int] = 
        entry_self.elements[idx];
    ((0 <= idx < sz) ==>
        (ret == before))
}