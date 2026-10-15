predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    ((¬ entry_self.empty) ==>
        ((((ret == entry_self.elements[0]) ∧
            (exit_self.size == (entry_self.size - 1))) ∧
            (exit_self.elements == substr(entry_self.elements, 1, (entry_self.size - 1)))) ∧
            (exit_self.empty == (exit_self.size == 0))))
}