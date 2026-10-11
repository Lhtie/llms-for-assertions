predicate spec(param: record[e: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    (is_some(param.e) ==>
        element_absent(exit_self.elements, param.e))
}

predicate element_absent(elems: list[option[int]], val: option[int]) {
    (∀(i: int) ::
        ((0 <= i < len(elems)) ==>
            (elems[i] != val)))
}