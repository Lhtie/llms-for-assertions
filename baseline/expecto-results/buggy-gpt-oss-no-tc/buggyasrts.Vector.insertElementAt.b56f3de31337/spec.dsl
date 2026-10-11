predicate spec(param: record[obj: option[int], index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var valid: bool = 
        ((0 <= param.index) ∧
            (param.index <= entry_self.size));
    (valid ==>
        ((exit_self.elements[(param.index + 1)] == param.obj) ∧
            (exit_self.size == (entry_self.size + 1))))
}