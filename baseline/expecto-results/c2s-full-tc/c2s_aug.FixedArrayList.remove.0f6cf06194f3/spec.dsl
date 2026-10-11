predicate spec(param: record[i: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    ((0 <= param.i < entry_self.size) ==>
        (∀(j: int) ::
            ((0 <= j < param.i) ==>
                (exit_self.elements[j] == entry_self.elements[j]))))
}