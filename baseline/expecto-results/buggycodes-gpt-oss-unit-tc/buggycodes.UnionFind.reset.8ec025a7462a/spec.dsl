predicate spec(param: record[], entry_self: record[size: int, number_of_sets: int], exit_self: record[size: int, number_of_sets: int], ret: nonetype) {
    (exit_self.number_of_sets == exit_self.size)
}