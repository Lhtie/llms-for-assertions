predicate spec(param: record[fromIndex: int, toIndex: int], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], ret: nonetype) {
    (∀(i: int) ::
        (InValidHalfOpen(i, param, exit_self) ==>
            (exit_self.bits[i] == true)))
}

predicate InValidHalfOpen(i: int, param: record[fromIndex: int, toIndex: int], self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool]) {
    ((((0 <= i) ∧
        (i < self.length)) ∧
        (i >= param.fromIndex)) ∧
        (i < param.toIndex))
}