predicate spec(param: record[obj: option[int], index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    (((0 <= param.index) ∧
        (param.index < entry_self.size)) ==>
        (((exit_self.size == (entry_self.size + 1)) ∧
            is_some(param.obj)) ∧
            (exit_self.elements[(param.index + 1)] == param.obj)))
}