predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (((entry_self.empty == false) ∧
        (ret == true)) ==>
        ((exit_self.empty == true) ∨
            (unwrap(exit_self.elements[0]) <= unwrap(entry_self.elements[0]))))
}