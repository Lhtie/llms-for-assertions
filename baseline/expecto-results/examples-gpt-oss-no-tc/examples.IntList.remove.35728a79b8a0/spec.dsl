predicate spec(param: record[i: int], entry_self: record[size: int, empty: bool, elements: list[int]], exit_self: record[size: int, empty: bool, elements: list[int]], ret: nonetype) {
    (((((0 <= param.i) ∧
        (param.i < entry_self.size)) ∧
        (exit_self.size == (entry_self.size - 1))) ∧
        (exit_self.empty == (exit_self.size == 0))) ∧
        (∀(k: int) ::
            ((0 <= k < exit_self.size) ==>
                (exit_self.elements[k] == entry_self.elements[(if (k < param.i) then k else (k + 1))]))))
}