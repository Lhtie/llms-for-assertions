predicate spec(param: record[bitIndex: int, value: bool], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_bitIndex: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_bitIndex: bool], ret: nonetype) {
    var idx: int = 
        param.bitIndex;
    var val: bool = param.value;
    ((idx >= 0) ==>
        (exit_self.bit_at_bitIndex == val))
}