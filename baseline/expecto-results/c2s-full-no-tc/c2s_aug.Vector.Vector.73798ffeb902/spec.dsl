predicate spec(param: record[initialCapacity: int], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var cap: int = 
        param.initialCapacity;
    var sz: int = 
        exit_self.size;
    var emp: bool = 
        exit_self.empty;
    ((cap >= 0) ==>
        ((sz == 0) ∧
            (emp == true)))
}