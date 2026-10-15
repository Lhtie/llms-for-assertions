predicate spec(param: record[obj: option[int], index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var idx: int = param.index;
    var new_elem: option[int] = 
        param.obj;
    (∀(i: int) ::
        ((0 <= i < idx) ==>
            ((exit_self.elements[i] == entry_self.elements[i]) ∧
                (exit_self.elements[idx] == new_elem))))
}