predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var idx: int = param.index;
    (valid_insert_index(entry_self.size, idx) ==>
        (∀(i: int) ::
            ((0 <= i < idx) ==>
                (entry_self.elements[i] == exit_self.elements[i]))))
}

predicate valid_insert_index(size: int, idx: int) {
    ((0 <= idx) ∧
        (idx <= size))
}