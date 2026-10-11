predicate spec(param: record[index: int, element: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_element: list[bool], elements_identical_element: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_element: list[bool], elements_identical_element: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: nonetype) {
    (((0 <= param.index) ∧
        (param.index <= entry_self.size)) ==>
        (((shift_preserve_bool(entry_self.elements_null, exit_self.elements_null, param.index) ∧
            shift_preserve_bool(entry_self.elements_equal_element, exit_self.elements_equal_element, param.index)) ∧
            shift_preserve_bool(entry_self.elements_identical_element, exit_self.elements_identical_element, param.index)) ∧
            (exit_self.size == (entry_self.size + 1))))
}

predicate shift_preserve_bool(old: list[bool], new: list[bool], idx: int) {
    var old_len: int = len(old);
    var new_len: int = len(new);
    (((new_len == (old_len + 1)) ∧
        (∀(i: int) ::
            ((0 <= i < idx) ==>
                (old[i] == new[i])))) ∧
        (∀(i: int) ::
            ((idx <= i < old_len) ==>
                (new[(i + 1)] == old[i]))))
}