predicate spec(param: record[fromIndex: int, toIndex: int], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], ret: nonetype) {
    var f: int = 
        param.fromIndex;
    var t: int = param.toIndex;
    (∀(i: int) ::
        (((0 <= i < entry_self.length) ∧
            ((i < f) ∨ (i >= t))) ==>
            (entry_self.bits[i] == exit_self.bits[i])))
}