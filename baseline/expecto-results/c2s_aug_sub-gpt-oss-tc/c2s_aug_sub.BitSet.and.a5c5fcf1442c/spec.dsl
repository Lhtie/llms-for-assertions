predicate spec(param: record[set: record[is_null: bool, length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]]], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], ret: nonetype) {
    (∀(i: int) ::
        ((0 <= i < len(exit_self.bits)) ==>
            (((i < len(entry_self.bits)) ∧
                (i < len(param.set.bits))) ==>
                ((exit_self.bits[i] == (entry_self.bits[i] ∧
                    param.set.bits[i])) ∧
                    (((i >= len(entry_self.bits)) ∨
                        (i >= len(param.set.bits))) ==>
                        (¬ exit_self.bits[i]))))))
}