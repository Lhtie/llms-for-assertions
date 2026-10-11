predicate spec(param: record[index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var idx: int = param.index;
    var sz: int = 
        entry_self.size;
    (((0 <= idx) ∧ (idx < sz)) ==>
        ((((exit_self.size == (sz - 1)) ∧
            (exit_self.empty == ((sz - 1) == 0))) ∧
            (ret == entry_self.elements[idx])) ∧
            (∀(k: int) ::
                ((((0 <= k) ∧ (k < idx)) ==>
                    ((exit_self.elements[k] == entry_self.elements[k]) ∧
                        ((idx <= k) ∧
                            (k < (sz - 1))))) ==>
                    (exit_self.elements[k] == entry_self.elements[(k + 1)])))))
}