predicate spec(param: record[], entry_self: record[size: int],
               exit_self: record[size: int], ret: int) {
    ret == entry_self.size and exit_self.size == entry_self.size
}
