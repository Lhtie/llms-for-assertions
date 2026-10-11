predicate spec(param: record[index: int, role: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_role: list[bool], elements_identical_role: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_role: list[bool], elements_identical_role: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: nonetype) {
    var size: int = 
        entry_self.size;
    (((0 <= param.index < size) ∧
        (¬ param.role.is_null)) ==>
        (∀(i: int) ::
            ((0 <= i < param.index) ==>
                (((entry_self.elements_null[i] == exit_self.elements_null[i]) ∧
                    (entry_self.elements_equal_role[i] == exit_self.elements_equal_role[i])) ∧
                    (entry_self.elements_identical_role[i] == exit_self.elements_identical_role[i])))))
}