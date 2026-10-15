predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (Contains(entry_self, param.o) ==>
        ((ret == true) ∧
            (exit_self.size == (entry_self.size - 2))))
}

predicate Contains(q: record[size: int, empty: bool, elements: list[option[int]]], val: option[int]) {
    (∃(i: int) ::
        ((0 <= i < len(q.elements)) ∧
            (q.elements[i] == val)))
}