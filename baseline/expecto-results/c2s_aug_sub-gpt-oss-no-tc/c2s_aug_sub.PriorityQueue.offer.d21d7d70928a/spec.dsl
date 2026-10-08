predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    var old_head: int = 
        unwrap(entry_self.elements[0]);
    var new_head: int = 
        unwrap(exit_self.elements[0]);
    ((is_some(param.e) ∧
        (¬ entry_self.empty)) ==>
        (new_head <= old_head))
}