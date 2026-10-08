predicate spec(param: record[fromIndex: int, toIndex: int, value: bool], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], ret: nonetype) {
    (valid_range(param, entry_self) ==>
        (∀(i: int) ::
            (((0 <= i < entry_self.length) ∧
                ((i < param.fromIndex) ∨
                    (i >= param.toIndex))) ==>
                (entry_self.bits[i] == exit_self.bits[i]))))
}

predicate valid_range(param: record[fromIndex: int, toIndex: int, value: bool], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool]) {
    var fromIdx: int = 
        param.fromIndex;
    var toIdx: int = 
        param.toIndex;
    var len: int = 
        entry_self.length;
    (((0 <= fromIdx) ∧
        (fromIdx <= toIdx)) ∧
        (toIdx <= len))
}