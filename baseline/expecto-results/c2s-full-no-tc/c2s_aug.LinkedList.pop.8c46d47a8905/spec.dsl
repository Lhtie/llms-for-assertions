predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var front: option[int] = 
        entry_self.elements[0];
    ((¬ entry_self.empty) ==>
        (ret == front))
}