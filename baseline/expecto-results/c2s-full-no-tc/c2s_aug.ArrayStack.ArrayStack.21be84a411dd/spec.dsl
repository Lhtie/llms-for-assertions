predicate spec(param: record[initialSize: int], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var init: int = 
        param.initialSize;
    var sz: int = 
        exit_self.size;
    var emp: bool = 
        exit_self.empty;
    ((init >= 0) ==>
        (emp ∧ (sz == 0)))
}