predicate spec(param: record[index: int], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    (∀(v: int) ::
        ((((ret == some(v)) ∧
            (entry_self.elements[param.index] == some(v))) ∧
            (Count(entry_self.elements, v) == 1)) ==>
            (∀(k: int) ::
                (((0 <= k) ∧
                    (k < len(exit_self.elements))) ==>
                    (exit_self.elements[k] != some(v))))))
}

function Count(elements: list[option[int]], v: int) -> int {
    sum(map(lambda (e) = 
        (if (e == some(v)) then 1 else 0), elements))
}