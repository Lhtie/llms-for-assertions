predicate spec(param: record[], entry_self: nonetype, exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], ret: nonetype) {
    ((((((exit_self.empty == true) ∧
        (exit_self.cardinality == 0)) ∧
        (∀(i: int) ::
            ((0 <= i < len(exit_self.bits)) ==>
                (exit_self.bits[i] == false)))) ∧
        (∀(i: int) ::
            ((0 <= i < len(exit_self.words_low)) ==>
                (exit_self.words_low[i] == 0)))) ∧
        (∀(i: int) ::
            ((0 <= i < len(exit_self.words_high)) ==>
                (exit_self.words_high[i] == 0)))) ∧
        (∀(i: int) ::
            ((0 <= i < len(exit_self.bytes)) ==>
                (exit_self.bytes[i] == 0))))
}