predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    ((¬ Contains(entry_self, param.o)) ==>
        (ret == false))
}

predicate Contains(s: record[size: int, empty: bool, elements: list[option[int]]], elem: option[int]) {
    (is_some(elem) ∧
        (∃(i: int) ::
            (((0 <= i < len(s.elements)) ∧
                is_some(s.elements[i])) ∧
                (unwrap(s.elements[i]) == unwrap(elem)))))
}