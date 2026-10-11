predicate spec(param: record[index: int, attribute: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_attribute: list[bool], elements_identical_attribute: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_attribute: list[bool], elements_identical_attribute: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: nonetype) {
    var old_len: int = 
        entry_self.size;
    (((0 <= param.index) ∧
        (param.index <= old_len)) ==>
        (∀(i: int) ::
            (((0 <= i) ∧
                (i < param.index)) ==>
                exit_self.elements_equal_entry[((i * old_len) + i)])))
}