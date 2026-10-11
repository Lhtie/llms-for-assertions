predicate spec(param: record[obj: option[int], index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var n: int = 
        entry_self.size;
    (((0 <= param.index) ∧
        (param.index <= n)) ==>
        (((exit_self.size == (n + 1)) ∧
            (exit_self.elements[param.index] == param.obj)) ∧
            (∀(i: int) ::
                ((0 <= i < param.index) ==>
                    ((exit_self.elements[i] == entry_self.elements[i]) ∧
                        (∀(i: int) ::
                            ((param.index <= i < n) ==>
                                (exit_self.elements[(i + 1)] == entry_self.elements[i]))))))))
}