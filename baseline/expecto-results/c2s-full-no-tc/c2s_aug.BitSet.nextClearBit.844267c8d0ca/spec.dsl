predicate spec(param: record[fromIndex: int], entry_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_result: bool], exit_self: record[length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int], bit_at_fromIndex: bool, bit_at_result: bool], ret: int) {
    var len: int = 
        entry_self.length;
    var f: int = 
        param.fromIndex;
    var r: int = ret;
    ((¬ (0 <= f < len)) ∨
        (∀(i: int) ::
            ((f <= i < r) ==>
                (entry_self.bits[i] == true))))
}