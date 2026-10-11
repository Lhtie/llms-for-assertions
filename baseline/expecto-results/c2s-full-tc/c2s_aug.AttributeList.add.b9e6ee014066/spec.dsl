predicate spec(param: record[attribute: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_attribute: list[bool], elements_identical_attribute: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_attribute: list[bool], elements_identical_attribute: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: nonetype) {
    (∃(i: int) ::
        ((0 <= i < len(exit_self.elements_equal_attribute)) ∧
            (if param.attribute.is_null then
                exit_self.elements_null[i]
            else
                exit_self.elements_equal_attribute[i])))
}