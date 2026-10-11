predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    ((¬ entry_self.empty) ==>
        (∀(i: int) ::
            ((0 <= i < len(exit_self.elements)) ==>
                (exit_self.elements[i] == entry_self.elements[(i + 1)]))))
}