predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    ((¬ element_in_queue(entry_self.elements, param.o)) ==>
        (ret == false))
}

predicate element_in_queue(elements: list[option[int]], o: option[int]) {
    (∃(i: int) ::
        ((0 <= i < len(elements)) ∧
            (elements[i] == o)))
}