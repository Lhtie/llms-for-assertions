predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var n: int = 
        entry_self.size;
    ((¬ entry_self.empty) ==>
        (ret == entry_self.elements[(n - 1)]))
}