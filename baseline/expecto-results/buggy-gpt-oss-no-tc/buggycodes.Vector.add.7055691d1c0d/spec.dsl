predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var idx: int = param.index;
    var oldSize: int = 
        entry_self.size;
    (((0 <= idx) ∧
        (idx <= oldSize)) ==>
        (∀(i: int) ::
            (((0 <= i < oldSize) ∧
                (i >= idx)) ==>
                (exit_self.elements[(i + 1)] == entry_self.elements[i]))))
}