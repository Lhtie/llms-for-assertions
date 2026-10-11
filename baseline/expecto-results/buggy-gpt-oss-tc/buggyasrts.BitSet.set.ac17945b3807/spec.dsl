predicate spec(param: record[fromIndex: int, toIndex: int], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], ret: nonetype) {
    (valid_half_open(param, entry_self.length) ∧
        (∀(i: int) ::
            ((param.fromIndex <= i < param.toIndex) ==>
                (¬ exit_self.bits[i]))))
}

predicate valid_half_open(param: record[fromIndex: int, toIndex: int], len: int) {
    true
}