predicate spec(param: record[initialCapacity: int, loadFactor: record[positive: bool, is_nan: bool]], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var ic: int = 
        param.initialCapacity;
    var lf_pos: bool = 
        param.loadFactor.positive;
    var lf_nan: bool = 
        param.loadFactor.is_nan;
    ((((ic >= 0) ∧ lf_pos) ∧
        (¬ lf_nan)) ==>
        (exit_self.empty ∧
            (exit_self.size == 0)))
}