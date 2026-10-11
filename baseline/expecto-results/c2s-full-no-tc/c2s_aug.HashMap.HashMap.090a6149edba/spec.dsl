predicate spec(param: record[initialCapacity: int, loadFactor: record[positive: bool, is_nan: bool]], entry_self: nonetype, exit_self: record[size: int, empty: bool], ret: nonetype) {
    (((param.initialCapacity >= 0) ∧
        param.loadFactor.positive) ==>
        (exit_self.size == 0))
}