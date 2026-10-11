predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var idx: int = param.index;
    var sz: int = 
        entry_self.size;
    var before: list[option[int]] = 
        entry_self.elements;
    var after: list[option[int]] = 
        exit_self.elements;
    ((0 <= idx < sz) ==>
        (∀(i: int) ::
            ((0 <= i < idx) ==>
                (after[i] == before[i]))))
}