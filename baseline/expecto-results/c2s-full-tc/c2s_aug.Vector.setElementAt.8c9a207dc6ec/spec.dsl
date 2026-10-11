predicate valid_index(idx: int, sz: int) {
    (0 <= idx < sz)
}

predicate spec(param: record[obj: option[int], index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    (valid_index(param.index, entry_self.size) ==>
        (∀(i: int) ::
            ((0 <= i < param.index) ==>
                (exit_self.elements[i] == entry_self.elements[i]))))
}