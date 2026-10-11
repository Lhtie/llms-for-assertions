predicate spec(param: record[o: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_o: list[bool], elements_identical_o: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_o: list[bool], elements_identical_o: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: bool) {
    (∃(i: int) ::
        ((0 <= i < exit_self.size) ∧
            (((¬ param.o.is_null) ∧
                exit_self.elements_equal_o[i]) ∨
                (param.o.is_null ∧
                    exit_self.elements_null[i]))))
}