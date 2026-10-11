predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: record[is_null: bool, elements: list[option[int]]]) {
    var n: int = 
        len(entry_self.elements);
    var m: int = 
        len(ret.elements);
    (((m == (n + 1)) ∧
        is_none(ret.elements[0])) ∧
        (∀(i: int) ::
            ((0 <= i < n) ==>
                (ret.elements[(i + 1)] == entry_self.elements[i]))))
}