predicate spec(param: record[index: int, role: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_role: list[bool], elements_identical_role: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_role: list[bool], elements_identical_role: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: nonetype) {
    (((0 <= param.index <= entry_self.size) ∧
        (¬ param.role.is_null)) ==>
        ((exit_self.size == (entry_self.size + 1)) ∧
            (exit_self.elements_equal_role[param.index] == true)))
}