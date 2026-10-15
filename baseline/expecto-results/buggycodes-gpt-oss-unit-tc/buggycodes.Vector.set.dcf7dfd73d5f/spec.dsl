predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var idx: int = param.index;
    var sz: int = 
        entry_self.size;
    ((0 <= idx < sz) ==>
        (((((exit_self.size == sz) ∧
            (exit_self.empty == entry_self.empty)) ∧
            (exit_self.elements[0] == param.element)) ∧
            (ret == entry_self.elements[idx])) ∧
            (∀(i: int) ::
                (((0 <= i < sz) ∧
                    (i != 0)) ==>
                    (exit_self.elements[i] == entry_self.elements[i])))))
}