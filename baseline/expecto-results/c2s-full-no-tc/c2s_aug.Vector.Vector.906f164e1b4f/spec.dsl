predicate spec(param: record[c: record[is_null: bool, size: int, empty: bool, elements: list[option[int]]]], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]], equals_c: bool], ret: nonetype) {
    var sz: int = param.c.size;
    ((¬ param.c.is_null) ==>
        (((exit_self.equals_c ∧
            (exit_self.size == sz)) ∧
            (exit_self.empty == param.c.empty)) ∧
            ElementsEqualInOrder(param.c.elements, exit_self.elements, sz)))
}

predicate ElementsEqualInOrder(c_elems: list[option[int]], v_elems: list[option[int]], sz: int) {
    (∀(i: int) ::
        ((0 <= i < sz) ==>
            (c_elems[i] == v_elems[i])))
}