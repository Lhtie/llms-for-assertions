predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: record[is_null: bool, elements: list[option[int]]]) {
    ((((len(entry_self.elements) == entry_self.size) ∧
        (len(ret.elements) == entry_self.size)) ∧
        (∀(i: int) ::
            ((0 <= i < (entry_self.size - 1)) ==>
                (ret.elements[(i + 1)] == entry_self.elements[i])))) ∧
        ((entry_self.size > 0) ==>
            is_none(ret.elements[0])))
}