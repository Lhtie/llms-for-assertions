predicate spec(param: record[role: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_role: list[bool], elements_identical_role: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_role: list[bool], elements_identical_role: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: nonetype) {
    ((param.role.is_null ==>
        true) ∧
        ((¬ param.role.is_null) ==>
            ((exit_self.size > 0) ∧
                (exit_self.elements_identical_role[(exit_self.size - 1)] == true))))
}