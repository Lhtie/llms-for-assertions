predicate spec(param: record[initialCapacity: int, capacityIncrement: int], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var ic: int = 
        param.initialCapacity;
    var inc: int = 
        param.capacityIncrement;
    var sz: int = 
        exit_self.size;
    var emp: bool = 
        exit_self.empty;
    (((ic >= 0) ∧ (inc >= 0)) ==>
        (emp ∧ (sz == 0)))
}