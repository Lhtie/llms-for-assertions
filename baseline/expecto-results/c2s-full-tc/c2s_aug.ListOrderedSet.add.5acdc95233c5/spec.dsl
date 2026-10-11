predicate spec(param: record[index: int, object: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    (((((0 <= param.index) ∧
        (param.index <= entry_self.size)) ∧
        is_some(param.object)) ∧
        (∀(i: int) ::
            ((0 <= i < entry_self.size) ==>
                (entry_self.elements[i] != param.object)))) ==>
        (exit_self.elements[param.index] == param.object))
}