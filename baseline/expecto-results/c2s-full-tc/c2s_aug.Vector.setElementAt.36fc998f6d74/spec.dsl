predicate spec(param: record[obj: option[int], index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    (((0 <= param.index) ∧
        (param.index < entry_self.size)) ==>
        (∀(k: int) ::
            (((k > param.index) ∧
                (k < entry_self.size)) ==>
                (exit_self.elements[k] == entry_self.elements[k]))))
}