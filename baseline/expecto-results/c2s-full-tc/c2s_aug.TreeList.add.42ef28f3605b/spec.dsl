predicate spec(param: record[index: int, obj: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var idx: int = param.index;
    var sz: int = 
        entry_self.size;
    (((0 <= idx) ∧
        (idx <= sz)) ==>
        (((exit_self.size == (sz + 1)) ∧
            (∀(k: int) ::
                ((0 <= k < idx) ==>
                    (exit_self.elements[k] == entry_self.elements[k])))) ∧
            (∀(k: int) ::
                ((idx <= k < sz) ==>
                    (exit_self.elements[(k + 1)] == entry_self.elements[k])))))
}