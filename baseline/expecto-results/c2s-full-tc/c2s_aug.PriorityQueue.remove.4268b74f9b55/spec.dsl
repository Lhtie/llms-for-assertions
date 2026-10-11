predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    var n: int = 
        len(entry_self.elements);
    ((¬ contains_option(param.o, entry_self.elements)) ==>
        (ret == false))
}

predicate contains_option(o: option[int], elems: list[option[int]]) {
    (∃(i: int) ::
        ((0 <= i < len(elems)) ∧
            (elems[i] == o)))
}