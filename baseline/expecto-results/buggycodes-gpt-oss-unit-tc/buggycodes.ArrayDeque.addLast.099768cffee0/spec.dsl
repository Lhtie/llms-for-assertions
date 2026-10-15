predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var old_len: int = 
        len(entry_self.elements);
    var new_len: int = 
        len(exit_self.elements);
    ((((exit_self.size == (entry_self.size + 1)) ∧
        (new_len == (old_len + 1))) ∧
        (exit_self.elements[0] == param.e)) ∧
        (∀(i: int) ::
            ((0 <= i < old_len) ==>
                (exit_self.elements[(i + 1)] == entry_self.elements[i]))))
}