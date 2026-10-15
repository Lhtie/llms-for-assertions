predicate spec(param: record[bytes: record[is_null: bool, elements: list[int]]], entry_self: nonetype, exit_self: nonetype, ret: record[is_null: bool, length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]]) {
    ((¬ param.bytes.is_null) ==>
        (((¬ ret.is_null) ∧
            (len(ret.bytes) == len(param.bytes.elements))) ∧
            (∀(i: int) ::
                ((0 <= i < len(param.bytes.elements)) ==>
                    (ret.bytes[i] == param.bytes.elements[i])))))
}