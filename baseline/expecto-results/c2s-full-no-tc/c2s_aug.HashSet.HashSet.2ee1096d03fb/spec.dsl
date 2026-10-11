predicate spec(param: record[], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var sz: int = 
        exit_self.size;
    var emp: bool = 
        exit_self.empty;
    var elems: list[option[int]] = 
        exit_self.elements;
    (((sz == 0) ∧ emp) ∧
        (len(elems) == 0))
}