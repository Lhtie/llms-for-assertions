predicate spec(param: record[], entry_self: record[size: int, number_of_sets: int], exit_self: record[size: int, number_of_sets: int], ret: nonetype) {
    (entry_self.size == exit_self.size)
}