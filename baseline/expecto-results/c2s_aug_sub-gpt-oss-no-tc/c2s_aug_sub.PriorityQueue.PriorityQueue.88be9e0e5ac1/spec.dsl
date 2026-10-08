predicate spec(param: record[c: record[is_null: bool, size: int, empty: bool, elements: list[option[int]]]], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var coll_len: int = 
        len(param.c.elements);
    var self_len: int = 
        len(exit_self.elements);
    (param.c.is_null ∨
        (∀(i: int) ::
            (((0 <= i < coll_len) ∧
                is_some(param.c.elements[i])) ==>
                (∃(j: int) ::
                    ((0 <= j < self_len) ∧
                        (exit_self.elements[j] == param.c.elements[i]))))))
}