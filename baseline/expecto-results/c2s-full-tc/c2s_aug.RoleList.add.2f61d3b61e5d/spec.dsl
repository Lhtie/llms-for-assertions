predicate spec(param: record[index: int, element: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_element: list[bool], elements_identical_element: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_element: list[bool], elements_identical_element: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: nonetype) {
    var old_len: int = 
        entry_self.size;
    var idx: int = param.index;
    (((0 <= idx) ∧
        (idx <= old_len)) ==>
        (∀(i: int) ::
            ((0 <= i < idx) ==>
                exit_self.elements_equal_entry[((i * old_len) + i)])))
}