predicate spec(param: record[index: int, element: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_element: list[bool], elements_identical_element: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_element: list[bool], elements_identical_element: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: nonetype) {
    (((0 <= param.index) ∧
        (param.index <= entry_self.size)) ==>
        unchanged_before_index(entry_self, exit_self, param.index))
}

predicate unchanged_before_index(entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_element: list[bool], elements_identical_element: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_element: list[bool], elements_identical_element: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], idx: int) {
    (∀(i: int) ::
        ((0 <= i < idx) ==>
            unchanged_at(entry_self, exit_self, i)))
}

predicate unchanged_at(entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_element: list[bool], elements_identical_element: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_element: list[bool], elements_identical_element: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], i: int) {
    (((0 <= i) ∧
        (i < entry_self.size)) ==>
        exit_self.elements_equal_entry[((i * entry_self.size) +
            i)])
}