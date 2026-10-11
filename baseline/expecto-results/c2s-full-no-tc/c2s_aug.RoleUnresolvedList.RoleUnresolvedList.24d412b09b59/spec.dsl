predicate spec(param: record[list: record[is_null: bool, size: int, empty: bool]], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements_null: list[bool], equals_list: bool, elements_equal_list: list[bool], elements_identical_list: list[bool]], ret: nonetype) {
    ((¬ param.list.is_null) ==>
        ((exit_self.equals_list ∧
            (exit_self.size == param.list.size)) ∧
            (exit_self.empty == param.list.empty)))
}