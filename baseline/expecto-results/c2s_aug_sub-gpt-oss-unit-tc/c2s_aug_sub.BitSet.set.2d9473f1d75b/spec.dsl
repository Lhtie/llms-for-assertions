predicate spec(param: record[fromIndex: int, toIndex: int, value: bool], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_toIndex: bool], ret: nonetype) {
    var length: int = 
        entry_self.length;
    var from: int = 
        param.fromIndex;
    var to: int = param.toIndex;
    var val: bool = param.value;
    ((((0 <= from) ∧
        (from <= to)) ∧
        (to <= length)) ==>
        (∀(i: int) ::
            ((from <= i < to) ==>
                (exit_self.bits[i] == val))))
}