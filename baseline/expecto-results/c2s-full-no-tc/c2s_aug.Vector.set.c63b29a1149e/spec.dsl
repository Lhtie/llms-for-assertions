predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var idx: int = param.index;
    var oldElems: list[option[int]] = 
        entry_self.elements;
    var newElems: list[option[int]] = 
        exit_self.elements;
    ((0 <= idx < entry_self.size) ==>
        (∀(i: int) ::
            ((0 <= i < idx) ==>
                (newElems[i] == oldElems[i]))))
}