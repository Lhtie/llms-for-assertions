predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: record[is_null: bool, size: int, empty: bool, elements: list[option[int]], same_receiver: bool]) {
    (∀(i: int) ::
        ((0 <= i < entry_self.size) ==>
            (entry_self.elements[i] == ret.elements[i])))
}