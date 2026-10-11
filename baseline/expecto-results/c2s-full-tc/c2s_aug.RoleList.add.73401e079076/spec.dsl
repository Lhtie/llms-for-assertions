predicate spec(param: record[index: int, role: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_role: list[bool], elements_identical_role: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_role: list[bool], elements_identical_role: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: nonetype) {
    var idx: int = param.index;
    var old_sz: int = 
        entry_self.size;
    (((0 <= idx <= old_sz) ∧
        (¬ param.role.is_null)) ==>
        (∀(i: int) ::
            ((0 <= i < idx) ==>
                exit_self.elements_equal_entry[((i * old_sz) + i)])))
}