predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var size_before: int = 
        entry_self.size;
    var size_after: int = 
        exit_self.size;
    ((¬ entry_self.empty) ==>
        (size_after == (size_before - 2)))
}