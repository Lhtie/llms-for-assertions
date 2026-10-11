predicate spec(param: record[fromIndex: int], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_result: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_result: bool], ret: int) {
    var f: int = 
        param.fromIndex;
    ((ret >= 0) ==>
        ((∀(i: int) ::
            ((f <= i < ret) ==>
                (¬ exit_self.bits[i]))) ∧
            ((ret >= 0) ==>
                exit_self.bit_at_result)))
}