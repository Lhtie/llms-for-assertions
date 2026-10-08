predicate spec(param: record[fromIndex: int], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_result: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_result: bool], ret: int) {
    ((ret >= 0) ==>
        ((entry_self.bits[ret] == true) ∧
            ClearBetween(entry_self.bits, param.fromIndex, ret)))
}

predicate ClearBetween(bits: list[bool], lo: int, hi: int) {
    (∀(i: int) ::
        ((lo <= i < hi) ==>
            (¬ bits[i])))
}