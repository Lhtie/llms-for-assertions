predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: record[is_null: bool, size: int, empty: bool, elements: list[option[int]], same_receiver: bool]) {
    ((((((((exit_self.size == entry_self.size) ∧
        (exit_self.empty == entry_self.empty)) ∧
        lists_option_int_eq(exit_self.elements, entry_self.elements)) ∧
        (ret.is_null == false)) ∧
        (ret.size == entry_self.size)) ∧
        (ret.empty == entry_self.empty)) ∧
        lists_option_int_eq(ret.elements, entry_self.elements)) ∧
        (ret.same_receiver == false))
}

predicate lists_option_int_eq(l1: list[option[int]], l2: list[option[int]]) {
    var n: int = len(l1);
    ((len(l2) == n) ∧
        (∀(i: int) ::
            ((0 <= i < n) ==>
                (l1[i] == l2[i]))))
}