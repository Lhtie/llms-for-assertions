predicate IsLast(entry_self: record[size: int, empty: bool, elements: list[option[int]]], val: option[int]) {
    ((entry_self.empty ==> true) ∧
        ((¬ entry_self.empty) ==>
            (is_some(val) ∧
                (∃(i: int) ::
                    ((0 <= i < len(entry_self.elements)) ∧
                        (entry_self.elements[i] == val))))))
}

predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    (is_some(ret) ==>
        IsLast(entry_self, ret))
}