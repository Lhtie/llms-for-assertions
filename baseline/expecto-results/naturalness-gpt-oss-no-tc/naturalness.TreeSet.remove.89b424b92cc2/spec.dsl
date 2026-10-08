predicate spec(param: record[o: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: bool) {
    var present: bool = 
        (is_some(param.o) ∧
            (∃(idx: int) ::
                (((0 <= idx < len(entry_self.elements)) ∧
                    is_some(entry_self.elements[idx])) ∧
                    (unwrap(entry_self.elements[idx]) == unwrap(param.o)))));
    ((¬ present) ==>
        (ret == false))
}