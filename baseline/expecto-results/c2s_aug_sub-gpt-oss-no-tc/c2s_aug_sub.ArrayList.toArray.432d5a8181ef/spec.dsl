predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: record[is_null: bool, elements: list[option[int]]]) {
    var sz: int = 
        entry_self.size;
    (∀(i: int) ::
        ((0 <= i < sz) ==>
            (entry_self.elements[i] == ret.elements[i])))
}