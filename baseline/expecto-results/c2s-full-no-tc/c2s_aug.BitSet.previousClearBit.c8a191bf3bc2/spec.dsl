predicate spec(param: record[fromIndex: int], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_result: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_result: bool], ret: int) {
    var f: int = 
        param.fromIndex;
    var r: int = ret;
    (((r >= 0) ==>
        (∀(i: int) ::
            (((r < i) ∧ (i <= f)) ==>
                entry_self.bits[i]))) ∧
        ((r == (-1)) ==>
            (∀(i: int) ::
                (((0 <= i) ∧ (i <= f)) ==>
                    entry_self.bits[i]))))
}