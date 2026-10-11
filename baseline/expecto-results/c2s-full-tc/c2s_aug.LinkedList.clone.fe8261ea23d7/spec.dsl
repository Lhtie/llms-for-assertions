predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: record[is_null: bool, size: int, empty: bool, elements: list[option[int]], same_receiver: bool]) {
    (((((((entry_self.size == exit_self.size) ∧
        (entry_self.empty == exit_self.empty)) ∧
        (entry_self.elements == exit_self.elements)) ∧
        (ret.size == entry_self.size)) ∧
        (ret.empty == entry_self.empty)) ∧
        (ret.elements == entry_self.elements)) ∧
        (¬ ret.is_null))
}