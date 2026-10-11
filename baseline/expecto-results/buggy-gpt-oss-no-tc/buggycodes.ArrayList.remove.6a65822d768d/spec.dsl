predicate spec(param: record[index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    var v: int = unwrap(ret);
    ((is_some(ret) ∧
        occurs_once(entry_self.elements, v)) ==>
        absent(exit_self.elements, v))
}

predicate occurs_once(lst: list[option[int]], val: int) {
    var n: int = len(lst);
    (∃(i: int) ::
        (((0 <= i < n) ∧
            (lst[i] == some(val))) ∧
            (∀(j: int) ::
                (((0 <= j < n) ∧ (j != i)) ==>
                    (lst[j] != some(val))))))
}

predicate absent(lst: list[option[int]], val: int) {
    var n: int = len(lst);
    (∀(i: int) ::
        ((0 <= i < n) ==>
            (lst[i] != some(val))))
}