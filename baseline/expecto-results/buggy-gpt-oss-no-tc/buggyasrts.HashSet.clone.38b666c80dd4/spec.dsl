predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: record[is_null: bool, size: int, empty: bool, elements: list[option[int]], same_receiver: bool]) {
    var n: int = exit_self.size;
    ((ret.same_receiver == false) ∧
        (¬ (((exit_self.size == ret.size) ∧
            (exit_self.empty == ret.empty)) ∧
            (∀(i: int) ::
                ((0 <= i < n) ==>
                    (exit_self.elements[i] == ret.elements[i]))))))
}