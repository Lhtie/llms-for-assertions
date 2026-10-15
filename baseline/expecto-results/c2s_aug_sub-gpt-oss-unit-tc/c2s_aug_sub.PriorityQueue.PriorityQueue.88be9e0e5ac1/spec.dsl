predicate spec(param: record[c: record[is_null: bool, size: int, empty: bool, elements: list[option[int]]]], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    (param.c.is_null ∨
        (∀(i: int) ::
            ((0 <= i < len(param.c.elements)) ==>
                ((¬ is_some(param.c.elements[i])) ∨
                    elem_in_list(unwrap(param.c.elements[i]), exit_self.elements)))))
}

predicate elem_in_list(v: int, lst: list[option[int]]) {
    (∃(j: int) ::
        ((0 <= j < len(lst)) ∧
            (is_some(lst[j]) ∧
                (unwrap(lst[j]) == v))))
}