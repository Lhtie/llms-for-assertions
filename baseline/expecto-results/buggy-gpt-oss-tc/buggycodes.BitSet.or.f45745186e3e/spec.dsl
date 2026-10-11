predicate spec(param: record[set: record[is_null: bool, length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]]], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], ret: nonetype) {
    var res_len: int = 
        len(exit_self.bits);
    (∀(i: int) ::
        ((0 <= i < res_len) ==>
            (exit_self.bits[i] == (((i < entry_self.length) ∧
                entry_self.bits[i]) ∨
                ((i < param.set.length) ∧
                    param.set.bits[i])))))
}