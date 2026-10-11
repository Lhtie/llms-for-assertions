predicate spec(param: record[fromIndex: int, toIndex: int], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], ret: nonetype) {
    var from: int = 
        param.fromIndex;
    var to: int = param.toIndex;
    var n: int = 
        entry_self.length;
    ((((0 <= from) ∧
        (from <= to)) ∧
        (to <= n)) ==>
        ((∀(i: int) ::
            ((from <= i < to) ==>
                (exit_self.bits[i] != entry_self.bits[i]))) ∧
            (∀(i: int) ::
                (((i < from) ∨ (i >= to)) ==>
                    (exit_self.bits[i] == entry_self.bits[i])))))
}