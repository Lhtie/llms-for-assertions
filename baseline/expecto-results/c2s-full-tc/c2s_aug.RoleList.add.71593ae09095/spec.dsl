predicate spec(param: record[role: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_role: list[bool], elements_identical_role: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_role: list[bool], elements_identical_role: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: nonetype) {
    var role_not_null: bool = 
        (¬ param.role.is_null);
    (role_not_null ==>
        (∃(i: int) ::
            ((0 <= i < exit_self.size) ∧
                exit_self.elements_equal_role[i])))
}