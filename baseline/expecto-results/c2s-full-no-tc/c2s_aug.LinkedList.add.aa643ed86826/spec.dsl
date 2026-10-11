predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var idx: int = param.index;
    var elem_opt: option[int] = 
        param.element;
    var sz0: int = 
        entry_self.size;
    var sz1: int = 
        exit_self.size;
    ((0 <= idx <= sz0) ==>
        (((sz1 == (sz0 + 1)) ∧
            is_some(elem_opt)) ∧
            (∀(i: int) ::
                ((0 <= i < idx) ==>
                    (((exit_self.elements[i] == entry_self.elements[i]) ∧
                        (exit_self.elements[idx] == some(unwrap(elem_opt)))) ∧
                        (∀(i: int) ::
                            ((idx < i < sz1) ==>
                                (exit_self.elements[i] == entry_self.elements[(i - 1)]))))))))
}