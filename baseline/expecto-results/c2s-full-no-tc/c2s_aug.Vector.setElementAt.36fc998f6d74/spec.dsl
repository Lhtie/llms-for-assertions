predicate spec(param: record[obj: option[int], index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var sz: int = 
        entry_self.size;
    ((0 <= param.index < sz) ==>
        (∀(i: int) ::
            (((param.index < i) ∧
                (i < sz)) ==>
                (exit_self.elements[i] == entry_self.elements[i]))))
}