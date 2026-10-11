predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    ((¬ elem_present(entry_self.elements, param.o)) ==>
        (ret == true))
}

predicate elem_present(elements: list[option[int]], val: option[int]) {
    var n: int = len(elements);
    (is_some(val) ∧
        (∃(i: int) ::
            (((0 <= i < n) ∧
                is_some(elements[i])) ∧
                (unwrap(elements[i]) == unwrap(val)))))
}