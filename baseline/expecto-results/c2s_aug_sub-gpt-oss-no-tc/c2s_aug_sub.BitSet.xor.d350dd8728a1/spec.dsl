predicate spec(param: record[set: record[is_null: bool, length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]]], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], ret: nonetype) {
    var len: int = 
        exit_self.length;
    (∀(i: int) ::
        ((0 <= i < len) ==>
            (exit_self.bits[i] == (BitValue(entry_self.bits, i) != BitValue(param.set.bits, i)))))
}

function BitValue(bits: list[bool], i: int) -> (value: bool) {
    ensure ((((0 <= i) ∧
    (i < len(bits))) ==>
    (value == bits[i])) ∧
    (((i < 0) ∨
        (i >= len(bits))) ==>
        (value == false)));
}