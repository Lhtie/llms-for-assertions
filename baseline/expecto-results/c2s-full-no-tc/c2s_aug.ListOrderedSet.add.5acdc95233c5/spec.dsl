predicate spec(param: record[index: int, object: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    ((((0 <= param.index) ∧
        (param.index <= len(entry_self.elements))) ∧
        (is_none(param.object) ∨
            (is_some(param.object) ∧
                (∀(i: int) ::
                    ((0 <= i < len(entry_self.elements)) ==>
                        (entry_self.elements[i] != param.object)))))) ==>
        (exit_self.elements[param.index] == param.object))
}