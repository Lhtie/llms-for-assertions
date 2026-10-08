predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    ((entry_self.empty ==>
        (ret == None)) ∧
        ((¬ entry_self.empty) ==>
            (∃(v: int) ::
                (((ret == some(v)) ∧
                    Contains(v, entry_self.elements)) ∧
                    (∀(w: int) ::
                        (Contains(w, entry_self.elements) ==>
                            (w <= v)))))))
}

predicate Contains(val: int, elems: list[option[int]]) {
    (∃(i: int) ::
        ((0 <= i < len(elems)) ∧
            (elems[i] == some(val))))
}