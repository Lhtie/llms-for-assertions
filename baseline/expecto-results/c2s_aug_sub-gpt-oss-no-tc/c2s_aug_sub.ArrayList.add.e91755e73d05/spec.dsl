predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    (valid_index(entry_self.size, param.index) ==>
        (exit_self.elements[param.index] == param.element))
}

predicate valid_index(size: int, idx: int) {
    ((0 <= idx) ∧
        (idx <= size))
}