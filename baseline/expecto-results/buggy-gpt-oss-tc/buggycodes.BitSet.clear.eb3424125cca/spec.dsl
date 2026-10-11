predicate spec(param: record[], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], ret: nonetype) {
    (∀(i: int) ::
        ((0 <= i < exit_self.length) ==>
            (((¬ exit_self.bits[i]) ∧
                (exit_self.cardinality == 0)) ∧
                (exit_self.empty == true))))
}