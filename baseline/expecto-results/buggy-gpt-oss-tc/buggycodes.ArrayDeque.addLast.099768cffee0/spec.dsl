predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    ((¬ exit_self.empty) ==>
        (exit_self.elements[(len(exit_self.elements) -
            1)] == param.e))
}