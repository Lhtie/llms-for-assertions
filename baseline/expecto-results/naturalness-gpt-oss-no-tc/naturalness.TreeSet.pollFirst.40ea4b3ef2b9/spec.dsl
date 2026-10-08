predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var n: int = 
        len(entry_self.elements);
    ((entry_self.empty ==>
        ((((ret == None) ∧
            (exit_self.size == entry_self.size)) ∧
            (exit_self.empty == entry_self.empty)) ∧
            (exit_self.elements == entry_self.elements))) ∧
        ((¬ entry_self.empty) ==>
            (is_some(ret) ∧
                (∀(k: int) ::
                    (((0 <= k < n) ∧
                        is_some(entry_self.elements[k])) ==>
                        ((unwrap(ret) <= unwrap(entry_self.elements[k])) ∧
                            (∃(i: int) ::
                                (((((0 <= i < n) ∧
                                    (entry_self.elements[i] == ret)) ∧
                                    (exit_self.size == (entry_self.size - 1))) ∧
                                    (exit_self.empty == (exit_self.size == 0))) ∧
                                    (∀(j: int) ::
                                        ((0 <= j < n) ==>
                                            (((j == i) ==>
                                                ((exit_self.elements[j] == None) ∧
                                                    (j != i))) ==>
                                                (exit_self.elements[j] == entry_self.elements[j]))))))))))))
}