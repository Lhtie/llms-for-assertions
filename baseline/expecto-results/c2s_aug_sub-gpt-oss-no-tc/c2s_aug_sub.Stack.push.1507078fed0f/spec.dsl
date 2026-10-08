predicate spec(param: record[item: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var len_exit: int = 
        len(exit_self.elements);
    (exit_self.elements[(len_exit - 1)] == param.item)
}