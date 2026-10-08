predicate spec(param: record[item: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var n: int = exit_self.size;
    ((n > 0) ∧
        (exit_self.elements[(n - 1)] == param.item))
}