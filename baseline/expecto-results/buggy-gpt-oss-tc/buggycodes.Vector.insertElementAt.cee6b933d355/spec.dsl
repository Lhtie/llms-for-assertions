predicate spec(param: record[obj: option[int], index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var oldSize: int = 
        entry_self.size;
    (((0 <= param.index) ∧
        (param.index <= oldSize)) ==>
        (∀(i: int) ::
            (((i >= param.index) ∧
                (i < oldSize)) ==>
                (exit_self.elements[(i + 1)] == entry_self.elements[i]))))
}