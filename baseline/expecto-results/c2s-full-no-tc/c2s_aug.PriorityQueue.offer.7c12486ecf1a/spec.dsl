predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    var e_opt: option[int] = 
        param.e;
    var old: list[option[int]] = 
        entry_self.elements;
    var newer: list[option[int]] = 
        exit_self.elements;
    ((¬ is_some(e_opt)) ∨
        (∀(i: int) ::
            (((0 <= i < len(old)) ∧
                is_some(old[i])) ==>
                (∃(j: int) ::
                    ((0 <= j < len(newer)) ∧
                        (newer[j] == old[i]))))))
}