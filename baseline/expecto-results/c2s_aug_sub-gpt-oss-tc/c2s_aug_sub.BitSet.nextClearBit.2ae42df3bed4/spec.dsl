predicate AllTrue(bits: list[bool], lo: int, hi: int) {
    (∀(i: int) ::
        (((lo <= i) ∧ (i < hi)) ==>
            (bits[i] == true)))
}

predicate spec(param: record[fromIndex: int], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_result: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_result: bool], ret: int) {
    (((0 <= param.fromIndex) ∧
        (param.fromIndex < entry_self.length)) ==>
        AllTrue(entry_self.bits, param.fromIndex, ret))
}