predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: record[is_null: bool, size: int, empty: bool, elements: list[option[int]], same_receiver: bool]) {
    ((((((((entry_self.size == exit_self.size) ∧
        (entry_self.empty == exit_self.empty)) ∧
        (∀(i: int) ::
            ((0 <= i < len(entry_self.elements)) ==>
                (entry_self.elements[i] == exit_self.elements[i])))) ∧
        (ret.is_null == false)) ∧
        (ret.same_receiver == false)) ∧
        (ret.size == entry_self.size)) ∧
        (ret.empty == entry_self.empty)) ∧
        (∀(i: int) ::
            ((0 <= i < len(entry_self.elements)) ==>
                (entry_self.elements[i] == ret.elements[i]))))
}