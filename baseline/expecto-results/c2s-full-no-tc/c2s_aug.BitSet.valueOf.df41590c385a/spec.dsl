predicate spec(param: record[lb: record[is_null: bool, position: int, limit: int, remaining: int, low: list[int], high: list[int]]], entry_self: nonetype, exit_self: nonetype, ret: record[is_null: bool, length: int, cardinality: int, empty: bool, bits: list[bool], words_low: list[int], words_high: list[int], bytes: list[int]]) {
    var n: int = 
        len(ret.words_low);
    var pos: int = 
        param.lb.position;
    ((¬ ret.is_null) ∧
        (∀(i: int) ::
            ((0 <= i < n) ==>
                ((ret.words_low[i] == param.lb.low[(pos + i)]) ∧
                    (ret.words_high[i] == param.lb.high[(pos + i)])))))
}