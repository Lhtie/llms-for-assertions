predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    (((exit_self.size == 0) ∧
        exit_self.empty) ∧
        (len(exit_self.elements) == 0))
}