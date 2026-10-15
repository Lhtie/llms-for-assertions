predicate spec(param: record[], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], ret: nonetype) {
    var len: int = 
        exit_self.length;
    (∀(i: int) ::
        ((0 <= i < len) ==>
            (((exit_self.bits[i] == false) ∧
                (exit_self.cardinality == 0)) ∧
                (exit_self.empty == true))))
}