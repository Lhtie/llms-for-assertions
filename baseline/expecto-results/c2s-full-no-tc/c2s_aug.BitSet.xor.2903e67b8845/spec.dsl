predicate spec(param: record[set: record[is_null: bool, length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]]], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], ret: nonetype) {
    (∀(i: int) ::
        ((0 <= i < (if (len(entry_self.bits) >= len(param.set.bits)) then
            len(entry_self.bits)
        else
            len(param.set.bits))) ==>
            (exit_self.bits[i] == (get_bit(entry_self.bits, i) != get_bit(param.set.bits, i)))))
}

function get_bit(bits: list[bool], i: int) -> (b: bool) {
    ensure ((((0 <= i) ∧
    (i < len(bits))) ==>
    ((b == bits[i]) ∧
        (¬ ((0 <= i) ∧
            (i < len(bits)))))) ==>
    (b == false));
}