predicate spec(param: record[index: int, element: option[int]], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var idx: int = param.index;
    var new_val: option[int] = 
        param.element;
    ((0 <= idx < entry_self.size) ==>
        ((((exit_self.size == entry_self.size) ∧
            (exit_self.empty == entry_self.empty)) ∧
            same_except_at(entry_self.elements, exit_self.elements, idx, new_val)) ∧
            (ret == entry_self.elements[idx])))
}

predicate same_except_at(old: list[option[int]], new: list[option[int]], idx: int, val: option[int]) {
    var n: int = len(old);
    (((len(new) == n) ∧
        (0 <= idx < n)) ==>
        (∀(i: int) ::
            ((0 <= i < n) ==>
                (((i == idx) ==>
                    (new[i] == val)) ∧
                    ((i != idx) ==>
                        (new[i] == old[i]))))))
}