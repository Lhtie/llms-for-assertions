predicate spec(param: record[size: int], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    ((param.size > 0) ==>
        ((((exit_self.size == param.size) ∧
            (exit_self.empty == true)) ∧
            (len(exit_self.elements) == param.size)) ∧
            (∀(i: int) ::
                ((0 <= i < len(exit_self.elements)) ==>
                    is_none(exit_self.elements[i])))))
}