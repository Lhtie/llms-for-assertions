predicate spec(param: record[initialCapacity: int], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var cap: int = 
        param.initialCapacity;
    ((cap >= 0) ==>
        (exit_self.empty ∧
            (exit_self.size == 0)))
}