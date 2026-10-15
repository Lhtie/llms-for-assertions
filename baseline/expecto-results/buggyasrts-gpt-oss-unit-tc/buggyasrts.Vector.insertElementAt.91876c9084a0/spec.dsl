predicate spec(param: record[obj: option[int], index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    (∀(i: int) ::
        (((param.index <= i) ∧
            (i < entry_self.size)) ==>
            (exit_self.elements[i] == entry_self.elements[i])))
}