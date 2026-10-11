predicate spec(param: record[fromIndex: int, toIndex: int, value: bool], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], ret: nonetype) {
    var len: int = 
        entry_self.length;
    var f: int = 
        param.fromIndex;
    var t: int = param.toIndex;
    var v: bool = param.value;
    ((((0 <= f) ∧ (f <= t)) ∧
        (t <= len)) ==>
        (∀(i: int) ::
            ((f <= i < t) ==>
                (exit_self.bits[i] == v))))
}