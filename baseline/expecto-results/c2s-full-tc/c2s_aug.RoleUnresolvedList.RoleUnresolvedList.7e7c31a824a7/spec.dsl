predicate spec(param: record[], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements_null: list[bool]], ret: nonetype) {
    var sz: int = 
        exit_self.size;
    var emp: bool = 
        exit_self.empty;
    var nulls: list[bool] = 
        exit_self.elements_null;
    ((emp ∧ (sz == 0)) ∧
        (len(nulls) == 0))
}