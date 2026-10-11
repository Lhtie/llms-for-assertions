predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    var length: int = 
        len(entry_self.elements);
    ((∃(i: int) ::
        ((0 <= i < length) ∧
            (entry_self.elements[i] == param.o))) ==>
        (ret == false))
}