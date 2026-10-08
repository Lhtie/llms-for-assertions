predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: record[is_null: bool, size: int, empty: bool, elements: list[option[int]], same_receiver: bool]) {
    ((len(ret.elements) == len(entry_self.elements)) ∧
        (∀(i: int) ::
            ((0 <= i < len(entry_self.elements)) ==>
                (ret.elements[i] == entry_self.elements[i]))))
}