predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (∀(v: int) ::
        ((param.e == some(v)) ==>
            (exit_self.elements[0] == some(v))))
}