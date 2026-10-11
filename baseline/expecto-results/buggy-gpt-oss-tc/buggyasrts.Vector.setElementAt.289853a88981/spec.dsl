predicate spec(param: record[obj: option[int], index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    (∀(k: int) ::
        ((0 <= k <= param.index) ==>
            (entry_self.elements[k] == exit_self.elements[k])))
}