predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    var added: option[int] = 
        param.e;
    (((ret == true) ∧
        is_some(added)) ∧
        (∃(i: int) ::
            ((0 <= i < len(exit_self.elements)) ∧
                (exit_self.elements[i] == added))))
}