predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var old_head: int = 
        unwrap(entry_self.elements[0]);
    ((((¬ entry_self.empty) ∧
        (ret == some(old_head))) ∧
        (entry_self.size == (exit_self.size + 1))) ∧
        (exit_self.empty ∨
            (unwrap(exit_self.elements[0]) <= old_head)))
}