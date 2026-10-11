predicate spec(param: record[index: int, obj: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var n: int = 
        entry_self.size;
    ((0 <= param.index < n) ==>
        (∀(i: int) ::
            (((i > param.index) ∧
                (i < n)) ==>
                (exit_self.elements[i] == entry_self.elements[i]))))
}