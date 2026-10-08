predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    ((entry_self.empty ==>
        is_none(ret)) ∧
        ((¬ entry_self.empty) ==>
            (is_some(ret) ∧
                (∃(i: int) ::
                    ((0 <= i < len(entry_self.elements)) ∧
                        (entry_self.elements[i] == ret))))))
}