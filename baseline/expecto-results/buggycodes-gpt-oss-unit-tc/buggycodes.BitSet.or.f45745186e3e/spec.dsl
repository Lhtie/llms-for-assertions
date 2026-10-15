predicate spec(param: record[set: record[is_null: bool, length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]]], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], ret: nonetype) {
    ((exit_self.length == max_int(entry_self.length, param.set.length)) ∧
        (∀(i: int) ::
            ((0 <= i < exit_self.length) ==>
                (exit_self.bits[i] == (effective_bit(entry_self.bits, i) ∨
                    effective_bit(param.set.bits, i))))))
}

function max_int(a: int, b: int) -> (max: int) {
    ensure (((max == a) ∨ (max == b)) ∧
    ((max >= a) ∧ (max >= b)));
}

function effective_bit(bits: list[bool], i: int) -> (value: bool) {
    ensure ((((0 <= i) ∧
    (i < len(bits))) ==>
    (value == bits[i])) ∧
    (((i < 0) ∨
        (i >= len(bits))) ==>
        (value == false)));
}