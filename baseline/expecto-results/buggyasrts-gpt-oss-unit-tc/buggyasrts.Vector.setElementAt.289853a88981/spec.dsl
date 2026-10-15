predicate spec(param: record[obj: option[int], index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var idx: int = param.index;
    var before: list[option[int]] = 
        entry_self.elements;
    var after: list[option[int]] = 
        exit_self.elements;
    (∀(i: int) ::
        ((0 <= i <= idx) ==>
            (after[i] == before[i])))
}