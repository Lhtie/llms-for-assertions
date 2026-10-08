predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: record[is_null: bool, elements: list[option[int]]]) {
    (∀(i: int) ::
        (((0 <= i < entry_self.size) ∧
            (i < len(ret.elements))) ==>
            (entry_self.elements[i] == ret.elements[i])))
}