predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: nonetype) {
    var old_size: int = 
        entry_self.size;
    (((0 <= param.index) ∧
        (param.index <= old_size)) ==>
        (((exit_self.size == (old_size + 1)) ∧
            (∀(k: int) ::
                ((0 <= k < param.index) ==>
                    (exit_self.elements[k] == entry_self.elements[k])))) ∧
            (∀(k: int) ::
                ((param.index <= k < old_size) ==>
                    (exit_self.elements[(k + 1)] == entry_self.elements[k])))))
}