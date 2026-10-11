predicate spec(param: record[bitIndex: int], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_bitIndex: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_bitIndex: bool], ret: nonetype) {
    ((param.bitIndex >= 0) ==>
        bits_unchanged_except(entry_self.bits, exit_self.bits, param.bitIndex))
}

predicate bits_unchanged_except(b1: list[bool], b2: list[bool], idx: int) {
    var l: int = len(b1);
    ((len(b2) == l) ∧
        (∀(i: int) ::
            (((0 <= i < l) ∧
                (i != idx)) ==>
                (b1[i] == b2[i]))))
}