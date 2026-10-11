predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var lenEntry: int = 
        len(entry_self.elements);
    var lenExit: int = 
        len(exit_self.elements);
    (((0 <= param.index <= lenEntry) ∧
        (lenExit == (lenEntry + 1))) ∧
        (exit_self.elements[param.index] == param.element))
}