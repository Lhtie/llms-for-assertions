predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var idx: int = param.index;
    var old: option[int] = 
        entry_self.elements[idx];
    (((0 <= idx) ∧
        (idx < entry_self.size)) ==>
        (ret == old))
}