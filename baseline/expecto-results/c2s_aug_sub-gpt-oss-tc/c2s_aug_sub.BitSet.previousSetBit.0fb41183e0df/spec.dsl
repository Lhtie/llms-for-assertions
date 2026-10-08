predicate spec(param: record[fromIndex: int], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_result: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_result: bool], ret: int) {
    var len: int = 
        entry_self.length;
    ((0 <= param.fromIndex < len) ==>
        (∀(i: int) ::
            ((ret < i <= param.fromIndex) ==>
                (¬ entry_self.bits[i]))))
}