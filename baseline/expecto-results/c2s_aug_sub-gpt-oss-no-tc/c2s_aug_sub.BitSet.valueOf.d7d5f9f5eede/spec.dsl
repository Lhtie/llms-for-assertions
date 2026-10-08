predicate spec(param: record[longs: record[is_null: bool, low: list[int], high: list[int]]], entry_self: nonetype, exit_self: nonetype, ret: record[is_null: bool, length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]]) {
    ((¬ ret.is_null) ∧
        (∀(i: int) ::
            ((0 <= i < len(ret.words_low)) ==>
                ((ret.words_low[i] == param.longs.low[i]) ∧
                    (ret.words_high[i] == param.longs.high[i])))))
}