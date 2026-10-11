predicate spec(param: record[index: int, element: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_element: list[bool], elements_identical_element: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_element: list[bool], elements_identical_element: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: record[is_null: bool, entry_elements_equal: list[bool], entry_elements_identical: list[bool], exit_elements_equal: list[bool], exit_elements_identical: list[bool]]) {
    ((0 <= param.index < entry_self.size) ==>
        (ret.entry_elements_identical[param.index] ∧
            (ret.is_null == entry_self.elements_null[param.index])))
}