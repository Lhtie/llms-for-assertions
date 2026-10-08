predicate list_option_eq(l1: list[option[int]], l2: list[option[int]]) {
    ((len(l1) == len(l2)) ∧
        (∀(i: int) ::
            ((0 <= i < len(l1)) ==>
                ((is_none(l1[i]) ∧
                    is_none(l2[i])) ∨
                    ((is_some(l1[i]) ∧
                        is_some(l2[i])) ∧
                        (unwrap(l1[i]) == unwrap(l2[i])))))))
}

predicate set_state_eq(s1: record[size: int, empty: bool, elements: list[option[int]]], s2: record[size: int, empty: bool, elements: list[option[int]]]) {
    (((s1.size == s2.size) ∧
        (s1.empty == s2.empty)) ∧
        list_option_eq(s1.elements, s2.elements))
}

predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: record[is_null: bool, size: int, empty: bool, elements: list[option[int]], same_receiver: bool]) {
    ((((set_state_eq(entry_self, exit_self) ∧
        (ret.is_null == false)) ∧
        (entry_self.size == ret.size)) ∧
        (entry_self.empty == ret.empty)) ∧
        list_option_eq(entry_self.elements, ret.elements))
}