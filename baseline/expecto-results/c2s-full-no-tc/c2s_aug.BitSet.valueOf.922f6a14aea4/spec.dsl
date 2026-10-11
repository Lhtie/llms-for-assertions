predicate spec(param: record[bb: record[is_null: bool, position: int, limit: int, remaining: int, elements: list[int]]], entry_self: nonetype, exit_self: nonetype, ret: record[is_null: bool, length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]]) {
    (((¬ ret.is_null) ∧
        (len(ret.bytes) <= (len(param.bb.elements) -
            param.bb.position))) ∧
        (∀(i: int) ::
            ((0 <= i < len(ret.bytes)) ==>
                (ret.bytes[i] == param.bb.elements[(param.bb.position + i)]))))
}