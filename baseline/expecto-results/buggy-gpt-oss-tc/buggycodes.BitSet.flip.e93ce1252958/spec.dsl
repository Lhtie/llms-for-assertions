predicate spec(param: record[fromIndex: int, toIndex: int], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], ret: nonetype) {
    ((valid_range(param, entry_self) ==>
        bits_toggled_in_range(entry_self, exit_self, param.fromIndex, param.toIndex)) ∧
        ((¬ valid_range(param, entry_self)) ==>
            (∀(i: int) ::
                ((0 <= i < entry_self.length) ==>
                    (exit_self.bits[i] == entry_self.bits[i])))))
}

predicate valid_range(p: record[fromIndex: int, toIndex: int], s: record[length: int, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], empty: bool, cardinality: int, bit_at_fromIndex: bool, bit_at_toIndex: bool]) {
    (((0 <= p.fromIndex) ∧
        (p.fromIndex <= p.toIndex)) ∧
        (p.toIndex < s.length))
}

predicate bits_toggled_in_range(entry: record[length: int, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], empty: bool, cardinality: int, bit_at_fromIndex: bool, bit_at_toIndex: bool], exit: record[length: int, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], empty: bool, cardinality: int, bit_at_fromIndex: bool, bit_at_toIndex: bool], from: int, to: int) {
    ((exit.length == entry.length) ∧
        (∀(i: int) ::
            ((0 <= i < entry.length) ==>
                ((((from <= i) ∧ (i <= to)) ==>
                    (exit.bits[i] != entry.bits[i])) ∧
                    ((¬ ((from <= i) ∧ (i <= to))) ==>
                        (exit.bits[i] == entry.bits[i]))))))
}