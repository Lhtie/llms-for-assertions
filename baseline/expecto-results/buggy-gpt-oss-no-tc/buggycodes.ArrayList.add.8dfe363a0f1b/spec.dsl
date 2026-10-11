predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var oldSize: int = 
        entry_self.size;
    var idx: int = param.index;
    ((0 <= idx <= oldSize) ==>
        (∀(i: int) ::
            ((idx <= i < oldSize) ==>
                (exit_self.elements[(i + 1)] == entry_self.elements[i]))))
}