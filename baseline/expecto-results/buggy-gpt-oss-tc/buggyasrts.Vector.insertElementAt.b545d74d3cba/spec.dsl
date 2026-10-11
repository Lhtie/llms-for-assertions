predicate spec(param: record[obj: option[int], index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    (∀(i: int) ::
        ((0 <= i <= param.index) ==>
            (entry_self.elements[i] == exit_self.elements[i])))
}