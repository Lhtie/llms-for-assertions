predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: record[is_null: bool, elements: list[option[int]]]) {
    ((len(ret.elements) == exit_self.size) ∧
        (∀(i: int) ::
            ((0 <= i < exit_self.size) ==>
                (exit_self.elements[i] == ret.elements[i]))))
}