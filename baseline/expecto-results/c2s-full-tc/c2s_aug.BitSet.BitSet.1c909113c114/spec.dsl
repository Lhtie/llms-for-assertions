predicate spec(param: record[nbits: int], entry_self: nonetype, exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], ret: nonetype) {
    var n: int = param.nbits;
    var len: int = 
        exit_self.length;
    ((n >= 0) ==>
        ((exit_self.empty ∧
            (exit_self.cardinality == 0)) ∧
            (∀(i: int) ::
                ((0 <= i < len) ==>
                    (¬ exit_self.bits[i])))))
}