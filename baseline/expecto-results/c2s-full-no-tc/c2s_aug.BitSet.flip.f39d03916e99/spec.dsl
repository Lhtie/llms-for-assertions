predicate spec(param: record[bitIndex: int], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_bitIndex: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_bitIndex: bool], ret: nonetype) {
    var idx: int = 
        param.bitIndex;
    ((((0 <= idx < entry_self.length) ∧
        (exit_self.length == entry_self.length)) ∧
        BitsEqualExcept(entry_self.bits, exit_self.bits, idx)) ∧
        (exit_self.bit_at_bitIndex != entry_self.bit_at_bitIndex))
}

predicate BitsEqualExcept(bits1: list[bool], bits2: list[bool], idx: int) {
    ((len(bits1) == len(bits2)) ∧
        (∀(i: int) ::
            (((0 <= i < len(bits1)) ∧
                (i != idx)) ==>
                (bits1[i] == bits2[i]))))
}