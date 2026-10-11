predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: record[is_null: bool, elements: list[option[int]]]) {
    var len_q: int = 
        exit_self.size;
    ((len(ret.elements) >= len_q) ∧
        (∀(i: int) ::
            ((0 <= i < len_q) ==>
                (exit_self.elements[i] == ret.elements[i]))))
}