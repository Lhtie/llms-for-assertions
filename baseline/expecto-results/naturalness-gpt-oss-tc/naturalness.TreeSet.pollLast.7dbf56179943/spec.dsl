predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    HighestValue(ret, entry_self.elements)
}

predicate HighestValue(ret: option[int], elems: list[option[int]]) {
    ((NoConcrete(elems) ==>
        is_none(ret)) ∧
        ((¬ NoConcrete(elems)) ==>
            MaxConcrete(ret, elems)))
}

predicate NoConcrete(elems: list[option[int]]) {
    var length: int = 
        len(elems);
    ((length > 0) ∧
        (∀(i: int) ::
            ((0 <= i < length) ==>
                is_none(elems[i]))))
}

predicate MaxConcrete(ret: option[int], elems: list[option[int]]) {
    var length: int = 
        len(elems);
    var v: int = unwrap(ret);
    (is_some(ret) ∧
        (∀(j: int) ::
            (((0 <= j < length) ∧
                is_some(elems[j])) ==>
                (unwrap(elems[j]) <= v))))
}