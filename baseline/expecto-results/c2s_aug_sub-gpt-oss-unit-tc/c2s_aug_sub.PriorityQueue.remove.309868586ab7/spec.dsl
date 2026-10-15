predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    ((is_some(param.o) ∧
        Contains(entry_self.elements, param.o)) ==>
        ((exit_self.size == (entry_self.size - 1)) ∧
            (ret == true)))
}

predicate Contains(elements: list[option[int]], val: option[int]) {
    (∃(i: int) ::
        ((0 <= i < len(elements)) ∧
            (elements[i] == val)))
}