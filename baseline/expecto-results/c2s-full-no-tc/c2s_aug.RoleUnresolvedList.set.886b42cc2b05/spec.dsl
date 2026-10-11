predicate spec(param: record[index: int, role: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_role: list[bool], elements_identical_role: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_role: list[bool], elements_identical_role: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: nonetype) {
    (((0 <= param.index < entry_self.size) ∧
        (¬ param.role.is_null)) ==>
        ((entry_self.size == exit_self.size) ∧
            (∀(i: int) ::
                ((param.index < i < entry_self.size) ==>
                    exit_self.elements_equal_entry[((i * entry_self.size) +
                        i)]))))
}