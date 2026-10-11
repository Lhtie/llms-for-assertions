predicate spec(param: record[index: int, attribute: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_attribute: list[bool], elements_identical_attribute: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_attribute: list[bool], elements_identical_attribute: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: nonetype) {
    (((0 <= param.index) ∧
        (param.index < entry_self.size)) ==>
        unchanged_before(entry_self, exit_self, param.index))
}

predicate unchanged_before(entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_attribute: list[bool], elements_identical_attribute: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_attribute: list[bool], elements_identical_attribute: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], idx: int) {
    var len_self: int = 
        len(entry_self.elements_null);
    (∀(i: int) ::
        (((0 <= i) ∧ (i < idx)) ==>
            exit_self.elements_equal_entry[((i * len_self) + i)]))
}