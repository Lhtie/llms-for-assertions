predicate spec(param: record[], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements_null: list[bool]], ret: nonetype) {
    (((exit_self.empty == true) ∧
        (exit_self.size == 0)) ∧
        (∀(i: int) ::
            ((0 <= i < len(exit_self.elements_null)) ==>
                (exit_self.elements_null[i] == true))))
}