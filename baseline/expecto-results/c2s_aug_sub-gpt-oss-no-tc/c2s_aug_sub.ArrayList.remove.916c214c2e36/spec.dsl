predicate spec(param: record[index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var idx: int = param.index;
    var oldSize: int = 
        entry_self.size;
    ((0 <= idx < oldSize) ==>
        (∀(i: int) ::
            ((0 <= i < idx) ==>
                (entry_self.elements[i] == exit_self.elements[i]))))
}