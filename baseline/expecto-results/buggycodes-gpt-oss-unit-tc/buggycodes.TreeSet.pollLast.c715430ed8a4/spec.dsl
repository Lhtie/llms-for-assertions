predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    ((entry_self.empty == false) ==>
        ((len(entry_self.elements) > 0) ∧
            (ret == entry_self.elements[(len(entry_self.elements) -
                1)])))
}