predicate spec(param: record[initialCapacity: int, loadFactor: record[positive: bool, is_nan: bool]], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    (valid_params(param) ==>
        (((exit_self.size == 0) ∧
            (exit_self.empty == true)) ∧
            (len(exit_self.elements) == 0)))
}

predicate valid_params(param: record[initialCapacity: int, loadFactor: record[positive: bool, is_nan: bool]]) {
    (((param.initialCapacity >= 0) ∧
        param.loadFactor.positive) ∧
        (¬ param.loadFactor.is_nan))
}