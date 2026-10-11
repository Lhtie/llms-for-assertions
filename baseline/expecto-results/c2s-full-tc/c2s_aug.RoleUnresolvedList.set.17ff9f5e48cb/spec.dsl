predicate spec(param: record[index: int, element: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_element: list[bool], elements_identical_element: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_element: list[bool], elements_identical_element: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: record[is_null: bool, entry_elements_equal: list[bool], entry_elements_identical: list[bool], exit_elements_equal: list[bool], exit_elements_identical: list[bool]]) {
    var idx: int = param.index;
    var sz: int = 
        entry_self.size;
    ((0 <= idx < sz) ==>
        (∀(i: int) ::
            ((idx < i < sz) ==>
                exit_self.elements_identical_entry[((i * sz) + i)])))
}