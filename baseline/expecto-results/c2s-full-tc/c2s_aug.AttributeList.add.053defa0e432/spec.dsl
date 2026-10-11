predicate spec(param: record[index: int, attribute: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_attribute: list[bool], elements_identical_attribute: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_attribute: list[bool], elements_identical_attribute: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: nonetype) {
    var old_sz: int = 
        entry_self.size;
    var new_sz: int = 
        exit_self.size;
    var idx: int = param.index;
    (((0 <= idx) ∧
        (idx <= old_sz)) ==>
        ((new_sz == (old_sz + 1)) ∧
            (∀(j: int) ::
                (((0 <= j < old_sz) ∧
                    (j >= idx)) ==>
                    (exit_self.elements_identical_entry[(((j + 1) * old_sz) + j)] == true)))))
}