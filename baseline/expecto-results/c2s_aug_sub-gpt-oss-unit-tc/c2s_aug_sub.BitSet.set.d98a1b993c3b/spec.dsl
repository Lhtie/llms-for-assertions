predicate valid_range(param: record[fromIndex: int, toIndex: int], self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool]) {
    (((0 <= param.fromIndex) ∧
        (param.fromIndex <= param.toIndex)) ∧
        (param.toIndex <= self.length))
}

predicate bits_true_range(bits: list[bool], from: int, to: int) {
    (∀(i: int) ::
        (((from <= i) ∧ (i < to)) ==>
            (bits[i] == true)))
}

predicate spec(param: record[fromIndex: int, toIndex: int], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], ret: nonetype) {
    (valid_range(param, entry_self) ==>
        bits_true_range(exit_self.bits, param.fromIndex, param.toIndex))
}