predicate spec(param: record[index: int, obj: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    ((0 <= param.index <= entry_self.size) ==>
        ((((exit_self.size == (entry_self.size + 1)) ∧
            (exit_self.empty == false)) ∧
            (exit_self.elements[param.index] == param.obj)) ∧
            (∀(i: int) ::
                ((0 <= i < entry_self.size) ==>
                    (((i < param.index) ==>
                        ((exit_self.elements[i] == entry_self.elements[i]) ∧
                            (i >= param.index))) ==>
                        (exit_self.elements[(i + 1)] == entry_self.elements[i]))))))
}