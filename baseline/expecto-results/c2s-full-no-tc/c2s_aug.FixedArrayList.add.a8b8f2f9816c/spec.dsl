predicate spec(param: record[element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    var n: int = 
        len(exit_self.elements);
    (is_some(param.element) ==>
        (∃(i: int) ::
            ((0 <= i < n) ∧
                (exit_self.elements[i] == param.element))))
}