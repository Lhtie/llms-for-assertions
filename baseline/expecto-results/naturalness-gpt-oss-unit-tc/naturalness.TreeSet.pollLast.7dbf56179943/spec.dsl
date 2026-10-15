predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var n: int = 
        len(entry_self.elements);
    ((entry_self.empty ==>
        (ret == None)) ∧
        ((¬ entry_self.empty) ==>
            (∃(i: int, v: int) ::
                ((((0 <= i < n) ∧
                    (entry_self.elements[i] == some(v))) ∧
                    (ret == some(v))) ∧
                    (∀(j: int, w: int) ::
                        (((0 <= j < n) ∧
                            (entry_self.elements[j] == some(w))) ==>
                            (w <= v)))))))
}