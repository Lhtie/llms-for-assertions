predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    ((ret == true) ∧
        (exit_self.elements == concat(entry_self.elements, [param.e])))
}