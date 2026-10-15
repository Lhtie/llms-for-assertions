predicate spec(param: record[fromIndex: int, toIndex: int], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], ret: nonetype) {
    (∀(i: int) ::
        ((((0 <= i < len(entry_self.bits)) ∧
            (0 <= i < len(exit_self.bits))) ∧
            ((i < param.fromIndex) ∨
                (i >= param.toIndex))) ==>
            (exit_self.bits[i] == entry_self.bits[i])))
}