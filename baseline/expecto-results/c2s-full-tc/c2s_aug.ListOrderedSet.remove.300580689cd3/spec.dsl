predicate spec(param: record[index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var oldSize: int = 
        entry_self.size;
    var newSize: int = 
        exit_self.size;
    var idx: int = param.index;
    ((0 <= idx < oldSize) ==>
        (∀(i: int) ::
            ((idx <= i < newSize) ==>
                (exit_self.elements[i] == entry_self.elements[(i + 1)]))))
}