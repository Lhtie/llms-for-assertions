predicate spec(param: record[obj: option[int], index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    (((0 <= param.index) ∧
        (param.index <= entry_self.size)) ==>
        (((exit_self.size == (entry_self.size + 1)) ∧
            (∀(k: int) ::
                (((0 <= k) ∧
                    (k < param.index)) ==>
                    (exit_self.elements[k] == entry_self.elements[k])))) ∧
            (∀(k: int) ::
                (((param.index <= k) ∧
                    (k < entry_self.size)) ==>
                    (exit_self.elements[(k + 1)] == entry_self.elements[k])))))
}