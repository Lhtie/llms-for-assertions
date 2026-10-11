predicate spec(param: record[index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var idx: int = param.index;
    var n: int = 
        entry_self.size;
    ((0 <= idx < n) ==>
        ((((ret == entry_self.elements[idx]) ∧
            (exit_self.size == (n - 1))) ∧
            (exit_self.empty == ((n - 1) == 0))) ∧
            (∀(i: int) ::
                ((0 <= i < idx) ==>
                    ((exit_self.elements[i] == entry_self.elements[i]) ∧
                        (∀(i: int) ::
                            ((idx <= i < exit_self.size) ==>
                                ((exit_self.elements[i] == entry_self.elements[(i + 1)]) ∧
                                    (exit_self.elements[exit_self.size] == None)))))))))
}