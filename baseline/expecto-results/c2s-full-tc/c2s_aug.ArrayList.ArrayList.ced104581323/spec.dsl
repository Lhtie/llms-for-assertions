predicate spec(param: record[initialCapacity: int], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var capacity: int = 
        param.initialCapacity;
    var sz: int = 
        exit_self.size;
    var isEmpty: bool = 
        exit_self.empty;
    var elems: list[option[int]] = 
        exit_self.elements;
    ((capacity >= 0) ==>
        (((sz == 0) ∧
            (isEmpty == true)) ∧
            (len(elems) == 0)))
}