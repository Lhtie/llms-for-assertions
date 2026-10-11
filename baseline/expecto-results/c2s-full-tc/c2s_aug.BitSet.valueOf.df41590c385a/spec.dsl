predicate spec(param: record[lb: record[is_null: bool, position: int, limit: int, remaining: int, low: list[int], high: list[int]]], entry_self: nonetype, exit_self: nonetype, ret: record[is_null: bool, length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]]) {
    ((¬ ret.is_null) ∧
        (∀(i: int) ::
            ((0 <= i < len(ret.words_low)) ==>
                ((ret.words_low[i] == param.lb.low[(param.lb.position + i)]) ∧
                    (ret.words_high[i] == param.lb.high[(param.lb.position + i)])))))
}