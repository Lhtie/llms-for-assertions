predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: record[is_null: bool, elements: list[option[int]]]) {
    ((((((exit_self.size == entry_self.size) ∧
        (exit_self.empty == entry_self.empty)) ∧
        (exit_self.elements == entry_self.elements)) ∧
        (ret.is_null == false)) ∧
        (len(ret.elements) == (entry_self.size + 1))) ∧
        (∀(i: int) ::
            ((0 <= i < entry_self.size) ==>
                (ret.elements[(i + 1)] == entry_self.elements[i]))))
}