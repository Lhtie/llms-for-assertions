predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    var n: int = 
        len(entry_self.elements);
    ((((((exit_self.size == (entry_self.size + 1)) ∧
        (exit_self.empty == false)) ∧
        (ret == true)) ∧
        (len(exit_self.elements) == (n + 1))) ∧
        (exit_self.elements[0] == param.e)) ∧
        (∀(i: int) ::
            ((0 <= i < n) ==>
                (exit_self.elements[(i + 1)] == entry_self.elements[i]))))
}