predicate spec(param: record[fromIndex: int], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_result: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_result: bool], ret: int) {
    ((ret >= 0) ==>
        ((∀(i: int) ::
            ((param.fromIndex <= i < ret) ==>
                (¬ entry_self.bits[i]))) ∧
            (entry_self.bits[ret] == true)))
}