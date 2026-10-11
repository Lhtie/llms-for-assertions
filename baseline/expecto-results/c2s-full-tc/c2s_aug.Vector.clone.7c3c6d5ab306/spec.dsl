predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: record[is_null: bool, size: int, empty: bool, elements: list[option[int]], same_receiver: bool]) {
    ((((vectors_equal(entry_self, exit_self) ∧
        (entry_self.size == ret.size)) ∧
        (entry_self.empty == ret.empty)) ∧
        (entry_self.elements == ret.elements)) ∧
        (¬ ret.is_null))
}

predicate vectors_equal(v1: record[size: int, empty: bool, elements: list[option[int]]], v2: record[size: int, empty: bool, elements: list[option[int]]]) {
    (((v1.size == v2.size) ∧
        (v1.empty == v2.empty)) ∧
        (v1.elements == v2.elements))
}