predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var idx: int = param.index;
    var oldSize: int = 
        entry_self.size;
    var newSize: int = 
        exit_self.size;
    (((0 <= idx) ∧
        (idx <= oldSize)) ==>
        (∀(i: int) ::
            (((idx <= i) ∧
                (i < oldSize)) ==>
                ((is_none(exit_self.elements[(i + 1)]) ∧
                    is_none(entry_self.elements[i])) ∨
                    (exit_self.elements[(i + 1)] == entry_self.elements[i])))))
}