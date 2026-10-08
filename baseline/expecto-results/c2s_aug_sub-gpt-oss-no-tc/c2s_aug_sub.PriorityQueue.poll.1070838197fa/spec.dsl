predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var pre_nonempty: bool = 
        (¬ entry_self.empty);
    (pre_nonempty ==>
        (exit_self.size == (entry_self.size - 1)))
}