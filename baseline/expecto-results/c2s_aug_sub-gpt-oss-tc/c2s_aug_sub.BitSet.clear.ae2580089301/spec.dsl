predicate spec(param: record[bitIndex: int], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_bitIndex: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_bitIndex: bool], ret: nonetype) {
    var i: int = param.bitIndex;
    var n: int = 
        entry_self.length;
    ((0 <= i < n) ==>
        ((exit_self.bit_at_bitIndex == false) ∧
            (exit_self.bits[i] == false)))
}