predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    ((((entry_self.empty == (entry_self.size == 0)) ∧
        (exit_self.empty == (exit_self.size == 0))) ∧
        ((ret == None) ==>
            (((exit_self.size == entry_self.size) ∧
                (exit_self.empty == entry_self.empty)) ∧
                (∀(j: int) ::
                    ((0 <= j < len(entry_self.elements)) ==>
                        (exit_self.elements[j] == entry_self.elements[j])))))) ∧
        ((ret != None) ==>
            (∃(i: int) ::
                (((((0 <= i < len(entry_self.elements)) ∧
                    (entry_self.elements[i] == ret)) ∧
                    (exit_self.elements[i] == None)) ∧
                    (∀(j: int) ::
                        (((0 <= j < len(entry_self.elements)) ∧
                            (j != i)) ==>
                            (exit_self.elements[j] == entry_self.elements[j])))) ∧
                    (exit_self.size == (entry_self.size - 1))))))
}