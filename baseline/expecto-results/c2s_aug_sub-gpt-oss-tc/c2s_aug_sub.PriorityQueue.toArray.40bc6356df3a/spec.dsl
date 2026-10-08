predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: record[is_null: bool, elements: list[option[int]]]) {
    var n: int = 
        entry_self.size;
    (∀(i: int) ::
        ((0 <= i < n) ==>
            (entry_self.elements[i] == ret.elements[i])))
}