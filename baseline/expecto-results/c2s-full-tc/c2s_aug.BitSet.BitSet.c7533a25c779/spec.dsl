predicate spec(param: record[nbits: int], entry_self: nonetype, exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], ret: nonetype) {
    ((param.nbits >= 0) ==>
        ((((exit_self.length == 0) ∧
            (exit_self.empty == true)) ∧
            (exit_self.cardinality == 0)) ∧
            (exit_self.bits == [])))
}