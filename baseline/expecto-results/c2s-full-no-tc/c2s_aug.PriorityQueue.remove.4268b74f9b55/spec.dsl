predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    ((¬ contains_option(entry_self.elements, param.o)) ==>
        (ret == false))
}

predicate contains_option(elems: list[option[int]], val: option[int]) {
    (∃(i: int) ::
        ((0 <= i < len(elems)) ∧
            (elems[i] == val)))
}