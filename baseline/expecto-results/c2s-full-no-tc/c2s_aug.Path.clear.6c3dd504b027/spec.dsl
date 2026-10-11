predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements_null: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: nonetype) {
    (exit_self.size == 0)
}