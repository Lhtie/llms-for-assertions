predicate spec(param: record[], entry_self: nonetype, exit_self: record[size: int, empty: bool, elements_null: list[bool]], ret: nonetype) {
    ((exit_self.empty ∧
        (exit_self.size == 0)) ∧
        (len(exit_self.elements_null) == 0))
}