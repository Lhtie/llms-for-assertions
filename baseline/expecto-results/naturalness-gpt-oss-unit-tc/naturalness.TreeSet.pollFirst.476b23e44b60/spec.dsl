predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    ((entry_self.empty ==>
        (ret == None)) ∧
        ((¬ entry_self.empty) ==>
            (∃(v: int) ::
                ((ret == some(v)) ∧
                    MinElem(entry_self.elements, v)))))
}

predicate MinElem(elements: list[option[int]], v: int) {
    ((some(v) in elements) ∧
        (∀(e: option[int]) ::
            (((e in elements) ∧
                is_some(e)) ==>
                (unwrap(e) >= v))))
}