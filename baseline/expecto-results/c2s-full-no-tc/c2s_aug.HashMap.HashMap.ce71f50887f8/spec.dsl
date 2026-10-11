predicate spec(param: record[], entry_self: nonetype, exit_self: record[size: int, empty: bool], ret: nonetype) {
    ((exit_self.size == 0) ∧
        (exit_self.empty == true))
}