predicate spec(param: record[initialCapacity: int], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements_null: list[bool]], ret: nonetype) {
    var ic: int = 
        param.initialCapacity;
    var sz: int = 
        exit_self.size;
    var emp: bool = 
        exit_self.empty;
    ((ic >= 0) ==>
        ((sz == 0) ∧
            (emp == true)))
}