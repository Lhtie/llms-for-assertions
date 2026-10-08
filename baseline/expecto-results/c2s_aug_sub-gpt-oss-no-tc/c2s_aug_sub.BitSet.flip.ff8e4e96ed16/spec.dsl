predicate spec(param: record[bitIndex: int], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_bitIndex: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_bitIndex: bool], ret: nonetype) {
    var idx: int = 
        param.bitIndex;
    var len: int = 
        entry_self.length;
    (((((0 <= idx) ∧
        (idx < len)) ∧
        (exit_self.bits[idx] != entry_self.bits[idx])) ∧
        (∀(i: int) ::
            (((0 <= i < len) ∧
                (i != idx)) ==>
                (exit_self.bits[i] == entry_self.bits[i])))) ∧
        (exit_self.bit_at_bitIndex != entry_self.bit_at_bitIndex))
}