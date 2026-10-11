predicate spec(param: record[obj: option[int], index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    (((0 <= param.index) ∧
        (param.index <= entry_self.size)) ==>
        ((exit_self.size == (entry_self.size + 1)) ∧
            (∀(i: int) ::
                ((0 <= i < param.index) ==>
                    (((exit_self.elements[i] == entry_self.elements[i]) ∧
                        (exit_self.elements[param.index] == param.obj)) ∧
                        (∀(i: int) ::
                            ((param.index <= i < entry_self.size) ==>
                                (exit_self.elements[(i + 1)] == entry_self.elements[i]))))))))
}