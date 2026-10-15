function head(q: record[size: int, empty: bool, elements: list[option[int]]]) -> option[int] {
    (if q.empty then None else q.elements[0])
}

predicate spec(param: record[], entry_self: record[size: int, empty: bool, elements: list[option[int]]], exit_self: record[size: int, empty: bool, elements: list[option[int]]], ret: option[int]) {
    (((((entry_self.empty == false) ∧
        (head(entry_self) == ret)) ∧
        (exit_self.size == (entry_self.size - 1))) ∧
        (¬ exit_self.empty)) ==>
        (unwrap(head(exit_self)) <= unwrap(ret)))
}