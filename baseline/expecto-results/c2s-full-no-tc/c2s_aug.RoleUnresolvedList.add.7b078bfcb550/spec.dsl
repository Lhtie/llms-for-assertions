predicate spec(param: record[o: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_o: list[bool], elements_identical_o: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_o: list[bool], elements_identical_o: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: bool) {
    var last_idx: int = 
        (exit_self.size - 1);
    (((((entry_self.size + 1) == exit_self.size) ∧
        (0 <= last_idx)) ∧
        (last_idx < len(exit_self.elements_equal_o))) ∧
        exit_self.elements_equal_o[last_idx])
}