predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var n: int = 
        entry_self.size;
    var m: int = exit_self.size;
    (((((((¬ entry_self.empty) ∧
        is_some(entry_self.elements[0])) ∧
        (ret == entry_self.elements[0])) ∧
        (m == (n - 1))) ∧
        (exit_self.empty == (n == 1))) ∧
        (∀(i: int) ::
            ((0 <= i < m) ==>
                (exit_self.elements[i] == entry_self.elements[(i + 1)])))) ∧
        is_none(exit_self.elements[m]))
}