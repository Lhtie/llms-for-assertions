predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var idx: int = param.index;
    var elem: option[int] = 
        param.element;
    ((index_valid(entry_self, idx) == true) ==>
        (((exit_self.elements[idx] == elem) ∧
            (exit_self.size == (entry_self.size + 1))) ∧
            (∀(i: int) ::
                ((0 <= i < idx) ==>
                    ((exit_self.elements[i] == entry_self.elements[i]) ∧
                        (∀(i: int) ::
                            ((idx < i < exit_self.size) ==>
                                (exit_self.elements[i] == entry_self.elements[(i - 1)]))))))))
}

predicate index_valid(rec: record[size: int, empty: bool, elements: list[option[int]]], idx: int) {
    var sz: int = rec.size;
    ((0 <= idx) ∧
        (idx <= sz))
}