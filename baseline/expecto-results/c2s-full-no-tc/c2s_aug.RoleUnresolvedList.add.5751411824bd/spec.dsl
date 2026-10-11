predicate spec(param: record[index: int, element: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_element: list[bool], elements_identical_element: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_element: list[bool], elements_identical_element: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: nonetype) {
    ((0 <= param.index <= entry_self.size) ==>
        (∀(i: int) ::
            ((0 <= i < param.index) ==>
                exit_self.elements_equal_entry[((i * entry_self.size) +
                    i)])))
}