predicate valid_range(param: record[fromIndex: int, toIndex: int], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool]) {
    (((0 <= param.fromIndex) ∧
        (param.fromIndex <= param.toIndex)) ∧
        (param.toIndex <= entry_self.length))
}

predicate spec(param: record[fromIndex: int, toIndex: int], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], ret: nonetype) {
    (valid_range(param, entry_self) ==>
        (∀(i: int) ::
            (((0 <= i) ∧
                (i < entry_self.length)) ==>
                ((((param.fromIndex <= i) ∧
                    (i < param.toIndex)) ==>
                    (exit_self.bits[i] != entry_self.bits[i])) ∧
                    (((i < param.fromIndex) ∨
                        (i >= param.toIndex)) ==>
                        (exit_self.bits[i] == entry_self.bits[i]))))))
}