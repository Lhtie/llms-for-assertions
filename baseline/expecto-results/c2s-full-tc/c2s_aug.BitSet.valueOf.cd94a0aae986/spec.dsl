predicate spec(param: record[bytes: record[is_null: bool, elements: list[int]]], entry_self: nonetype, exit_self: nonetype, ret: record[is_null: bool, length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]]) {
    var out_len: int = 
        len(ret.bytes);
    ((¬ ret.is_null) ∧
        (∀(i: int) ::
            ((0 <= i < out_len) ==>
                (ret.bytes[i] == param.bytes.elements[i]))))
}