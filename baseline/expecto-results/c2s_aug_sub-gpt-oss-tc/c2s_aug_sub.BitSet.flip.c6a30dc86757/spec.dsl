predicate spec(param: record[fromIndex: int, toIndex: int], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], ret: nonetype) {
    ((((0 <= param.fromIndex) ∧
        (param.toIndex <= entry_self.length)) ∧
        (param.fromIndex <= param.toIndex)) ==>
        ((∀(i: int) ::
            ((param.fromIndex <= i < param.toIndex) ==>
                (exit_self.bits[i] != entry_self.bits[i]))) ∧
            (∀(i: int) ::
                (((i < param.fromIndex) ∨
                    (i >= param.toIndex)) ==>
                    (exit_self.bits[i] == entry_self.bits[i])))))
}