predicate spec(param: record[list: record[is_null: bool, size: int, empty: bool]], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements_null: list[bool], equals_list: bool, elements_equal_list: list[bool], elements_identical_list: list[bool]], ret: nonetype) {
    ((¬ param.list.is_null) ==>
        (∃(i: int) ::
            ((0 <= i < param.list.size) ∧
                exit_self.elements_equal_list[i])))
}