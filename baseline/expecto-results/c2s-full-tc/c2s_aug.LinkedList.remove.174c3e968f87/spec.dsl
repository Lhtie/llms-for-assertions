predicate spec(param: record[index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    (((0 <= param.index) ∧
        (param.index < entry_self.size)) ==>
        ((((ret == entry_self.elements[param.index]) ∧
            (exit_self.size == (entry_self.size - 1))) ∧
            (exit_self.empty == (exit_self.size == 0))) ∧
            (exit_self.elements == RemoveAt(entry_self.elements, param.index))))
}

function RemoveAt(elements: list[option[int]], idx: int) -> (result: list[option[int]]) {
    ensure (((len(result) == (len(elements) - 1)) ∧
    (∀(i: int) ::
        ((0 <= i < idx) ==>
            (result[i] == elements[i])))) ∧
    (∀(i: int) ::
        ((idx <= i < len(result)) ==>
            (result[i] == elements[(i + 1)]))));
}