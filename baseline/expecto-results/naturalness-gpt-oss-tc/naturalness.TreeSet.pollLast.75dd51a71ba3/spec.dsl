predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var n: int = 
        len(entry_self.elements);
    (is_some(ret) ==>
        (∀(j: int) ::
            (((0 <= j < n) ∧
                is_some(entry_self.elements[j])) ==>
                (unwrap(ret) >= unwrap(entry_self.elements[j])))))
}