predicate spec(param: record[attribute: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_attribute: list[bool], elements_identical_attribute: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_attribute: list[bool], elements_identical_attribute: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: nonetype) {
    var n: int = 
        len(exit_self.elements_null);
    ((param.attribute.is_null ==>
        (∃(i: int) ::
            ((0 <= i < n) ∧
                exit_self.elements_null[i]))) ∧
        ((¬ param.attribute.is_null) ==>
            (∃(i: int) ::
                ((0 <= i < n) ∧
                    exit_self.elements_identical_attribute[i]))))
}