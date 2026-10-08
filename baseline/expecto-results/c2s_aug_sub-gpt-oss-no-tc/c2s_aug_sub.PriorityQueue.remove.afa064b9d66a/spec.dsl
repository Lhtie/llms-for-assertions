predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    ((∀(i: int) ::
        ((0 <= i < len(entry_self.elements)) ==>
            (entry_self.elements[i] != param.o))) ==>
        (ret == false))
}