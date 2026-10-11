predicate spec(param: record[item: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var top_idx: int = 
        (len(exit_self.elements) -
            1);
    (exit_self.elements[top_idx] == param.item)
}