predicate spec(param: record[index: int, attribute: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_attribute: list[bool], elements_identical_attribute: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_attribute: list[bool], elements_identical_attribute: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: nonetype) {
    var len: int = 
        entry_self.size;
    ((0 <= param.index < len) ==>
        (∀(j: int) ::
            ((param.index < j < len) ==>
                exit_self.elements_identical_entry[((j * len) + j)])))
}