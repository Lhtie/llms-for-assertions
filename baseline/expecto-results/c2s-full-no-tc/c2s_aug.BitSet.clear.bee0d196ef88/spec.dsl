predicate spec(param: record[fromIndex: int, toIndex: int], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], ret: nonetype) {
    var f: int = 
        param.fromIndex;
    var t: int = param.toIndex;
    var len: int = 
        entry_self.length;
    (valid_range(f, t, len) ==>
        (∀(i: int) ::
            (((f <= i) ∧ (i < t)) ==>
                (exit_self.bits[i] == false))))
}

predicate valid_range(f: int, t: int, len: int) {
    (((0 <= f) ∧ (f <= t)) ∧
        (t <= len))
}