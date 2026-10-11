predicate spec(param: record[set: record[is_null: bool, length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]]], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]], ret: nonetype) {
    var max_len: int = 
        (if (entry_self.length >= param.set.length) then
            entry_self.length
        else
            param.set.length);
    ((exit_self.length == max_len) ∧
        (∀(i: int) ::
            ((0 <= i < max_len) ==>
                (exit_self.bits[i] == (get_bit(entry_self.bits, i) != get_bit(param.set.bits, i))))))
}

function get_bit(bits: list[bool], i: int) -> bool {
    (if ((0 <= i) ∧
        (i < len(bits))) then bits[i] else false)
}