predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    ((∃(v: int) ::
        ((ret == some(v)) ==>
            ((contains_val(entry_self, v) ∧
                (¬ contains_val(exit_self, v))) ∧
                (exit_self.size == (entry_self.size - 1))))) ∧
        ((ret == None) ==>
            (((entry_self.empty ∧
                exit_self.empty) ∧
                (exit_self.size == entry_self.size)) ∧
                (entry_self.elements == exit_self.elements))))
}

predicate contains_val(s: record[size: int, empty: bool, elements: list[option[int]]], v: int) {
    (∃(i: int) ::
        ((0 <= i < len(s.elements)) ∧
            (s.elements[i] == some(v))))
}