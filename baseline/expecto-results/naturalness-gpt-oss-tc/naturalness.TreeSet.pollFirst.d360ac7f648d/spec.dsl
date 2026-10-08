predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    (is_none(ret) ∨
        (is_some(ret) ∧
            (∀(i: int) ::
                ((0 <= i < len(exit_self.elements)) ==>
                    (exit_self.elements[i] != some(unwrap(ret)))))))
}