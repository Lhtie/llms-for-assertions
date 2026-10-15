predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    var oldSize: int = 
        entry_self.size;
    var newSize: int = 
        (oldSize + 1);
    (((((ret == true) ∧
        (exit_self.size == newSize)) ∧
        (exit_self.empty == false)) ∧
        (exit_self.elements[oldSize] == param.e)) ∧
        (∀(i: int) ::
            ((0 <= i < oldSize) ==>
                (exit_self.elements[i] == entry_self.elements[i]))))
}