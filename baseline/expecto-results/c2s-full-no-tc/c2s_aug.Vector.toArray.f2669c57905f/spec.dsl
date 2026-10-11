predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: record[is_null: bool, elements: list[option[int]]]) {
    (∀(i: int) ::
        ((0 <= i < len(ret.elements)) ==>
            (ret.elements[i] == entry_self.elements[i])))
}