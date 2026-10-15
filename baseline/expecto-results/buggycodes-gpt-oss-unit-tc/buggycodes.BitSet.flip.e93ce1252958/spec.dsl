predicate spec(param: record[fromIndex: int, toIndex: int], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], ret: nonetype) {
    var valid_range: bool = 
        (((((0 <= param.fromIndex) ∧
            (param.fromIndex < entry_self.length)) ∧
            (0 <= param.toIndex)) ∧
            (param.toIndex < entry_self.length)) ∧
            (param.fromIndex <= param.toIndex));
    valid_range
}