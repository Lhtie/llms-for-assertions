predicate spec(param: record[item: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    (is_some(param.item) ==>
        (((exit_self.elements[(len(exit_self.elements) -
            1)] == param.item) ∧
            (ret == param.item)) ∧
            (exit_self.size == (entry_self.size + 1))))
}