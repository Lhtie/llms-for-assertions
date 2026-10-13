predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    ((entry_self.empty ==>
        (ret == None)) ∧
        ((¬ entry_self.empty) ==>
            (∃(max: int) ::
                (((ret == some(max)) ∧
                    (∃(i: int) ::
                        (((0 <= i < len(entry_self.elements)) ∧
                            is_some(entry_self.elements[i])) ∧
                            (unwrap(entry_self.elements[i]) == max)))) ∧
                    (∀(j: int) ::
                        (((0 <= j < len(entry_self.elements)) ∧
                            is_some(entry_self.elements[j])) ==>
                            (unwrap(entry_self.elements[j]) <= max)))))))
}