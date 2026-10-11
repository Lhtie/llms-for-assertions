predicate spec(param: record[index: int, role: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_role: list[bool], elements_identical_role: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_role: list[bool], elements_identical_role: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: nonetype) {
    (((0 <= param.index < entry_self.size) ∧
        (¬ param.role.is_null)) ==>
        ((exit_self.size == entry_self.size) ∧
            (∀(i: int) ::
                ((param.index < i < entry_self.size) ==>
                    unchanged_at(i, entry_self, exit_self)))))
}

predicate unchanged_at(i: int, entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_role: list[bool], elements_identical_role: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_role: list[bool], elements_identical_role: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]]) {
    ((0 <= i < entry_self.size) ==>
        exit_self.elements_equal_entry[((i * entry_self.size) +
            i)])
}