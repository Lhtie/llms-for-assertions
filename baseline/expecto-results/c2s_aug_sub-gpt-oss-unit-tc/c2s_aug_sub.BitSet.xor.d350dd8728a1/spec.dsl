predicate spec(param: record[set: record[is_null: bool, length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]]], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], ret: nonetype) {
    (∀(i: int) ::
        (((0 <= i < len(entry_self.bits)) ∨
            (0 <= i < len(param.set.bits))) ==>
            (exit_self.bits[i] == ((if (i < len(entry_self.bits)) then
                entry_self.bits[i]
            else
                false) != (if (i < len(param.set.bits)) then
                param.set.bits[i]
            else
                false)))))
}