predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var topIdx: int = 
        (entry_self.size - 1);
    ((¬ entry_self.empty) ==>
        (is_some(ret) ∧
            (unwrap(ret) == unwrap(entry_self.elements[topIdx]))))
}