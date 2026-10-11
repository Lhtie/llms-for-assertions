predicate spec(param: record[], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], ret: nonetype) {
    ((exit_self.empty ∧
        (exit_self.cardinality == 0)) ∧
        (∀(i: int) ::
            ((0 <= i < len(exit_self.bits)) ==>
                (¬ exit_self.bits[i]))))
}