predicate spec(param: record[index: int, element: record[is_null: bool]], entry_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_element: list[bool], elements_identical_element: list[bool]], exit_self: record[size: int, empty: bool, elements_null: list[bool], elements_equal_element: list[bool], elements_identical_element: list[bool], elements_equal_entry: list[bool], elements_identical_entry: list[bool]], ret: nonetype) {
    var idx: int = param.index;
    var oldSize: int = 
        entry_self.size;
    ((0 <= idx <= oldSize) ==>
        ((∀(i: int) ::
            (((0 <= i < oldSize) ∧
                (i < idx)) ==>
                (exit_self.elements_equal_entry[((i * oldSize) + i)] ∧
                    exit_self.elements_identical_entry[((i * oldSize) + i)]))) ∧
            (∀(i: int) ::
                (((0 <= i < oldSize) ∧
                    (i >= idx)) ==>
                    (exit_self.elements_equal_entry[(((i + 1) * oldSize) + i)] ∧
                        exit_self.elements_identical_entry[(((i + 1) * oldSize) + i)])))))
}