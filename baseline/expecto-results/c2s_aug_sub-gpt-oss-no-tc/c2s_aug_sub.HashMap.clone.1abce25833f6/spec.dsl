predicate spec(param: record[], entry_self: record[size: int, empty: bool], exit_self: record[size: int, empty: bool], ret: record[is_null: bool, size: int, empty: bool, same_receiver: bool]) {
    ((ret.size == entry_self.size) ∧
        (exit_self.size == entry_self.size))
}