predicate spec(param: record[obj: option[int], index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var idx: int = param.index;
    var oldSize: int = 
        entry_self.size;
    (∀(i: int) ::
        ((idx <= i < oldSize) ==>
            (exit_self.elements[i] == entry_self.elements[i])))
}