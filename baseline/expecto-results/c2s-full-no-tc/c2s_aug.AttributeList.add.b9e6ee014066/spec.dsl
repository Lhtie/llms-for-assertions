predicate spec(param: record[attribute: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_attribute: list[bool], elements_identical_attribute: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_attribute: list[bool], elements_identical_attribute: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: nonetype) {
    (((exit_self.size == (entry_self.size + 1)) ∧
        (exit_self.elements_equal_attribute[(exit_self.size - 1)] == true)) ∧
        (∀(i: int) ::
            ((0 <= i < entry_self.size) ==>
                (exit_self.elements_identical_attribute[i] == entry_self.elements_identical_attribute[i]))))
}