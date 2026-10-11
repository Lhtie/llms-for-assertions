predicate spec(param: record[bitIndex: int], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_bitIndex: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_bitIndex: bool], ret: nonetype) {
    (((0 <= param.bitIndex) ∧
        (param.bitIndex < entry_self.length)) ==>
        (exit_self.bit_at_bitIndex == false))
}