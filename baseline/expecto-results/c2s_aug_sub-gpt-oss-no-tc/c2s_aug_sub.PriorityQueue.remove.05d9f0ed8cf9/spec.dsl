predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (InQueue(entry_self, param.o) ==>
        ret)
}

predicate InQueue(q: record[size: int, empty: bool, elements: list[option[int]]], elem: option[int]) {
    (∃(i: int) ::
        ((0 <= i < len(q.elements)) ∧
            (q.elements[i] == elem)))
}