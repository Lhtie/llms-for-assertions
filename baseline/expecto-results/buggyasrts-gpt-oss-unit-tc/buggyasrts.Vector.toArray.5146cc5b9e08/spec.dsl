predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: record[is_null: bool, elements: list[option[int]]]) {
    ((ret.is_null == false) ∧
        ShiftedByOne(entry_self.elements, ret.elements))
}

predicate ShiftedByOne(orig: list[option[int]], shifted: list[option[int]]) {
    var o_len: int = len(orig);
    var s_len: int = 
        len(shifted);
    (((o_len == 0) ∧
        (s_len == 0)) ∨
        ((s_len == (o_len + 1)) ∧
            (∀(i: int) ::
                ((0 <= i < o_len) ==>
                    (shifted[(i + 1)] == orig[i])))))
}