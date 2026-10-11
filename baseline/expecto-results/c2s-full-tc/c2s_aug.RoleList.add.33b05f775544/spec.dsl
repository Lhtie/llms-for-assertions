predicate spec(param: record[role: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_role: list[bool], elements_identical_role: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_role: list[bool], elements_identical_role: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: nonetype) {
    var last_idx: int = 
        (exit_self.size - 1);
    (((exit_self.size == entry_self.size) ∨
        ((exit_self.size == (entry_self.size + 1)) ∧
            exit_self.elements_identical_role[last_idx])) ∧
        (∀(i: int) ::
            ((0 <= i < entry_self.size) ==>
                (exit_self.elements_identical_role[i] == entry_self.elements_identical_role[i]))))
}