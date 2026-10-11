predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var idx: int = param.index;
    (∀(i: int) ::
        ((0 <= i < idx) ==>
            ((exit_self.elements[i] == entry_self.elements[i]) ∧
                (∀(i: int) ::
                    ((idx <= i < len(entry_self.elements)) ==>
                        (exit_self.elements[(i + 1)] == entry_self.elements[i]))))))
}