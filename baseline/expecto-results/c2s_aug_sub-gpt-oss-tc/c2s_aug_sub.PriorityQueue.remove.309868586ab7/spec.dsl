predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (Contains(entry_self.elements, param.o) ==>
        (exit_self.size == (entry_self.size - 1)))
}

predicate Contains(elements: list[option[int]], o: option[int]) {
    (∃(i: int) ::
        ((0 <= i < len(elements)) ∧
            (elements[i] == o)))
}