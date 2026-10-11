predicate spec(param: record[role: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_role: list[bool], elements_identical_role: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_role: list[bool], elements_identical_role: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: nonetype) {
    ((param.role.is_null ==>
        (((((exit_self.size == entry_self.size) ∧
            (exit_self.empty == entry_self.empty)) ∧
            (exit_self.elements_null == entry_self.elements_null)) ∧
            (exit_self.elements_equal_role == entry_self.elements_equal_role)) ∧
            (exit_self.elements_identical_role == entry_self.elements_identical_role))) ∧
        ((¬ param.role.is_null) ==>
            ((((exit_self.size == (entry_self.size + 1)) ∧
                (exit_self.empty == false)) ∧
                unchanged_prefix(entry_self, exit_self)) ∧
                new_last_is_role(entry_self, exit_self))))
}

predicate unchanged_prefix(entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_role: list[bool], elements_identical_role: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_role: list[bool], elements_identical_role: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]]) {
    (∀(i: int) ::
        ((0 <= i < entry_self.size) ==>
            (((entry_self.elements_null[i] == exit_self.elements_null[i]) ∧
                (entry_self.elements_equal_role[i] == exit_self.elements_equal_role[i])) ∧
                (entry_self.elements_identical_role[i] == exit_self.elements_identical_role[i]))))
}

predicate new_last_is_role(entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_role: list[bool], elements_identical_role: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_role: list[bool], elements_identical_role: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]]) {
    (((exit_self.elements_null[entry_self.size] == false) ∧
        (exit_self.elements_equal_role[entry_self.size] == true)) ∧
        (exit_self.elements_identical_role[entry_self.size] == true))
}