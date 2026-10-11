predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    var len_e: int = 
        len(entry_self.elements);
    ((is_some(param.o) ∧
        (∃(i: int) ::
            ((0 <= i < len_e) ∧
                (entry_self.elements[i] == param.o)))) ==>
        (ret == false))
}