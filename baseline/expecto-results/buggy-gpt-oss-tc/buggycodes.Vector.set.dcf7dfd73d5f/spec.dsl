predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    ((0 <= param.index < entry_self.size) ==>
        (((exit_self.elements[param.index] == param.element) ∧
            (ret == entry_self.elements[param.index])) ∧
            (∀(i: int) ::
                (((0 <= i < entry_self.size) ∧
                    (i != param.index)) ==>
                    (((exit_self.elements[i] == entry_self.elements[i]) ∧
                        (exit_self.size == entry_self.size)) ∧
                        (exit_self.empty == entry_self.empty))))))
}