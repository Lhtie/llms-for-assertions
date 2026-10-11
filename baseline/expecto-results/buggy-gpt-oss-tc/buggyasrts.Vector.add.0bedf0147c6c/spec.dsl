predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var idx: int = param.index;
    (∀(i: int) ::
        (((0 <= i < entry_self.size) ∧
            (i >= idx)) ==>
            (exit_self.elements[i] == entry_self.elements[i])))
}