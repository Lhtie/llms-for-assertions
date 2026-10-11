predicate spec(param: record[], entry_self: record[size: int, empty: bool], exit_self: record[size: int, empty: bool], ret: nonetype) {
    (exit_self.empty ∧
        (exit_self.size == 0))
}