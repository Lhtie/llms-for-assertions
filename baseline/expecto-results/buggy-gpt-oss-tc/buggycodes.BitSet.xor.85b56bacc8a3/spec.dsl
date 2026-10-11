predicate spec(param: record[set: record[is_null: bool, length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]]], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], ret: nonetype) {
    var common_len: int = 
        (if (entry_self.length <= exit_self.length) then
            entry_self.length
        else
            exit_self.length);
    (∀(i: int) ::
        ((0 <= i < common_len) ==>
            ((exit_self.bits[i] == ((if (i < entry_self.length) then
                entry_self.bits[i]
            else
                false) ∧
                (¬ (if (i < param.set.length) then
                    param.set.bits[i]
                else
                    false)))) ∨
                ((¬ (if (i < entry_self.length) then
                    entry_self.bits[i]
                else
                    false)) ∧
                    (if (i < param.set.length) then
                        param.set.bits[i]
                    else
                        false)))))
}