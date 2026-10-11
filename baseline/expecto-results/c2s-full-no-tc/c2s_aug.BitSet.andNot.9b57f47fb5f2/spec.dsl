predicate spec(param: record[set: record[is_null: bool, length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]]], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], ret: nonetype) {
    var len_self: int = 
        entry_self.length;
    var len_set: int = 
        param.set.length;
    ((exit_self.length == len_self) ∧
        (∀(i: int) ::
            ((0 <= i < len_self) ==>
                (if (i < len_set) then
                    (exit_self.bits[i] == (entry_self.bits[i] ∧
                        (¬ param.set.bits[i])))
                else
                    (exit_self.bits[i] == entry_self.bits[i])))))
}