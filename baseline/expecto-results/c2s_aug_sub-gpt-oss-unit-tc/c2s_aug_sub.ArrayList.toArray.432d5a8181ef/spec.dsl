predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: record[is_null: bool, elements: list[option[int]]]) {
    var len_ret: int = 
        len(ret.elements);
    ((len_ret == entry_self.size) ∧
        (∀(i: int) ::
            ((0 <= i < entry_self.size) ==>
                (entry_self.elements[i] == ret.elements[i]))))
}