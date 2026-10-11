predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: record[is_null: bool, size: int, empty: bool, elements: list[option[int]], same_receiver: bool]) {
    var n: int = 
        entry_self.size;
    ((ret.size == n) ∧
        (∀(i: int) ::
            ((0 <= i < n) ==>
                (ret.elements[i] == entry_self.elements[i]))))
}