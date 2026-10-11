predicate spec(param: record[index: int, role: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_role: list[bool], elements_identical_role: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_role: list[bool], elements_identical_role: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: nonetype) {
    var entry_len: int = 
        len(entry_self.elements_null);
    (((0 <= param.index <= entry_len) ∧
        (¬ param.role.is_null)) ==>
        shifted_elements(entry_len, exit_self.elements_equal_entry, param.index))
}

predicate shifted_elements(entry_len: int, exit_eq: list[bool], index: int) {
    (∀(i: int) ::
        (((index <= i) ∧
            (i < entry_len)) ==>
            exit_eq[(((i + 1) * entry_len) +
                i)]))
}