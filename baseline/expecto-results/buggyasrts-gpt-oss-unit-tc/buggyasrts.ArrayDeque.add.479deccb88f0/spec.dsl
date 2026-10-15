predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    var old_len: int = 
        len(entry_self.elements);
    var new_len: int = 
        len(exit_self.elements);
    ((((((ret == true) ∧
        (exit_self.size == (entry_self.size + 1))) ∧
        (exit_self.empty == false)) ∧
        (new_len == (old_len + 1))) ∧
        (exit_self.elements[(new_len - 1)] == param.e)) ∧
        (∀(i: int) ::
            ((0 <= i < old_len) ==>
                (exit_self.elements[i] == entry_self.elements[i]))))
}