predicate spec(param: record[bitIndex: int], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_bitIndex: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_bitIndex: bool], ret: nonetype) {
    var len: int = 
        entry_self.length;
    ((((0 <= param.bitIndex) ∧
        (param.bitIndex < len)) ==>
        ((exit_self.bits[param.bitIndex] != entry_self.bits[param.bitIndex]) ∧
            (∀(i: int) ::
                ((((0 <= i) ∧ (i < len)) ∧
                    (i != param.bitIndex)) ==>
                    (exit_self.bits[i] == entry_self.bits[i]))))) ∧
        (((param.bitIndex < 0) ∨
            (param.bitIndex >= len)) ==>
            (∀(i: int) ::
                (((0 <= i) ∧ (i < len)) ==>
                    (exit_self.bits[i] == entry_self.bits[i])))))
}