predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var oldSize: int = 
        entry_self.size;
    var newSize: int = 
        exit_self.size;
    var wasEmpty: bool = 
        entry_self.empty;
    ((¬ wasEmpty) ==>
        (newSize == (oldSize - 1)))
}