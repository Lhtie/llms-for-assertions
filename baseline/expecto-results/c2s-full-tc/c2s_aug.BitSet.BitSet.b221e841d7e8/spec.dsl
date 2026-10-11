predicate spec(param: record[], entry_self: nonetype, exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], ret: nonetype) {
    (((exit_self.cardinality == 0) ∧
        (exit_self.empty == true)) ∧
        all(lambda (b) = (b == false), exit_self.bits))
}