predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    (∃(idx: int) ::
        (last_filled(exit_self.elements, idx) ∧
            (exit_self.elements[idx] != param.e)))
}

predicate last_filled(arr: list[option[int]], idx: int) {
    var n: int = len(arr);
    (((0 <= idx < n) ∧
        is_some(arr[idx])) ∧
        (∀(i: int) ::
            (((0 <= i < n) ∧
                is_some(arr[i])) ==>
                (i <= idx))))
}