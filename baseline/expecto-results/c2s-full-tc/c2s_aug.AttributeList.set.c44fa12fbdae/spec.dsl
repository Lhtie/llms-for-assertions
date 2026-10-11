predicate spec(param: record[index: int, attribute: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_attribute: list[bool], elements_identical_attribute: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_attribute: list[bool], elements_identical_attribute: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: nonetype) {
    (((0 <= param.index) ∧
        (param.index < entry_self.size)) ==>
        (∀(i: int) ::
            ((0 <= i < param.index) ==>
                (((exit_self.elements_null[i] == entry_self.elements_null[i]) ∧
                    (exit_self.elements_equal_attribute[i] == entry_self.elements_equal_attribute[i])) ∧
                    (exit_self.elements_identical_attribute[i] == entry_self.elements_identical_attribute[i])))))
}