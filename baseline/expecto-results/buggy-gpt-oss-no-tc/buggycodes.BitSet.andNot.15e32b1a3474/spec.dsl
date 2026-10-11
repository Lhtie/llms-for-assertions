predicate spec(param: record[set: record[is_null: bool, length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]]], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], ret: nonetype) {
    (∀(i: int) ::
        ((0 <= i < exit_self.length) ==>
            (exit_self.bits[i] == (BitAt(entry_self.bits, entry_self.length, i) ∧
                (¬ BitAt(param.set.bits, param.set.length, i))))))
}

function BitAt(bits: list[bool], len: int, i: int) -> (value: bool) {
    ensure (((0 <= i) ∧ (i < len)) ==>
    (value == bits[i]));
    ensure (((i < 0) ∨ (i >= len)) ==>
    (value == false));
}