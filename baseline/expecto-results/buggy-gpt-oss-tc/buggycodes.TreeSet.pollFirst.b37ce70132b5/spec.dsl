predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var size_before: int = 
        entry_self.size;
    var empty_before: bool = 
        entry_self.empty;
    var size_after: int = 
        exit_self.size;
    ((¬ empty_before) ==>
        (size_after == (size_before - 1)))
}