predicate spec(param: record[bitIndex: int], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_bitIndex: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_bitIndex: bool], ret: nonetype) {
    var n: int = 
        entry_self.length;
    ((param.bitIndex >= 0) ==>
        (∀(i: int) ::
            (((0 <= i < n) ∧
                (i != param.bitIndex)) ==>
                (exit_self.bits[i] == entry_self.bits[i]))))
}