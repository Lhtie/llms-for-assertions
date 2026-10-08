predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (ContainsElement(entry_self.elements, param.o) ==>
        ret)
}

predicate ContainsElement(elems: list[option[int]], e: option[int]) {
    (∃(i: int) ::
        ((0 <= i < len(elems)) ∧
            (elems[i] == e)))
}