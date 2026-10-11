predicate spec(param: record[index: int, role: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_role: list[bool], elements_identical_role: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_role: list[bool], elements_identical_role: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: nonetype) {
    var old_len: int = 
        entry_self.size;
    var new_len: int = 
        exit_self.size;
    ((((0 <= param.index) ∧
        (param.index <= old_len)) ∧
        (¬ param.role.is_null)) ==>
        (∀(p: int) ::
            (((0 <= p < old_len) ∧
                (p >= param.index)) ==>
                exit_self.elements_equal_entry[(((p + 1) * old_len) + p)])))
}