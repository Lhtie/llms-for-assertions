predicate spec(param: record[fromIndex: int, toIndex: int, value: bool], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], ret: nonetype) {
    var in_len: int = 
        entry_self.length;
    var out_len: int = 
        exit_self.length;
    (∀(i: int) ::
        ((((((param.fromIndex <= i) ∧
            (i <= param.toIndex)) ∧
            (0 <= i)) ∧
            (i < in_len)) ∧
            (i < out_len)) ==>
            (exit_self.bits[i] == param.value)))
}