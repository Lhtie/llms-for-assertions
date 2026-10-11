predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var n: int = 
        entry_self.size;
    ((0 <= param.index < n) ==>
        (∀(k: int) ::
            (((k > param.index) ∧
                (k < n)) ==>
                (exit_self.elements[k] == entry_self.elements[k]))))
}