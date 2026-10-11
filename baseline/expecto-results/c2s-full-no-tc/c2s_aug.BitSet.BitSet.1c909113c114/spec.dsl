predicate spec(param: record[nbits: int], entry_self: nonetype, exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], ret: nonetype) {
    var nbits: int = 
        param.nbits;
    ((nbits >= 0) ==>
        (((exit_self.cardinality == 0) ∧
            (exit_self.empty == true)) ∧
            (∀(i: int) ::
                ((0 <= i < exit_self.length) ==>
                    (exit_self.bits[i] == false)))))
}