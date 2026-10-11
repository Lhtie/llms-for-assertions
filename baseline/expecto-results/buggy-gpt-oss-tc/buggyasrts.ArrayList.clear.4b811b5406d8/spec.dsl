predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var len_e: int = 
        len(exit_self.elements);
    (((exit_self.empty == false) ∧
        (exit_self.size > 0)) ∧
        (∃(i: int) ::
            ((0 <= i < len_e) ∧
                is_some(exit_self.elements[i]))))
}