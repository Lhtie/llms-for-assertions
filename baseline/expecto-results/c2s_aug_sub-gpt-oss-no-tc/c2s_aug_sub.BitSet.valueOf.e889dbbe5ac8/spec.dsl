predicate spec(param: record[bytes: record[is_null: bool, elements: list[int]]], entry_self: nonetype, exit_self: nonetype, ret: record[is_null: bool, length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]]) {
    ((((¬ ret.is_null) ∧
        (¬ param.bytes.is_null)) ∧
        (len(param.bytes.elements) == len(ret.bytes))) ∧
        (∀(i: int) ::
            ((0 <= i < len(param.bytes.elements)) ==>
                (ret.bytes[i] == param.bytes.elements[i]))))
}