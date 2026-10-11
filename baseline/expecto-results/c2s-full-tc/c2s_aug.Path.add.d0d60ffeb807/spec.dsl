predicate spec(param: record[edge: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_edge: list[bool], elements_identical_edge: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_edge: list[bool], elements_identical_edge: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: nonetype) {
    ((param.edge.is_null ==>
        (∃(i: int) ::
            ((0 <= i < exit_self.size) ∧
                exit_self.elements_null[i]))) ∧
        ((¬ param.edge.is_null) ==>
            (∃(i: int) ::
                ((0 <= i < exit_self.size) ∧
                    exit_self.elements_equal_edge[i]))))
}