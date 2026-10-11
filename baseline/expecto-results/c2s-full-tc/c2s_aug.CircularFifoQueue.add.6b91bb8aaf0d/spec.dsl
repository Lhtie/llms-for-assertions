predicate spec(param: record[element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (is_none(param.element) ∨
        (is_some(param.element) ==>
            (∃(idx: int) ::
                (IsLast(exit_self.elements, idx) ∧
                    (exit_self.elements[idx] == param.element)))))
}

predicate IsLast(arr: list[option[int]], idx: int) {
    var n: int = len(arr);
    (((0 <= idx < n) ∧
        is_some(arr[idx])) ∧
        (∀(j: int) ::
            (((0 <= j < n) ∧
                (j > idx)) ==>
                is_none(arr[j]))))
}