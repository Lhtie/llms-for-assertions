predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (((((exit_self.size == (entry_self.size + 1)) ∧
        (exit_self.empty == false)) ∧
        (ret == true)) ∧
        (∀(i: int) ::
            ((0 <= i < entry_self.size) ==>
                (exit_self.elements[i] == entry_self.elements[i])))) ∧
        (exit_self.elements[entry_self.size] == param.e))
}