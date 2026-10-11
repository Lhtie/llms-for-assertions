predicate spec(param: record[index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var idx: int = param.index;
    (∃(v: int) ::
        (occurs_once(entry_self.elements, idx, v) ==>
            occurs(exit_self.elements, v)))
}

predicate occurs_once(elements: list[option[int]], idx: int, v: int) {
    var length: int = 
        len(elements);
    (((0 <= idx < length) ∧
        (elements[idx] == some(v))) ∧
        (∀(i: int) ::
            (((0 <= i < length) ∧
                (i != idx)) ==>
                (elements[i] != some(v)))))
}

predicate occurs(elements: list[option[int]], v: int) {
    var len_e: int = 
        len(elements);
    (∃(i: int) ::
        ((0 <= i < len_e) ∧
            (elements[i] == some(v))))
}