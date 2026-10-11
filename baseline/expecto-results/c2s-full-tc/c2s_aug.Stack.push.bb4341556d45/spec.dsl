predicate spec(param: record[item: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    ((len(exit_self.elements) > 0) ∧
        (exit_self.elements[(len(exit_self.elements) -
            1)] == param.item))
}