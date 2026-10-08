predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    ((is_some(param.o) ∧
        contains_elem(entry_self.elements, param.o)) ==>
        (exit_self.size == (entry_self.size - 1)))
}

predicate contains_elem(elems: list[option[int]], elem: option[int]) {
    (∃(i: int) ::
        ((0 <= i < len(elems)) ∧
            (elems[i] == elem)))
}