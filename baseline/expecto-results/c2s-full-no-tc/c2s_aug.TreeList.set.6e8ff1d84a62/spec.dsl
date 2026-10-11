predicate spec(param: record[index: int, obj: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var idx: int = param.index;
    var sz: int = 
        entry_self.size;
    ((0 <= idx < sz) ==>
        (∀(i: int) ::
            ((0 <= i < idx) ==>
                (exit_self.elements[i] == entry_self.elements[i]))))
}