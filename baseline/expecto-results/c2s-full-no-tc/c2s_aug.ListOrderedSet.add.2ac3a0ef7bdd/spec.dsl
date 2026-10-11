predicate spec(param: record[index: int, object: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var idx: int = param.index;
    var obj: option[int] = 
        param.object;
    ((((0 <= idx) ∧
        (idx <= entry_self.size)) ∧
        (is_some(obj) ==>
            (¬ (∃(k: int) ::
                (((0 <= k) ∧
                    (k < entry_self.size)) ∧
                    (entry_self.elements[k] == obj)))))) ==>
        (((exit_self.size == (entry_self.size + 1)) ∧
            (exit_self.elements[idx] == obj)) ∧
            (∀(i: int) ::
                (((0 <= i) ∧ (i < idx)) ==>
                    ((exit_self.elements[i] == entry_self.elements[i]) ∧
                        (∀(i: int) ::
                            (((idx < i) ∧
                                (i < exit_self.size)) ==>
                                (exit_self.elements[i] == entry_self.elements[(i - 1)]))))))))
}