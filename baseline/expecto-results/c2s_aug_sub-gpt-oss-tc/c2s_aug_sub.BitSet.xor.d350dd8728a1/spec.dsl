predicate spec(param: record[set: record[is_null: bool, length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]]], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], ret: nonetype) {
    (∀(i: int) ::
        ((0 <= i < exit_self.length) ==>
            (exit_self.bits[i] == (BoolAt(entry_self.bits, i) != BoolAt(param.set.bits, i)))))
}

function BoolAt(bits: list[bool], i: int) -> (value: bool) {
    ensure ((((0 <= i) ∧
    (i < len(bits))) ==>
    ((value == bits[i]) ∧
        ((i < 0) ∨
            (i >= len(bits))))) ==>
    (value == false));
}