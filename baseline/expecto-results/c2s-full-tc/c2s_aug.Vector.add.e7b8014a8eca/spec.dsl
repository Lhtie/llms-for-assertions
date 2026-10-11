predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var size_before: int = 
        entry_self.size;
    ((0 <= param.index <= size_before) ==>
        (((exit_self.elements[param.index] == param.element) ∧
            (exit_self.size == (size_before + 1))) ∧
            (∀(k: int) ::
                (((0 <= k < size_before) ∧
                    (k >= param.index)) ==>
                    (exit_self.elements[(k + 1)] == entry_self.elements[k])))))
}