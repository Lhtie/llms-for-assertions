predicate spec(param: record[index: int, attribute: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_attribute: list[bool], elements_identical_attribute: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_attribute: list[bool], elements_identical_attribute: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: nonetype) {
    var idx: int = param.index;
    var attr_null: bool = 
        param.attribute.is_null;
    ((0 <= idx < entry_self.size) ==>
        ((((exit_self.size == entry_self.size) ∧
            (exit_self.empty == entry_self.empty)) ∧
            (exit_self.elements_null[idx] == attr_null)) ∧
            (exit_self.elements_identical_attribute[idx] == true)))
}