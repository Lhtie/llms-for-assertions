predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var idx: int = param.index;
    var oldSize: int = 
        entry_self.size;
    var newSize: int = 
        exit_self.size;
    ((0 <= idx <= oldSize) ==>
        (((∀(i: int) ::
            ((0 <= i < idx) ==>
                (exit_self.elements[i] == entry_self.elements[i]))) ∧
            (∀(i: int) ::
                ((idx <= i < oldSize) ==>
                    (exit_self.elements[(i + 1)] == entry_self.elements[i])))) ∧
            (newSize == (oldSize + 1))))
}