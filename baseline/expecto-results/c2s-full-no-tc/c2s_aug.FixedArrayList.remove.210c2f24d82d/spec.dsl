predicate spec(param: record[i: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var i: int = param.i;
    (((0 <= i < entry_self.size) ∧
        is_some(entry_self.elements[i])) ==>
        (((ret == entry_self.elements[i]) ∧
            (exit_self.elements[i] == None)) ∧
            (∀(j: int) ::
                (((0 <= j < entry_self.size) ∧
                    (j != i)) ==>
                    (exit_self.elements[j] == entry_self.elements[j])))))
}