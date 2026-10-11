predicate spec(param: record[item: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    (∃(i: int) ::
        ((0 <= i < exit_self.size) ∧
            (exit_self.elements[i] == param.item)))
}