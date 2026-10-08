predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (is_some(param.e) ==>
        (∀(i: int) ::
            ((0 <= i < entry_self.size) ==>
                (∃(j: int) ::
                    ((0 <= j < exit_self.size) ∧
                        (exit_self.elements[j] == entry_self.elements[i]))))))
}