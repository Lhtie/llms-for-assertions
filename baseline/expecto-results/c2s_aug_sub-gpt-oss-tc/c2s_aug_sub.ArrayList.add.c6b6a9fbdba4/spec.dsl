predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    ((exit_self.empty == false) ==>
        (exit_self.elements[(exit_self.size - 1)] == param.e))
}