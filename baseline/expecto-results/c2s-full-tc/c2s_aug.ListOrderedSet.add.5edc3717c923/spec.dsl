predicate spec(param: record[index: int, object: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    ((0 <= param.index <= entry_self.size) ==>
        (∃(k: int) ::
            ((0 <= k < len(exit_self.elements)) ∧
                (exit_self.elements[k] == param.object))))
}