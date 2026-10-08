predicate valid_range(param: record[fromIndex: int, toIndex: int], len: int) {
    ((((0 <= param.fromIndex) ∧
        (0 <= param.toIndex)) ∧
        (param.fromIndex <= param.toIndex)) ∧
        (param.toIndex <= len))
}

predicate spec(param: record[fromIndex: int, toIndex: int], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], ret: nonetype) {
    ((valid_range(param, entry_self.length) ==>
        (∀(i: int) ::
            ((param.fromIndex <= i < param.toIndex) ==>
                (exit_self.bits[i] == true)))) ∧
        (entry_self.length == exit_self.length))
}