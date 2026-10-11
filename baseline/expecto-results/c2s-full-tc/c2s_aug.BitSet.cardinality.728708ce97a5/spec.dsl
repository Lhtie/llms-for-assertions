predicate spec(param: record[], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_result: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_result: bool], ret: int) {
    (((entry_self.cardinality >= 0) ∧
        (exit_self.cardinality >= 0)) ∧
        (ret >= 0))
}