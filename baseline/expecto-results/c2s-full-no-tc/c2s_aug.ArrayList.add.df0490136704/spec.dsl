predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var idx: int = param.index;
    var oldSize: int = 
        entry_self.size;
    var oldElems: list[option[int]] = 
        entry_self.elements;
    var newElems: list[option[int]] = 
        exit_self.elements;
    (((0 <= idx) ∧
        (idx <= oldSize)) ==>
        (∀(i: int) ::
            (((idx <= i) ∧
                (i < oldSize)) ==>
                (newElems[(i + 1)] == oldElems[i]))))
}