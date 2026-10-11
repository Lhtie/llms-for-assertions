predicate spec(param: record[fromIndex: int, toIndex: int], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], ret: nonetype) {
    var range_ok: bool = 
        valid_range(param, entry_self);
    (range_ok ==>
        bits_true_in_range(exit_self.bits, param.fromIndex, param.toIndex))
}

predicate valid_range(param: record[fromIndex: int, toIndex: int], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool]) {
    var from: int = 
        param.fromIndex;
    var to: int = param.toIndex;
    var len: int = 
        entry_self.length;
    (((0 <= from) ∧
        (from <= to)) ∧
        (to <= len))
}

predicate bits_true_in_range(bits: list[bool], from: int, to: int) {
    var len: int = len(bits);
    (∀(i: int) ::
        (((from <= i) ∧ (i < to)) ==>
            (bits[i] == true)))
}