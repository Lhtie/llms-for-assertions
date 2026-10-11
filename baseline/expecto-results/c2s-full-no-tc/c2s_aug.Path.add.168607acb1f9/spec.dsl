predicate spec(param: record[edge: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_edge: list[bool], elements_identical_edge: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_edge: list[bool], elements_identical_edge: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: nonetype) {
    var last_idx: int = 
        (exit_self.size - 1);
    ((last_idx >= 0) ∧
        exit_self.elements_equal_edge[last_idx])
}