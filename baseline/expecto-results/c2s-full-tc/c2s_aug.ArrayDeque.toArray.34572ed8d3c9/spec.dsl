predicate spec(param: record[a: record[is_null: bool, elements: list[option[int]]]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: record[is_null: bool, elements: list[option[int]]]) {
    (((¬ param.a.is_null) ∧
        ComponentCompatible(param.a, entry_self.elements)) ==>
        (¬ ret.is_null))
}

predicate ComponentCompatible(arr: record[is_null: bool, elements: list[option[int]]], deque_elems: list[option[int]]) {
    (∀(i: int) ::
        ((0 <= i < len(deque_elems)) ==>
            (is_some(deque_elems[i]) ==>
                true)))
}