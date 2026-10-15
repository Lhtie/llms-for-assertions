predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: record[is_null: bool, elements: list[option[int]]]) {
    var n: int = 
        entry_self.size;
    (((n == 0) ==>
        (len(ret.elements) == 0)) ∧
        ((n > 0) ==>
            ((len(ret.elements) == (n + 1)) ∧
                (∀(i: int) ::
                    ((0 <= i < n) ==>
                        (ret.elements[(i + 1)] == entry_self.elements[i]))))))
}