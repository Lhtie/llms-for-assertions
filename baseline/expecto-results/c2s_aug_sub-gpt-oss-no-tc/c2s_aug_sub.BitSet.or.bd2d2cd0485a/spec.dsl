function BitAt(bits: list[bool], i: int) -> bool {
    (if (i < len(bits)) then bits[i] else false)
}

predicate spec(param: record[set: record[is_null: bool, length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]]], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], ret: nonetype) {
    ((exit_self.length == (if (entry_self.length >= param.set.length) then
        entry_self.length
    else
        param.set.length)) ∧
        (∀(i: int) ::
            ((0 <= i < exit_self.length) ==>
                (exit_self.bits[i] == (BitAt(entry_self.bits, i) ∨
                    BitAt(param.set.bits, i))))))
}