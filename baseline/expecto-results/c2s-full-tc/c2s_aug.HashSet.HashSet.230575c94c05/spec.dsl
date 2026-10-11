predicate spec(param: record[initialCapacity: int, loadFactor: record[positive: bool, is_nan: bool]], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    ((((param.initialCapacity >= 0) ∧
        param.loadFactor.positive) ∧
        (¬ param.loadFactor.is_nan)) ==>
        ((exit_self.empty ∧
            (exit_self.size == 0)) ∧
            (len(exit_self.elements) == 0)))
}