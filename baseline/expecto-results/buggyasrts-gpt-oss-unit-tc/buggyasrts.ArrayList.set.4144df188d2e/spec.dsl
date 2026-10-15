predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var idx: int = param.index;
    var old: option[int] = 
        entry_self.elements[idx];
    ((0 <= idx < entry_self.size) ==>
        (((((exit_self.elements[idx] == param.element) ∧
            (ret == old)) ∧
            (exit_self.size == entry_self.size)) ∧
            (exit_self.empty == entry_self.empty)) ∧
            (∀(i: int) ::
                (((0 <= i < entry_self.size) ∧
                    (i != idx)) ==>
                    (exit_self.elements[i] == entry_self.elements[i])))))
}