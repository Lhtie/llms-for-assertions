predicate spec(param: record[a: record[is_null: bool, elements: list[option[int]]]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: record[is_null: bool, elements: list[option[int]]]) {
    (((¬ param.a.is_null) ∧
        all_elements_compatible(param.a, entry_self.elements)) ==>
        (¬ ret.is_null))
}

predicate all_elements_compatible(arr: record[is_null: bool, elements: list[option[int]]], elems: list[option[int]]) {
    (∀(i: int) ::
        ((0 <= i < len(elems)) ==>
            element_compatible(arr, elems[i])))
}

predicate element_compatible(arr: record[is_null: bool, elements: list[option[int]]], e: option[int]) {
    (is_some(e) ==>
        (¬ arr.is_null))
}