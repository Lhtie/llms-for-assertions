predicate spec(param: record[o: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_o: list[bool], elements_identical_o: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_o: list[bool], elements_identical_o: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: bool) {
    var last_idx: int = 
        (len(exit_self.elements_equal_o) -
            1);
    ((len(exit_self.elements_equal_o) > 0) ==>
        (exit_self.elements_equal_o[last_idx] == true))
}