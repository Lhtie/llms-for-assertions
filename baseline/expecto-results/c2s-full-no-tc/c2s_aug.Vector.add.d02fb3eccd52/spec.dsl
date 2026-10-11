predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var idx: int = param.index;
    var size: int = 
        entry_self.size;
    var entry_elems: list[option[int]] = 
        entry_self.elements;
    var exit_elems: list[option[int]] = 
        exit_self.elements;
    ((0 <= idx <= size) ==>
        (∀(i: int) ::
            ((0 <= i < idx) ==>
                (entry_elems[i] == exit_elems[i]))))
}