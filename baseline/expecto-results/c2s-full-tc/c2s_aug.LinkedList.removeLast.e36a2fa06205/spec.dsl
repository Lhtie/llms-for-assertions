predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    ((entry_self.empty == false) ==>
        (∀(i: int) ::
            ((0 <= i < (entry_self.size - 1)) ==>
                (exit_self.elements[i] == entry_self.elements[i]))))
}