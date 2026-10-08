predicate spec(param: record[fromIndex: int, toIndex: int], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], ret: nonetype) {
    var n: int = 
        len(entry_self.bits);
    ((len(entry_self.bits) == len(exit_self.bits)) ∧
        (∀(i: int) ::
            (((0 <= i < n) ∧
                (¬ (param.fromIndex <= i < param.toIndex))) ==>
                (entry_self.bits[i] == exit_self.bits[i]))))
}