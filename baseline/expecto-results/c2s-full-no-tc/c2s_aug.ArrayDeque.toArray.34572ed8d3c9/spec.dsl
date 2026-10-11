predicate spec(param: record[a: record[is_null: bool, elements: list[option[int]]]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: record[is_null: bool, elements: list[option[int]]]) {
    (((¬ param.a.is_null) ∧
        component_compatible(param, entry_self)) ==>
        (¬ ret.is_null))
}

predicate component_compatible(param: record[a: record[is_null: bool, elements: list[option[int]]]], deque: record[size: int, empty: bool, elements: list[option[int]]]) {
    (∀(i: int) ::
        ((0 <= i < len(deque.elements)) ==>
            element_type_compatible(deque.elements[i])))
}

predicate element_type_compatible(elem: option[int]) {
    (is_some(elem) ∨
        is_none(elem))
}